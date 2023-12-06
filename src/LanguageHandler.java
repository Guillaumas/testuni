import java.util.Arrays;
import java.util.List;

public class LanguageHandler {
    private static final List<String> LANGUAGES = Arrays.asList("Français", "Anglais");
    private static final TimeGreeting TIME_GREETING = new TimeGreeting();

    public void displayLanguageOptions() {
        System.out.println("Dans quelle langue souhaitez-vous parler ? " + LANGUAGES);
    }

    public void processLanguage(String language) {
        language = language.toLowerCase();
        switch (language) {
            case "français":
            case "francais":
                TIME_GREETING.handleFrenchGreeting();
                break;
            case "anglais":
                TIME_GREETING.handleEnglishGreeting();
                break;
            default:
                System.out.println("Je ne parle pas cette langue.");
        }
    }
}
