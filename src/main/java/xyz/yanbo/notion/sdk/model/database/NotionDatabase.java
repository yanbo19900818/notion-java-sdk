package xyz.yanbo.notion.sdk.model.database;

import lombok.Data;
import xyz.yanbo.notion.sdk.model.NotionProperty;
import xyz.yanbo.notion.sdk.model.NotionFile;
import xyz.yanbo.notion.sdk.model.parent.NotionParent;
import xyz.yanbo.notion.sdk.model.richtext.NotionRichText;

import java.util.List;
import java.util.Map;

@Data
public class NotionDatabase {
    /**
     * Unique identifier for the database.
     * e.g.:"2f26ee68-df30-4251-aad4-8ddc420cba3d"
     */
    private String id;
    /**
     * Date and time when this database was created. Formatted as an ISO 8601 date time string.
     * e.g.:"2020-03-17T19:10:04.968Z"
     */
    private String createdTime;
    /**
     * Date and time when this database was updated. Formatted as an ISO 8601 date time string
     * e.g.:"2020-03-17T21:49:37.913Z"
     */
    private String lastEditedTime;
    /**
     * Name of the database as it appears in Notion.
     */
    private List<NotionRichText> title;
    /**
     * Page icon.
     */
    //TODO emoji case need to do
    private NotionFile icon;
    /**
     * Page cover image.
     */
    private NotionFile cover;
    /**
     *
     */
    private Map<String , NotionProperty> properties;
    /**
     * The parent of this page. Can be a page or workspace. Parent types are defined below.
     */
    private NotionParent parent;

    /**
     * The URL of the Notion database.
     * e.g.:"https://www.notion.so/668d797c76fa49349b05ad288df2d136"
     */
    private String url;
}
