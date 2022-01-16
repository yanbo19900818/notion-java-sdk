package xyz.yanbo.notion.sdk.model.database;

import lombok.Data;
import xyz.yanbo.notion.sdk.serializer.CommonEnum;

@Data
public class NotionSort {
    /**
     * The name of the property to sort against.
     */
    private String property;
    /**
     * The name of the timestamp to sort against. Possible values include "created_time" and "last_edited_time".
     */
    private TimestampEnum timestamp;
    /**
     * The direction to sort. Possible values include "ascending" and "descending".
     */
    private DirectionEnum direction;

    public enum DirectionEnum implements CommonEnum{
        ASCENDING("ascending"),
        descending("descending");
        private String code;

        DirectionEnum(String code) {
            this.code = code;
        }

        public String getCode() {
            return code;
        }
    }

    public enum TimestampEnum implements CommonEnum {
        CREATED_TIME("created_time"),

        LAST_EDITED_TIME("last_edited_time");

        private String code;

        TimestampEnum(String code) {
            this.code = code;
        }

        public String getCode() {
            return code;
        }
    }
}
