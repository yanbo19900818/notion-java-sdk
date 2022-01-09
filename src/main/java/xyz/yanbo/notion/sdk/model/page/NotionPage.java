package xyz.yanbo.notion.sdk.model.page;

import lombok.Data;
import xyz.yanbo.notion.sdk.model.NotionFile;
import xyz.yanbo.notion.sdk.model.parent.NotionParent;

import java.util.Map;

@Data
public class NotionPage {
    /**
     * Unique identifier of the page.
     * e.g.:"45ee8d13-687b-47ce-a5ca-6e2e45548c4b"
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
     * The archived status of the page.
     */
    private boolean archived;
    /**
     * Page cover image.
     */
    private NotionFile cover;
    /**
     * The parent of this page. Can be a page or workspace. Parent types are defined below.
     */
    private NotionParent parent;

    private String url;

    private Map<String, NotionPageProperty> properties;
}
