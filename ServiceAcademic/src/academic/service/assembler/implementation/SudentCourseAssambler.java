package academic.service.assembler.implementation;

import academic.DTO.StudentCourseDTO;
import academic.domain.StudentCourseDomain;
import academic.entity.StudentCourseEntity;
import academic.service.assembler.Assembler;

public class SudentCourseAssambler implements Assembler<StudentCourseDomain, StudentCourseDTO, StudentCourseEntity> {

	
	private static final Assembler<StudentCourseDomain, StudentCourseDTO, StudentCourseEntity> INSTANCE =new SudentCourseAssambler();
	private SudentCourseAssambler() {
		 super();
		}
		public static Assembler<StudentCourseDomain, StudentCourseDTO, StudentCourseEntity> getSubAssembler(){
			return INSTANCE;
		}
	
	
	@Override
	public StudentCourseDTO convertDomaianToDTO(StudentCourseDomain domain) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public StudentCourseEntity convertDomaianToEntity(StudentCourseDomain domain) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public StudentCourseDomain convertDTOtoDomain(StudentCourseDTO dto) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public StudentCourseDomain convertEntityToDomain(StudentCourseEntity entity) {
		// TODO Auto-generated method stub
		return null;
	}

	
	
	
	
	
	
	


}
