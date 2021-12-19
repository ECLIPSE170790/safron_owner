package io.safron.owner.config;

import java.net.MalformedURLException;
import java.net.URL;

public class HugeWebDriverConfig {

    public URL getRemoteUrl() {
        String remoteUrl = System.getProperty("remoteUrl");
        try {
            return new URL(remoteUrl);
        } catch (MalformedURLException e) {
            throw new RuntimeException(e);
        }
    }

    public int getPort() {
        String port = System.getProperty("port");
        return Integer.parseInt(port);
    }

    public Browser getBrowser() {
        String browserName = System.getProperty("browser");
        if (browserName == null) {
            return Browser.CHROME;
        } else {
            return Browser.valueOf(browserName);
        }
    }

    public String getBaseUrl() {
        return System.getProperty("baseUrl");
    }
}
