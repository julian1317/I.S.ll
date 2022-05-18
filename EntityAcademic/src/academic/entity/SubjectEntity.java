package academic.entity;

public class SubjectEntity {

	private int id;
	private String name;
	
	
	
	private SubjectEntity(int id, String name) {
		super();
		setId(id);
		setName(name);
		
		
	}
	 public static SubjectEntity create() {
		 return new SubjectEntity(0, null);
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
