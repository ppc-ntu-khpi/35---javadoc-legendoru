package domain;

/**
 * A class that represent an employee
 * @author legendoru
 */
public class Employee {
    
    /**
     * Displays information about employee
     * @return string with information about employee
     */
    @Override
    public String toString() {
        return "\nEmployee ID= " + ID + "\nName= " + name + "\nJobTitle= " + jobTitle + "\nLevel= " + level + "\nDept= " + dept;
    }

    private String name;
    private String jobTitle;
    private int ID;
    private int level;
    private String dept;

   // private static int employeesCount = 0;
    
    /**
     * Constructor with parameters
     * @param name name of employee
     * @param jobTitle job title of employee
     * @param level level of employee
     * @param dept employee's department
     */
    public Employee(String name, String jobTitle, int level, String dept) {
        this();
        setName(name);
        this.jobTitle = jobTitle;
        switch (level) {
            case 1:
            case 2:
            case 3:
                this.level = level;
                break;
            default:
                this.level = 1;
        }
        this.dept = dept;
    }
    
    /**
     * Constructor
     * Initialize ID of employee as integer ranging from 1 to 1000
     */
    public Employee() {
        ID = (int)(Math.random()*1000);
//        if (ID > 10000) {
//            throw new NumberFormatException("ERROR! Employee's ID cannot be greater than 10000. Employee is not created!");
//        }
    }
    
    /**
     * Method that defines a job title of employee
     * @param job job title
     */
    public void setJobTitle(String job) {
        jobTitle = job;
    }
    
    /**
     * Method that gets a job title of employee
     * @return job title
     */
    public String getJobTitle() {
        return jobTitle;
    }
    
    /**
     * Method that gets a name of employee
     * @return name of employee
     */
    public String getName() {
        return name;
    }
    
    /**
     * Method that defines a level of employee
     * @param level level of emloyee
     */
    public void setLevel(int level) {
        switch (level) {
            case 1:
            case 2:
            case 3:
                this.level = level;
                break;
            default:
                this.level = 1;
        }
    }
    
    /**
     * Method that gets a level of employee
     * @return level of employee
     */
    public int getLevel() {
        return level;
    }
    
    /**
     * Method that gets a department of employee
     * @return department of employee
     */
    public String getDept() {
        return dept;
    }
    
    /**
     * Method that defines a department of employee
     * @param dept department of employee
     */
    public void setDept(String dept) {
        this.dept = dept;
    }
    
    /**
     * Method that defines a name of employee
     * @param name name of employee
     */
    public void setName(String name) {
//        boolean correctName = true;
//        for (int i = 0; i < name.length(); i++) {
//            char s = name.charAt(i);
//            if (Character.isDigit(s)) {
//                correctName = false;
//            }
//        }
//        if (correctName) {
//            this.name = name;
//        } else {
//            this.name = "John Doe";
//        }
        if (name.matches("^([a-zA-Z]+[\\'\\,\\.\\-]?[a-zA-Z ]*)+[ ]([a-zA-Z]+[\\'\\,\\.\\-]?[a-zA-Z ]+)+$")) {
            this.name = name;
        } else {
            this.name = "John Doe";
        }
    }
}