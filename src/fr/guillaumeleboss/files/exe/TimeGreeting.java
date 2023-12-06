package fr.guillaumeleboss.files.exe;

import org.joda.time.DateTime;

import java.util.Scanner;

public class TimeGreeting {
    private final DateTime dateTime = new DateTime();
    private final Scanner scanner = new Scanner(System.in);

    public void handleFrenchGreeting() {
        greet("Bonjour", "Bonsoir");
        interact();
        farewell("Au revoir !", "Bonne soirée");
    }

    public void handleEnglishGreeting() {
        greet("Hello", "Good evening");
        interact();
        farewell("Have a nice day", "Bye !");
    }

    private void greet(String morningGreeting, String eveningGreeting) {
        if (isMorning()) {
            System.out.println(morningGreeting);
        } else {
            System.out.println(eveningGreeting);
        }
    }

    private void interact() {
        String input = scanner.nextLine();
        StringBuilder inputBuilder = new StringBuilder(input);
        System.out.println(inputBuilder.reverse());
        if (input.equals(new StringBuilder(input).reverse().toString())) {
            System.out.println(isMorning() ? "Bien dit !" : "Well said !");
        }
    }

    private void farewell(String morningFarewell, String eveningFarewell) {
        System.out.println(isMorning() ? morningFarewell : eveningFarewell);
    }

    private boolean isMorning() {
        return dateTime.getHourOfDay() < 12;
    }
}
