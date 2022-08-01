package fa.training.entities;

import java.sql.Date;
import java.time.LocalDate;

import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

public class ClassVoz {
	private String clazzName;
	private String clazzCode;
	private int auditId;
	private Date auditDate;
	private String auditNode;
	private String pic;
	private int clasId;
	
	

	public ClassVoz() {
		super();
	}


	public ClassVoz(String clazzName, String clazzCode, int auditId, Date auditDate, String auditNode, String pic,
			int clasId) {
		this.clazzName = clazzName;
		this.clazzCode = clazzCode;
		this.auditId = auditId;
		this.auditDate = auditDate;
		this.auditNode = auditNode;
		this.pic = pic;
		this.clasId = clasId;
	}






	public String getClazzCode() {
		return clazzCode;
	}



	public void setClazzCode(String clazzCode) {
		this.clazzCode = clazzCode;
	}



	public String getClazzName() {
		return clazzName;
	}



	public void setClazzName(String clazzName) {
		this.clazzName = clazzName;
	}



	public int getAuditId() {
		return auditId;
	}



	public void setAuditId(int auditId) {
		this.auditId = auditId;
	}





	public Date getAuditDate() {
		return auditDate;
	}






	public void setAuditDate(Date auditDate) {
		this.auditDate = auditDate;
	}






	public void setClasId(int clasId) {
		this.clasId = clasId;
	}






	public String getPic() {
		return pic;
	}



	public void setPic(String pic) {
		this.pic = pic;
	}



	public String getAuditNode() {
		return auditNode;
	}



	public void setAuditNode(String auditNode) {
		this.auditNode = auditNode;
	}


	@Override
	public String toString() {
		return "ClassVoz [clazzName=" + clazzName + ", clazzCode=" + clazzCode + ", auditId=" + auditId + ", auditDate="
				+ auditDate + ", auditNode=" + auditNode + ", pic=" + pic + ", clasId=" + clasId + "]";
	}


	
	
	

}
