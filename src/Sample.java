public class Sample {

    void printMessage(){
        System.out.println("sample hello world");
    }
    //without main functon cant run the java class


    public static void main(String args[]){
        Sample sObj = new Sample();
        sObj.printMessage();
    }
}
