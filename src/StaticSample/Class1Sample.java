package StaticSample;

public class Class1Sample {
    public static void main(String[] args) {
        //calling static vairable from other class
        //no need of object
        double d = Class2Sample.price;

        //no need of object
        Class2Sample.printMessage();;//
    }
}
