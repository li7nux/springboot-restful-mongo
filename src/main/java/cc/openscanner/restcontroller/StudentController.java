package cc.openscanner.restcontroller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import cc.openscanner.domain.Student;
import cc.openscanner.service.StudentService;

/**
 * @author Li7nux@gmail.com
 * @date 2016年4月16日 下午10:50:45
 * @description
 */

@RestController
@Component
public class StudentController {

	private StudentService studentService;

	@Autowired
	public StudentController(final StudentService studentService) {
		this.studentService = studentService;
	}

	@RequestMapping("/listStudents")
	public List<Student> getAll() {
		return studentService.findAll();
	}

	@RequestMapping("/student/")
	public Student findById(@RequestParam("id") String id) {
		return studentService.findById(id);
	}

	@RequestMapping(value = "/saveperson", method = RequestMethod.POST, consumes = "application/json")
	public ResponseEntity<?> save(@RequestBody final Student student) {

		// TODO need to do more
		return null;
	}

}
