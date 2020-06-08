public class Project {
    private String name;
    private String description;
    
    public String elevatorPitch() {
       return this.getName() + " : " +  this.getDescription(); 
    }

    //Constructor functions
    public Project() {
        this.name = "";
        this.description = "";
    }
    public Project(String name) {
        this.name = name;
        this.description = "";
    }
    public Project(String name, String description) {
        this.name = "";
        this.description = "";
    }

    //Setter functions
    public void setName(String name) {
        this.name = name;
    }
    public void setDescription(String description) {
        this.description = description;
    }

    //Getter Functions
    public String getName() {
        return (name);
    }
    public String getDescription() {
        return (description);
    }
}