# Projeto de internacionalização i18n (ainda em dev)

### Para adicionar essa biblioteca ao seu projeto:

1- basta adicionar ao `pom.xml`:
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

2- Caso queira passar a language por sessão:

Configure os dois filtros, um para salvar a language, outro para usa-la.
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

### Como usar a `<version>` mais atualizada:
Acesse a url: <a href="https://jitpack.io/#jpdev01/i18n/-SNAPSHOT"> Link para o repositório do jitpack</a>


### Para usar as traduções:
`I18nMessage.getString(${code}, ${locale})`
<br>

### :hammer: Futuras features: <br>
1- Verificar se é possível o projeto i18n decidir o locale a ser usado. O problema é que ele não tem dependencia ao outro projeto. <br>
2- Adicionar idioma espanhol <br>
3- Quando nao tiver aquela traducao, trazer o code. <br>
4- Permitir personalização.