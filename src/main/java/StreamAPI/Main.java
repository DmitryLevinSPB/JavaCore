package StreamAPI;

import StreamAPI.Data;

import java.io.UnsupportedEncodingException;
import java.util.List;
import java.util.stream.Collectors;

public class Main {

        public static void main(String[] args) throws UnsupportedEncodingException {

            List<Person> person = Data.getPerson();

            // В stream API существуют конвеерные методы и терминальные
            // С помошью конвеерных методов мы совершаем действие над элементами

            List <Person> person2 = person.stream()
                    // .map(pers ->new Person(pers.getLastName(), "Иванов",pers.getAge()))
                    .filter(p -> p.getAge()<30 )
                    .sorted()
                    .collect(Collectors.toList());

            for(int i =0; i< person2.size();i++ ){
                System.out.println(person2.get(i));
            }


        }

    }

