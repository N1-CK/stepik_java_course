package HW6;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        HashSet<Notebook> notebooks = new HashSet<>();
        notebooks.add(new Notebook("Lenovo", "IdeaPad", 8, 256, "Windows 10", "Black", 599.99));
        notebooks.add(new Notebook("Dell", "Inspiron", 16, 512, "Windows 10", "Silver", 899.99));
        notebooks.add(new Notebook("Apple", "MacBook Air", 16, 512, "MacOS", "Silver", 1199.99));

        filterNotebooks(notebooks);
    }

    public static void filterNotebooks(HashSet<Notebook> notebooks) {
        Scanner scanner = new Scanner(System.in);
        Map<String, Object> filters = new HashMap<>();

        System.out.println("Выберите критерии фильтрации:");
        System.out.println("1 - ОЗУ");
        System.out.println("2 - Объем жесткого диска");
        System.out.println("3 - Операционная система");
        System.out.println("4 - Цвет");

        int filterType = scanner.nextInt();

        switch (filterType) {
            case 1:
                System.out.println("Введите минимальный объем ОЗУ (в ГБ):");
                int ram = scanner.nextInt();
                filters.put("ram", ram);
                break;
            case 2:
                System.out.println("Введите минимальный объем жесткого диска (в ГБ):");
                int storage = scanner.nextInt();
                filters.put("storage", storage);
                break;
            case 3:
                System.out.println("Введите название операционной системы:");
                String os = scanner.next();
                filters.put("os", os);
                break;
            case 4:
                System.out.println("Введите цвет ноутбука:");
                String color = scanner.next();
                filters.put("color", color);
                break;
            default:
                System.out.println("Неверный тип фильтра.");
                scanner.close();
                return;
        }

        System.out.println("Фильтруем ноутбуки по критериям...");

        for (Notebook notebook : notebooks) {
            boolean passFilter = true;
            for (Map.Entry<String, Object> entry : filters.entrySet()) {
                switch (entry.getKey()) {
                    case "ram":
                        if (notebook.getRam() < (int) entry.getValue()) {
                            passFilter = false;
                        }
                        break;
                    case "storage":
                        if (notebook.getStorage() < (int) entry.getValue()) {
                            passFilter = false;
                        }
                        break;
                    case "os":
                        if (!notebook.getOs().equals(entry.getValue())) {
                            passFilter = false;
                        }
                        break;
                    case "color":
                        if (!notebook.getColor().equals(entry.getValue())) {
                            passFilter = false;
                        }
                        break;
                }
            }
            scanner.close();
            if (passFilter) {
                System.out
                        .println(notebook.getBrand() + " " + notebook.getModel() + " - Цена: $" + notebook.getPrice());
            }
        }
    }
}
