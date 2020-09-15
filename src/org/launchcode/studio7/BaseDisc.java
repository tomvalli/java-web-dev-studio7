package org.launchcode.studio7;

import java.util.HashMap;

public abstract class BaseDisc {
    private String name, diskType;
    private double capacity;
    private int year;
    private HashMap<String, String> metaData = new HashMap<>();

    public BaseDisc(String name, double capacity, String diskType, int year) {
        this.name = name;
        this.capacity = capacity;
        this.diskType = diskType;
        this.year = year;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDiskType() {
        return diskType;
    }

    public void setDiskType(String diskType) {
        this.diskType = diskType;
    }

    public double getCapacity() {
        return capacity;
    }

    public void setCapacity(double capacity) {
        this.capacity = capacity;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }
}
