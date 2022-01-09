package xyz.yanbo.notion.sdk.model;

public enum NotionTimestampEnum {
    CREATED_TIME("created_time"),

    LAST_EDITED_TIME("last_edited_time");

    private String code;

    NotionTimestampEnum(String code) {
        this.code = code;
    }

    public String getCode() {
        return code;
    }
}
