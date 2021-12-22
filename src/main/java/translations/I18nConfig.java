package translations;

import java.util.Locale;

public class I18nConfig {

    public static final Locale DEFAULT_LOCALE = new Locale("pt", "BR");

    private static Language language;

    public static Language getLanguage() {
        return language;
    }

    public void setLanguage(Language language) {
        this.language = language;
    }

}
