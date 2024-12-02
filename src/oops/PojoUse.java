package oops;

public class PojoUse {
    public static void main(String[] args) {
        Person person1 = new Person();
        person1.setId(1);
        person1.setName("vignesh");

        Person person2 = new Person();
        person2.setId(2);
        person2.setName("deepasree");


        System.out.println(person1.getId());
        System.out.println(person2.getName());

    }
}
