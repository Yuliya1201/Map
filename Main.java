import java.util.*;
import com.javacource.Homework.Product;
import com.javacource.Homework.Recipe;


public class Main {



    //  Создайте коллекцию Map<String,Integer>. Заполните ее произвольными значениями.
    // Напишите метод,который принимает строку(ключ) и целое число(значение) и пытается добавить ее в
    // коллекцию по логике:
    // - Если такого ключа нет,то просто добавляет данные в коллекцию.
    // - Если такой ключ уже есть и значение совпадают,то необходимо бросить исключение.
    // - Если такой ключ уже есть,но значения разные,то обновите целое число в коллекции.

    public static Map<String, Integer> lapTop = new HashMap<>();

    public static void main(String[] args) {
        add("Alexey", +798756766);
        add("Alexey", +798756766);
        add("David", +778978966);
    }


    public static void add(String name, Integer number) {
        if (Objects.equals(lapTop.put(name, number), number)) {
            throw new RuntimeException("ВВедите значение");

        }

    // Создайте Map<Integer,String>,заполните ее 10 произвольными значениями.Выведите в консоль
// все содержимое коллекции в порядке добавления (в формате "ключ:значение").
    Map <Integer,String> linkedHashMap = new LinkedHashMap<>();
        for (int i = 0; i< 10;i++) {
            String s = "String + i";
            linkedHashMap.put(i,s);
        }
        System.out.println(linkedHashMap);

    }
     //Напишите приложение "Телефонный справочник",используя HashMap:
    //В качестве ключа коллекция принимает строку "Имя и Фамилия",а в качестве значения коллекции
    // ногмер телефона

    public static void hateMaps() {
        Random random = new Random();
        int phoneNumber = +7_897_6_7655;
        Map<Integer, String> phoneBook = new HashMap<>();
        phoneBook.put(++phoneNumber, "Света");
        phoneBook.put(++phoneNumber, "Вика");
        phoneBook.put(++phoneNumber, "Настя");
        phoneBook.put(++phoneNumber, "Максим");
        phoneBook.put(++phoneNumber, "Вера");
        phoneBook.put(++phoneNumber, "Юлия");
        phoneBook.put(++phoneNumber, "Дмитрий");
        phoneBook.put(++phoneNumber, "Павел");
        phoneBook.put(++phoneNumber, "Ольга");
        phoneBook.put(++phoneNumber, "Андрей");
        System.out.println(phoneBook);

        int phoneNumber1 = +7_897_676_55;
        StringBuilder builder = new StringBuilder();
        for (Map.Entry<Integer, String> entry : phoneBook.entrySet()) {
            phoneNumber = phoneNumber + 1;
            builder.append(phoneNumber).append(". ").append(entry.getKey()).append(":")
                    .append(entry.getValue()).append(" \n");
        }
        System.out.println(builder);


//  Задание 2 из Д.З-1
        Map<String,Integer> product = new HashMap<>();
        product.put("банан",55);
        product.put("киви",5);
        product.put("гранат",2);
        product.put("оливки",50);
        System.out.println(product);

    }
    public static Integer sumElements(List<Integer>list) {
        Integer sum = 0;
        for (Integer element : list) {
            sum += element;
        }
        return sum;
    }
    // Задание 1 из ДЗ 2
    // Сщздайте Map <String,List<Integer>>.Заполните ее 5 элементами,где ключ произвольное значение,а
    // значение список, состоящий из 3 случайных чисел в диапазоне от 0 до 1000.Преобразуйте созданную
    // коллекцию в новую - Map<String,Integer>,где ключи взяты из первой коллекции,а число сумма
    // чисел списка.Выведите результат в консоль.
    // "string" -[1,6,12]
    // "string" -[200,150,350]
    // out
    // <p>
    // "string1"-19
    // "string2"-700

    private static void test2() {
        Map <String,List<Integer>> listMap = new HashMap<>();
        listMap.put("string1",List.of(11,12,13));
        listMap.put("string2",List.of(100,120,130));
        listMap.put("string3",List.of(210,125,138));
        listMap.put("string4",List.of(119,184,136));
        listMap.put("string5",List.of(399,522,999));


        Map<String,Integer> listMap1 = new HashMap<>();
        for (Map.Entry<String,List<Integer>> stringListEntry : listMap.entrySet()) {
            listMap1.put(stringListEntry.getKey(),sumElements(stringListEntry.getValue()));
        }
        for (Map.Entry<String,Integer>stringIntegerEntry : listMap1.entrySet()){
            System.out.println(stringIntegerEntry.getKey() + " : " + stringIntegerEntry.getValue());
        }

    }
}




    