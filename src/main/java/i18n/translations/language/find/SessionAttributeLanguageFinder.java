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
        if ((attribute == null) || !String.class.isAssignableFrom(attribute.getClass())) {
            return null;
        }
        return new DefaultLanguage(LocaleUtils.getByCode(String.class.cast(attribute))).getLanguage();
    }

}
