import com.homework.jdbc.example.util.ApplicationContext;

import java.sql.SQLException;

public class Application {

    public static void main(String args[]) throws SQLException, ClassNotFoundException {

        ApplicationContext applicationContext = new ApplicationContext();

        applicationContext.getDatabaseCreateTable().init();
        System.out.println("ok");

    }
}
