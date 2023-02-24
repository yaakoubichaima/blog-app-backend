package com.app.blogapp;
import java.io.IOException;
import org.bson.types.ObjectId;
import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.databind.DeserializationContext;
import com.fasterxml.jackson.databind.JsonDeserializer;

public class ObjectIdDeserializer extends JsonDeserializer<ObjectId> {

    @Override
    public ObjectId deserialize(JsonParser p, DeserializationContext ctxt) throws IOException {
        String objectIdString = p.getValueAsString();
        if (objectIdString != null) {
            return new ObjectId(objectIdString);
        }
        return null;
    }
}
