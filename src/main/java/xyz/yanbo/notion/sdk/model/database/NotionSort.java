package xyz.yanbo.notion.sdk.model.database;

import lombok.Data;
import xyz.yanbo.notion.sdk.model.NotionDirectionEnum;
import xyz.yanbo.notion.sdk.model.NotionTimestampEnum;

@Data
public class NotionSort {
    /**
     * The name of the property to sort against.
     */
    private String property;
    /**
     * The name of the timestamp to sort against. Possible values include "created_time" and "last_edited_time".
     */
    private NotionTimestampEnum timestamp;
    /**
     *The direction to sort. Possible values include "ascending" and "descending".
     */
    private NotionDirectionEnum direction;


}
