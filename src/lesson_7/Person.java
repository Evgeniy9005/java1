package lesson_7;

public class Person {

    public static class Child1{
        String hello(){
            return "привет";
        }
    }

    public class Child2{
        String hello(){
            return "servus";
        }
    }
    public static void main(String[] args) {
    Child1 child1=new Child1();
    Person person=new Person();
        Person.Child2 child2=person.new Child2();
        System.out.println(child1.hello());
        System.out.println(child2.hello());
    }
}

