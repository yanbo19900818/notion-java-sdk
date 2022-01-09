package xyz.yanbo.notion.sdk.model;

public enum NotionDirectionEnum {
    ASCENDING("ascending"),
    descending("descending");
    private String code;
    NotionDirectionEnum(String code){
        this.code=code;
    }

    public String getCode() {
        return code;
    }
}
