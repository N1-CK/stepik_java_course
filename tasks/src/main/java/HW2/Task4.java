package HW2;
//Напишите программу, которая принимает с консоли число в формате byte и записывает его в файл ”result.txt”. Требуется перехватить все возможные ошибки и вывести их в логгер. После написания, попробуйте подать на вход числа 100 и 200 и проследите разницу в результате

import java.io.IOException;
import java.util.Scanner;
import java.util.logging.FileHandler;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.logging.SimpleFormatter;

class WriteByteToFile {
    private static final Logger lg = Logger.getLogger(WriteByteToFile.class.getName());

    public static void main(String[] args) throws SecurityException, IOException {
        Scanner sc = new Scanner(System.in);
        System.out.print("Please enter a byte number: ");
        FileHandler fh = new FileHandler("result.txt");
        lg.addHandler(fh);
        SimpleFormatter sFormat = new SimpleFormatter();
        fh.setFormatter(sFormat);
        try {
            byte number = sc.nextByte();
            lg.log(Level.INFO, "Byte number " + number + " has been written to 'result.txt' file.");
        } catch (Exception e) {
            lg.info("" + e);
        }
        sc.close();
    }
}  