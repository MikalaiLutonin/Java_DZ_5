//Реализуйте структуру телефонной книги с помощью HashMap, учитывая, что 1 человек может иметь несколько телефонов.

import java.util.HashMap;
import java.util.Map;

public class Task01 {
    public static void main(String[] args) {
        Map<Long, String> numbers = new HashMap<>();
        numbers.put(375296417716L, "Лутонин Николай Сергеевич");
        numbers.put(375291234567L, "Тимовец Андрей Валерьевич");
        numbers.put(375449876543L, "Кручинская Ольга Викторовна");
        numbers.put(375256888697L, "Придуманный Алексей Петрович");
        numbers.put(375333881598L, "Лутонин Николай Сергеевич");
        numbers.put(375294886029L, "Макаревич Игорь Викторович");
        numbers.put(375172542362L, "Грушевский Николай Александрович");
        numbers.put(375293237755L, "Макаревич Игорь Викторович");
        numbers.entrySet().stream().sorted(Map.Entry.comparingByValue()).forEach(System.out::println);
        // Сортировка и вывод по значению
    }
}