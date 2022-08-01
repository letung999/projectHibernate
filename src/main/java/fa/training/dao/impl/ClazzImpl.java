package fa.training.dao.impl;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.Transaction;

import fa.training.dao.ClazzDAO;
import fa.training.entities.Clazz;
import fa.training.hibernateuitl.HibernateUtil;

public class ClazzImpl implements ClazzDAO {

	public int saveClazz(Clazz clazz) {
		Transaction transaction = null;
		try (Session session = HibernateUtil.getSessionFactory().openSession()) {
			// start a transaction
			transaction = session.beginTransaction();
			// save the clazz object
			session.save(clazz);
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
	public Clazz getClazzById(int id) {
		Transaction transaction = null;
		try (Session session = HibernateUtil.getSessionFactory().openSession()) {
			// start a transaction
			transaction = session.beginTransaction();
			// save the product object
			Clazz clazz = session.get(Clazz.class, id);
			// commit transaction
			transaction.commit();

			return clazz;
		} catch (Exception e) {
			if (transaction != null) {
				transaction.rollback();
			}
			e.printStackTrace();
		}

		return null;
	}

	@Override
	public List<Clazz> findByAdmin(String clazzAdmin) {
		List<Clazz> resultList = new ArrayList<Clazz>();
		
		Transaction transaction = null;
		try (Session session = HibernateUtil.getSessionFactory().openSession()) {
			// start a transaction
			transaction = session.beginTransaction();

			String query = "select * from clazz as c where c.clazz_admin = '" + clazzAdmin + "'";
			resultList = session.createSQLQuery(query).addEntity(Clazz.class).list();
			// commit transaction
			transaction.commit();
			
			return resultList;
			
		} catch (Exception e) {
			if (transaction != null) {
				transaction.rollback();
			}
			e.printStackTrace();
		}

		return null;
	}

}
