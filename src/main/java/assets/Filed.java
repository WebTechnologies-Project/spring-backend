package assets;

import java.util.ArrayList;

public class Filed {
    private String content;
    private Types type;
    private Integer formID;

    public Filed(String content, Types type, Integer formID) {
        this.content = content;
        this.type = type;
        this.formID = formID;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public Types getType() {
        return type;
    }

    public void setType(Types type) {
        this.type = type;
    }

    public Integer getFormID() {
        return formID;
    }

    public void setFormID(Integer formID) {
        this.formID = formID;
    }
}
