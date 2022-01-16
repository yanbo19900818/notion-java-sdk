package xyz.yanbo.notion.sdk.model.parent;

import lombok.Data;
import xyz.yanbo.notion.sdk.serializer.CommonEnum;

@Data
public class NotionParent {
    private NotionParentType type;

    public enum NotionParentType implements CommonEnum {
        DATABSE("database_id"),
        PAGE("page_id"),
        WORKSPACE("workspace");

        private String code;

        NotionParentType(String code) {
            this.code = code;
        }

        public String getCode() {
            return code;
        }

        public static NotionParentType getEnumByCode(String code) {
            for (NotionParentType value : values()) {
                if (value.getCode().equals(code)) {
                    return value;
                }
            }
            return null;
        }
    }
}

