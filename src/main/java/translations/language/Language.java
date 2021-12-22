package translations.language;

public enum Language {
    PR_BR, EN_US, EN;

    public Boolean isPT_BR() {
        return Language.PR_BR.equals(this);
    }

    public Boolean isEN_US() {
        return Language.EN_US.equals(this);
    }

    public Boolean isEN() {
        return Language.EN.equals(this);
    }
}
