package cn.edu.zut.service;

import cn.edu.zut.mapper.BookMapper;
import cn.edu.zut.pojo.Books;

import java.util.List;

/**
 * @Classname BookServiceImpl
 * @Author jdq8576
 * @Date 2020/1/10 12:29
 **/
public class BookServiceImpl implements BookService {

    // service调dao层

    private BookMapper bookMapper;

    public void setBookMapper(BookMapper bookMapper) {
        this.bookMapper = bookMapper;
    }

    public int addBook(Books books) {
        return bookMapper.addBook(books);
    }

    public int deleteBookById(int id) {
        return bookMapper.deleteBookById(id);
    }

    public int updateBook(Books books) {
        return bookMapper.updateBook(books);
    }

    public Books queryBookById(int id) {
        return bookMapper.queryBookById(id);
    }

    public List<Books> queryAllBooks() {
        return bookMapper.queryAllBooks();
    }

    public Books queryByBookName(String bookName) {
        return bookMapper.queryByBookName(bookName);
    }
}
