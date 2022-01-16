package xyz.yanbo.notion.sdk;

import com.google.gson.FieldNamingPolicy;
import com.google.gson.GsonBuilder;
import lombok.Data;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.logging.HttpLoggingInterceptor;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;
import xyz.yanbo.notion.sdk.model.parent.NotionParent;
import xyz.yanbo.notion.sdk.serializer.EnumTypeAdapterFactory;
import xyz.yanbo.notion.sdk.serializer.NotionParentDeserializer;

@Data
public class NotionClient {
    private Retrofit retrofit;
    /**
     * api url
     */
    private String baseUrl = "https://api.notion.com/v1/";
    /**
     * 用户token
     */
    private String notionToken = "";
    /**
     * notion api 版本
     */
    private String notionVersion = "2021-08-16";

    public void init() {
        GsonBuilder gsonBuilder = new GsonBuilder();
        gsonBuilder.registerTypeAdapter(NotionParent.class, new NotionParentDeserializer());
        gsonBuilder.setFieldNamingStrategy(FieldNamingPolicy.LOWER_CASE_WITH_UNDERSCORES);
        gsonBuilder.registerTypeAdapterFactory(new EnumTypeAdapterFactory());
        HttpLoggingInterceptor logInterceptor = new HttpLoggingInterceptor();
        logInterceptor.setLevel(HttpLoggingInterceptor.Level.BODY);
        OkHttpClient okHttpClient = new OkHttpClient.Builder()
                .addInterceptor(logInterceptor)
                .addInterceptor(chain -> {
                    Request request = chain.request().newBuilder()
                            .addHeader("Authorization", "Bearer " + notionToken)
                            .addHeader("Notion-Version", notionVersion).build();
                    return chain.proceed(request);
                }).build();
        retrofit = new Retrofit.Builder().client(okHttpClient).addConverterFactory(GsonConverterFactory.create(gsonBuilder.create()))
                .baseUrl(baseUrl)
                .build();
    }
}
