package org.launchcode.studio7;

import java.util.HashMap;

public interface OpticalDisc {
    void storeData(String data);
    String readData();
    HashMap<String, String> getMetaData();
    void storeData();
    void spinDisc(boolean spin);

}
