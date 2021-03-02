# GetMyIP

_Lire ceci en [Français](README.fr.md)._

This small Java framework is used to retrieve the public IP address of your network.
It's using the service [ipify API](https://www.ipify.org/) to get the IP.

## Features

Here is the list of the features:

- Retrieves an IP address as a string,
- Tests if the IP is a v4 or v6.

## Maven usage

To use the framework with your Maven project, just define this dependency:

```xml
<dependency>
  <groupId>fr.devrefs.getmyip</groupId>
  <artifactId>getmyip-core</artifactId>
  <version>1.0.0</version>
</dependency>
```

## Program usage

```java
    try {
	final IPInfo ipInfo = MyIP.get();
        final String myIp = ipInfo.getAsString();
    } catch(GetMyIPAddressException e) {
        e.printStackTrace(); // TODO Manage the exception
    }

```

## Bugs & new features

You can report any bugs or request changes and new features using the GitHub's issue manager: https://github.com/stefv/GetMyIP/issues

## Changelog

- 1.0.0
  - First release
