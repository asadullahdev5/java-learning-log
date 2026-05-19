
import java.util.Scanner;
// Employee Mangement
// Parent Class

abstract  class Employee {

    private int id;
    private String name;
    private float salary;

    // Constructor
    public Employee(int id, String name, float salary) {
        this.id = id;
        this.name = name;
        this.salary = salary;
    }
    
        public int getId(){
            return id;
        }
    
        public String getName(){
            return name;
        }
    
        public float  getSalary(){
            return salary;
        }
    


    public abstract float calculateSalary();

    @Override
    public String toString (){
        return "Employee[name "+name+",id = "+id+",salary="+calculateSalary()+"]";
    }

    
}
// Child Class Manager

class Manager extends Employee {

    private String department;

    // Child Constructor
    public Manager(int id,String name , float salary ,String department) {
        super(id, name, salary);
        this.department = department;
    }

    public String getDepartment(){
        return department;
    }

}

// Child Class Developer

class Developer extends Employee {

    private String programmingLanguage;

    // Child Constructor
    public Developer(int id,String name , float salary ,String programmingLanguage) {
        super(id, name, salary);
        this.programmingLanguage = programmingLanguage;
    }

    public String getprogrammingLanguage(){
        return programmingLanguage;
    }

}