package CollectionsSample.java8streams;

import java.util.ArrayList;
import java.util.List;

public class ListSampleMap {
    public static void main(String[] args) {
        ArrayList<Integer> listObj = new ArrayList<>();
        listObj.add(4);//0th index
        listObj.add(13);
        listObj.add(14);
        listObj.add(45);
        listObj.add(43);
        listObj.add(50);
        System.out.println(listObj);

//        List<Integer> listFilter = listObj.stream().map((i) ->i*2).toList();
//        System.out.println(listFilter);

        ///get the even num and multiply by 10

        List<Integer> listFilter =  listObj.stream().filter((i) ->i%2==0).map((o)->o*10).toList();
        System.out.println(listFilter);
    }
}
