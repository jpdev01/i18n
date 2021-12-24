package i18n.translations.language;

import i18n.translations.I18nConfig;

import java.util.Locale;

public class LocaleUtils {

    public static Locale getCurrentLocale() {
        String language = getStringLanguage();
        String country = getCurrentCountry();

        if (language != null && country != null) return new Locale(language, country);

        return I18nConfig.DEFAULT_LOCALE;
    }

    public static String getStringLanguage() {
        Language language = I18nConfig.getLanguage();

        if (language != null) {
            if (language.isPT_BR()) return "pt";
            if (language.isEN_US()) return "en";
            if (language.isEN()) return null;
        }
        return null;
    }

    public static String getCurrentCountry() {
        Language language = I18nConfig.getLanguage();

        if (language != null) {
            if (language.isPT_BR()) return "br";
            if (language.isEN_US()) return "us";
            if (language.isEN()) return null;
        }
        return null;
    }

    public static Language getByCode(String code) {
        if (code == "pt_BR") return Language.PT_BR;
        if (code == "en_US") return Language.EN_US;

        return null;
    }
}
