package org.launchcode.studio7;

import java.util.HashMap;

public class CD extends BaseDisc implements OpticalDisc {

    public CD(String name, double capacity, String diskType, int year){
        super(name, capacity, diskType, year);
    }

    @Override
    public void storeData(String data) {

    }

    @Override
    public String readData() {
        return null;
    }

    @Override
    public HashMap<String, String> getMetaData() {
        return null;
    }

    @Override
    public void storeData() {

    }

    @Override
    public void spinDisc(boolean spin) {

    }

    // TODO: Implement your custom interface.

    // TODO: Determine which fields, methods, and constructors can be extended from the base class and which ones
    //  need to be declared separately.

}
