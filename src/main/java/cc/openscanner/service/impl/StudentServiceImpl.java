package cc.openscanner.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;

import cc.openscanner.dao.StudentDao;
import cc.openscanner.domain.Student;
import cc.openscanner.service.StudentService;

/**
 * @author Li7nux@gmail.com
 * @date 2016年4月16日 下午10:43:01
 * @description 
 */

@Component
@Transactional
public class StudentServiceImpl implements StudentService{
	
	private StudentDao studentDao;

	@Autowired
	public StudentServiceImpl(final StudentDao studentDao) {
		this.studentDao = studentDao;
	}

	@Override
	public List<Student> findAll() {
		return studentDao.findAll();
	}

	@Override
	public Student findById(String id) {
		return studentDao.findById(id);
	}

	@Override
	public Student save(Student student) {
		return studentDao.save(student);
	}
	

}
