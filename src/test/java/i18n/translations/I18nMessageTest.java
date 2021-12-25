package i18n.translations;

import i18n.language.I18nConfig;
import i18n.language.Language;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.util.Locale;

public class I18nMessageTest {

    @Before
    public void mockBundle() {
        I18nConfig.setLanguage(Language.PT_BR);
    }

    @Test
    public void getStringTest() {
        Assert.assertEquals("Teste", I18nMessage.getString("test"));
        Assert.assertEquals("Test", I18nMessage.getString("test", Language.EN_US));
    }
}
