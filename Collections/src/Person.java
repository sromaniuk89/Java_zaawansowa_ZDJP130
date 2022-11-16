import java.util.Objects;

public class Person implements Comparable<Person> {
    String name;
    String surname;
    Integer age;

    public Person(String name, String surname, Integer age) {
        this.name = name;
        this.surname = surname;
        this.age = age;
    }

    //a
//    @Override
//    public int compareTo(Person p) {
//        return this.age-p.age;
//    }

    //b
//    @Override
//    public int compareTo(Person p) {
//        return this.surname.compareTo(p.surname);
//    }

    //c
//    @Override
//    public int compareTo(Person p) {
//        if(this.surname.compareTo(p.surname)!=0){ //czy nazwiska sa rozne
//            return this.surname.compareTo(p.surname); //wowczas wynik dzialania metody compareTo na nazwsikach
//        } else { //nazwiska sa takie same
//            return this.name.compareTo(p.name);
//        }
//    }

    //d
    @Override
    public int compareTo(Person p) {
        if(this.surname.compareTo(p.surname) != 0){
            return this.surname.compareTo(p.surname);
        } else if (this.name.compareTo(p.name)!=0) {
            return this.name.compareTo(p.name);
        }else{
            return this.age-p.age;
        }
    }

    @Override
    public boolean equals(Object o) {
        //jezeli referencja jest taka sama to znaczy ze oba obiektu to jest tak naprawde to samo
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Person person = (Person) o;
        return Objects.equals(name, person.name) && //(and)
                Objects.equals(surname, person.surname) &&
                Objects.equals(age, person.age);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, surname, age);
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", age=" + age +
                '}';
    }
}
