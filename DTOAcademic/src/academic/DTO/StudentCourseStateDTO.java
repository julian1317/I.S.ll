package academic.DTO;

public class StudentCourseStateDTO {
	private int id;
	private String name;
	
	
	
	public StudentCourseStateDTO() {
		super();
		setId(0);
		setName(name);
	}
	
	public static StudentCourseStateDTO create() {
		return new StudentCourseStateDTO();
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	
	
	
	
	
	
	

}
