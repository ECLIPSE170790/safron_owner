package io.safron.owner.config;

import org.aeonbits.owner.Config;

public interface TypesConfig extends Config {

    @Key("interger")
    Integer getInteger();

    @Key("enum")
    Browser getEnum();

    @Key("double")
    Double getDouble();

    @Key("boolean")
    Boolean getBoolean();

}
