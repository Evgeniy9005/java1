package lesson_8;

public abstract class PersonCompare {
    public int compare(Person p1, Person p2) {
        return 0;
    }

    public static void main(String[] args) {
        Person p1=new Person("Харе");
        Person p2=new Person("Кришна");
        System.out.println(p2.name.compareTo(p1.name));
        //анонимный класс перекрывает метод абстрактного класса
        PersonCompare personCompare=new PersonCompare(){
            @Override
            public int compare(Person p1, Person p2) {
                return p1.name.compareTo(p2.name);
            }
        };
        //System.out.println(personCompare.compare(p1,p2));
        System.out.println(personCompare.compare(p1,p2));
    }

}
