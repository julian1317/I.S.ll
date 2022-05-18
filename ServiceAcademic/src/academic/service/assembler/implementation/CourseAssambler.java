package academic.service.assembler.implementation;

import academic.DTO.AttendanceDTO;
import academic.DTO.CourseDTO;
import academic.domain.AttendanceDomain;
import academic.domain.CourseDomain;
import academic.entity.AttendanceEntity;
import academic.entity.CourseEntity;
import academic.service.assembler.Assembler;

public class CourseAssambler implements Assembler<CourseDomain, CourseDTO, CourseEntity> {
	
	private static final Assembler<CourseDomain, CourseDTO, CourseEntity> INSTANCE =new CourseAssambler();
	private CourseAssambler() {
		 super();
		}
		public static Assembler<CourseDomain, CourseDTO, CourseEntity> getSubAssembler(){
			return INSTANCE;
		}
	
	
	
	
	
	
	

	@Override
	public CourseDTO convertDomaianToDTO(CourseDomain domain) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public CourseEntity convertDomaianToEntity(CourseDomain domain) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public CourseDomain convertDTOtoDomain(CourseDTO dto) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public CourseDomain convertEntityToDomain(CourseEntity entity) {
		// TODO Auto-generated method stub
		return null;
	}

	
	
	
}
