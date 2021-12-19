package io.safron.owner;

import io.safron.owner.config.AndroidConfig;
import io.safron.owner.config.MobileConfig;
import org.aeonbits.owner.ConfigFactory;
import org.assertj.core.api.AssertionsForClassTypes;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class MobileTest {

    private MobileConfig config;

    @Test
    public void testAndroid() {
        System.setProperty("platform", "android");

        config = ConfigFactory.create(MobileConfig.class, System.getProperties());
        AssertionsForClassTypes.assertThat(config.appLocation()).isEqualTo("/Users/ECLIPSE/Downloads/app.android");
        AssertionsForClassTypes.assertThat(config.deviceName()).isEqualTo("Pixel 8");
        AssertionsForClassTypes.assertThat(config.platformName()).isEqualTo("Android");
        AssertionsForClassTypes.assertThat(config.platformVersion()).isEqualTo("23");
    }

    @Test
    public void testIOS() {
        System.setProperty("platform", "ios");

        config = ConfigFactory.create(MobileConfig.class, System.getProperties());
        AssertionsForClassTypes.assertThat(config.appLocation()).isEqualTo("/Users/ECLIPSE/Downloads/app.ios");
        AssertionsForClassTypes.assertThat(config.deviceName()).isEqualTo("IPhone 13");
        AssertionsForClassTypes.assertThat(config.platformName()).isEqualTo("IOS");
        AssertionsForClassTypes.assertThat(config.platformVersion()).isEqualTo("15");
    }

}
