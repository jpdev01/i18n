package i18n.translations.language.find;

import i18n.translations.language.SessionAttributeLanguageFinder;

import javax.servlet.http.HttpServletRequest;
import java.util.Locale;

final public class RequestParameterLanguageFinder {

    private final HttpServletRequest request;

    public RequestParameterLanguageFinder(final HttpServletRequest request) {
        this.request = request;
    }

    public Locale findLanguage() {
        String parameter = request.getParameter("i18n_lang");
        return new SessionAttributeLanguageFinder(request.getSession()).findLanguage();
    }

}