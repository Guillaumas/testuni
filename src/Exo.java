import org.joda.time.DateTime;
import java.util.ArrayList;
import java.util.Scanner;

public class Exo {
    public static void main(String[] args) {


        ArrayList langues = new ArrayList();
        langues.add("Français");
        langues.add("Anglais");
        DateTime dt = new DateTime();
        int hour = dt.getHourOfDay();
        System.out.println("Dans quelle langues souhaitez vous parler ?" + langues);
        Scanner langue = new Scanner(System.in);
        String lang = langue.nextLine();
        System.out.println("Vous avez choisi de parler " + lang);
        if (lang.contentEquals("Français") || lang.contentEquals("français") || lang.contentEquals("francais")) {
            if (hour < 12) {
                System.out.println("Bonjour");
            } else {
                System.out.println("Bonsoir");
            }

            Scanner input = new Scanner(System.in);
            String str = input.nextLine();
            System.out.println(str);
            if (str.contentEquals(new StringBuilder(str).reverse())) {
                System.out.println("Bien dit !");
            }

            if (hour < 12) {
                System.out.println("Au revoir !");
            } else {
                System.out.println("Bonne soirée");
            }
        } else if (lang.contentEquals("Anglais") || lang.contentEquals("anglais")) {
            if (hour < 12) {
                System.out.println("Hello");
            } else {
                System.out.println("Good evening");
            }

            Scanner input = new Scanner(System.in);
            String str = input.nextLine();
            System.out.println(str);
            if (str.contentEquals(new StringBuilder(str).reverse())) {
                System.out.println("Well said !");
            }

            if (hour < 12) {
                System.out.println("Have a nice day");
            } else {
                System.out.println("Bye !");
            }
        }
        else {
            System.out.println("Je ne parle pas cette langue");
        }
    }
}
