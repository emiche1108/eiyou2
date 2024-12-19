package model;

import java.util.List;

import service.ColorService;



public class Color {
    private String colorName;
    private List<String> vegetables;

    // コンストラクタ
    public Color(String color, String colorName, List<String> vegetables) {
        this.colorName = colorName;
        this.vegetables = vegetables;
    }

	public Color(String color, Object object, String color2, Object object2) {
		// TODO 自動生成されたコンストラクター・スタブ
	}

	public String getColorName() {
        return colorName;
    }

    public List<String> getVegetables() {
        return vegetables;
    }
    
    
    // 選ばれた色に基づき野菜リストを取得するメソッド
    public static Color getColorInfo(String selectedColor) {
        ColorService colorService = new ColorService();
        return colorService.getColorInfo(selectedColor);
    }
    
}
