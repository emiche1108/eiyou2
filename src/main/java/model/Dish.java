package model;

import java.util.ArrayList;
import java.util.List;



public class Dish {
    private String name;
    private String description;
    private List<Comment> comments;  // コメントを保持するリスト

    // コンストラクタ
    public Dish(String name, String description) {
        this.name = name;
        this.description = description;
        this.comments = new ArrayList<>();  // コメントリストを初期化
    }

    // ゲッターとセッター
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public List<Comment> getComments() {
        return comments;
    }

    
    
    public void addComment(Comment comment) {
        this.comments.add(comment);
    }
    
    

    // レシピの詳細情報を表示する
    public void displayRecipeInfo() {
        System.out.println("Recipe Name: " + name);
        System.out.println("Description: " + description);
        System.out.println("Comments:");
        
        for (Comment comment : comments) {
            System.out.println(comment.getText());
        }
    }
}
