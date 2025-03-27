
public class Employee {

	int id;
	String name;
	String email;
	String gender;
	String status;
	String[] task;
	
	public String[] getTask() {
		return task;
	}
	public void setTask(String[] task) {
		this.task = task;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getGender() {
		return gender;
	}	public void setGender(String gender) {
		this.gender = gender;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	
	public static void main(String[] args) {
	
		Employee emp=new Employee();
		emp.setId(7795710);
		emp.setEmail("desai_vinay@roberts.example");
		emp.setName("Vinay Desai");
		emp.setGender("female");
		emp.setStatus("active");
		System.out.println(emp);
	}
	

}
