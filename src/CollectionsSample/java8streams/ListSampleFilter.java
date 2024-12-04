package CollectionsSample.java8streams;

import java.util.ArrayList;
import java.util.List;

public class ListSampleFilter {
    public static void main(String[] args) {
        ArrayList<Integer> listObj = new ArrayList<>();
        listObj.add(4);//0th index
        listObj.add(13);
        listObj.add(14);
        listObj.add(45);
        listObj.add(43);
        listObj.add(50);
        System.out.println(listObj);
        //to get the even number from the list
//        for(int i :listObj){
//            if(i%2==0){
//                System.out.println(i);
//            }
//        }

        List<Integer> listFilter = listObj.stream().filter((i) -> i % 2 == 0).toList();
        System.out.println(listFilter);

        ArrayList<String> listObjStr = new ArrayList<>();
        listObjStr.add("ertrt");
        listObjStr.add("eawdfrtrt");
        listObjStr.add("vbvtrtertrt");
        listObjStr.add("bvnvbertrt");
        listObjStr.add("acdsfertrt");

        List<String> listFilter1 = listObjStr.stream().filter((i) -> i.startsWith("a")).toList();
        System.out.println(listFilter1);

    }
}
