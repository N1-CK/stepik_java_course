package task3_10;

import java.sql.*;
import java.util.Scanner;

public class AllCodeForTenTasks {
    public static void main(String... args) throws SQLException {
        AllCodeForTenTasks cats = new AllCodeForTenTasks();
        cats.open();

        //cats.insert();
        //cats.addAllTypes(cats.name);
        //cats.deleteType();
        //cats.updateType();
        //cats.getType();
        //cats.getTypeWhere();
        //cats.newTableCats();
        //cats.insertCat("Барсик", "Подзаборный", 11, 2.3);
        //cats.insertCat("Мурзик", "Лесной", 3, 3.5);
        //cats.insertCat("Тузик", "Турецкий ван", 7, 1.5);

        //cats.addMoreCats(cats.names.length);

        //cats.select();
        //cats.deleteCat(122);
        //cats.deleteCat(121);
        //cats.deleteCat();
        //cats.updateCate(118,"Цирилла");


        //cats.getCatId(111);
        //cats.getCatId(88);
        //cats.getCatWhere();
        cats.selectCats();
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

    String[] names = new String[]{
            "Гарфилд", "Том", "Гудвин", "Рокки", "Ленивец",
            "Пушок", "Спорти", "Бегемот", "Пират", "Гудини",
            "Зорро", "Саймон", "Альбус", "Базилио", "Леопольд",
            "Нарцисс", "Атос", "Каспер", "Валлито", "Оксфорд",
            "Бисквит", "Соня", "Клеопатра", "Цунами", "Забияка",
            "Матильда", "Кнопка", "Масяня", "Царапка", "Серсея",
            "Ворсинка", "Амели", "Наоми", "Маркиза", "Изольда",
            "Вальс", "Несквик", "Златан", "Баскет", "Изюм", "Цукат",
            "Мокко", "Месси", "Кокос", "Адидас", "Бейлиз", "Тайгер",
            "Зефир", "Мохи", "Валенсия", "Баунти", "Свити", "Текила",
            "Ириска", "Карамель", "Виски", "Кукуруза", "Гренка",
            "Фасолька", "Льдинка", "Китана", "Офелия", "Дайкири",
            "Брусника", "Аватар", "Космос", "Призрак", "Изумруд",
            "Плинтус", "Яндекс", "Крисмас", "Метеор", "Оптимус", "Смайлик",
            "Цельсий", "Краска", "Дейзи", "Пенка", "Веста", "Астра", "Эйприл",
            "Среда", "Бусинка", "Гайка", "Елка", "Золушка", "Мята", "Радость",
            "Сиам", "Оскар", "Феликс", "Гарри", "Байрон", "Чарли", "Симба", "Тао",
            "Абу", "Ватсон", "Енисей", "Измир", "Кайзер", "Васаби", "Байкал",
            "Багира", "Айрис", "Диана", "Мими", "Сакура", "Индия", "Тиффани",
            "Скарлетт", "Пикси", "Лиззи", "Алиса", "Лило", "Ямайка", "Пэрис", "Мальта", "Аляска"
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

    private void addAllTypes(String[] types) {
        for (String type : types) {
            insert(type);
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

    private void newTableCats() {
        try {
            Statement statement = connection.createStatement();
            String query = "CREATE TABLE if not exists cats (id INTEGER PRIMARY KEY AUTOINCREMENT UNIQUE, " +
                    "name VARCHAR(100) NOT NULL, type_id INTEGER NOT NULL REFERENCES types (id), " +
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

    private void insertCat(String name, String type, int age, Double weight) {
        try {
            // тип кошки
            ResultSet resultSet = getType("type = '" + type + "'");
            int id;
            if (resultSet.isBeforeFirst()) //если находится такой тип, то берём его id
                id = resultSet.getInt("id");
            else { //если нет такого типа, то создаём новый и берём
                insert(type);
                id = getType("type = '" + type + "'").getInt("id");
            }
            Statement statement = connection.createStatement();
            statement.execute("INSERT INTO 'cats' ('name','type_id','age','weight') " +
                    "VALUES ('" + name + "'," + id + "," + age + "," + weight + ")");
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }


    private ResultSet getType(String type) throws SQLException {
        Statement statement = connection.createStatement();
        String query = "SELECT id, type FROM types WHERE " + type;
        return statement.executeQuery(query);
    }

    private void addMoreCats(int n) {
        try {
            for (int i = 0; i < n; i++) {
                insertCat(names[(int) ((names.length - 1) * Math.random())], types[(int) ((types.length - 1) * Math.random())], (int) (25 * Math.random()), 17 * Math.random());
            }
            System.out.println("Количество добавленных котиков: " + n);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

    private void selectCats() {
        //select() это и есть get_all_types(), вывод всех котов, которые есть у меня в базе
        try {
            //обращение к БД
            Statement statement = connection.createStatement();
            String query = "SELECT *" +
                    " FROM cats " +
                    "ORDER BY id";
            ResultSet resultSet = statement.executeQuery(query);
            while (resultSet.next()) {
                int id = resultSet.getInt("id");
                String name = resultSet.getString("name");
                int age = resultSet.getInt("age");
                int weight = resultSet.getInt("weight");
                System.out.println(id + "\t|" + name + "\t|" + age + "\t|" + weight);
            }
            resultSet.close();
            statement.close();
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

    private void deleteCat(int id) {
        try {
            Statement statement = connection.createStatement();
            String query = "DELETE FROM cats WHERE id = " + id;

            statement.executeUpdate(query);

            System.out.println("Котик " + id + " удалился от вас(");
            statement.close();
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }


    private void deleteCat() {
        try {
            Scanner sc = new Scanner(System.in);
            System.out.print("Введите цифру(1 или 2), по какому принципу вы хотите удалить по id < введённым вами числом, или type LIKE '%а': ");
            int number = sc.nextInt();

            switch (number) {
                case (1) -> {
                    System.out.print("Введите до какого кота удалить: ");
                    int id = sc.nextInt();

                    String query = "DELETE FROM cats WHERE id <= " + id;

                    Statement statement = connection.createStatement();

                    statement.executeUpdate(query);
                    System.out.println("Удалено!");

                    statement.close();
                }
                case (2) -> {
                    System.out.print("Введите русскую букву по какому принципу удалить котиков: ");
                    sc.nextLine();
                    String charRush = sc.nextLine();

                    String query = "DELETE FROM cats WHERE name LIKE '%" + charRush + "'";

                    Statement statement = connection.createStatement();

                    statement.executeUpdate(query);
                    System.out.println("Удалено!");

                    statement.close();
                }
            }

        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

    private void updateCate(int id, String set){
        try {
            String query = "UPDATE cats SET name = '" + set + "' WHERE id = " + id;

            Statement statement = connection.createStatement();
            statement.executeUpdate(query);

            System.out.println("Изменено");
            statement.close();
        }catch (Exception e){
            System.out.println(e.getMessage());
        }
    }

    private void getCatId(int id){
        try {
            Statement statement = connection.createStatement();

            System.out.println(statement.executeQuery("SELECT * FROM cats WHERE id = " + id).getString("name"));

            System.out.println("Вот ваш котик!");
            statement.close();
        }catch (Exception e){
            System.out.println(e.getMessage());
        }
    }

    private void getCatWhere() {
        try {
            Scanner sc = new Scanner(System.in);
            System.out.print("Введите цифру(1 или 2), по какому принципу вы хотите отбирать по id < введённым вами числом, или type LIKE '%а': ");
            int number = sc.nextInt();

            switch (number) {
                case (1) -> {
                    System.out.print("Введите до какого кота выводить: ");
                    int id = sc.nextInt();

                    String query = "SELECT * FROM cats WHERE id <= " + id;

                    Statement statement = connection.createStatement();
                    ResultSet resultSet = statement.executeQuery(query);

                    while (resultSet.next()) {
                        id = resultSet.getInt("id");
                        String name = resultSet.getString("name");
                        int age = resultSet.getInt("age");
                        int weight = resultSet.getInt("weight");
                        System.out.println(id + "\t|" + name + "\t|" + age + "\t|" + weight);
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
    private void close() {
        try {
            connection.close();
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

}
