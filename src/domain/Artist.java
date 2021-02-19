package domain;

/**
 * A subclass of Employee that represent an artist
 * @see Employee
 * @author OLEX
 */
public class Artist extends Employee {
    
    /**
     * Constructor that initializes a new object
     * @param skiils skills of artist
     * @param name name of artist
     * @param jobTitle job title of artist
     * @param level level of artist
     * @param dept artist's department
     */
    public Artist(String[] skiils, String name, String jobTitle, int level, String dept) {
        super(name, jobTitle, level, dept);
        this.skiils = skiils;
    }
    
    /**
     * Creates a new object with parameter skills
     * @param skiils skills of artist 
     */
    public Artist(String[] skiils) {
        super();
        this.skiils = skiils;
    }
    
    /**
     * Creates a new object
     */
    public Artist() {
        super();
        this.skiils = new String[10];
    }
    
    /**
     * Converting information about artist to string
     * @return string with information about artist
     */
    @Override
    public String toString() {
        return super.toString()+"\nSkills: "+getSkills();
    }

    private String[] skiils;
    
    /**
     * Method that gets skills of artist in string
     * @return skills of artist
     */
    public String getSkills() {
        String s = "";
        for (String e : skiils) {
            s = s + e + ", ";
        }
       s=s.substring(0, s.length() - 2);
        return s;
    }
    
    /**
     * Method that defines skills of artist
     * @param skills skills of artist
     */
    public void setSkills(String[] skills) {
        this.skiils=skills;
    }
    
    /**
     * Method that gets a list of skills of artist
     * @return list of skills
     */
    public String[] getSkillsLSist() {
        return skiils;
    }
}