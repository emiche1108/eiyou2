<%@ page contentType="text/html; charset=UTF-8" language="java" %>
<!DOCTYPE html>
<html lang="ja">

<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>エラーが発生</title>
    
    <style>
        body {
            font-family: Arial, sans-serif;
            background-color: #f4f4f4;
            margin: 0;
            padding: 0;
            display: flex;
            justify-content: center;
            align-items: center;
            height: 100vh;
            color: #333;
        }
        .container {
            background-color: #fff;
            border-radius: 8px;
            padding: 20px;
            box-shadow: 0 4px 6px rgba(0, 0, 0, 0.1);
            width: 80%;
            max-width: 600px;
            text-align: center;
        }
        .error-message {
            color: #e74c3c;
            font-size: 18px;
            margin-bottom: 20px;
        }
        .back-button {
            background-color: #3498db;
            color: white;
            padding: 10px 20px;
            border: none;
            border-radius: 4px;
            text-decoration: none;
            font-size: 16px;
        }
        .back-button:hover {
            background-color: #2980b9;
        }
    </style>
</head>

<body>
    <div class="container">
        <h1>エラーが発生しました</h1>
        <p class="error-message">${errorMessage}</p>
        <p>もう一度色を選択してください。</p>
        
        <!-- ReturnColorSelect サーブレットに GET リクエストを送るフォーム -->
        <form action="ReturnColorSelect" method="GET">
            <button type="submit" class="back-button">色を選び直す</button>
        </form>
    </div>
</body>



</html>



</html>
