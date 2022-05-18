package academic.domain;

public class StudentDomain {
	private int id;
	private IdTypeDomain idType;
	private int idNumber;
	private String name;
	private String email;
	
	public StudentDomain(int id, IdTypeDomain idType, String name) {
		super();
		setId(id);
		setIdType(idType);
		setName(name);
	}
	public int getId() {
		return id;
	}
	private void setId(int id) {
		this.id = id;
	}
	public IdTypeDomain getIdType() {
		return idType;
	}
	private void setIdType(IdTypeDomain idType) {
		this.idType = idType;
	}
	public String getName() {
		return name;
	}
	private void setName(String name) {
		this.name = name;
	}
	public int getIdNumber() {
		return idNumber;
	}
	public void setIdNumber(int idNumber) {
		this.idNumber = idNumber;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	
	
	
	

}
