package i18n.language;

public class I18nConfig {

    private static Language language;

    public static Language getLanguage() {
        return language;
    }

    public static void setLanguage(Language language) {
        I18nConfig.language = language;
    }

    public static void removeLanguage() {
        I18nConfig.language = null;
    }
}
