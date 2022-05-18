package academic.DTO;

import java.sql.Date;
import java.util.Calendar;

import javax.security.auth.Subject;

public class CourseDTO {
	private int id;
	private Subject subject;
	private ProfessorDTO profesor;
	private Date initialDate;
	private Date finalDate;
	private boolean isOpen;
	
	
	public CourseDTO () {
		setId(0);
		setSubject(subject);
		setProfesor(ProfessorDTO.create());
		setInitialDate(Calendar.getInstance().getTime());
		setFinalDate(Calendar.getInstance().getTime());
		
	}
	
	public static CourseDTO create() {
		return new CourseDTO();
	}
	public int getId() {
		return id;
	}
	public CourseDTO setId(int id) {
		this.id = (id<0)?0: id;
		return this;
	}
	public Subject getSubject() {
		return subject;
	}
	public CourseDTO setSubject(Subject subject) {
		this.subject = subject;
		return this;
	}
	public ProfessorDTO getProfesor() {
		return profesor;
	}
	public CourseDTO setProfesor(ProfessorDTO profesor) {
		this.profesor = profesor;
		return this;
	}

	public Date getInitialDate() {
		return initialDate;
	}

	public void setInitialDate(java.util.Date date) {
		this.initialDate = (Date) date;
	}

	public Date getFinalDate() {
		return finalDate;
	}

	public void setFinalDate(java.util.Date date) {
		this.finalDate = (Date) date;
	}
	
	
	

}
