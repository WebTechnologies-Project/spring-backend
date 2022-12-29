package assets;

import java.util.ArrayList;

public class Form {

    private String title;
    private Integer id;
    private String description;
    public ArrayList<Filed> fileds = new ArrayList<>();

    public Form(String title, Integer id, String description) {
        this.title = title;
        this.id = id;
        this.description = description;
    }

    public String getTitle() {
        return title;
    }

    public Integer getId() {
        return id;
    }

    public String getDescription() {
        return description;
    }

    public void setFileds(ArrayList<Filed> fileds) {
        this.fileds = fileds;
    }
}
