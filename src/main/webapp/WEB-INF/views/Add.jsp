<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>Add product</title>
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.1/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-4bw+/aepP/YC94hEpVNVgiZdgIC5+VKNBQNGCHeKRQN+PtmoHDEXuppvnDJzQIu9" crossorigin="anonymous">
</head>
<body>
    <h1>product</h1>
    <form href="ProductsList" method="post" th:object="${product}">
        <label for="name">Name</label>
        <input type="text" id="name" name="name" th:field="*{name}" required>
        <br>
        <label for="price">Price</label>
        <input type="number" id="price" name="price" th:field="*{price}" required>
        <br>
        <input type="submit" value="ADD">
    </form>
    <a href="ProductsList">ListSanPham</a>
</body>
</html>
