package xyz.yanbo.notion.sdk.service;

import retrofit2.Call;
import retrofit2.http.*;
import xyz.yanbo.notion.sdk.model.NotionQueryRequest;
import xyz.yanbo.notion.sdk.model.NotionQueryResult;
import xyz.yanbo.notion.sdk.model.database.NotionDatabase;
import xyz.yanbo.notion.sdk.model.NotionProperty;
import xyz.yanbo.notion.sdk.model.page.NotionPage;
import xyz.yanbo.notion.sdk.model.parent.NotionParent;
import xyz.yanbo.notion.sdk.model.richtext.NotionRichText;

import java.util.List;
import java.util.Map;

public interface DataBaseService {
    @GET("databases/{database_id}")
    Call<NotionDatabase> retrieveDatabase(@Path("database_id") String databaseId);

    @PATCH("databases/{database_id}")
    Call<NotionDatabase> updateDatabase(@Path("database_id") String databaseId, @Field("title") List<NotionRichText> title, @Field("properties") Map<String, NotionProperty> propertyMap);

    @POST("databases")
    Call<NotionDatabase> createDatabase(@Field("parent") NotionParent parent, @Field("title") List<NotionRichText> title, @Field("properties") Map<String, NotionProperty> propertyMap);

    @POST("databases/{database_id}/query")
    Call<NotionQueryResult<NotionPage>> queryDatabse(@Path("database_id") String databaseId, @Body NotionQueryRequest notionQuery);

}
