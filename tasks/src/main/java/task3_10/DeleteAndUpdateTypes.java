package task3_10;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.Scanner;

public class DeleteAndUpdateTypes {
    public static void main(String... args) {
        DeleteAndUpdateTypes cats = new DeleteAndUpdateTypes();
        cats.open();
        //cats.insert();
        //cats.addAllTypes(cats.types);
        cats.deleteType();
        cats.updateType();
        cats.select();
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

    private void deleteType(){
        try {
            Scanner sc = new Scanner(System.in);
            System.out.print("Введите id, чтобы удалить: ");
            int id = sc.nextInt();

            String query = "DELETE FROM types WHERE id = " + id;

            Statement statement = connection.createStatement();
            statement.executeUpdate(query);

            System.out.println("Всё удалилось успешно!");
            statement.close();
        }
        catch (Exception e){
            System.out.println(e.getMessage());
        }
    }

    private void updateType(){
        try {
            Scanner sc = new Scanner(System.in);
            System.out.print("Введите тип кошки: ");
            String type = sc.nextLine();
            System.out.print("Введите id: ");
            int id = sc.nextInt();

            String query = "UPDATE types SET type = '" + type +"' WHERE id = " + id;

            Statement statement = connection.createStatement();
            statement.executeUpdate(query);

            System.out.println("Всё добавилось успешно!");
            statement.close();
        }
        catch (Exception e){
            System.out.println(e.getMessage());
        }
    }

    private void select() {
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
