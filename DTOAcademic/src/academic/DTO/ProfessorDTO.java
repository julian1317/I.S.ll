package academic.DTO;

public class ProfessorDTO {
	
	private int id;
	private String name;
	private IdTypeDTO idType;
	private String email;
	
	
	
	
	public ProfessorDTO () {
		setId(0);
		setName("");
		setIdType(IdTypeDTO.create());
		
	}
	public static ProfessorDTO create() {
		return new ProfessorDTO();
	}
	public int getId() {
		return id;
	}
	public ProfessorDTO setId(int id) {
		this.id = (id<0)?0: id;
		return this;
	}
	public String getName() {
		return name;
	}
	public ProfessorDTO setName(String name) {
		this.name = (name == null)? "": name.trim();
		return this;
	}
	public IdTypeDTO getIdType() {
		return idType;
	}
	public ProfessorDTO setIdType(IdTypeDTO idType) {
		this.idType = idType;
		return this;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	
	
	

}
