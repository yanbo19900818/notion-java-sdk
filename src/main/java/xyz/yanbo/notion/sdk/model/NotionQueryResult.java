package xyz.yanbo.notion.sdk.model;

import lombok.Data;

import java.util.List;

@Data
public class NotionQueryResult<T> {
    private List<T> results;
    private boolean hasMore;
    private String nextCursor;

}
