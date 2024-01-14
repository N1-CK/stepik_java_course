package task2_10_2;

import java.io.*;
import java.util.Scanner;

public class MyProgram {
    public static void main(String[] args) throws Exception {
        // Use FileReader to read the input file
        FileReader fr = new FileReader("input.txt");

        // Use Scanner to read one line from the file
        Scanner sc = new Scanner(fr);
        String line = sc.nextLine();
        sc.close();

        // Use the existing code to parse and process the line
        double a = 0.0;
        double b = 0.0;
        char znak = ' ';
        int m = 0;
        boolean is = true;

        for (String num : line.split(" ")) {
            m++;
            if (m == 1) {
                try {
                    a = Double.valueOf(num);
                } catch (NumberFormatException e) {
                    System.out.println("Error! Not a number\n");
                    is = false;
                    break;
                }
            }

            if (m == 3) {
                try {
                    b = Double.valueOf(num);
                } catch (NumberFormatException e) {
                    System.out.println("Error! Not a number\n");
                    is = false;
                    break;
                }
            }
        }

        if (is) {
            m = 0;
            for (String num : line.split(" ")) {
                m++;
                if (m == 2) {
                    try {
                        znak = result(num, znak);
                    } catch (Exception e) {
                        System.out.println("Operation Error!");
                        is = false;
                        break;
                    }
                }
            }
        }

        if (is) {
            switch (znak) {
                case '+':
                    System.out.println(a + b);
                    break;

                case '-':
                    System.out.println(a - b);
                    break;

                case '/':
                    if (b == 0.0) {
                        System.out.println("Error! Division by zero");
                    } else {
                        System.out.println(a / b);
                    }
                    break;

                case '*':
                    System.out.println(a * b);
                    break;
            }
        }
    }

    public static char result(String nums, char znak) throws Exception {
        if (nums.equals("/") || nums.equals("*") || nums.equals("+") || nums.equals("-")) {
            znak = nums.charAt(0);
            return znak;
        } else {
            throw new Exception("OperationError");
        }
    }
}
