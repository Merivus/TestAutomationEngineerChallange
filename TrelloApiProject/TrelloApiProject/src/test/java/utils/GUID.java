package utils;

import java.util.UUID;

public class GUID {
    private UUID value;

    public GUID(UUID value) {
        this.value = value;
    }

    public GUID(String guid) {
        this(UUID.fromString(guid));
    }

    @Override
    public String toString() {
        return value.toString();
    }

    public static GUID fromString(String guid) {
        return new GUID(guid);
    }
}