import java.util.ArrayList;
import java.util.List;

public class Data {
    private static final List<Person> person = new ArrayList();

        static {

            Person person1 = new Person("Иван", "Иванов", 24);
            Person person2 = new Person("Степан", "Первый", 38);
            Person person3 = new Person("Петр", "Никоноров", 64);
            Person person4 = new Person("Геннадий", "Тригуб", 52);
            Person person5 = new Person("Аркадий", "Мартышкин", 47);
            Person person11 = new Person("Аркадий", "Мартышкин", 47);
            Person person6 = new Person("Дмитрий", "Первачев", 39);
            Person person7 = new Person("Алексей", "Сабо", 28);
            Person person8 = new Person("Никодим", "Шеременчев", 19);
            Person person9 = new Person("Егор", "Егоров", 71);
            Person person10 = new Person("Зиновий", "Ержанов", 18);

            person.add(person1);
            person.add(person2);
            person.add(person3);
            person.add(person4);
            person.add(person5);
            person.add(person6);
            person.add(person7);
            person.add(person8);
            person.add(person9);
            person.add(person10);
            person.add(person11);

        }

        public static List<Person> getPerson() {
            return person;
        }

}





