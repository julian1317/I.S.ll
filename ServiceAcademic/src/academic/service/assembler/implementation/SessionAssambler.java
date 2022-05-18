package academic.service.assembler.implementation;

import org.hibernate.Session;

import academic.DTO.ProfessorDTO;
import academic.DTO.SessionDTO;
import academic.domain.ProfessorDomain;
import academic.domain.SessioDomain;
import academic.entity.ProfessorEntity;
import academic.entity.SessioEntity;
import academic.service.assembler.Assembler;

public class SessionAssambler implements Assembler<SessioDomain, SessionDTO, SessioEntity>{
	
	private static final Assembler<SessioDomain, SessionDTO, SessioEntity> INSTANCE =new SessionAssambler();
	private SessionAssambler() {
		 super();
		}
		public static Assembler<SessioDomain, SessionDTO, SessioEntity> getSubAssembler(){
			return INSTANCE;
		}
		@Override
		public SessionDTO convertDomaianToDTO(SessioDomain domain) {
			// TODO Auto-generated method stub
			return null;
		}
		@Override
		public SessioEntity convertDomaianToEntity(SessioDomain domain) {
			// TODO Auto-generated method stub
			return null;
		}
		@Override
		public SessioDomain convertDTOtoDomain(SessionDTO dto) {
			// TODO Auto-generated method stub
			return null;
		}
		@Override
		public SessioDomain convertEntityToDomain(SessioEntity entity) {
			// TODO Auto-generated method stub
			return null;
		}
	

}
