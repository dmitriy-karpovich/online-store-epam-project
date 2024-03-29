package by.epam.onlinestore.dao.mapper.impl;


import by.epam.onlinestore.bean.ProductCategory;
import by.epam.onlinestore.dao.mapper.ColumnLabel;
import by.epam.onlinestore.dao.mapper.RowMapper;

import java.sql.ResultSet;
import java.sql.SQLException;

public class ProductCategoryRowMapper implements RowMapper<ProductCategory> {

    @Override
    public ProductCategory create(ResultSet resultSet) throws SQLException {
        ProductCategory productCategory = new ProductCategory();

        productCategory.setId(resultSet.getLong(ColumnLabel.PRODUCT_CATEGORY_ID));
        productCategory.setProductCategoryName(resultSet.getString(ColumnLabel.PRODUCT_CATEGORY_NAME));

        return productCategory;
    }
}
