package io.safron.owner.config;

import org.aeonbits.owner.Config;

@Config.LoadPolicy()
@Config.Sources({
        "classpath:${platform}.properties",
        "file:C:/Users/ECLIPSE/Downloads/some.file"
})
public interface MobileConfig extends Config {

    @Key("app.location")
    String appLocation();

    @Key("device.name")
    String deviceName();

    @Key("platform.name")
    String platformName();

    @Key("platform.version")
    String platformVersion();
}
