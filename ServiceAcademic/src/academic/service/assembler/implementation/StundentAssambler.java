package academic.service.assembler.implementation;

import academic.DTO.StudentDTO;
import academic.domain.StudentDomain;
import academic.entity.StudentEntity;
import academic.service.assembler.Assembler;

public class StundentAssambler implements Assembler<StudentDomain, StudentDTO, StudentEntity>  {
	private static final Assembler<StudentDomain, StudentDTO, StudentEntity> INSTANCE =new StundentAssambler();
	private StundentAssambler() {
		 super();
		}
		public static Assembler<StudentDomain, StudentDTO, StudentEntity> getSubAssembler(){
			return INSTANCE;
		}
	
	

	@Override
	public StudentDTO convertDomaianToDTO(StudentDomain domain) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public StudentEntity convertDomaianToEntity(StudentDomain domain) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public StudentDomain convertDTOtoDomain(StudentDTO dto) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public StudentDomain convertEntityToDomain(StudentEntity entity) {
		// TODO Auto-generated method stub
		return null;
	}

}
