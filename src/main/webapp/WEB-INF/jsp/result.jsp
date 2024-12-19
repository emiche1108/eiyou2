<%@ page contentType="text/html; charset=UTF-8" language="java" %>
<!DOCTYPE html>
<html lang="ja">

<%@ page import="java.util.List" %>
<%@ page import="model.Comment" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>



<head>
    <meta charset="UTF-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>副菜のご提案</title>
    
        <style>
        body {
            font-family: Arial, sans-serif;
            line-height: 1.6;
        }

        main {
            margin: 20px;
        }

        section {
            margin-bottom: 20px;
        }

        h1, h2 {
            color: #333;
        }

        .vegetable-list {
            list-style-type: none;
            padding-left: 0;
        }

        .vegetable-list li {
            background-color: #f4f4f4;
            padding: 10px;
            margin-bottom: 5px;
            border-radius: 5px;
        }

        .side-dish {
            background-color: #e0f7fa;
            padding: 10px;
            border-radius: 5px;
        }

        .comment-item {
            background-color: #f9f9f9;
            border: 1px solid #ddd;
            padding: 10px;
            margin-bottom: 10px;
            border-radius: 5px;
        }
    </style>
</head>


<body>
    <main>
        <h1>選ばれた色: ${selectedColor}</h1>
        <h2>選ばれた野菜：${selectedVegetable}</h2>
        
        <!-- 副菜の提案 -->
        <section>
        	<h2>～${selectedVegetable}を使った副菜の提案～</h2>
        	<div class="SideDishAdvise">
        		<p>提案された副菜: 
            		<c:if test="${not empty sideDish}">
            			${sideDish.name}
            		</c:if>
            		<c:if test="${empty sideDish}">
            			データなし
            		</c:if>
        		</p>
        		
        		<p>副菜の説明: 
            		<c:if test="${not empty sideDish}">
                		${sideDish.description}
            		</c:if>
            		<c:if test="${empty sideDish}">
            		説明なし
            		</c:if>
            	</p>
             </div>
		</section>
		
        
        <!-- コメントの表示 -->
        <section>
            <h2>管理栄養士おすすめポイント</h2>
            <ul>
            	<c:forEach var="comment" items="${comments}">
            		<li>${comment.content}</li>
        		</c:forEach>
    		</ul>
		</section>
        
        
        <!-- 戻るボタン -->
        <form action="ReturnColorSelect" method="get">
            <button type="submit">気に入らない。選びなおす</button>
        </form>
        
        <!-- 気に入った！作り方教えてボタン -->
        <!--レシピのページへ -->
        <%-- <form action="         " method="get">
        	<button type="submit">気に入った！作り方教えて</button>
        </form>--%>
        
        <!--準備中ページへ -->
        <form action="recipezyunnbi.jsp" method="get">
            <button type="submit">気に入った！作り方教えて</button>
        </form>
        
    </main>
</body>
</html>
