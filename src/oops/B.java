package oops;

/*
inheriting the props from A class to B
 */
public class B extends A implements SampleIntr {
    public static void main(String[] args) {
        B bobj = new B();
        System.out.println(bobj.num);
        System.out.println(bobj.mobile);
        bobj.add(12,45);
    }

    @Override
    public void printMessage() {

    }

    @Override
    public void printName() {

    }

    //override will be added only when method is override
    // from the parent class
//    @Override
//    public void add(int num, int num2) {
//        int res = num+num2;
//        System.out.print("result is "+res);
//    }
}

//overloading and override