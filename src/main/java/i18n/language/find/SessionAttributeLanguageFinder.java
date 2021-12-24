package i18n.language.find;

import i18n.language.DefaultLanguage;
import i18n.language.Language;
import i18n.language.LocaleUtils;

import javax.servlet.http.HttpSession;

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
