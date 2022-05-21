import com.homework.jdbc.example.domain.*;
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

        boolean flag = true;

        while (flag) {
            applicationContext.getShowMenu().showWelcomeMenu();
            int selectedNumber = applicationContext.getIntScanner().nextInt();
            if (selectedNumber == 1) {
                login(applicationContext);
            } else if (selectedNumber == 2) {
                signup(applicationContext);
            } else if (selectedNumber == 3) {
                applicationContext.getShowMenu().showLogout();
                flag = false;
            } else {
                applicationContext.getShowMenu().showRightNumber();
            }
        }
    }


    private static void login(ApplicationContext applicationContext) throws SQLException {

        applicationContext.getShowMenu().showUsername();
        String username = applicationContext.getStringScanner().nextLine();

        applicationContext.getShowMenu().showPassword();
        String password = applicationContext.getStringScanner().nextLine();

        User user = applicationContext.getUserRepository().getByUsernameAndPassword(username, password);
        if (user != null) {
            applicationContext.getShowMenu().showWelcome(user);
            applicationContext.getSecurityUser().setCurrentUser(user);
            redirectUserToPanel(applicationContext);

        } else {
            applicationContext.getShowMenu().showLoginFail();

        }
    }

    private static void redirectUserToPanel(ApplicationContext applicationContext) throws SQLException {
        applicationContext.getShowMenu().showUserMenu();
        boolean isSelectedNumberInValid = true;
        while (isSelectedNumberInValid) {

            int selectedNumber = applicationContext.getIntScanner().nextInt();
            if (selectedNumber == 1) {
                applicationContext.getShowMenu().showItemMyCart();
                cartUserToPanel(applicationContext);

                redirectUserToPanel(applicationContext);
            } else if (selectedNumber == 2) {
                applicationContext.getShowMenu().showAllProduct();
                printAllProduct(applicationContext);

            } else if (selectedNumber == 3) {

                applicationContext.getShowMenu().showProfile(applicationContext.getSecurityUser().getCurrentUser());
                redirectUserToPanel(applicationContext);
            } else if (selectedNumber == 4) {

                applicationContext.getShowMenu().showLogoutProfile();
                applicationContext.getSecurityUser().logout();
                isSelectedNumberInValid = false;
            } else {
                applicationContext.getShowMenu().showRightNumber();
                applicationContext.getShowMenu().showUserMenu();
            }
        }
    }

    private static void cartUserToPanel(ApplicationContext applicationContext) throws SQLException {
        boolean flag = true;
        while (flag) {
            int selectNumber = applicationContext.getIntScanner().nextInt();
            if (selectNumber == 1) {
                addedProductTocart(applicationContext);

            } else if (selectNumber == 2) {


            } else if (selectNumber == 3) {
                applicationContext.getShowMenu().showAllProduct();
                printAllProduct(applicationContext);

            } else if (selectNumber == 4) {

                applicationContext.getShowMenu().showLogoutProfile();
                applicationContext.getSecurityUser().logout();
                flag = false;


            } else if (selectNumber == 5) {
                redirectUserToPanel(applicationContext);

            } else {
                applicationContext.getShowMenu().showRightNumber();
                applicationContext.getShowMenu().showUserMenu();

            }


        }
    }

    private static void addedProductTocart(ApplicationContext applicationContext) {
        applicationContext.getShowMenu().showAddeProduct();
        int selectNumber = applicationContext.getIntScanner().nextInt();
        if (selectNumber == 1) {
            applicationContext.getShowMenu().showAddedShoe();
            addedSheoToMycart(applicationContext);
        } else if (selectNumber == 2) {


        } else if (selectNumber == 3) {


        } else {
        }
        applicationContext.getShowMenu().showRightNumber();
        applicationContext.getShowMenu().showUserMenu();
    }

    private static void addedSheoToMycart(ApplicationContext applicationContext) {

        int selectNumber = applicationContext.getIntScanner().nextInt();
        if (selectNumber == 1) {
            applicationContext.getSportShoeRepository().addedToMyCart(applicationContext);
        } else if (selectNumber == 2) {

        } else {
        }
        applicationContext.getShowMenu().showRightNumber();
        applicationContext.getShowMenu().showUserMenu();
    }

    private static void printAllProduct(ApplicationContext applicationContext) throws SQLException {
        printAllBook(applicationContext);
        printAllMagazine(applicationContext);
        printAllRadio(applicationContext);
        printAllTelevision(applicationContext);
        printAllSportShoe(applicationContext);
        printAllOfficalShoe(applicationContext);
        redirectUserToPanel(applicationContext);
    }

    private static void printAllBook(ApplicationContext applicationContext) throws SQLException {
        Book[] books = applicationContext.getBookRepository().getAllBook();
        for (int i = 0; i < books.length; i++) {
            System.out.println((i + 1 + ": " + books[i]));
        }
    }

    private static void printAllMagazine(ApplicationContext applicationContext) throws SQLException {
        Magazine[] magazines = applicationContext.getMagazineRepository().getAllMagazine();
        for (int i = 0; i < magazines.length; i++) {
            System.out.println((i + 4 + ": " + magazines[i]));
        }
    }

    private static void printAllRadio(ApplicationContext applicationContext) throws SQLException {
        Radio[] radio = applicationContext.getRadioRepository().getAllRadio();
        for (
                int i = 0; i < radio.length; i++) {
            System.out.println((i + 7 + ": " + radio[i]));
        }
    }

    private static void printAllTelevision(ApplicationContext applicationContext) throws SQLException {
        Television[] televisions = applicationContext.getTelevisionRepository().getAllTelevision();
        for (int i = 0; i < televisions.length; i++) {
            System.out.println((i + 10 + ": " + televisions[i]));
        }
    }

    private static void printAllSportShoe(ApplicationContext applicationContext) throws SQLException {
        SportShoe[] sportShoes = applicationContext.getSportShoeRepository().getAllSportShoe();
        for (int i = 0; i < sportShoes.length; i++) {
            System.out.println((i + 13 + ": " + sportShoes[i]));
        }
    }

    private static void printAllOfficalShoe(ApplicationContext applicationContext) throws SQLException {
        OfficalShoe[] officalShoes = applicationContext.getOfficalshoeRepository().getAllOfficalShoe();
        for (int i = 0; i < officalShoes.length; i++) {
            System.out.println((i + 16 + ": " + officalShoes[i]));
        }
    }


    private static void signup(ApplicationContext applicationContext) throws SQLException {

        User user = new User();

        applicationContext.getShowMenu().showFirstName();
        String firstName = applicationContext.getStringScanner().nextLine();


        applicationContext.getShowMenu().showLastName();
        String lastName = applicationContext.getStringScanner().nextLine();


        applicationContext.getShowMenu().showUsername();
        String username = applicationContext.getStringScanner().nextLine();


        applicationContext.getShowMenu().showPassword();
        String password = applicationContext.getStringScanner().nextLine();

        applicationContext.getShowMenu().showPhoneNumber();
        String phoneNumber = applicationContext.getStringScanner().nextLine();


        applicationContext.getShowMenu().showEmail();
        String email = applicationContext.getStringScanner().nextLine();


        user.setFirstName(firstName);
        user.setLastName(lastName);
        user.setUserName(username);
        user.setPassword(password);
        user.setPhoneNumber(phoneNumber);
        user.setEmailAddress(email);


        User adedUser = applicationContext.getUserRepository().insertUser(user);

        System.out.println(adedUser);
    }


}

