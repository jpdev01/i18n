package i18n.language;

import java.util.Locale;

public class LocaleUtils {

    public static Locale getCurrentLocale() {
        String language = getStringLanguage();
        String country = getCurrentCountry();

        if (language != null && country != null) return new Locale(language, country);

        return null;
    }

    public static String getStringLanguage() {
        Language language = I18nConfig.getLanguage();

        if (language != null) {
            if (language.isPT_BR()) return "pt";
            if (language.isEN_US()) return "en";
        }
        return null;
    }

    public static String getCurrentCountry() {
        Language language = I18nConfig.getLanguage();

        if (language != null) {
            if (language.isPT_BR()) return "br";
            if (language.isEN_US()) return "us";
        }
        return null;
    }

    public static Language getByCode(String code) {
        if (code == "pt_BR") return Language.PT_BR;
        if (code == "en_US") return Language.EN_US;

        return null;
    }
}
