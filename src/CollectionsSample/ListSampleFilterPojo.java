package CollectionsSample;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ListSampleFilterPojo {
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

         listObj.stream().filter((c)->c.getStudentCount() >1).forEach((o)->{
            System.out.println(o.getName());
        });
//        System.out.print(lfilter);
    }
}
