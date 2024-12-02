package ExceptionSample;
//returning the error
public class CustomError2 {
    public static void main(String[] args) {
        //check the child age
        // if age is greater than 10 we ll create an error
        int age = 65;
    }
    //return the error
    void checkChild(int age)throws Exception{
            if(age >10){
                //create error
                throw new Exception("this is not child");
            }else{
                System.out.println("age is fine..this is child");
            }

    }
}
