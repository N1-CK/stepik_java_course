package HW4;

import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.Deque;

public class Task1 {
    // Дан Deque состоящий из последовательности цифр. Необходимо проверить, что
    // последовательность цифр является палиндромом
    public static void main(String[] args) {
        Deque<Integer> deque = new ArrayDeque<>(Arrays.asList(1, 2, 3, 2, 2, 3, 2, 1));
        System.out.println(checkOn(deque) ? "Yes" : "No");

    }

    public static boolean checkOn(Deque<Integer> deque) {
        Deque<Integer> temp = new ArrayDeque<>();
        temp.addAll(deque);
        for (int i = 0; i < deque.size() / 2; i++) {
            if (temp.pollFirst() != temp.pollLast()) {
                return false;
            }
        }
        return true;
    }
}
