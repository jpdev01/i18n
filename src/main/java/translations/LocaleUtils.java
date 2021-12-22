package translations;

import java.util.Locale;

public class LocaleUtils {

    public static Locale getCurrentLocale() {
        String language = getStringLanguage();
        String country = getCurrentCountry();
        if (language != null && country != null) {
            return new Locale(getStringLanguage(), getCurrentCountry());
        }
        return I18nConfig.DEFAULT_LOCALE;
    }

    public static String getStringLanguage() {
        Language language = I18nConfig.getLanguage();

        if (language != null) {
            if (language.isPT_BR()) return "pt";
            if (language.isEN_US()) return "en";
            if (language.isEN()) return "en";
        }
        return null;
    }

    public static String getCurrentCountry() {
        Language language = I18nConfig.getLanguage();

        if (language != null) {
            if (language.isPT_BR()) return "br";
            if (language.isEN_US()) return "us";
            if (language.isEN()) return "en";
        }
        return null;
    }
}
