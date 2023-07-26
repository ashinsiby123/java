class Employee1 {
    protected int empId;
    protected String name;
    protected double salary;
    protected String address;

    public Employee1(int empId, String name, double salary, String address) {
        this.empId = empId;
        this.name = name;
        this.salary = salary;
        this.address = address;
    }
}

class Teacher extends Employee1 {
    private String department;
    private String subjectsTaught;

    public Teacher(int empId, String name, double salary, String address, String department, String subjectsTaught) {
        super(empId, name, salary, address);
        this.department = department;
        this.subjectsTaught = subjectsTaught;
    }

    public void display() {
        System.out.println("Employee ID: " + empId);
        System.out.println("Name: " + name);
        System.out.println("Salary: " + salary);
        System.out.println("Address: " + address);
        System.out.println("Department: " + department);
        System.out.println("Subjects Taught: " + subjectsTaught);
        System.out.println();
    }
}

public class Employee {
    public static void main(String[] args) {
        System.out.println("J SIDDHARTH");
        System.out.println("SJC22MCA-2034");
        System.out.println("07-06-2023");
        System.out.println("20MCA132 , Object Oriented Programming Lab \n"); 
        Teacher[] teachers = new Teacher[2];
        teachers[0] = new Teacher(101, "John Doe", 5000.0, "123 Main St", "Mathematics", "Algebra, Calculus");
        teachers[1] = new Teacher(102, "Jane Smith", 6000.0, "456 Elm St", "Science", "Physics, Chemistry");

        for (Teacher teacher : teachers) {
            teacher.display();
        }
    }
}

