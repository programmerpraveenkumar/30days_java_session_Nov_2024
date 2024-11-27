//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
        static int age = 12;
        int age2 = 13;
    public static void main(String[] args) {
        //declaring the variables`
        int number = 45;//to store the number
        float price = 56.56f;//to store the decimal number
        boolean status = false;//true or false

        System.out.println("hello world");
        System.out.println(number);//printing the variables
        System.out.println(price);
        System.out.println(status);

        int num1 = 45;
        int num2 = 56;
        int x = num1+num2;//after addition result is store in x.
        System.out.println(x);

        //classname obj   = new classsname();
        Main mObj = new Main();
        mObj.add(10,14);
        mObj.add(30,54);
        mObj.add(100,14);
        mObj.add(100,14,45);
        mObj.add(100,14,45.677);
       // mObj.add(100,14,false);//error..no method avaiable for matching this params

        System.out.println(age);//static varibles does not need any object
//        System.out.println(age2);//error.non-static variable should be called with object,.


        printMyCity();//static methods does not need any object
    }

    static void printMyCity(){
        System.out.println("sample city");
    }

    void add(int num1,int num2){
        int x = num1+num2;//after addition result is store in x.
        System.out.println(x);
        //return x;//error..should not return as this method is void
    }

    //method overloading-> same method with different parameters
    void add(int num1,int num2,int num3){
        int x = num1+num2+num3;//after addition result is store in x.
        System.out.println(x);
        //return x;//error..should not return as this method is void
    }
    void add(int num1,int num2,double dbl){
        int x = (int) (num1+num2+dbl);//after addition result is store in x.
        System.out.println(x);
        //return x;//error..should not return as this method is void
    }


    int subtraction(int num1,int num2){
        int x = num1-num2;//after addition result is store in x.
        return x;//return should be last the line
       // System.out.println("asdfadsf");//error ..should not have any statement after return
    }
}