package translations;

import translations.language.LocaleUtils;

import java.util.Locale;
import java.util.ResourceBundle;

public class I18nMessage {

    public static String getString(String message) {
        ResourceBundle bundle = ResourceBundle.getBundle("i18n", LocaleUtils.getCurrentLocale());
        return bundle.getString(message);
    }

    public static String getString(String message, Locale locale) {
        ResourceBundle bundle = ResourceBundle.getBundle("i18n", locale);
        return bundle.getString(message);
    }
}
