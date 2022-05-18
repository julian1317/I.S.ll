package academic.service.usecase.validator.attendance;
import javax.xml.validation.Validator;

import academic.domain.AttendanceDomain;
import academic.service.usecase.attendance.validator;

public class RegisterAttendaceValidator implements validator<AttendanceDomain> {
	private static final Validator<AttendanceDomain> INSTANCE = new RegisterAttendaceValidator();
	
	private RegisterAttendaceValidator() {
	super();
	}
	private static  Validator<AttendanceDomain>  getregisterattendanceValidator() {
		return INSTACE;
	
	}
	
	
	@Override
	public void validate(AttendanceDomain domain) {
		// TODO Auto-generated method stub
		
	}

}
