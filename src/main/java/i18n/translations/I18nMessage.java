package i18n.translations;

import i18n.language.I18nConfig;
import i18n.language.Language;
import i18n.language.LocaleUtils;

import java.util.Locale;
import java.util.ResourceBundle;

public class I18nMessage {

    private static final String I18N_PREFIX = "i18n";

    public static String getString(String message) {
        try {
            return I18nMessage.getBundle().getString(message);
        } catch (Exception e) {
            return message;
        }
    }

    public static String getString(String message, Language language) {
        return I18nMessage.getBundle(LocaleUtils.getLocale(language)).getString(message);
    }

    public static ResourceBundle getBundle() {
        return getBundle(LocaleUtils.getLocale(I18nConfig.getLanguage()));
    }

    public static ResourceBundle getBundle(Locale locale) {
        if (locale == null) return null;
        return ResourceBundle.getBundle(I18N_PREFIX, locale);
    }
}
