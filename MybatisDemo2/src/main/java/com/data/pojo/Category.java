package com.data.pojo;

import java.util.List;

public class Category {
    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column category.Id
     *
     * @mbg.generated Thu Feb 23 15:42:59 CST 2017
     */
    private Integer id;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column category.Name
     *
     * @mbg.generated Thu Feb 23 15:42:59 CST 2017
     */
    private String name;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column category.Id
     *
     * @return the value of category.Id
     *
     * @mbg.generated Thu Feb 23 15:42:59 CST 2017
     */
    public Integer getId() {
        return id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column category.Id
     *
     * @param id the value for category.Id
     *
     * @mbg.generated Thu Feb 23 15:42:59 CST 2017
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column category.Name
     *
     * @return the value of category.Name
     *
     * @mbg.generated Thu Feb 23 15:42:59 CST 2017
     */
    public String getName() {
        return name;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column category.Name
     *
     * @param name the value for category.Name
     *
     * @mbg.generated Thu Feb 23 15:42:59 CST 2017
     */
    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    private List<Product> productList;
    public List<Product> getProductList()
    {
        return productList;
    }
    public void setProductList(List<Product> products)
    {
        this.productList=products;
    }
}