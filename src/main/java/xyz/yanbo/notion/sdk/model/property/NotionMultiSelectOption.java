package xyz.yanbo.notion.sdk.model.property;

import lombok.Data;
import xyz.yanbo.notion.sdk.model.NotionColorEnum;
@Data
public class NotionMultiSelectOption {
    private String name;
    private String id;
    private NotionColorEnum color;
}
