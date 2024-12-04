package CollectionsSample;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class ListSample4 {
    public static void main(String[] args) {
        ArrayList<College> listObj = new ArrayList<>();

        College c1 = new College();
        c1.setStudentCount(1);
        c1.setName("zfdf");

        College c2 = new College();
        c2.setStudentCount(2);
        c2.setName("afdwerdf");

        College c3 = new College();
        c3.setStudentCount(3);
        c3.setName("gfdfawfw");

        listObj.add(c3);//adding the cityobj to list
        listObj.add(c1);//adding the cityobj to list
        listObj.add(c2);//adding the cityobj to list

        for(College c:listObj){
            System.out.println(c.getStudentCount()+" "+c.getName());
        }

        ///as we are using comparable java will not throw the error.
        Collections.sort(listObj);
        System.out.println("--after sorting---");
        for(College c:listObj){
            System.out.println(c.getStudentCount()+" "+c.getName());
        }
    }
}
