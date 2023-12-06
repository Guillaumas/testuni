import org.joda.time.DateTime;

import java.util.Scanner;

public class Exo {
    public static void main(String[] args) {
        LanguageHandler languageHandler = new LanguageHandler();
        languageHandler.displayLanguageOptions();

        Scanner scanner = new Scanner(System.in);
        String selectedLanguage = scanner.nextLine();
        languageHandler.processLanguage(selectedLanguage);
    }
}
