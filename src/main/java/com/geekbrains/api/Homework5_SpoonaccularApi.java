package com.geekbrains.api;

import retrofit2.Call;
import retrofit2.http.*;

public interface Homework5_SpoonaccularApi {

//    @GET("/recipes/complexSearch")
//    Call<ApiSearchResult> findRecipes(
//            @Query("apiKey") String apiKey,
//            @Query("query") String query,
//            @Query("number") Integer number
//    );
    @POST("/users/connect")
    Call<ApiUserConnectResult> connect(@Body ApiUserConnectRequest request, @Query("apiKey") String apiKey);

    @POST("/mealplanner/{{username}}/shopping-list/items")
    Call<Homework5_AddToShoppingListResult> add (@Body Homework5_AddToShoppingListRequest request,
                                                    @Query("apiKey") String apiKey,
                                                    @Query("username") String username,
                                                    @Query("hash") String hash);

    @GET("/mealplanner/{{username}}/shopping-list")
    Call<Homework5_GetShoppingListResult> get (@Query("apiKey") String apiKey,
                                                   @Query("hash") String username,
                                                   @Query("username") String hash);

    @DELETE ("/mealplanner/{{username}}/shopping-list/items/id")
    Call<Homework5_DeleteFromShoppingList> delete (@Query("apiKey") String apiKey,
                                                    @Query("username") String username,
                                                    @Query("hash") String hash,
                                                    @Query("id") String id);

}
