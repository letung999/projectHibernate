package fa.training.entities;

import java.io.Serializable;
import java.time.LocalDate;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "audit")
public class Audit implements Serializable{
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "audit_id")
	private int id;
	
	@Column(name = "audit_date")
	private LocalDate auditDate;
	
	
	@Column(name = "pic")
	private String pic;
	
	
	@Column(name = "audit_note")
	private String auditNode;
	
	
	@ManyToOne
	@JoinColumn(name = "clazz_id")
	private Clazz clazz;


	public Audit() {
		
	}
	
	
	public Audit(LocalDate auditDate, String pic, String auditNode, Clazz clazz) {
		this.auditDate = auditDate;
		this.pic = pic;
		this.auditNode = auditNode;
		this.clazz = clazz;
	}




	public int getId() {
		return id;
	}


	public void setId(int id) {
		this.id = id;
	}


	public LocalDate getAuditDate() {
		return auditDate;
	}


	public void setAuditDate(LocalDate auditDate) {
		this.auditDate = auditDate;
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


	public Clazz getClazz() {
		return clazz;
	}


	public void setClazz(Clazz clazz) {
		this.clazz = clazz;
	}


	
	
	
	
	
	
	
}
