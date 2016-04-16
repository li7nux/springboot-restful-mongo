package cc.openscanner.service;

import java.util.List;

import cc.openscanner.domain.Student;

/**
 * @author Li7nux@gmail.com
 * @date 2016年4月16日 下午10:41:50
 * @description
 */

public interface StudentService {

	List<Student> findAll();

	Student findById(String id);

	Student save(Student student);

}
