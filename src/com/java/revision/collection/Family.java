package com.java.revision.collection;

public class Family {

    private int id;
    private int postcode;
    private int occupant;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getPostcode() {
        return postcode;
    }

    public void setPostcode(int postcode) {
        this.postcode = postcode;
    }

    public int getOccupant() {
        return occupant;
    }

    public void setOccupant(int occupant) {
        this.occupant = occupant;
    }

    @Override
    public String toString() {
        return "Family{" +
                "id=" + id +
                ", postcode=" + postcode +
                ", occupant=" + occupant +
                '}';
    }
}
