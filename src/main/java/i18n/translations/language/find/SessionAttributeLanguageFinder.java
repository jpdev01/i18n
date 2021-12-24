package i18n.translations.language.find;

import i18n.translations.language.DefaultLanguage;
import i18n.translations.language.Language;
import i18n.translations.language.LocaleUtils;

import javax.servlet.http.HttpSession;
import java.util.Locale;

final public class SessionAttributeLanguageFinder {

    private final HttpSession session;

    public SessionAttributeLanguageFinder(final HttpSession session) {
        this.session = session;
    }

    public Language findLanguage() {
        Object attribute = session.getAttribute("i18n_lang");
        if (attribute == null) return null;

        Language language = null;
        if (String.class.isAssignableFrom(attribute.getClass())) {
            language = LocaleUtils.getByCode(String.class.cast(attribute));
        } else if (attribute instanceof Language) {
            language = (Language) attribute;
        }
        return new DefaultLanguage(language).getLanguage();
    }

}
