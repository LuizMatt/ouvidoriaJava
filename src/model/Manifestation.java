package model;

public class Manifestation {
    private String title;
    private int id;
    private String type;
    private String description;

    public Manifestation(String title, int id, String type, String description) {
        this.title = title;
        this.id = id;
        this.type = type;
        this.description = description;
    }

    // Getters

    public String getTitle() {
        return title;
    }
    public int getId() {
        return id;
    }
        public String getType() {
        return type;
    }
    public String getDescription(){
        return description;
    }

    // Setters
    
    public void setTitle(String title) {
        this.title = title;
    }
    
    public void setId(int id) {
        this.id = id;
    }
    
    public void setType(String type) {
        this.type = type;
    }
    public void setDescription(String description){
        this.description = description;
    }
}
