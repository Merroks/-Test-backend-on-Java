package com.geekbrains.api;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class Homework5_AddToShoppingListRequest {

    private String item;
    private String aisle;
    private String parse;

}
