package in.sample.java.string;

import java.io.Serializable;

public final class MyString implements Serializable {
    private String string;

    public MyString(String string) {
        this.string = string;
    }

    public String getString() {
        return string;
    }
}
