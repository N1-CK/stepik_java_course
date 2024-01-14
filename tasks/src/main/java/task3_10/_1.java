package task3_10;

import java.sql.*;

public class _1 {
    public static Connection con;
    public static Statement st;
    public static void Conn() throws ClassNotFoundException, SQLException {
        //con = null;
        Class.forName("org.sqlite.JDBC");
        con = DriverManager.getConnection("jdbc:sqlite:C:\\Users\\Nick\\Desktop\\My_cats.db");
        System.out.println("База создана");
    }
    public static void CreateDB() throws SQLException {
        st = con.createStatement();
        st.execute("CREATE TABLE if not exists types (id INTEGER PRIMARY KEY AUTOINCREMENT, type VARCHAR(100))");
        System.out.printf("Таблица создана");
    }
    public static void CloseDB() throws SQLException {
        con.close();
        st.close();
    }
}
