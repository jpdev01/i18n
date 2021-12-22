# Projeto de internacionalização i18n 

### Para adicionar essa biblioteca ao seu projeto, basta adicionar ao `pom.xml`:
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

### Para usar as traduções:
`I18nMessage.getString(${code}, ${locale})`
<br>

Futuras features: <br>
1- Verificar se é possível o projeto i18n decidir o locale a ser usado. O problema é que ele não tem dependencia ao outro projeto. <br>
2- Adicionar idioma espanhol