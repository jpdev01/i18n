package i18n.filter.config;

import i18n.translations.language.Language;

import javax.servlet.*;
import javax.servlet.http.HttpSession;

public abstract class I18nFilterConfig implements Filter {

    private HttpSession session;

    public void destroy() {

    }

    public void init(final FilterConfig filterConfig) throws ServletException {

    }

    protected void saveSession(final HttpSession httpSession) {
        this.session = httpSession;
    }

    protected void saveLanguage(Language language) {
        session.setAttribute("i18n_lang", language);
    }
}
