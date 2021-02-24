public class Person {
    protected String name;
    protected int age;

    public Person(String name){

        this.name = name;
    }

    public Person(String george, int age) {

        this.age = age;
    }

    public int getAge() {
        return age;
    }

    public Object getName() {
        return this.name;
    }
}
