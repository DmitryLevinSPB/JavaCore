package String;

import java.nio.charset.StandardCharsets;
import java.util.Arrays;
import java.util.Locale;

public class main {
    public static void main(String[] args) {

        // имена переменных это ссылки на их значения и они хранятся в стеке
        // значения переменных хранятся в куче (хипе) в отдельно выделенном месте - стринг пуле. Это сделано для экономии памяти
        // Строки сами по себе иммутабельны


        String str1 = "Hello";
        String str2 = "He" + "llo";
        str2 = str2.toLowerCase(Locale.ROOT);
        String str3 = new String("Hello");
        String str4 = "Hello";
        String str5 = "hello";
        String str6 = str1 + "?";
        String str7 = "Hello?";
        String str8 = "Hellohello";
        String s = "Java langu3424age very go3434od";
        String r = "JavaVeryGood";
        String c = "Java the best   ";


        //    str1 += "!"; // если сравнивать с str2 будет false  т.к после добавления ! стринг попадает в хип а не в стринг пул


        // System.out.println(str1==str3); // false
        // System.out.println(str1==str2); // true т.к. канкатенация дает то-же слово, что лежит в стринг пуле
        // System.out.println(str1==str4); // true
        // System.out.println(str1==str5); // false  регистро зависимость
        // System.out.println(str1.equals(str3)); // true т.к equals сравнивает посимвольно, а не ссылки
        // System.out.println(str7==str6); // false


        // Создавать длинную строку таким образом нельзя. Будет забиваться память. Для создания длинных строк используют стринг билдер
    /*    String s = "A";
        for (int i = 0; i < 1000; i++) {
            s += "A";
        }
        System.out.println(s);*/


        // --- Методы класса ---

        // System.out.println(str7.length());                           // возвращает длинну строки
        // System.out.println(str1.charAt(2));                          // вернет символ который находится на заданной позиции(2)
        // System.out.println(str7.toCharArray());                      // преобразование строки вмассив символов
        // System.out.println(str1.equals(str2));                       // сравнивает два объекта булиново значение
        // System.out.println(str4.equalsIgnoreCase(str5));             // сравнивает без учета регистра
        // System.out.println(str1.concat(str7));                       // объединяет строки
        // System.out.println(str1.toUpperCase(Locale.ROOT));           // переведет все символы в верхний
        // System.out.println(str1.toLowerCase(Locale.ROOT));           // переведет все символы в нижний регистр
        // System.out.println(str2.getBytes(StandardCharsets.UTF_8));   // получает байты

        // System.out.println(str1.matches("\\w+"));                    // можно проверить например состоит ли строка только из букв
        // System.out.println(str1.matches("\\w{5}"));                  // проверит состоит ли слово из 5 букв
        // System.out.println(str1.matches("^H\\w+o$"));                // проверит начинается ли слово с H и заканчивается o


        // String [] string = s.split(" ", 2);                 // ставит разделитель в указанных местах. Можно установить лимит
        //  System.out.println(Arrays.toString(string));

        // s = s.replace(" ", "+");                                     // поменяет пробелы на +
        // s = s.replaceAll("\\d", "*");                                // поменяет все цифры
        // r= r.replaceAll("(^\\w)(\\w+)(\\w$)", "$2$3$1");             // поменяет местами части текста
        // System.out.println(r);

        // System.out.println(c.substring(5));                           // подстрока выведет символы начиная с 5 символа
        // System.out.println(c.substring(5,8));                         // подстрока выведет символы с 5 по 8
        // System.out.println(c.trim());                                 // удаляет пробельные символы
        // System.out.println(c.strip());                                // так же удаляет символы

        // У строки есть статические методы которые не требуют создание объекта


    }
}
