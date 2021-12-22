package i18n.translations.language;

import javax.servlet.http.HttpSession;
import java.util.Locale;

/**
 * @author jonasabreu
 * 
 */
final public class SessionAttributeLanguageFinder {

    private final HttpSession session;

    public SessionAttributeLanguageFinder(final HttpSession session) {
        this.session = session;
    }

    public Locale findLanguage() {
        Object attribute = session.getAttribute("i18n_lang");
        if ((attribute == null) || !String.class.isAssignableFrom(attribute.getClass())) {
            return null;
        }
        return new DefaultLanguage(LocaleUtils.getByCode(String.class.cast(attribute))).getLocale();
    }

}
