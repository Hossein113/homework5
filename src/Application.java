import com.homework.jdbc.example.util.ApplicationContext;

import java.sql.SQLException;

public class Application {

    public static void main(String args[]) throws SQLException, ClassNotFoundException {

        ApplicationContext applicationContext = new ApplicationContext();

        applicationContext.getDatabaseCreateTable().init();
        System.out.println("ok");

        applicationContext.getDataInit().init();
        System.out.println("0k");
//
//        Product[] products = new Product[4];
//
//        Shoes shoes = new SportShoe();
//        Shoes shoes1 = new OfficalShoe();
//
//        ElectricalAppliances electricalAppliances = new Radio();
//        ElectricalAppliances electricalAppliances1 = new Television();
//
//        products[0] = shoes;
//        products[1] = shoes1;
//        products[2] = electricalAppliances;
//        products[3] = electricalAppliances1;
//
//        for (Product pr : products) {
//            System.out.println(pr.getClass().getName());
    }

}

