package i18n.filter;

import i18n.translations.I18nConfig;
import i18n.translations.language.find.SessionAttributeLanguageFinder;

import javax.servlet.*;
import javax.servlet.http.HttpServletRequest;
import java.io.IOException;
import java.util.Locale;

final public class I18nFilter implements Filter {

    public void doFilter(final ServletRequest request, final ServletResponse response, final FilterChain chain) throws IOException, ServletException {

        Locale locale = new SessionAttributeLanguageFinder(((HttpServletRequest) request).getSession()).findLanguage();
        if (locale != null) I18nConfig.setLocale(locale);

        chain.doFilter(request, response);
    }


    public void destroy() {

    }

    public void init(final FilterConfig filterConfig) throws ServletException {

    }

}