package cc.openscanner.domain;

/**
 * @author Li7nux@gmail.com
 * @date 2016年4月16日 下午10:34:08
 * @description 
 */

public class Student {
	
	private String id;
    private String firstName;
    private String lastName;
    
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
}
