package academic.service.assembler;

public interface Assembler<D,T,E> {
	
	T convertDomaianToDTO(D domain);
	E convertDomaianToEntity(D domain);
	D convertDTOtoDomain(T dto);
	D convertEntityToDomain(E entity);

}
