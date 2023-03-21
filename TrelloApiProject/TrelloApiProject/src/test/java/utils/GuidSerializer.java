package utils;

import com.fasterxml.jackson.core.JsonGenerationException;
import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.databind.SerializerProvider;
import com.fasterxml.jackson.databind.ser.std.StdSerializer;

import java.io.IOException;

public class GuidSerializer extends StdSerializer<GUID> {

    public GuidSerializer(){
        super(GUID.class);
    }

    @Override
    public void serialize(GUID guid, JsonGenerator jsonGenerator, SerializerProvider serializerProvider) throws IOException, JsonGenerationException {
        jsonGenerator.writeString(guid.toString());
    }
}
