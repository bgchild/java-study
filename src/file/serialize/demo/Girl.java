package file.serialize.demo;

import java.io.Serializable;

public class Girl implements Serializable {

    public Girl(String name) {
        this.name = name;
    }

    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
