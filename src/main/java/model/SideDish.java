package model;

import java.util.ArrayList;
import java.util.List;



public class SideDish {
    private String name;  // 副菜の名前
    private String description;
    private List<Comment> comments;

    // コンストラクタ
    public SideDish(String name, String description, List<Comment> comments) {
        this.name = name;
        this.description = description;
     // nullチェックして初期化
        this.comments = (comments != null) ? comments : new ArrayList<>(); 
    }

    // ゲッター
    public String getName() {
        return name;
    }

    public List<Comment> getComments() {
        return comments;
    }

    // コメント追加メソッド
    public void addComment(Comment comment) {
        if (comment != null) {
            this.comments.add(comment);
        }
    }
    
    
    // toStringメソッドの追加
    @Override
    public String toString() {
        return "SideDish{name='" + name + "', description='" + description + "', comments=" + comments + "}";
    }

    // setCommentsメソッドの追加
    public void setComments(List<Comment> comments) {
        this.comments = comments != null ? comments : new ArrayList<>();
    }
}




