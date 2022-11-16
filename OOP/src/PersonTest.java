public class PersonTest {
    public static void main(String[] args) {
        Person person1 = new Person("John", "Kowalski", 11);
        Person person2 = new Person("Gulia", "Blue", 12);

        person1.setAge(person1.getAge()+1);
        System.out.println(person1); //tutaj zostanie automatycznie wywolana metoda toString();

        System.out.println(person2.getSurname());
    }
}
