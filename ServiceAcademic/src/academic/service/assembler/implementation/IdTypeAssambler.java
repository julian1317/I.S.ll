package academic.service.assembler.implementation;

import academic.DTO.CourseDTO;
import academic.DTO.IdTypeDTO;
import academic.domain.CourseDomain;
import academic.domain.IdTypeDomain;
import academic.entity.CourseEntity;
import academic.entity.IdTypeEntity;
import academic.service.assembler.Assembler;

public class IdTypeAssambler implements Assembler<IdTypeDomain, IdTypeDTO, IdTypeEntity> {

	private static final Assembler<IdTypeDomain, IdTypeDTO, IdTypeEntity> INSTANCE =new IdTypeAssambler();
	private IdTypeAssambler() {
		 super();
		}
		public static Assembler<IdTypeDomain, IdTypeDTO, IdTypeEntity> getSubAssembler(){
			return INSTANCE;
		}
		@Override
		public IdTypeDTO convertDomaianToDTO(IdTypeDomain domain) {
			// TODO Auto-generated method stub
			if(domain == null) {
				var message= "no es posible convertir un IdTypeDomain a un IdTypeDTO cuando es nulo";
				/*falta la exceptio*/
			}
			return IdTypeDomain.create(domain.getId(), domain.getName());
		}
		@Override
		public IdTypeEntity convertDomaianToEntity(IdTypeDomain domain) {
			// TODO Auto-generated method stub
			return null;
		}
		@Override
		public IdTypeDomain convertDTOtoDomain(IdTypeDTO dto) {
			// TODO Auto-generated method stub
			return null;
		}
		@Override
		public IdTypeDomain convertEntityToDomain(IdTypeEntity entity) {
			// TODO Auto-generated method stub
			return null;
		}
	
	
	
	

}
