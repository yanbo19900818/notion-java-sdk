package xyz.yanbo.notion.sdk.model.parent;

import lombok.Data;

import java.lang.reflect.Type;

@Data
public class NotionPageParent extends NotionParent {
    public static Type NotionWorkspaceParent;
    private String pageId;
}
