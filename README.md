# 🥬プロダクト
色で選ぶ！簡単副菜提案アプリ「ColorDish（カラーディッシュ）」  


## 👓作成したキッカケ
献立を考える際、肉や魚などの主菜は割とすぐ決まるのに対して、  
サラダや煮物などの副菜は後回しになりがちだと思います。  
ビタミンやミネラルなどの栄養を補う大事な料理であり、茶色くなりがちな献立を色鮮やかに彩る役割もある為    
もっと気軽に提案できる方法を考えて、このアプリを作ってみました。  

食卓に欲しい色を選択すると、副菜が提案される仕組みとなっており、  
主菜だけじゃなくて副菜も楽しく取り入れやすくなればいいなと思っています。  
バランスの取れた食事作りをちょっとだけお手伝いできれば嬉しいです。  


## 🎯ターゲット
栄養バランスを考えた食事作りをしたいけど、どう始めたらよいか分からない人  　　

忙しい日常でも簡単に美しい献立を作りたい人  

料理をされる全人類対象！！  


## アプリURL
現在当サービスは非公開にしています。  

## 📌スタートポイント
アプリケーションは、`Main.java` 内の `Main` サーブレットから起動します。  
以下の手順でアプリケーションを開始してください。  

 1. Tomcat サーバーを起動  
Eclipse でプロジェクトを開き、Tomcat サーバーを起動します。  

 2. ブラウザで次の URL にアクセスします。  
http://localhost:8080/Yasai/  


## 📒使い方
1.TOPページ：会員登録不要。始めるボタンを押す。  
<img src="https://github.com/emiche1108/eiyou2/raw/main/images/main.png" width="500" height="380" />


2.色を選ぶ：まずは食卓に「ほしい色」を選択。  
<img src="https://github.com/emiche1108/eiyou2/raw/main/images/colorr.png" width="500" height="380" />


3.提案された内容のチェック：色に合わせて提案された副菜を確認。  
<img src="https://github.com/emiche1108/eiyou2/raw/main/images/result.png" width="500" height="500" />


4-1.レシピの確認：作り方も「レシピ」ボタンで確認できます。

4-2.再選択も可能：提案内容が気に入らない場合は、再度色選択に戻ることも可能。　　  

 

## 🍴「ColorDish」の特徴
色で決める新しい献立作り：食卓に合った色を選んで、副菜を決める新しいアプローチ。  

栄養面も意識した提案：色に合った副菜に加え、栄養面でのアドバイスがついて、  
健康的な食事作りがサポートされます。  

直感的な操作：シンプルで直感的なデザインなので、誰でも簡単に素早く献立が考えられます。  


## 🌈今後の予定
新しいレシピや色のバリエーションを追加予定。    
ログイン時間帯に合わせた、背景色の微調整。  
レシピページの公開予定（現在準備中）。  
栄養素に関する新情報を追加し、さらに健康的な食事作りをサポートします。   


### シーケンス図（システム内のオブジェクト間のやりとりを時系列に沿って表現する図）
```
やりとりを一目で理解できるように、整理整頓を目的で作る。
【TOP画面・挨拶】
ユーザー → Main.java →　index.jsp+footer.jsp　→挨拶ページ 
ユーザーが始めるボタン押す→colorSelect.jsp　

【色の選択】
colorSelect.jsp　でユーザーが色選択→
ColorSelect.java＋Dish.javaの空箱　色に関連する野菜を、1つだけランダムに出す
→出てきた野菜　vegetables

【副菜の提案】
vegetables　→　VageAndRscipe vegetablesに関連する副菜の提案
　　　　　　　→ CommentService vegetablesに関連するコメント 

→ result.jsp で副菜とコメントを表示→ ユーザー

【選択次第で分岐】
＜気に入らない場合＞
ユーザー → 「やり直し」ボタン → ReturnColorSelect → index.jsp → ユーザー

＜気に入った場合＞
ユーザー → 「これで決定」ボタン → 再びresult.jsp → ユーザー
```


### ファイル階層について(仮)
```
Yasai
/src
├── src/main/java         

│       ├── /main　　　メイン
│       │    ├── Main.java　　　　　 (スタートポイント)

│       │    └── GreetingUtil.java　　 (時間帯別挨拶)

│       │
│       ├── /controller　　　コントロール 

│       │    ├── ColorSelect.java  　　(色選択)

│       │     └── ReturnColorSelect.java 　(色選択に戻る)

│       │     └──SideDishServlet　　　  　(副菜の提案)

│       │     └── Resipemada　　　　　　(作り方。準備中)

│       │
│       ├── /service　　　

│       │    ├──ColorService　　　　（色に関連する野菜）

│       │    ├── SideDishAdvise.java     (副菜提案)

│       │    └──CommentService.java     (栄養面のコメント)

│       │    └──RecipeService　　　（レシピ表示。準備中）

│       │
│       ├── /model　　　
│       │    ├── Color.java　　　　  (色モデル)
│       │    ├── SideDish.java　　　(副菜モデル)
│       │    ├── Dish.java　　　　　(副菜の料理名モデル)
│       │    └── Comment.java　　  (コメント)

│       │
└── /test

├── /webapp　　

│ ├── /WEB-INF 　 

│  │　├──  web.xml

│  │   ├── /jsp

│  │   　├──error.jsp

│  │   　├── index.jsp  　　　(トップページ+色選択ページ)

│  │   　├── result.jsp  　　　(副菜結果ページ)

│  │   　├── recipezyunnbi.jsp   (レシピ表示。準備中)
│  │  　 └── footer.jsp           (共通フッター)

│  │

│  ├── /lib     (jarファイルを置く場所)

│  　  └── /classes 　(コンパイル済みクラスファイル (自動生成))

│  ├── /CSS

│  │  └── styles

│  │

│  ├── /images

│  └── /js 　　　(JavaScriptファイル)
```



## 💻使用技術
バックエンド  
- java version "22.0.2"   
- サーブレット（Servlet API）  
- JSP (JavaServer Pages)  
- Tomcat 9.17 (サーブレットコンテナ)  

フロントエンド  
- HTML5  
- CSS (スタイルシート)  


開発環境
- Eclipse (IDE)  
- Apache Tomcat (サーブレットコンテナ)  
- JDK (Java Development Kit)  
- Git (バージョン管理)  






