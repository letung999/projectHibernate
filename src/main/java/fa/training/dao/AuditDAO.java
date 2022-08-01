package fa.training.dao;

import java.util.List;

import fa.training.entities.Audit;

public interface AuditDAO {
	public int saveAudit(Audit audit);
	
	public List<Object[]> findAllDetail();
}
