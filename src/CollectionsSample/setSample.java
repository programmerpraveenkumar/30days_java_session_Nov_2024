package CollectionsSample;

import java.util.ArrayList;
import java.util.HashSet;

public class setSample {
    public static void main(String[] args) {
        HashSet<Integer> hObj = new HashSet<>();
        hObj.add(34);//0th index
        hObj.add(43);//1st index
        hObj.add(4233);//2nd index
        hObj.add(34);//will not allow the duplicate..it ignores the value
        for(int i :hObj){
            System.out.println(i);
        }
    }
}
