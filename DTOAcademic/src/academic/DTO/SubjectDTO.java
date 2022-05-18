package academic.DTO;

import javax.swing.text.html.FormSubmitEvent;

public class SubjectDTO {
	private int id;
	private String name;
	
	
	private SubjectDTO(int id, String name) {
		super();
		setId(id);
		setName(name);
		
	}
	public static SubjectDTO create() {
		return new SubjectDTO();
	}
	public SubjectDTO() {
		setName("");
	}
	
	public int getId() {
		return id;
	}
	private void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	private void setName(String name) {
		this.name = name;
	}
	
}
