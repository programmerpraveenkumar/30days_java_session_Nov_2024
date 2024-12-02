package CollectionsSample;

import java.util.ArrayList;
import java.util.HashMap;

//key and value
public class MapSample {
    public static void main(String[] args) {
        HashMap<Integer,String> listObj = new HashMap<>();
        listObj.put(1,"first");
        listObj.put(5,"awefawew");

        HashMap<String,Double> m2obj = new HashMap<>();
        m2obj.put("first",45.78);
        m2obj.put("second",65.78);

        for(String s:listObj.values()){
            System.out.println(s);
        }
    }
}
