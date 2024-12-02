package ArraySample;
/*
array is for storing multiple values
it can be declared with square brackets and values defined by {}
in run time we cant add new values and cant increase the size of the array
 */
public class FirstArray {
    void message( String nameList []){
        for(int start = 0;start<nameList.length;start++){
            System.out.println(nameList[start]);
        }
    }

    public static void main(String[] args) {
        int mobile[] = {2341234,7867867,345455,6786787};//integer array
        String nameList [] = {"sdfasd","tes12","adfswa1","sdfsadf"};//string array
        System.out.println(mobile[1]);
        System.out.println(mobile[3]);//access the value from 3rd position
        System.out.println(nameList[0]);//access the value from the 0th position
        System.out.println(nameList[10]);//error ArrayIndexOutOfBoundsException

        for(int start = 0;start<mobile.length;start++){
            System.out.println(mobile[start]);
        }
        //iteration
        for(int i :mobile){
            System.out.println(i);
        }

        for(String n : nameList){
            System.out.println(n);
        }
        FirstArray f =  new FirstArray();
        f.message(new String[]{"dfs","wf"});
    }
}
