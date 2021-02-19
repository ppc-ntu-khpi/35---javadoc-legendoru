package domain;

/**
 * A subclass of Artist that represent an editor
 * @see Artist
 * @author OLEX
 */
public class Editor extends Artist {
    
    /**
     * Constructor that initializes a new object
     * @param electronicEditing status of electronic editing
     * @param skiils skills of editor
     * @param name name of editor
     * @param jobTitle job title of editor
     * @param level level of editor
     * @param dept editor's department
     */
    public Editor(boolean electronicEditing, String[] skiils, String name, String jobTitle, int level, String dept) {
        super(skiils, name, jobTitle, level, dept);
        this.electronicEditing = electronicEditing;
    }
    
    /**
     * Creates a new object with parameter electronic editing and skills
     * @param electronicEditing status of electronic editing
     * @param skiils skills of editor
     */
    public Editor(boolean electronicEditing, String[] skiils) {
        super(skiils);
        this.electronicEditing = electronicEditing;
    }
    
    /**
     * Creates a new object with parameter electronic editing
     * @param electronicEditing status of electronic editing
     */
    public Editor(boolean electronicEditing) {
        super();
        this.electronicEditing = electronicEditing;
    }
    
    /**
     * Creates a new object and electroning editing is turn on
     */
    public Editor() {
        super();
        this.electronicEditing = true;
    }
    
    /**
     * Converting information about a person with informaton about skills and status of electronic editing to string
     * @return string with information a person
     */
    @Override
    public String toString() {
        String s=super.toString()+"\nEditing preferences= "; 
        if (electronicEditing)
            s=s+"electronic";
        else
            s=s+"paper";
        return s;
            
    }

    private boolean electronicEditing;

    /**
     * Method that gets a status of electronic editing
     * @return boolean value of electroning editing
     */
    public boolean getPreferences() {
        return electronicEditing;
    }

    /**
     * Method that defines a status of electronic editing
     * @param electronic status of electroning editing
     */
    public void setPreferences(boolean electronic) {
        this.electronicEditing=electronic;
    }
}