package academic.domain;

import java.sql.Date;
import java.util.Calendar;

import javax.security.auth.Subject;

public class CourseDomain {
	private int id;
	private Subject subject;
	private ProfessorDomain profesor;
	private Date initialDate;
	private Date finalDate;
	
	public CourseDomain(int id, Subject subject, ProfessorDomain profesor) {
		super();
		setId(id);
		setSubject(subject);
		setProfesor(profesor);
	}
	public int getId() {
		return id;
	}
	private void setId(int id) {
		this.id = id;
	}
	public Subject getSubject() {
		return subject;
	}
	private void setSubject(Subject subject) {
		this.subject = subject;
	}
	public ProfessorDomain getProfesor() {
		return profesor;
	}
	private void setProfesor(ProfessorDomain profesor) {
		this.profesor = profesor;
	}
	
	
	public Date getInitialDate() {
		return initialDate;
	}
	public void setInitialDate(Date initialDate) {
		this.initialDate = initialDate;
	}
	public Date getFinalDate() {
		return finalDate;
	}
	public void setFinalDate(Date finalDate) {
		this.finalDate = finalDate;
	}
	
	public boolean isOpen() {
		return (Calendar.getInstance().getTime().getTime()>= getInitialDate().getTime()
				&& Calendar.getInstance().getTime().getTime()<= getFinalDate().getTime());
	}
	
	

}
