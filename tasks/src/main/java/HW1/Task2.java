package HW1;// Вводится число n, затем n чисел целых, по одному на каждой строке. Затем вводится число, на которое нужно умножить все введённые выше числа. Выведите на экран результат умножения построчно.
// Sample Input:

// 4
// 1
// 2
// 3
// 5
// 2
// Sample Output:

// 2
// 4
// 6
// 10
// import java.util.Scanner;

// class Main {
//     public static void main(String[] args) {
//         Scanner scanner = new Scanner(System.in);
//         System.out.print("Введите количество чисел: ");
//         int n = scanner.nextInt();
//         int[] numbers = new int[n];
        
//         for (int i = 0; i < n; i++) {
//             System.out.print("Введите следующее число: ");
//             numbers[i] = scanner.nextInt();
//         }
        
//         System.out.print("Введите число на которое будем умножать: ");
//         int multiplier = scanner.nextInt();
//         scanner.close();

//         for (int i = 0; i < n; i++) {
//             System.out.println(numbers[i] * multiplier);
//         }
//     }
// }
