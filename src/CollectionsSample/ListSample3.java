package CollectionsSample;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class ListSample3 {
    public static void main(String[] args) {
        //city is the data type of arraylist
        ArrayList<City> listObj = new ArrayList<>();

        City c1 = new City();
        c1.setId(1);
        c1.setName("zfdf");

        City c2 = new City();
        c2.setId(2);
        c2.setName("afdwerdf");

        City c3 = new City();
        c3.setId(3);
        c3.setName("gfdfawfw");

        listObj.add(c3);//adding the cityobj to list
        listObj.add(c1);//adding the cityobj to list
        listObj.add(c2);//adding the cityobj to list

        for(City c:listObj){
            System.out.println(c.getId()+" "+c.getName());
        }

//        //java does not know how to sort the city datetype of list.so it throws the error
//        Collections.sort(listObj);
//      /  Collections.sort(listObj,new IdComparator());//sort the custom data type
      Collections.sort(listObj,new NameComparator());//sort the custom data type
        System.out.println("----after sorting--");
        for(City c:listObj){
            System.out.println(c.getId()+" "+c.getName());
        }
    }
}

class IdComparator implements Comparator<City>{
    @Override
    public int compare(City o1, City o2) {
        return Integer.compare(o1.getId(),o2.getId());
    }
}


class NameComparator implements Comparator<City>{
    @Override
    public int compare(City o1, City o2) {
        return o1.getName().compareTo(o2.getName());
    }
}
