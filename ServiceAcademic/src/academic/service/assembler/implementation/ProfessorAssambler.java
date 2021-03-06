package academic.service.assembler.implementation;

import academic.DTO.CourseDTO;
import academic.DTO.ProfessorDTO;
import academic.domain.CourseDomain;
import academic.domain.ProfessorDomain;
import academic.entity.CourseEntity;
import academic.entity.ProfessorEntity;
import academic.service.assembler.Assembler;

public class ProfessorAssambler implements Assembler<ProfessorDomain, ProfessorDTO, ProfessorEntity> {
	
	private static final Assembler<ProfessorDomain, ProfessorDTO, ProfessorEntity> INSTANCE =new ProfessorAssambler();
	private ProfessorAssambler() {
		 super();
		}
		public static Assembler<ProfessorDomain, ProfessorDTO, ProfessorEntity> getSubAssembler(){
			return INSTANCE;
		}
		@Override
		public ProfessorDTO convertDomaianToDTO(ProfessorDomain domain) {
			// TODO Auto-generated method stub
			return null;
		}
		@Override
		public ProfessorEntity convertDomaianToEntity(ProfessorDomain domain) {
			// TODO Auto-generated method stub
			return null;
		}
		@Override
		public ProfessorDomain convertDTOtoDomain(ProfessorDTO dto) {
			// TODO Auto-generated method stub
			return null;
		}
		@Override
		public ProfessorDomain convertEntityToDomain(ProfessorEntity entity) {
			// TODO Auto-generated method stub
			return null;
		}
	

}
