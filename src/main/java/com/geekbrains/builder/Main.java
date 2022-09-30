package com.geekbrains.builder;

import com.geekbrains.api.*;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import com.geekbrains.db.dao.CategoriesMapper;
import com.geekbrains.db.dao.ProductsMapper;
import com.geekbrains.db.model.Categories;
import com.geekbrains.db.model.Products;
import retrofit2.Call;

import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {

         //К 5-му ДЗ
        //SpoonaccularService spoonaccularService = new SpoonaccularService();
        //ApiSearchResult recipes = spoonaccularService.findRecipes("Bread", 3);
        //System.out.println(recipes);

        SpoonaccularService spoonaccularService = new SpoonaccularService();
        ApiUserConnectResult connectResult = spoonaccularService.connect(new ApiUserConnectRequest());
        System.out.println(connectResult);

        Homework5_SpoonaccularApi homework5_spoonaccularApi = new Homework5_SpoonaccularApi() {
            @Override
            public Call<ApiUserConnectResult> connect(ApiUserConnectRequest request, String apiKey) {
                return null;
            }

            @Override
            public Call<Homework5_AddToShoppingListResult> add(Homework5_AddToShoppingListRequest request, String apiKey, String username, String hash) {
                return null;
            }

            @Override
            public Call<Homework5_GetShoppingListResult> get(String apiKey, String username, String hash) {
                return null;
            }

            @Override
            public Call<Homework5_DeleteFromShoppingList> delete(String apiKey, String username, String hash, String id) {
                return null;
            }
        };
        ApiUserConnectResult connectResult1 = spoonaccularService.connect(new ApiUserConnectRequest());
        System.out.println(connectResult1);



        //К 6-му ДЗ
//        SqlSessionFactory sessionFactory = new SqlSessionFactoryBuilder()
//                .build(Resources.getResourceAsStream("myBatisConfig.xml"));
//
//        try (SqlSession session = sessionFactory.openSession()) {
//            ProductsMapper productsMapper = session.getMapper(ProductsMapper.class);
//            CategoriesMapper categoriesMapper = session.getMapper(CategoriesMapper.class);
//            Products product = productsMapper.selectByPrimaryKey(444L);
//            System.out.println(product);
//            Categories category = categoriesMapper.selectByPrimaryKey(product.getCategoryId());
//            System.out.println(category);
//
//        }

    }
}
