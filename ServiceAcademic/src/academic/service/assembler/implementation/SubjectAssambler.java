package academic.service.assembler.implementation;

import academic.DTO.SubjectDTO;
import academic.domain.SubjectDomain;
import academic.entity.SubjectEntity;
import academic.service.assembler.Assembler;


public class SubjectAssambler implements Assembler<SubjectDomain, SubjectDTO, SubjectEntity> {
	private static final Assembler<SubjectDomain, SubjectDTO, SubjectEntity> INSTANCE =new SubjectAssambler();
	
	private SubjectAssambler() {
	 super();
	}
	public static Assembler<SubjectDomain, SubjectDTO, SubjectEntity> getSubAssembler(){
	return INSTANCE;
	}
	
	@Override
	public SubjectDTO convertDomaianToDTO(SubjectDomain domain) {
		// TODO Auto-generated method stub
		if(domain == null) {
			var message="no es posible converitr un subjectDomain a un subjecDTO cuando el minio est? nul..";
			/*aca falta una exceptin*/
		}
		
		
		return SubjectDTO.create(domain.getId(), domain.getName());
	}

	@Override
	public SubjectEntity convertDomaianToEntity(SubjectDomain domain) {
		if(domain == null) {
			var message="no es posible converitr un subjectDomain a un subjecDTO cuando el minio est? nul..";
			/*aca falta una exceptin*/
		}
		
		
		return SubjectEntity.create(domain.getId(), domain.getName());
	
	}

	@Override
	public SubjectDomain convertDTOtoDomain(SubjectDTO dto) {
		if(dto == null) {
			var message="no es posible converitr un subjectDomain a un subjecDTO cuando el minio est? nul..";
			/*aca falta una exceptin*/
		}
		
		
		return SubjectEntity.create(dto.getId(), dto.getName());
	}

	@Override
	public SubjectDomain convertEntityToDomain(SubjectEntity entity) {
		// TODO Auto-generated method stub
		return null;
	}

}
