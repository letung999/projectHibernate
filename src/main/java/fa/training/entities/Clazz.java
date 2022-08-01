package fa.training.entities;

import java.io.Serializable;
import java.time.LocalDate;
import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name = "clazz")
public class Clazz implements Serializable{
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "clazz_id")
	private int id;
	
	@Column(name = "clazz_code", nullable = false, length=30)
	private String clazzCode;
	
	@Column(name = "clazz_name", nullable = false, length=255)
	private String clazzName;
	
	
	@Column(name = "accept_trainee_Number")
	private int acceptTraineeNumber;
	
	@Column(name = "actual_trainee_Number")
	private int actualTraineeNumber;
	
	@Column(name = "skill", length = 255)
	private String skill;
	
	@Column(name = "start_date")
	private LocalDate startDate;
	
	@Column(name = "end_date")
	private LocalDate endDate;
	
	@Column(name = "clazz_admin", length=255)
	private String clazzAdmin;
	
	@Column(name = "status")
	int status;
	
	@OneToMany(mappedBy = "clazz")
	private Set<Audit> audits;

	public Clazz() {
		super();
	}
	
	

	public Clazz(int id, String clazzCode, String clazzName, int acceptTraineeNumber, int actualTraineeNumber,
			String skill, LocalDate startDate, LocalDate endDate, String clazzAdmin, int status) {
		this.id = id;
		this.clazzCode = clazzCode;
		this.clazzName = clazzName;
		this.acceptTraineeNumber = acceptTraineeNumber;
		this.actualTraineeNumber = actualTraineeNumber;
		this.skill = skill;
		this.startDate = startDate;
		this.endDate = endDate;
		this.clazzAdmin = clazzAdmin;
		this.status = status;
	}



	public Set<Audit> getAudits() {
		return audits;
	}

	public void setAudits(Set<Audit> audits) {
		this.audits = audits;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
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

	public int getAcceptTraineeNumber() {
		return acceptTraineeNumber;
	}

	public void setAcceptTraineeNumber(int acceptTraineeNumber) {
		this.acceptTraineeNumber = acceptTraineeNumber;
	}

	public int getActualTraineeNumber() {
		return actualTraineeNumber;
	}

	public void setActualTraineeNumber(int actualTraineeNumber) {
		this.actualTraineeNumber = actualTraineeNumber;
	}

	public String getSkill() {
		return skill;
	}

	public void setSkill(String skill) {
		this.skill = skill;
	}

	public LocalDate getStartDate() {
		return startDate;
	}

	public void setStartDate(LocalDate startDate) {
		this.startDate = startDate;
	}

	public LocalDate getEndDate() {
		return endDate;
	}

	public void setEndDate(LocalDate endDate) {
		this.endDate = endDate;
	}

	public String getClazzAdmin() {
		return clazzAdmin;
	}

	public void setClazzAdmin(String clazzAdmin) {
		this.clazzAdmin = clazzAdmin;
	}

	public int getStatus() {
		return status;
	}

	public void setStatus(int status) {
		this.status = status;
	}
	
	
	
	
}
