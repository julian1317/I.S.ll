package academic.service.facade.attendance.implementation;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import academic.DTO.AttendanceDTO;
import academic.domain.AttendanceDomain;
import academic.persistence.dao.attendance.AttendanceRepository;
import academic.service.facade.attendance.RegisterAttendanceFacade;
import academic.service.usecase.attendance.RegisterAttendanceImpl;
import academic.service.usecase.attendance.RegistterAttendance;

@Service
@Transactional
public class RegisterAttendaceFaceImpl  implements RegistterAttendance{
	@Autowired
	private AttendanceRepository attendanceRepository;

	@Override
	public void execute(AttendanceDomain domain) {
		registerAttendanceDomain = ;
		registerAttendance.execute(domain); 
		
	}

	

}
