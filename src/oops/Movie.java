package oops;

/*
cant create object directly
if any method declared as abstract that has to override in child class
 */
public abstract class Movie {
    void printMessage(){
        System.out.print("sample output..");
    }

    //below should override in the child class
    //cant give definition fot the abstract method..
    abstract void addPlus10(int num);
}
