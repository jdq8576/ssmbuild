package cn.edu.zut.controller;

import cn.edu.zut.pojo.Books;
import cn.edu.zut.service.BookService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.ArrayList;
import java.util.List;

/**
 * @Classname Controller
 * @Author jdq8576
 * @Date 2020/1/10 13:28
 **/
@SuppressWarnings("all")
@Controller
@RequestMapping("/book")
public class BookController {
    @Autowired
    @Qualifier("bookServiceImpl")
    private BookService bookService;

    // 查询全部书籍,并返回到一个书籍展示页面
    @RequestMapping("/allBook")
    public String list(Model model){

        List<Books> list = bookService.queryAllBooks();

        model.addAttribute("list",list);

        return "allBook";
    }

    @RequestMapping("/toAddBook")
    public String toAddPaper(){
        return "addBook";
    }

    @RequestMapping("/addBook")
    public String addBook(Books books){
        bookService.addBook(books);

        return "redirect:/book/allBook"; // 重定向到allBook请求
    }


    @RequestMapping("/toUpdateBook/{bookID}")
    public String toUpdatePaper(@PathVariable("bookID") int id,Model model){

        Books book = bookService.queryBookById(id);

        model.addAttribute("book",book);

        return "updateBook";
    }

    // 修改书籍
    @RequestMapping("updateBook")
    public String updateBook(Books books){

        bookService.updateBook(books);
        return "redirect:/book/allBook";
    }

    // 删除书籍
    @RequestMapping("/deleteBook/{bookID}")
    public String deleteBook(@PathVariable("bookID") int id){
        bookService.deleteBookById(id);
        return "redirect:/book/allBook";
    }

    // 查询书籍

    @RequestMapping("/queryBook")
    public String queryBook(String queryBookName,Model model){
        Books books = bookService.queryByBookName(queryBookName);

        List<Books> list = new ArrayList<Books>();

        if(books==null){
            list = bookService.queryAllBooks();
            model.addAttribute("error","未查到");
        }else{
            list.add(books);
        }
        model.addAttribute("list",list);
        return "allBook";
    }
}
