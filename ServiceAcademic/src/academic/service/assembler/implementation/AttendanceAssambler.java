package academic.service.assembler.implementation;

import academic.DTO.AttendanceDTO;
import academic.DTO.SubjectDTO;
import academic.domain.AttendanceDomain;
import academic.domain.SubjectDomain;
import academic.entity.AttendanceEntity;
import academic.entity.SubjectEntity;
import academic.service.assembler.Assembler;

public class AttendanceAssambler implements Assembler<AttendanceDomain, AttendanceDTO, AttendanceEntity> { 

	private static final Assembler<AttendanceDomain, AttendanceDTO, AttendanceEntity> INSTANCE =new AttendanceAssambler();
	private AttendanceAssambler() {
		 super();
		}
		public static Assembler<AttendanceDomain,  AttendanceDTO, AttendanceEntity> getSubAssembler(){
			return INSTANCE;
		}
	
	
	
	
	@Override
	public AttendanceDTO convertDomaianToDTO(AttendanceDomain domain) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public AttendanceEntity convertDomaianToEntity(AttendanceDomain domain) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public AttendanceDomain convertDTOtoDomain(AttendanceDTO dto) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public AttendanceDomain convertEntityToDomain(AttendanceEntity entity) {
		// TODO Auto-generated method stub
		return null;
	}

}
