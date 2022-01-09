package xyz.yanbo.notion.sdk.model.database;

import lombok.Data;

import java.util.List;

@Data
public class NotionQuery {
    /**
     *When supplied, returns a page of results starting after the cursor provided. If not supplied, this endpoint will return the first page of results.
     */
    private String startCursor;
    /**
     * The number of items from the full list desired in the response. Maximum: 100
     */
    private int pageSize;

    private List<NotionSort> sorts;

    private List<NotionFilter> or;
    private List<NotionFilter> and;

}
