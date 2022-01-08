package xyz.yanbo.notion.sdk.model.richtext;

import lombok.Data;
import xyz.yanbo.notion.sdk.model.NotionAnnotation;

@Data
public class NotionRichText {
    private String plainText;

    private String href;

    private NotionAnnotation annotations;

    private NotionRichTextTypeEnum type;

    public enum NotionRichTextTypeEnum {
        TEXT("text"),
        MENTION("mention"),
        EQUATION("equation");
        private String code;

        NotionRichTextTypeEnum(String code) {
            this.code = code;
        }

        public String getCode() {
            return code;
        }
        public static NotionRichTextTypeEnum getEnumByCode(String code) {
            for (NotionRichTextTypeEnum value : values()) {
                if (value.getCode().equals(code)) {
                    return value;
                }
            }
            return null;
        }
    }
}
