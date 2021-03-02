# GetMyIP

Read this in [English](README.md).

Ce petit framework Java est utilisé pour retrouver l'adresse IP publique de votre réseau.
Il utilise the service [ipify API](https://www.ipify.org/) pour récupérer l'IP.

## Fonctionnalités

Voici la liste des fonctionnalités:

- Récupére l'IP comme une chaîne de caractères,
- Teste si l'IP est v4 ou v6.

## Usage avec Maven

Pour utiliser ce framework avec votre projet Maven, définissez cette dépendance:

```xml
<dependency>
  <groupId>fr.devrefs.getmyip</groupId>
  <artifactId>getmyip-core</artifactId>
  <version>1.0.0</version>
</dependency>
```

## Usage dans le programme

```java
    try {
	final IPInfo ipInfo = MyIP.get();
        final String myIp = ipInfo.getAsString();
    } catch(GetMyIPAddressException e) {
        e.printStackTrace(); // TODO Gérer cette exception
    }

```

## Bugs et évolutions

Vous pouvez signaler tout bug éventuel ou demander des évolutions et nouvelles fonctionnalités au moyen du gestionnaire d'_issue_ de GitHub: https://github.com/stefv/GetMyIP/issues

## Changelog

- 1.0.0
  - Première release
