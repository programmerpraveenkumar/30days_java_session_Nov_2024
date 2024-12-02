package CollectionsSample;

import java.util.ArrayList;
import java.util.List;

public class ListSample {
    public static void main(String[] args) {
        ArrayList<Integer> listObj = new ArrayList<>();
        listObj.add(34);//0th index
        listObj.add(43);//1st index
        listObj.add(4233);//2nd index

        System.out.println("exist or not "+listObj.indexOf(43));
        System.out.println("exist or not "+listObj.contains(3));//true or false
        listObj.remove(2);//2index will be removed
//        listObj.
        System.out.println(listObj);
        ArrayList<String> listStrObj = new ArrayList<>();
        listStrObj.add("asdf");//0th index
        listStrObj.add("wer");//1st index

        System.out.print(listObj.get(1));//access from the inde


//        System.out.print(listObj.get(5));//error
//        for(int i :listObj){
//            System.out.print(i);
//        }
//
//        for(int start = 0;start<listObj.size();start++){
//            System.out.print(listObj.get(start));
//        }

    }
}
