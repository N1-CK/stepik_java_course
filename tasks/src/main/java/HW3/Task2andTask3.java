package HW3;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

// 2. Пусть дан произвольный список целых чисел, удалить из него чётные числа
// 3. Задан целочисленный список ArrayList. Найти минимальное, максимальное и среднее из этого списка.
class Solution {
    public static void main(String[] args) {
        List<Integer> a = new ArrayList<>(Arrays.asList(1, 2, 9, 6, 4, 3, 5, 7, 8, 0));
        final List<Integer> b = new ArrayList<>();
        for (int i = 0; i < a.size(); i++) {
            if (a.get(i) % 2 == 0) {
                b.add(a.get(i));
            }
        }
        for (int i = 0; i < b.size(); i++) {
            a.remove(b.get(i));
        }
        System.out.println(a);
        System.out.println(Collections.min(a));
        System.out.println(Collections.max(a));
        System.out.println(a.stream().mapToInt(Integer::intValue).average());
        System.out.println((Collections.min(a) + Collections.max(a)) / 2);
    }
}
