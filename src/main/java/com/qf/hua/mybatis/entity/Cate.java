package com.qf.hua.mybatis.entity;

import java.util.Date;
import java.util.List;

public class Cate {
    /**
     * 主键
     */
    private Integer cateId;

    /**
     * 分类名称
     */
    private String name;

    /**
     * 0 表示未删除 1 表示已删除
     */
    private Integer status;

    /**
     *
     */
    private Date createDate;

    private List<Product> productList;

    public List<Product> getProductList() {
        return productList;
    }

    public void setProductList(List<Product> productList) {
        this.productList = productList;
    }

    private static final long serialVersionUID = 1L;

    public Integer getCateId() {
        return cateId;
    }

    public void setCateId(Integer cateId) {
        this.cateId = cateId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    public Date getCreateDate() {
        return createDate;
    }

    public void setCreateDate(Date createDate) {
        this.createDate = createDate;
    }

    @Override
    public String toString() {
        return "Cate{" +
                "cateId=" + cateId +
                ", name='" + name + '\'' +
                ", status=" + status +
                ", createDate=" + createDate +
                ", productList=" + productList +
                '}';
    }
}
