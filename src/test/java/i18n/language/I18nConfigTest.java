package i18n.language;


import org.junit.After;
import org.junit.Assert;
import org.junit.Test;

public class I18nConfigTest {

    @After
    public void tearDown() {
        I18nConfig.removeLanguage();
    }

    @Test
    public void testThatReturnsNotSetLanguageIfLanguageWasNotSet() {
        Assert.assertEquals(null, I18nConfig.getLanguage());
    }

    @Test
    public void testThatReturnsLanguageSet() {
        I18nConfig.setLanguage(new DefaultLanguage("pt_BR").getLanguage());
        Assert.assertEquals(new DefaultLanguage("pt_BR").getLanguage(), I18nConfig.getLanguage());
    }
}
