## Como utilizar: 

- [Adicionar dependência](#dependency)


## dependency
#### 1- Adicionar ao `pom.xml`:
```
<repositories>
	<repository>
		<id>jitpack.io</id>
		<url>https://jitpack.io</url>
	</repository>
</repositories>
```

```
<dependency>
	<groupId>com.github.jpdev01</groupId>
	<artifactId>i18n</artifactId>
	<version>77440832de</version>
</dependency>
```

#### 2- Caso queira passar a language por sessão:

#### 2.1 - Configure seu filtro interno, onde será salvo em sessão o idioma do usuário:
```
public class I18nFilterConfigImpl extends I18nFilterConfig {

    public void doFilter(final ServletRequest request, final ServletResponse response, final FilterChain chain) throws IOException, ServletException {
        saveSession(((HttpServletRequest) request).getSession());
        saveLanguage(Language.PT_BR);
        chain.doFilter(request, response);
    }

}
```
#### 2.2- Configure os dois filtros, um para salvar a language (seu/interno), outro para usa-la (da lib).
```
@Configuration
public class I18nConfig {

    @Bean
    public FilterRegistrationBean internalFilter() {
        FilterRegistrationBean registration = new FilterRegistrationBean();
        registration.setFilter(new I18nFilterConfigImpl());
        registration.addUrlPatterns("/*");
        registration.setName("i18nInternalFilter");
        registration.setOrder(1);
        return registration;
    }

    @Bean
    public FilterRegistrationBean dependencyFilter() {
        FilterRegistrationBean registration = new FilterRegistrationBean();
        registration.setFilter(new I18nFilter());
        registration.addUrlPatterns("/*");
        registration.setName("i18nFilter");
        registration.setOrder(2);
        return registration;
    }
}
```
### Para usar as traduções:
`I18nMessage.getString(${code})`

Ou ainda se quiser especificar/sobrepor o locale:
`I18nMessage.getString(${code}, ${locale})`

### Como usar a `<version>` mais atualizada:
Acesse a url: <a href="https://jitpack.io/#jpdev01/i18n/-SNAPSHOT"> Link para o repositório do jitpack</a>