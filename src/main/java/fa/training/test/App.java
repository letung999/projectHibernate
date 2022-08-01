package fa.training.test;

import java.sql.Date;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import fa.training.dao.AuditDAO;
import fa.training.dao.ClazzDAO;
import fa.training.dao.impl.AuditImpl;
import fa.training.dao.impl.ClazzImpl;
import fa.training.entities.Audit;
import fa.training.entities.ClassVoz;
import fa.training.entities.Clazz;

public class App {
	public static void main(String[] args) {

		/* add Clazz */
		ClazzDAO clazzDAO = new ClazzImpl();
		AuditDAO auditDAO = new AuditImpl();
//		
//		Clazz clazz = new Clazz();
//		clazz.setClazzCode("003_Golang_03");
//		clazz.setClazzName("Golang");
//		clazz.setAcceptTraineeNumber(8);
//		clazz.setActualTraineeNumber(11);
//		clazz.setSkill("Golang");
//		clazz.setStartDate(LocalDate.of(2022, 3, 23));
//		clazz.setEndDate(LocalDate.of(2022, 6, 30));
//		clazz.setClazzAdmin("VinhTH_09");
//		clazz.setStatus(1);
//	
//		clazzDAO.saveClazz(clazz);

		/* add audit */

//		Audit audit = new Audit();
//		audit.setAuditDate(LocalDate.of(2022, 7, 1));
//		audit.setPic("PhucMT_09");
//		audit.setAuditNode("good");
//		//get class Audit 
//		
//		Clazz clazz = clazzDAO.getClazzById(3);
//		audit.setClazz(clazz);
//		auditDAO.saveAudit(audit);

		/* find my admin */
//		List<Clazz> clazzs = new ArrayList<Clazz>();
//		clazzs = clazzDAO.findByAdmin("LMD_09");
//		System.out.println(clazzs.size());
//		for(int i = 0; i < clazzs.size(); ++i) {
//			System.out.println(clazzs.get(i).getClazzName());
//		}
//		

		/* detail */
		List<Object[]> details = new ArrayList<Object[]>();
		List<ClassVoz> classVozs = new ArrayList<ClassVoz>();

		details = auditDAO.findAllDetail();
		for (Object[] record : details) {
			String clazzName = (String) record[0];
			String clazzCode = (String) record[1];
			int auditId = (int) record[2];
			Date auditDate = (Date) record[3];
			String auditNode = (String) record[4];
			String pic = (String) record[5];
			int clasId = (int) record[6];

			ClassVoz classVoz = new ClassVoz(clazzName, clazzCode, auditId, auditDate, auditNode, pic, clasId);
			classVozs.add(classVoz);
		}
		
		
		for (ClassVoz classVoz : classVozs) {
			System.out.println(classVoz);
		}

//		forEach(Object[] record : results) {
//			Long id = ((BigInteger) record[0]).longValue();
//			String firstName = (String) record[1];
//			String lastName = (String) record[2];
//			Integer version = (Integer) record[3];
//			};

	}
}
