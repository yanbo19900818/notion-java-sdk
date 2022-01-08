package xyz.yanbo.notion.sdk.model;

import lombok.Data;

@Data
public class NotionAnnotation {
    private boolean bold;
    private boolean italic;
    private boolean strikethrough;
    private boolean underline;
    private boolean code;
    private NotionAnnotationColor color;

    public enum NotionAnnotationColor {
        DEFAULT("default"),
        BROWN("brown"),
        ORANGE("orange"),
        YELLOW("yellow"),
        GREEN("green"),
        BLUE("blue"),
        PURPLE("purple"),
        PINK("pink"),
        RED("red"),
        GRAY_BACKGROUND("gray_background"),
        BROWN_BACKGROUND("brown_background"),
        ORANGE_BACKGROUND("orange_background"),
        YELLOW_BACKGROUND("yellow_background"),
        RED_BACKGROUND("red_background"),
        GREEN_BACKGROUND("green_background"),
        BLUE_BACKGROUND("blue_background"),
        PURPLE_BACKGROUND("purple_background"),
        PINK_BACKGROUND("pink_background");
        private String code;

        NotionAnnotationColor(String code) {
            this.code = code;
        }

        public String getCode() {
            return code;
        }
    }
}
