package org.launchcode.techjobs.oo;

import java.util.Objects;

public abstract class JobField {

    private int id;
    private static int nextId = 1;
    private String value;

    public JobField(String value) {
        id = nextId;
        nextId++;
        this.value=value;
    }

    @Override
    public String toString() {
        return value;
    }
    // postion type is a custom type of toString so dont comment it out?

    @Override
    public boolean equals(Object o) {  // Two objects are equal if they have the same id.
        if (this == o) return true;
        if (!(o instanceof JobField)) return false;
        JobField jobField = (JobField) o;
        return getId() == jobField.getId();
    }

    @Override
    public int hashCode() {
        return Objects.hash(getId());
    }

    public String getValue() {
        return value;
    }

    public int getId() {return id;}

    public void setValue(String value) {
        this.value = value;
    }
}













