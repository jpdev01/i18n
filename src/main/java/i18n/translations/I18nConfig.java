package i18n.translations;

import i18n.translations.language.Language;
import javax.servlet.http.HttpServletRequest;

import java.util.Locale;

public class I18nConfig {

    public I18nConfig(final HttpServletRequest httpRequest){

    }

    public static final Locale DEFAULT_LOCALE = new Locale("pt", "BR");

    public static final Language DEFAULT_LANGUAGE = Language.PT_BR;

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
