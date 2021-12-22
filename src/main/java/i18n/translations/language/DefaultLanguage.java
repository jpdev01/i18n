package i18n.translations.language;

import java.util.Locale;

public class DefaultLanguage {

    private Locale locale;

    public DefaultLanguage(final Locale locale) {
        this.locale = locale;
    }

    public Locale getLocale() {
        return locale;
    }

    public void setLocale(Locale locale) {
        this.locale = locale;
    }
}
