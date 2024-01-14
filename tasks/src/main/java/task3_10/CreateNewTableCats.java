package task3_10;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.Scanner;

public class CreateNewTableCats {
    public static void main(String... args) {
        CreateNewTableCats cats = new CreateNewTableCats();
        cats.open();

        //cats.insert();
        //cats.addAllTypes(cats.types);
        //cats.deleteType();
        //cats.updateType();
        //cats.getType();
        //cats.getTypeWhere();
        //cats.select();
        cats.newTableCats();

        cats.close();
    }

    Connection connection;
    String[] types = new String[]{"Абиссинская кошка",
            "Австралийский мист",
            "Американская жесткошерстная",
            "Американская короткошерстная",
            "Американский бобтейл",
            "Американский кёрл",
            "Балинезийская кошка",
            "Бенгальская кошка",
            "Бирманская кошка",
            "Бомбейская кошка",
            "Бразильская короткошёрстная",
            "Британская длинношерстная",
            "Британская короткошерстная",
            "Бурманская кошка",
            "Бурмилла кошка",
            "Гавана",
            "Гималайская кошка",
            "Девон-рекс",
            "Донской сфинкс",
            "Европейская короткошерстная",
            "Египетская мау",
            "Канадский сфинкс",
            "Кимрик",
            "Корат",
            "Корниш-рекс",
            "Курильский бобтейл",
            "Лаперм",
            "Манчкин",
            "Мейн-ку́н",
            "Меконгский бобтейл",
            "Мэнкс кошка",
            "Наполеон",
            "Немецкий рекс",
            "Нибелунг",
            "Норвежская лесная кошка",
            "Ориентальная кошка",
            "Оцикет",
            "Персидская кошка",
            "Петерболд",
            "Пиксибоб",
            "Рагамаффин",
            "Русская голубая кошка",
            "Рэгдолл",
            "Саванна",
            "Селкирк-рекс",
            "Сиамская кошка",
            "Сибирская кошка",
            "Сингапурская кошка",
            "Скоттиш-фолд",
            "Сноу-шу",
            "Сомалийская кошка",
            "Тайская кошка",
            "Тойгер",
            "Тонкинская кошка",
            "Турецкая ангорская кошка",
            "Турецкий ван",
            "Украинский левкой",
            "Чаузи",
            "Шартрез",
            "Экзотическая короткошерстная",
            "Японский бобтейл"
    };

    private void open() {
        try {
            Class.forName("org.sqlite.JDBC");
            connection = DriverManager.getConnection("jdbc:sqlite:C:\\Users\\Алина\\Desktop\\SQLite\\My_cats.db");
            System.out.println("Connected");
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

    private void insert(String type) {
        try {
            Scanner sc = new Scanner(System.in);
            //System.out.print("Enter type cat: ");


            String query =
                    "INSERT INTO types (type) " +
                            "VALUES('" + type + "')";

            //Мы делаем как раз запрос в базу данных, уже обращаясь к нему на прямую
            Statement statement = connection.createStatement();
            statement.executeUpdate(query);

            //Чтобы узнать, что всё сохранилось в базе
            //System.out.println("Rows added");
            statement.close();
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

    }

    private void deleteType() {
        try {
            Scanner sc = new Scanner(System.in);
            System.out.print("Введите id, чтобы удалить: ");
            int id = sc.nextInt();

            String query = "DELETE FROM types WHERE id = " + id;

            Statement statement = connection.createStatement();
            statement.executeUpdate(query);

            System.out.println("Всё удалилось успешно!");
            statement.close();
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

    private void updateType() {
        try {
            Scanner sc = new Scanner(System.in);
            System.out.print("Введите тип кошки: ");
            String type = sc.nextLine();
            System.out.print("Введите id: ");
            int id = sc.nextInt();

            String query = "UPDATE types SET type = '" + type + "' WHERE id = " + id;

            Statement statement = connection.createStatement();
            statement.executeUpdate(query);

            System.out.println("Всё добавилось успешно!");
            statement.close();
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }


    private void getType() {
        try {
            Scanner sc = new Scanner(System.in);
            System.out.print("Введите id для получения котика: ");
            int id = sc.nextInt();

            Statement statement = connection.createStatement();

            System.out.println(statement.executeQuery("SELECT type FROM types WHERE id = " + id).getString("type") + "\n");

            System.out.println("Вы получили своего котика!");
            System.out.println("\n");
            statement.close();

        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

    private void getTypeWhere() {
        try {
            Scanner sc = new Scanner(System.in);
            System.out.print("Введите цифру(1 или 2), по какому принципу вы хотите отбирать по id < введённым вами числом, или type LIKE '%а': ");
            int number = sc.nextInt();

            switch (number) {
                case (1) -> {
                    System.out.print("Введите до какого кота выводить: ");
                    int id = sc.nextInt();

                    String query = "SELECT id, type FROM types WHERE id <= " + id;

                    Statement statement = connection.createStatement();
                    ResultSet resultSet = statement.executeQuery(query);

                    while (resultSet.next()) {
                        id = resultSet.getInt("id");
                        String type = resultSet.getString("type");
                        System.out.println(id + "\t|" + type);
                    }

                    statement.executeUpdate(query);
                    System.out.println("Список выведен!");
                    resultSet.close();
                    statement.close();
                }
                case (2) -> {
                    System.out.print("Введите русскую букву по какому принципу выводить котиков: ");
                    sc.nextLine();
                    String charRush = sc.nextLine();

                    String query = "SELECT id, type FROM types WHERE type LIKE '%" + charRush + "'";

                    Statement statement = connection.createStatement();
                    ResultSet resultSet = statement.executeQuery(query);

                    while (resultSet.next()) {
                        int id = resultSet.getInt("id");
                        String type = resultSet.getString("type");
                        System.out.println(id + "\t|" + type);
                    }

                    statement.executeUpdate(query);
                    System.out.println("Список выведен!");
                    resultSet.close();
                    statement.close();
                }
            }

        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

    //НОВОЕ ЗАДАНИЕ, С ОБЪЕДИНЕНИЕМ ID-ШНИКОВ И СОЗДАНИЕ НОВОЙ ТАБЛИЦЫ
    private void newTableCats() {
        try {
            Statement statement = connection.createStatement();
            String query = "CREATE TABLE if not exists cats (id INTEGER PRIMARY KEY AUTOINCREMENT UNIQUE, " +
                    "name VARCHAR(20) NOT NULL, type_id INTEGER NOT NULL REFERENCES types (id), " +
                    "age INTEGER NOT NULL, weight DOUBLE)";
            statement.executeUpdate(query);

            System.out.println("Всё добавилось успешно!");
            statement.close();
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

    private void select() {
        //select() это и есть get_all_types(), вывод всех котов, которые есть у меня в базе
        try {
            //обращение к БД
            Statement statement = connection.createStatement();
            String query = "SELECT id, type" +
                    " FROM types " +
                    "ORDER BY id";
            ResultSet resultSet = statement.executeQuery(query);
            while (resultSet.next()) {
                int id = resultSet.getInt("id");
                String type = resultSet.getString("type");
                System.out.println(id + "\t|" + type);
            }
            resultSet.close();
            statement.close();
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

    private void close() {
        try {
            connection.close();
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

    private void addAllTypes(String[] types) {
        for (String type : types) {
            insert(type);
        }
    }
}
