package i18n.translations;

import i18n.language.I18nConfig;
import i18n.language.Language;
import i18n.language.LocaleUtils;

import java.text.MessageFormat;
import java.util.Locale;
import java.util.ResourceBundle;

public class I18nMessage {

    private static final String I18N_PREFIX = "i18n";

    public static String getString(String key) {
        return getString(key, null);
    }

    public static String getString(String key, Object... params) {
        return getString(key, I18nConfig.getLanguage(), params);
    }

    public static String getString(String key, Language language, Object... params) {
        try {
            return MessageFormat.format(I18nMessage.getBundle(LocaleUtils.getLocale(language)).getString(key), params);
        } catch (Exception e) {
            return key;
        }
    }

    public static ResourceBundle getBundle(Locale locale) {
        if (locale == null) return null;
        return ResourceBundle.getBundle(I18N_PREFIX, locale);
    }
}
