package translations;

import java.util.ResourceBundle;

public class I18nMessage {

    public static String getString(String message)
    {
        // FIXME quando nao tiver aquela traducao, trazer o codigo.
        ResourceBundle bundle = ResourceBundle.getBundle("i18n", I18nConfig.getCurrentLocale());
        return bundle.getString(message);
    }
}
