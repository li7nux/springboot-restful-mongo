package cc.openscanner.dao;

import org.springframework.data.mongodb.repository.MongoRepository;

import cc.openscanner.domain.Student;

/**
 * @author Li7nux@gmail.com
 * @date 2016年4月16日 下午10:37:18
 * @description
 */

public interface StudentDao extends MongoRepository<Student, String> {
	
	public Student findByFirstName(String firstName);

	public Student findByLastName(String lastName);
	
	public Student findById(String id);

}
