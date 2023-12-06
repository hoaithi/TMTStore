<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title>Add Product</title>
</head>
<body>



<div>
    <h2>Add Product</h2>
    <form action="AddProductServlet" method="post" enctype="multipart/form-data">
        <!-- Other form fields for product information -->
        Image: <input type="file" name="image" required><br>
        Name: <input type="text" name="name" required><br>
        Price: <input type="text" name="price" required><br>
        Description: <textarea name="description" required></textarea><br>
        Quantity: <input type="number" name="quantity" required><br>
        Image Detail: <textarea name="imageDetail" required></textarea><br>
        
        Size ID:
        <select name="sizeId" required>
            <option value="1">Small</option>
            <option value="2">Medium</option>
            <option value="3">Large</option>
            <!-- Add more options as needed -->
        </select><br>

        Color ID:
        <select name="colorId" required>
            <option value="1">Red</option>
            <option value="2">Blue</option>
            <option value="3">Green</option>
            <!-- Add more options as needed -->
        </select><br>

        Category ID:
        <select name="categoryId" required>
            <option value="1">Electronics</option>
            <option value="2">Clothing</option>
            <option value="3">Home & Garden</option>
            <!-- Add more options as needed -->
        </select><br>

        <input type="submit" value="Add Product">
    </form>
</div>



</body>
</html>
