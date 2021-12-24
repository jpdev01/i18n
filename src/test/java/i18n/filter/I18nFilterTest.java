package i18n.filter;

import i18n.language.I18nConfig;
import i18n.language.I18nConfigTest;
import i18n.language.DefaultLanguage;
import i18n.language.Language;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import javax.servlet.*;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import java.io.IOException;

import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

final public class I18nFilterTest {

    private HttpServletRequest request;
    private HttpSession session;
    private HttpServletResponse response;

    @Before
    public void setup() {
        request = mock(HttpServletRequest.class);
        session = mock(HttpSession.class);
        response = mock(HttpServletResponse.class);
    }

    @After
    public void tearDown() {
        I18nConfig.removeLanguage();
    }

    @Test
    public void testThatFindsLanguageOnSession() throws Throwable {
        //Arrange
        Filter filter = new I18nFilter();
        when(session.getAttribute("i18n_lang")).thenReturn("pt_BR");
        when(request.getSession()).thenReturn(session);

        filter.doFilter(request, response, new AssertLanguageChain(new DefaultLanguage("pt_BR").getLanguage()));
    }

    public class AssertLanguageChain implements FilterChain {

        private final Language language;

        public AssertLanguageChain(final Language language) {
            this.language = language;
        }

        public void doFilter(final ServletRequest request, final ServletResponse response) throws IOException,
                ServletException {
            Assert.assertEquals(language, I18nConfig.getLanguage());
        }
    }
}
