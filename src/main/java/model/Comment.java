package model;



public class Comment {
    private String content; // コメントの内容

    // コンストラクタ
    public Comment(String content, String vegetable) {
        this.content = content;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    
    @Override
    public String toString() {
        return "Comment{content='" + content + "'}";
    }

	public char[] getText() {
		// TODO 自動生成されたメソッド・スタブ
		return null;
	}
}
