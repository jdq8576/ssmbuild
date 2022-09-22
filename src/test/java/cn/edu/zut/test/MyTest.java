package cn.edu.zut.test;

import cn.edu.zut.pojo.Books;
import cn.edu.zut.service.BookServiceImpl;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @Classname MyTest
 * @Author jdq8576
 * @Date 2020/1/10 14:14
 **/
public class MyTest {

    @Test
    public void test(){

        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("applicationContext.xml");

        BookServiceImpl bookServiceImpl = applicationContext.getBean("bookServiceImpl", BookServiceImpl.class);

        for (Books book : bookServiceImpl.queryAllBooks()) {
            System.out.println(book);

        }

    }
}
