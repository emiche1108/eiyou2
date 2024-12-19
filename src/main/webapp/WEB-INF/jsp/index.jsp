<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<!DOCTYPE html>
<html>


<head>
    <title>ようこそTOPぺージ</title>
    <!-- CSSファイルのリンク -->
    <link rel="stylesheet" type="text/css" href="buttonColor.css">
</head>


<body>
    <h1>${greeting}</h1>
    <p>提案してほしい副菜の色を選んでね</p>
    
    <!-- 色選択ボタン -->
    <form action="colorSelect" method="post">
        <div class="button-container">
            <button type="submit" name="color" value="赤" class="color-button red">赤色</button>
            <button type="submit" name="color" value="オレンジ" class="color-button orange">オレンジ色</button>
            <button type="submit" name="color" value="黄" class="color-button yellow">黄色</button>
            <button type="submit" name="color" value="緑" class="color-button green">緑色</button>
            <button type="submit" name="color" value="紫" class="color-button blue">紫色</button>
            <button type="submit" name="color" value="白" class="color-button white">白色</button>
        </div>
    </form>
    
</body>
</html>


