package com.gem.luoqimalls.pojo;

public class GoodsSearch {
    private String brandId;
    private Integer id_2;
    private Double minPrice;
    private Double maxPrice;
    private String key;
    private Integer id_1;

    public GoodsSearch() {
    }

    public GoodsSearch(String brandId, Integer id_2, Double minPrice, Double maxPrice, String key) {
        this.brandId = brandId;
        this.id_2 = id_2;
        this.minPrice = minPrice;
        this.maxPrice = maxPrice;
        this.key = key;

    }

    public GoodsSearch(String brandId, Integer id_2, Double minPrice, Double maxPrice, Integer id_1) {
        this.brandId = brandId;
        this.id_2 = id_2;
        this.minPrice = minPrice;
        this.maxPrice = maxPrice;
        this.id_1 = id_1;
    }

    public String getKey() {
        return key;
    }

    public void setKey(String key) {
        this.key = key;
    }

    public String getBrandId() {
        return brandId;
    }

    public void setBrandId(String brandId) {
        this.brandId = brandId;
    }

    public Integer getId_2() {
        return id_2;
    }

    public void setId_2(Integer id_2) {
        this.id_2 = id_2;
    }

    public Double getMinPrice() {
        return minPrice;
    }

    public void setMinPrice(Double minPrice) {
        this.minPrice = minPrice;
    }

    public Double getMaxPrice() {
        return maxPrice;
    }

    public void setMaxPrice(Double maxPrice) {
        this.maxPrice = maxPrice;
    }

    public Integer getId_1() {
        return id_1;
    }

    public void setId_1(Integer id_1) {
        this.id_1 = id_1;
    }


}
