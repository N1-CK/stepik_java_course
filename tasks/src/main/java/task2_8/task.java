//package task2_8;
//
//import org.apache.tomcat.jni.Library;
//
//public class Main {
//
//    public static void main(String[] args) {
//
//        // Создаем объект библиотеки
//        Library library = new Library();
//
//        // Добавляем книги в библиотеку
//        library.addBook(new Book("Война и мир", "Лев Толстой", "Роман", 1869, 100, Status.AVAILABLE));
//        library.addBook(new Book("Преступление и наказание", "Фёдор Достоевский", "Роман", 1866, 50, Status.AVAILABLE));
//        library.addBook(new Book("Мастер и Маргарита", "Михаил Булгаков", "Роман", 1929, 20, Status.AVAILABLE));
//
//        // Добавляем сотрудников в библиотеку
//        library.addEmployee(new Employee("Иванов Иван Иванович", "Библиотекарь", "+7 (911) 123-45-67"));
//        library.addEmployee(new Employee("Петров Петр Петрович", "Заведующий библиотекой", "+7 (922) 765-43-21"));
//
//        // Добавляем клиентов в библиотеку
//        library.addClient(new Client("Сидоров Сергей Сергеевич", "1234567890"));
//        library.addClient(new Client("Иванова Анна Андреевна", "9876543210"));
//
//        // Выдаем книгу в прокат
//        library.loanBook(library.getBookByTitle("Война и мир"), "Сидоров Сергей Сергеевич");
//
//        // Бронируем книгу
//        library.reserveBook(library.getBookByTitle("Преступление и наказание"), "Иванова Анна Андреевна");
//
//        // Выводим информацию о библиотеке
//        library.printInfo();
//    }
//}