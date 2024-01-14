package HW5;

/*
Пусть дан список сотрудников:

Иван Иванов
Светлана Петрова
Кристина Белова
Анна Мусина
Анна Крутова
Иван Юрин
Петр Лыков
Павел Чернов
Петр Чернышов
Мария Федорова
Марина Светлова
Мария Савина
Мария Рыкова
Марина Лугова
Анна Владимирова
Иван Мечников
Петр Петин
Иван Ежов
Написать программу, которая найдёт и выведет повторяющиеся имена с количеством повторений. Отсортировать по убыванию популярности.
*/

import java.util.*;

class Main {
    public static void main(String[] args) {
        String[] lst = {
                "Иван Иванов", "Светлана Петрова", "Кристина Белова",
                "Анна Мусина", "Анна Крутова", "Иван Юрин",
                "Петр Лыков", "Павел Чернов", "Петр Чернышов",
                "Мария Федорова", "Марина Светлова", "Мария Савина",
                "Мария Рыкова", "Марина Лугова", "Анна Владимирова",
                "Иван Мечников", "Петр Петин", "Иван Ежов" };
        HashMap<String, String> hsm = new HashMap<>();
        TreeMap<Integer, String> keys = new TreeMap<>();
        for (int i = 0; i < lst.length; i++) {
            String k = lst[i].split(" ")[0];
            String v = lst[i].split(" ")[1];
            if (hsm.keySet().contains(k)) {
                hsm.put(k, hsm.get(k) + " " + v);
            } else
                hsm.put(k, v);
        }
        for (String k : hsm.keySet()) {
            keys.put(hsm.get(k).split(" ").length, k);
        }
        String[] s = new String[keys.keySet().size()];
        for (Integer i : keys.keySet()) {
            s[s.length - i] = keys.get(i) + " " + i;
        }
        for (int i = 0; i < s.length - 1; i++) {
            System.out.println(s[i]);
        }
    }
}