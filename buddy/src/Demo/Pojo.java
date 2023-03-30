package Demo;

import java.io.File;
import java.io.IOException;

import com.fasterxml.jackson.databind.ObjectMapper;

public class Pojo {
    public static void main(String[] args) {
        // Create an object mapper instance
        ObjectMapper objectMapper = new ObjectMapper();

        // Create a POJO object
        Employee employee = new Employee("buddy", "mii", "anwer@gmail.com", 25);

        try {
            // Serialize the POJO object to a JSON file
            objectMapper.writeValue(new File("employee.json"), employee);

            // Deserialize the JSON file to a POJO object
            Employee deserializedEmployee = objectMapper.readValue(new File("employee.json"), Employee.class);

            // Print the deserialized POJO object
            System.out.println(deserializedEmployee);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}

class Employee {
    private String firstName;
    private String lastName;
    private String email;
    private int age;

    public Employee() {
    }

    public Employee(String firstName, String lastName, String email, int age) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.email = email;
        this.age = age;
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

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	@Override
    public String toString() {
        return "Employee [firstName=" + firstName + ", lastName=" + lastName + ", email=" + email + ", age=" + age + "]";
    }
}
