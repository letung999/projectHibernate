package fa.training.dao;

import java.util.List;

import fa.training.entities.Clazz;

public interface ClazzDAO {
	public int saveClazz(Clazz clazz);
	
	public Clazz getClazzById(int id);
	
	public List<Clazz> findByAdmin(String clazzAdmin);
}
