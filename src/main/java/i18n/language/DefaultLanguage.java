package i18n.language;

public class DefaultLanguage {

    private final Language language;

    public DefaultLanguage(final Language language) {
        this.language = language;
    }

    public DefaultLanguage(final String code) {
        this.language = LocaleUtils.getByCode(code);
    }

    public Language getLanguage() {
        return language;
    }
}
