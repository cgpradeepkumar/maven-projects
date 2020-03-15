package com.samples.java.string;

import java.io.Serializable;

public final class MyString implements Serializable {

    private final String string;

    public MyString(final String string) {
        this.string = string;
    }

    public String getString() {
        return string;
    }
}
