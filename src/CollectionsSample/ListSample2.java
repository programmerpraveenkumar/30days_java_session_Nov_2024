package CollectionsSample;

import java.util.ArrayList;
import java.util.Collections;

public class ListSample2 {
    public static void main(String[] args) {
        ArrayList<Integer> listObj = new ArrayList<>();
        listObj.add(43);
        listObj.add(4);
        listObj.add(2);
        listObj.add(1);
        listObj.add(34);
        listObj.add(134);
        listObj.add(4233);
        Collections.sort(listObj);//it will sort the data
        System.out.println(listObj);

        ArrayList<String> listStrObj = new ArrayList<>();
        listStrObj.add("zsdasdfa");
        listStrObj.add("asdfa");
        listStrObj.add("efewasdfa");
        System.out.println(listStrObj);//before sorting

        Collections.sort(listStrObj);//it will sort the data
        System.out.println(listStrObj);

    }
}
