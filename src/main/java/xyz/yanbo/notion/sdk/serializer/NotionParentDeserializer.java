package xyz.yanbo.notion.sdk.serializer;

import com.google.gson.*;
import xyz.yanbo.notion.sdk.model.parent.NotionDatabaseParent;
import xyz.yanbo.notion.sdk.model.parent.NotionPageParent;
import xyz.yanbo.notion.sdk.model.parent.NotionParent;
import xyz.yanbo.notion.sdk.model.parent.NotionWorkspaceParent;

import java.lang.reflect.Type;

public class NotionParentDeserializer implements JsonDeserializer<NotionParent> {
    @Override
    public NotionParent deserialize(JsonElement json, Type typeOfT, JsonDeserializationContext context) throws JsonParseException {
        JsonObject jsonObject = json.getAsJsonObject();
        JsonElement jsonType = jsonObject.get("type");
        if (jsonType == null) {
            return new NotionParent();
        }
        String type = jsonType.getAsString();
        NotionParent.NotionParentType notionParentType = NotionParent.NotionParentType.getEnumByCode(type);
        if (notionParentType == null) {
            return new NotionParent();
        }

        switch (notionParentType) {
            case DATABSE:
                return context.deserialize(json, NotionDatabaseParent.class);
            case PAGE:
                return context.deserialize(json, NotionPageParent.class);
            case WORKSPACE:
                return context.deserialize(json, NotionWorkspaceParent.class);
        }
        return new NotionParent();
    }
}