package com.qf.hua.mybatis.entity;

import java.math.BigDecimal;
import java.util.Date;
import java.util.List;

/*
* 1.一个分类信息    两个商品信息      一次性保存
* 2.查询所有的分类信息以及相关的商品信息
* */
public class Product {
    /**
     * 主键
     */
    private Integer productId;

    /**
     * 商品的标题
     */
    private String title;

    /**
     * 商品信息
     */
    private String content;

    /**
     * 商品的图片
     */
    private String img;

    /**
     * 商品的价格
     */
    private BigDecimal price;

    /**
     * 创建时间
     */
    private Date createDate;

    /**
     * 0 表示未删除 1 表示已删除
     */
    private Integer status;

    /**
     *
     */
    private Integer cateId;

    private List<Product> productList;

    public List<Product> getProductList() {
        return productList;
    }

    public void setProductList(List<Product> productList) {
        this.productList = productList;
    }

    public Integer getProductId() {
        return productId;
    }

    public void setProductId(Integer productId) {
        this.productId = productId;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public String getImg() {
        return img;
    }

    public void setImg(String img) {
        this.img = img;
    }

    public BigDecimal getPrice() {
        return price;
    }

    public void setPrice(BigDecimal price) {
        this.price = price;
    }

    public Date getCreateDate() {
        return createDate;
    }

    public void setCreateDate(Date createDate) {
        this.createDate = createDate;
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    public Integer getCateId() {
        return cateId;
    }

    public void setCateId(Integer cateId) {
        this.cateId = cateId;
    }

    @Override
    public String toString() {
        return "Product{" +
                "productId=" + productId +
                ", title='" + title + '\'' +
                ", content='" + content + '\'' +
                ", img='" + img + '\'' +
                ", price=" + price +
                ", createDate=" + createDate +
                ", status=" + status +
                ", cateId=" + cateId +
                ", productList=" + productList +
                '}';
    }
}
