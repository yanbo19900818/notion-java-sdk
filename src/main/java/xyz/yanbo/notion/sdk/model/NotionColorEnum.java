package xyz.yanbo.notion.sdk.model;

public enum NotionColorEnum {
    DEFAULT("default"), GRAY("gray"), BROWN("brown"), ORANGE("orange"), YELLOW("yellow"), GREEN("green"), BLUE("blue"), PURPLE("purple"), PINK("pink"), RED("red");
    private String code;

    NotionColorEnum(String code) {
        this.code = code;
    }

    public String getCode() {
        return code;
    }
    }
