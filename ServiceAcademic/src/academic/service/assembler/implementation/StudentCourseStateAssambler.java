package academic.service.assembler.implementation;

import academic.DTO.StudentCourseStateDTO;
import academic.domain.StudentCourseStateDomain;
import academic.entity.StudentCourseStateEntity;
import academic.service.assembler.Assembler;

public class StudentCourseStateAssambler  implements Assembler<StudentCourseStateDomain, StudentCourseStateDTO, StudentCourseStateEntity> {
	private static final Assembler<StudentCourseStateDomain, StudentCourseStateDTO, StudentCourseStateEntity> INSTANCE =new StudentCourseStateAssambler();
	private StudentCourseStateAssambler() {
		 super();
		}
		public static Assembler<StudentCourseStateDomain, StudentCourseStateDTO, StudentCourseStateEntity> getSubAssembler(){
			return INSTANCE;
		}

	@Override
	public StudentCourseStateDTO convertDomaianToDTO(StudentCourseStateDomain domain) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public StudentCourseStateEntity convertDomaianToEntity(StudentCourseStateDomain domain) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public StudentCourseStateDomain convertDTOtoDomain(StudentCourseStateDTO dto) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public StudentCourseStateDomain convertEntityToDomain(StudentCourseStateEntity entity) {
		// TODO Auto-generated method stub
		return null;
	}
	
	

}
