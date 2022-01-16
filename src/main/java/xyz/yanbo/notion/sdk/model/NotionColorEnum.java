package xyz.yanbo.notion.sdk.model;

import xyz.yanbo.notion.sdk.serializer.CommonEnum;

public enum NotionColorEnum implements CommonEnum {
    DEFAULT("default"), GRAY("gray"), BROWN("brown"), ORANGE("orange"), YELLOW("yellow"), GREEN("green"), BLUE("blue"), PURPLE("purple"), PINK("pink"), RED("red");
    private String code;

    NotionColorEnum(String code) {
        this.code = code;
    }

    public String getCode() {
        return code;
    }
    }
