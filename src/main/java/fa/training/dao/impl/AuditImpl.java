package fa.training.dao.impl;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.Transaction;

import fa.training.dao.AuditDAO;
import fa.training.entities.Audit;
import fa.training.entities.ClassVoz;
import fa.training.entities.Clazz;
import fa.training.hibernateuitl.HibernateUtil;

public class AuditImpl implements AuditDAO {

	@Override
	public int saveAudit(Audit audit) {
		Transaction transaction = null;
		try (Session session = HibernateUtil.getSessionFactory().openSession()) {
			// start a transaction
			transaction = session.beginTransaction();
			// save the clazz object
			session.save(audit);
			// commit transaction
			transaction.commit();

			return 1;
		} catch (Exception e) {
			if (transaction != null) {
				transaction.rollback();
			}
			e.printStackTrace();
		}

		return 0;
	}

	@Override
	public List<Object[]> findAllDetail() {

		List<Object[]> details = new ArrayList<Object[]>();

		Transaction transaction = null;
		try (Session session = HibernateUtil.getSessionFactory().openSession()) {
			// start a transaction
			transaction = session.beginTransaction();

			String query = "select c.clazz_name, c.clazz_code, a.audit_id, a.audit_date, a.audit_note, a.pic, a.clazz_id from clazz as c inner join audit as a on a.clazz_id = c.clazz_id";
			details = session.createSQLQuery(query).getResultList();

			transaction.commit();

			return details;

		} catch (Exception e) {
			if (transaction != null) {
				transaction.rollback();
			}
			e.printStackTrace();
		}

		return null;
	}

}
