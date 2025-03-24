package config;

import org.aeonbits.owner.Config;

@Config.Sources("classpath:config.properties")
public interface ConfigProperties extends Config {
    @Key("browser")
    String browser();

    @Key("browserSize")
    String browserSize();

    @Key("pageLoadStrategy")
    String pageLoadStrategy();

    @Key("baseUrl")
    String baseUrl();

/*    @Key("browserBinary")
    String browserBinary();*/
}
