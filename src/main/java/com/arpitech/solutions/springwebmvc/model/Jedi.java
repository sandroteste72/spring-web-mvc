package com.arpitech.solutions.springwebmvc.model;

import javax.validation.constraints.NotBlank;

public class Jedi {

    @NotBlank
    private String name;
    @NotBlank
    private String lastName;

    public Jedi() {
    }

    public Jedi(final String name, final String lastName) {
        this.name = name;
        this.lastName = lastName;
    }

    public String getName() {
        return name;
    }

    public void setName(final String name) {
        this.name = name;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(final String lastName) {
        this.lastName = lastName;
    }
}
