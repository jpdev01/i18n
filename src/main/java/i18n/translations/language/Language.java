package i18n.translations.language;

public enum Language {
    PT_BR, EN_US, EN;

    public Boolean isPT_BR() {
        return Language.PT_BR.equals(this);
    }

    public Boolean isEN_US() {
        return Language.EN_US.equals(this);
    }

    public Boolean isEN() {
        return Language.EN.equals(this);
    }
}
