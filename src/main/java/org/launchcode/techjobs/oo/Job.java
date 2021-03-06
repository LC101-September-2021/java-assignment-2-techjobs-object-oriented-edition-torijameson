package org.launchcode.techjobs.oo;

import java.util.Objects;

public class Job {

    private int id;
    private static int nextId = 1;

    private String name;
    private Employer employer;
    private Location location;
    private PositionType positionType;
    private CoreCompetency coreCompetency;


    //***** copied from first file- 2 constructors
    // Step 1: constructor for a unique ID
    public Job () {
        id=nextId;
        nextId++;
    }
    //Step 2: second constructor calling the first, and initalizng other fields


    public Job (String name, Employer employer, Location location, PositionType positionType, CoreCompetency coreCompetency){
        this();
        this.name=name;
        this.employer=employer;
        this.location=location;
        this.positionType=positionType;
        this.coreCompetency=coreCompetency;
    }



    //******** Done. Custom equals and hashcode methods . equal when id fields match (is this here?)
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Job)) return false;
        Job job = (Job) o;
        return id == job.id;
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }


    // ******* Done:  Add getters for each field EXCEPT nextId. Add setters for each field EXCEPT nextID
    //  and id.
    public int getId() {
        return id;
    }
    public String getName() {
        return name;
    }
    public Employer getEmployer() {
        return employer;
    }
    public Location getLocation() {
        return location;
    }
    public PositionType getPositionType() {
        return positionType;
    }
    public CoreCompetency getCoreCompetency() {
        return coreCompetency;
    }

    public void setName(String name) {
        this.name = name;
    }
    public void setEmployer(Employer employer) {
        this.employer = employer;
    }
    public void setLocation(Location location) {
        this.location = location;
    }
    public void setPositionType(PositionType positionType) {
        this.positionType = positionType;
    }
    public void setCoreCompetency(CoreCompetency coreCompetency) {
        this.coreCompetency = coreCompetency;
    }

    @Override
    public String toString() {
        String dataNotFound ="Data not available";
        return "[" +"\n"+
                "ID: " + id +"\n"+
                "Name: " + name + '\'' +"\n"+
                "Employer: " + (employer.toString().equals("")? dataNotFound :employer.toString()) +"\n"+
                "Location: " + (location.toString().equals("")? dataNotFound : location.toString()) +"\n"+
                "Position Type: " + (positionType.toString().equals("")? dataNotFound :positionType.toString())  +"\n"+
                "Core Competency: " + (coreCompetency.toString().equals("")? dataNotFound :coreCompetency.toString())  +"\n"+
                ']';
    }
}
