package xyz.yanbo.notion.sdk.serializer;

import com.google.gson.Gson;
import com.google.gson.TypeAdapter;
import com.google.gson.TypeAdapterFactory;
import com.google.gson.reflect.TypeToken;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonToken;
import com.google.gson.stream.JsonWriter;

import java.io.IOException;
import java.lang.reflect.Field;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class EnumTypeAdapterFactory implements TypeAdapterFactory {
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> typeToken) {
        if (!typeToken.getRawType().isEnum()) {
            return null;
        }
        Map<Object, String> map = new HashMap<>();
        Arrays.stream(typeToken.getRawType().getEnumConstants()).forEach(e -> {
            CommonEnum tt = (CommonEnum) e;
            map.put(tt, tt.getCode());
        });
        return new TypeAdapter<T>() {
            @Override
            public void write(JsonWriter jsonWriter, T t) throws IOException {
                if (t == null) {
                    return;
                }
                jsonWriter.value(map.get(t));
            }

            @Override
            public T read(JsonReader jsonReader) throws IOException {
                if (jsonReader.peek() == JsonToken.NULL) {
                    jsonReader.nextNull();
                    return null;
                } else {
                    String source = jsonReader.nextString();
                    for (Map.Entry<Object, String> entry : map.entrySet()) {
                        if (entry.getValue().equals(source)) {
                            return (T) entry.getKey();
                        }
                    }
                    return null;
                }
            }
        };
    }
}
