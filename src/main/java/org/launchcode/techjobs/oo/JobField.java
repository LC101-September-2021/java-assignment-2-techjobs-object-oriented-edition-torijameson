package org.launchcode.techjobs.oo;

public abstract class JobField {

    private int id;
    private static int nextId = 1;
    private String value;

    public Employer() {
        id = nextId;
        nextId++;
    }

    @Override
    public String toString() {
        return value;
    }
    // postion type is a custom type of toString so dont comment it out?

    public String getValue() {
        return value;
    }

    public int getId() {return id;}

    public void setValue(String value) {
        this.value = value;
    }
}












}
