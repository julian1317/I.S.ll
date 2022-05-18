package academic.domain;

public class ProfessorDomain {

	private int id;
	private String name;
	private IdTypeDomain idType;
	private String email;

	public ProfessorDomain(int id, String name, IdTypeDomain idType) {
		super();
		setId(id);
		setName(name);
		setIdType(idType);;
	}

	public int getId() {
		return id;
	}

	private void setId(int id) {
		this.id = (id<0)?0: id;
	}

	public String getName() {
		return name;
	}

	private void setName(String name) {
		this.name = name;
	}

	public IdTypeDomain getIdType() {
		return (idType==null)? new IdTypeDomain(0, ""): idType;
	}

	private void setIdType(IdTypeDomain idType) {
		this.idType = idType;
	}

	
	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	
	
}
