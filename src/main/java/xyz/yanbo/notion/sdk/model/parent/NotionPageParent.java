package xyz.yanbo.notion.sdk.model.parent;

import lombok.Data;

@Data
public class NotionPageParent extends NotionParent {
    public static NotionParentType NotionWorkspaceParent;
    private String pageId;
}