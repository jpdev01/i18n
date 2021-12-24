package i18n.filter.config;

import i18n.translations.language.Language;

import javax.servlet.*;
import javax.servlet.http.HttpSession;

public abstract class I18nFilterConfig implements Filter {

    private final HttpSession session;

    public I18nFilterConfig(final HttpSession session){
        this.session = session;
    }

    public void destroy() {

    }

    public void init(final FilterConfig filterConfig) throws ServletException {

    }

    protected void saveLanguage(Language language) {
        session.setAttribute("i18n_lang", language);
    }
}
