package com.geekbrains.api;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class Homework5_GetShoppingListResult {

    private String aisles;
    private String cost;
    private String startDate;
    private String endDate;

}
