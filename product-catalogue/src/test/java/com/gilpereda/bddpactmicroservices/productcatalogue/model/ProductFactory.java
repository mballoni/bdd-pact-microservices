package com.gilpereda.bddpactmicroservices.productcatalogue.model;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class ProductFactory {

    public static Product getProduct(final long productId) {
        Category category = getCategory(1);
        return getProduct(productId, category);
    }

    public static List<Product> getProductList(final int count, final long categoryId) {
        Category category = getCategory(categoryId);
        return getProductList(count, category);
    }

    public static List<Product> getProductList(final int count, final Category category) {
        return IntStream.range(0, count)
            .boxed()
            .map(productId -> ProductFactory.getProduct(productId, category))
            .collect(Collectors.toList());
    }

    public static Category getCategory(final long categoryId) {
        Category category = new Category();
        category.setId(categoryId);
        category.setName("Product category " + categoryId);
        return category;
    }

    private static Product getProduct(final long productId, final Category category) {
        Product product = new Product();
        product.setId(productId);
        product.setName("Product 1");
        product.setManufacturer("Manufacturer 1");
        product.setCategory(category);
        return product;
    }
}
