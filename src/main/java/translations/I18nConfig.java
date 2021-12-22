package translations;

import translations.language.Language;
import javax.servlet.http.HttpServletRequest;

import java.util.Locale;

public class I18nConfig {

    public I18nConfig(final HttpServletRequest httpRequest){

    }

    public static final Locale DEFAULT_LOCALE = new Locale("pt", "BR");

    private static Language language;

    private static Locale locale;

    public static Language getLanguage() {
        return language;
    }

    public void setLanguage(Language language) {
        this.language = language;
    }

    public static Locale getLocale() {
        return locale;
    }

    public static void setLocale(Locale locale) {
        I18nConfig.locale = locale;
    }
}
