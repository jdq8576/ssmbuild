<%--
  Created by IntelliJ IDEA.
  User: jdq8576
  Date: 2020/1/10
  Time: 15:41
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>修改书籍</title>
    <link href="https://cdn.staticfile.org/twitter-bootstrap/3.3.7/css/bootstrap.min.css" rel="stylesheet">

</head>
<body>
<div class="container">

    <div class="row clearfix">
        <div class="col-md-12 column">
            <div class="page-header">
                <h1>
                    <small>修改书籍</small>
                </h1>
            </div>
        </div>
    </div>

    <form action="${pageContext.request.contextPath}/book/updateBook" method="post">
        <div class="form-group">
            <label for="bookID">书籍描述</label>
            <input type="hidden" value="${book.bookID}" class="form-control" id="bookID"  name="bookID"
                   placeholder="书籍名称" required >
        </div>
        <div class="form-group">
            <label for="bookName">书籍名称</label>
            <input type="text"
                   value="${book.bookName}" class="form-control" name="bookName" id="bookName" placeholder="书籍名称"
                   required>
        </div>
        <div class="form-group">
            <label for="bookCounts">书籍数量</label>
            <input type="text" value="${book.bookCounts}" class="form-control" name="bookCounts" id="bookCounts"
                   placeholder="书籍名称" required>
        </div>
        <div class="form-group">
            <label for="detail">书籍描述</label>
            <input type="text" value="${book.detail}" class="form-control" id="detail"  name="detail"
                   placeholder="书籍名称" required>
        </div>

        <button type="submit" class="btn btn-default">修改</button>
    </form>


</div>

</body>
</html>
