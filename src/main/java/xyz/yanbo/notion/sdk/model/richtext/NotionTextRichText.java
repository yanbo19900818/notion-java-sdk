package xyz.yanbo.notion.sdk.model.richtext;

import lombok.Data;

@Data
public class NotionTextRichText extends NotionRichText {
    /**
     * Text content. This field contains the actual content of your text and is probably the field you'll use most often.
     * example:"Avocado Lovelace"
     */
    private String content;

    private NotionLink link;

    @Data
    public class NotionLink{
        /**
         * value always 'url'
         */
        private String type;
        private String url;
    }


}
