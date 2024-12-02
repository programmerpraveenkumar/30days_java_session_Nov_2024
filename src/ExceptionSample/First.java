package ExceptionSample;

//handling the error
public class First {
    public static void main(String[] args) {
        try{
          //code
            int res = 5/0;//error
            System.out.println(res);
        }catch (Exception e){
            System.out.println(e);
        }
        System.out.print("this is last line");
    }
}
