package academic.crosscutting.exception.enums;

public enum TypeExceptionEnum {
	BUSSINES, TECHNICAL, DEFAULT;
	public static TypeExceptionEnum getDefault() {
		return DEFAULT;
	}

}
