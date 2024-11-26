//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {

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

    }

    void add(int num1,int num2){
        int x = num1+num2;//after addition result is store in x.
        System.out.println(x);
    }
}