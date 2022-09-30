package com.geekbrains.builder;

import com.geekbrains.api.ApiSearchResult;
import com.geekbrains.api.ApiUserConnectRequest;
import com.geekbrains.api.ApiUserConnectResult;
import com.geekbrains.api.SpoonaccularService;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import com.geekbrains.db.dao.CategoriesMapper;
import com.geekbrains.db.dao.ProductsMapper;
import com.geekbrains.db.model.Categories;
import com.geekbrains.db.model.Products;
import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {

        //К 5-му ДЗ
        SpoonaccularService spoonaccularService = new SpoonaccularService();
        ApiSearchResult recipes = spoonaccularService.findRecipes("Bread", 3);
        System.out.println(recipes);

        ApiUserConnectResult connectResult = spoonaccularService.connect(new ApiUserConnectRequest());
        System.out.println(connectResult);

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
