package com.qf.hua.mybatis;

import com.qf.hua.mybatis.entity.Cate;
import com.qf.hua.mybatis.entity.Product;
import com.qf.hua.mybatis.mapper.CateMapper;
import com.qf.hua.mybatis.mapper.ProductMapper;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import java.util.List;

public class TestMain2 {
    public static void main(String[] args) {

        SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(TestMain.class.getClassLoader().getResourceAsStream("mybatis-config.xml"));
        SqlSession sqlSession = sqlSessionFactory.openSession(true);

        ProductMapper productMapper = sqlSession.getMapper(ProductMapper.class);
        CateMapper cateMapper = sqlSession.getMapper(CateMapper.class);
        /*
        * 级联保存
        */
        Cate cate = new Cate();
        /*cate.setName("华为");
        int insert = cateMapper.insert(cate);
        System.out.println(cate.getCateId());*/

        for (int i = 0; i < 1; i++) {
            Product product = new Product();
            /*product.setContent("1111" + i);
            product.setCateId(cate.getCateId());
            product.setPrice(new BigDecimal("9999.00"));
            product.setTitle("手机1111"+i);
            product.setImg("/img/phone/1.png"+i);
            productMapper.insert(product);*/
        }

        /*级联查询，先查询主表的数据*/
        List<Cate> cates = cateMapper.selectList();
        cates.forEach(cate1 -> {
            List<Product> products = productMapper.selectListByCateId(cate1.getCateId());
            cate1.setProductList(products);
        });
        System.out.println(cates);
    }
}
