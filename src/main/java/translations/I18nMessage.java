package translations;

import java.util.Locale;
import java.util.ResourceBundle;

public class I18nMessage {

    public static String getString(String message) {
        // FIXME quando nao tiver aquela traducao, trazer o codigo.
        ResourceBundle bundle = ResourceBundle.getBundle("i18n", LocaleUtils.getCurrentLocale());
        return bundle.getString(message);
    }

    public static String getString(String message, Locale locale) {
        // FIXME quando nao tiver aquela traducao, trazer o codigo.
        ResourceBundle bundle = ResourceBundle.getBundle("i18n", locale);
        return bundle.getString(message);
    }
}
