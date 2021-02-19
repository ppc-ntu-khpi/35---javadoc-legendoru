package domain;

/**
 * A subclass of Employee that represent a manager
 * @see Employee
 * @author OLEX
 */
public class Manager extends Employee {

    /**
     * Constructor that initializes a new object
     * @param employees employees 
     * @param name name of employee
     * @param jobTitle job title of employee
     * @param level level of employee
     * @param dept employee's department
     */
    public Manager(Employee[] employees, String name, String jobTitle, int level, String dept) {
        super(name, jobTitle, level, dept);
        this.employees = employees;
    }
    
    /**
     * Converting information about employees to string
     * @return string of information about employees
     */
    @Override
    public String toString() {
        return super.toString()+"\nEmployees: "+getEmployees(); 
    }

    /**
     * Creates a new object with parameter
     * @param employees employees of manager
     */
    public Manager(Employee[] employees) {
        super();
        this.employees = employees;
    }
    
    /**
     * Creates a new object
     */
    public Manager() {
        super();
        employees = new Employee[10];
    }

    private Employee[] employees;
    
    /**
     * Method that gets a names of employees
     * @return names of employees
     */
    public String getEmployees() {
        String s = "";
        for (Employee e : employees) {
            s = s + e.getName() + ", ";
        }
        s=s.substring(0, s.length() - 2);
        return s;
    }

    /**
     * Method that defines an employees of manager
     * @param employees employees of manager
     */
    public void setEmployees(Employee[] employees) {
        this.employees=employees;
    }

    /**
     * Method that gets a list of employees
     * @return array of employees
     */
    public Employee[] getEmployeesList() {
        return employees;
    }

    
}