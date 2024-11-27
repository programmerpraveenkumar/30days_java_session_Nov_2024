package oops;

/*
inheriting the props from A class to B
 */
public class B extends A {
    public static void main(String[] args) {
        B bobj = new B();
        System.out.println(bobj.num);
        System.out.println(bobj.mobile);
        bobj.add(12,45);
    }
}
