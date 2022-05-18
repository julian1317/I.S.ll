package academic.service.usecase.validator.rules.student;

import org.springframework.stereotype.Service;

import academic.domain.StudentDomain;
import academic.service.usecase.validator.rules.Rule;

public class StudentIsActive implements Rule<StudentDomain> {
	@Service
	public void execute(StudentDomain domain)

}
