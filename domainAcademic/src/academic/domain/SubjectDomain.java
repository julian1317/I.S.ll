package academic.domain;

public class SubjectDomain {
	private int id;
	private String name;
	public int getId() {
		return id;
	}
	
	public SubjectDomain() {
		setName(name);
	}
	private subjectDomain create(int id, String name) {
		return new SubjectDomain();
	}
	public static SubjectDomain create() {
		return new SubjectDomain();
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
