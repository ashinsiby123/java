import java.util.Scanner;

class Person {
    String Name;
    String Gender;
    String Address;
    String Age;

    public Person(String Name, String Gender, String Address, String Age) {
        this.Name = Name;
        this.Gender = Gender;
        this.Address = Address;
        this.Age = Age;
    }
}

class Employee extends Person {
    String Empid;
    String Company_Name;
    String Qualification;
    String Salary;

    public Employee(String Name, String Gender, String Address, String Age, String Empid, String Company_Name,
            String Qualification, String Salary) {
        super(Name, Gender, Address, Age);
        this.Empid = Empid;
        this.Company_Name = Company_Name;
        this.Qualification = Qualification;
        this.Salary = Salary;
    }
}

class Teacher extends Employee {
    String Teacherid;
    String Department;
    String Subject;

    public Teacher(String Name, String Gender, String Address, String Age, String Empid, String Company_Name,
            String Qualification, String Salary, String Teacherid, String Department, String Subject) {
        super(Name, Gender, Address, Age, Empid, Name, Qualification, Salary);
        this.Teacherid = Teacherid;
        this.Department = Department;
        this.Subject = Subject;
    }

    public void read() {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the Name=");
        Name = in.nextLine();
        System.out.println("Enter the Gender=");
        Gender = in.nextLine();
        System.out.println("Enter the Address=");
        Address = in.nextLine();
        System.out.println("Enter the Age=");
        Age = in.nextLine();
        System.out.println("Enter the Employee ID=");
        Empid = in.nextLine();
        System.out.println("Enter the Company Name=");
        Company_Name = in.nextLine();
        System.out.println("Enter the Qualification=");
        Qualification = in.nextLine();
        System.out.println("Enter the Salary=");
        Salary = in.nextLine();
        System.out.println("Enter the Teacher ID=");
        Teacherid = in.nextLine();
        System.out.println("Enter the Department=");
        Department = in.nextLine();
        System.out.println("Enter the Subject=");
        Subject = in.nextLine();
        System.out.println("\n");
    }

    public void display() {
        System.out.println("_______Employee Details_________");
        System.out.println("Name=" + Name);
        System.out.println("Gender=" + Gender);
        System.out.println("Address=" + Address);
        System.out.println("Age=" + Age);
        System.out.println("Empid=" + Empid);
        System.out.println("Company Name=" + Company_Name);
        System.out.println("Qualification=" + Qualification);
        System.out.println("Salary=" + Salary);
        System.out.println("Teacher id=" + Teacherid);
        System.out.println("Department=" + Department);
        System.out.println("Subject=" + Subject);
        System.out.println("+++++++++++++++++++++++++++++++++++++++++++");
    }
}

public class Person1 {
    public static void main(String Args[]) {
        System.out.println("J Siddharth");
        System.out.println("SJC22MCA-2034");
        System.out.println("07-06-2023");
        System.out.println("20MCA132, Object Oriented Programming Lab \n\n");

        int i, n;
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the Number of employees=");
        n = in.nextInt();
        Teacher T[] = new Teacher[n];
        for (i = 0; i < n; i++) {
            T[i] = new Teacher("Name", "Gender", "Address", "Age", "Empid", "Name", "Qualification", "Salary",
                    "Teacherid", "Department", "Subject");
            T[i].read();
        }
        for (i = 0; i < n; i++) {
            T[i].display();
        }
    }
}

