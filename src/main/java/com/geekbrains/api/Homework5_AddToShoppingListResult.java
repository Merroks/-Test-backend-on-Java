package com.geekbrains.api;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class Homework5_AddToShoppingListResult {

    private String id;
    private String name;
    private String measures;
    private String usages;
    private String usageRecipeIds;
    private String pantryItem;
    private String aisle;
    private String cost;
    private String ingredientId;
    
}
