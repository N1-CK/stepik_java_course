package task2_10_4;
import java.io.*;
import java.util.Scanner;

public class MyProgram {
    public static void main(String[] args) throws Exception {
        // Create a Scanner to read the input file
        Scanner sc = new Scanner(new FileReader("input.txt"));

        // Iterate over all the lines in the input file
        while (sc.hasNextLine()) {
            // Extract the numbers a and b from the line
            String line = sc.nextLine();
            double a = Double.parseDouble(line.split(" ")[0]);
            double b = Double.parseDouble(line.split(" ")[2]);

            // Calculate the answer to the line
            char znak = line.split(" ")[1].charAt(0);
            double answer = 0;
            switch (znak) {
                case '+':
                    answer = a + b;
                    break;

                case '-':
                    answer = a - b;
                    break;

                case '/':
                    if (b == 0.0) {
                        answer = Double.NaN;
                    } else {
                        answer = a / b;
                    }
                    break;

                case '*':
                    answer = a * b;
                    break;
            }

            // Write the answer to the output file
            FileWriter fw = new FileWriter("output.txt", true);
            fw.write(line + " = " + answer + "\n");
            fw.close();
        }

        sc.close();
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
