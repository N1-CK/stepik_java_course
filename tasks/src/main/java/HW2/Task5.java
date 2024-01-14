package HW2;// Напишите программу, которая
// 1) по указанной строке URL скачивает файл и возвращает строковое содержимое файла
// 2) изменяет строковое содержимое файла подставляя по маске "%s" ваше имя
// 3) сохраняет файл локально
// 4) читает сохраненный файл и выводит содержимое в логгер
// 5) удаляет сохраненный файл
import java.io.*;
import java.net.URL;

class Task3 {

    public static void main(String[] args) {
        String fileUrl = "https://raw.githubusercontent.com/aksodar/JSeminar_2/master/src/main/resources/example.txt";
        String localFilename = "example.txt";
        String name = "Гарри";

        String fileContent = download(fileUrl, localFilename);
        String changedContent = change(name, fileContent);
        saveOnLocal(localFilename, changedContent);
        read(localFilename);
        removeFromLocale(localFilename);
    }
    
    public static String download(String url, String localFilename) {
        try (BufferedInputStream in = new BufferedInputStream(new URL(url).openStream());
             FileOutputStream fileOutputStream = new FileOutputStream(localFilename)) {

            byte[] dataBuffer = new byte[1024];
            int bytesRead;
            StringBuilder fileContent = new StringBuilder();

            while ((bytesRead = in.read(dataBuffer, 0, 1024)) != -1) {
                String readData = new String(dataBuffer, 0, bytesRead);
                fileContent.append(readData);
                fileOutputStream.write(dataBuffer, 0, bytesRead);
            }

            return fileContent.toString();
        } catch (IOException e) {
            e.printStackTrace();
            return null;
        }
    }

    public static String change(String name, String fileContent) {
        return fileContent.replace("%s", name);
    }

    public static void read(String localFilename) {
        try (BufferedReader br = new BufferedReader(new FileReader(localFilename))) {
            String line;
            while ((line = br.readLine()) != null) {
                System.out.println(line);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void saveOnLocal(String fileName, String fileContent) {
        try (PrintWriter out = new PrintWriter(fileName)) {
            out.println(fileContent);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }

    public static boolean removeFromLocale(String fileName) {
        File file = new File(fileName);
        return file.delete();
    }
}