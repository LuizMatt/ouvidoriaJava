package model;

public class Manifestation {

    public enum ManifestationType {
        ELOGIO, SUGESTAO, RECLAMACAO
    }

    private String title;
    private int id;
    private ManifestationType type;
    private String description;

    public Manifestation(String title, int id, ManifestationType type, String description) {
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

    public ManifestationType getType() {
        return type;
    }

    public String getDescription() {
        return description;
    }

    // Setters

    public void setTitle(String title) {
        this.title = title;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setType(ManifestationType type) {
        this.type = type;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}
