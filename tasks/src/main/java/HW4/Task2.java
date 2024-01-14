package HW4;

import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.Deque;

public class Task2 {
    // Даны два Deque представляющие два неотрицательных целых числа. Цифры хранятся
    // в обратном порядке,
    // и каждый из их узлов содержит одну цифру.
    // Сложите два числа и верните сумму в виде связанного списка.
    public static void main(String[] args) {
        Deque<Integer> d1 = new ArrayDeque<>(Arrays.asList(1, 2, 3));
        Deque<Integer> d2 = new ArrayDeque<>(Arrays.asList(5, 4, 7));
        System.out.println(sum(d1, d2));
        // result [6,6,0,1]

    }

    public static Deque<Integer> sum(Deque<Integer> d1, Deque<Integer> d2) {
        Deque<Integer> d3 = new ArrayDeque<>();
        for (int i = 0; i < 3; i++) {
            int k = d1.getFirst() + d2.getFirst();
            if (k >= 10) {
                d3.add(k % 10);
                d3.add(k / 10);
            } else {
                d3.add(d1.pollFirst() + d2.pollFirst());
            }
        }
        return d3;
    }
}
