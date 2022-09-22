package cn.edu.zut.mapper;

import cn.edu.zut.pojo.Books;
import org.apache.ibatis.annotations.Param;
import org.springframework.web.bind.annotation.PathVariable;

import java.util.List;

/**
 * @Classname BookMapper
 * @Author jdq8576
 * @Date 2020/1/10 12:05
 **/
public interface BookMapper {
    // 增加一本书
    int addBook(Books books);
    // 删除一本书
    int deleteBookById(@Param("bookId") int id);
    // 更新一本书
    int updateBook(Books books);
    // 查询一本书
    Books queryBookById(@Param("bookId") int id);
    // 查询全部的书
    List<Books> queryAllBooks();
    // 按照书名查找书籍
    Books queryByBookName(@Param("bookName") String bookName);
}
