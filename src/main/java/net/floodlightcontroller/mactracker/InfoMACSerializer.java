package net.floodlightcontroller.mactracker;

import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.JsonSerializer;
import com.fasterxml.jackson.databind.SerializerProvider;

import java.io.IOException;

public class InfoMACSerializer extends JsonSerializer<InfoMAC> {
    @Override
    public void serialize(InfoMAC infoMAC, JsonGenerator jsonGenerator, SerializerProvider serializerProvider) throws IOException, JsonProcessingException {
        jsonGenerator.writeStartObject();
        jsonGenerator.writeStringField("mac_address", infoMAC.getMAC());
        jsonGenerator.writeStringField("attachment_point", infoMAC.getAtchp());
        jsonGenerator.writeEndObject();
    }
}
