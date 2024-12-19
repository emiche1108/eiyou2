package service;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;

import model.Color;



public class ColorService {

    // 色に基づく野菜のリストを返す
    public Color getColorInfo(String color) {
        Set<String> vegetables = new HashSet<>();  // 重複を防ぐためにSetを使用
        
        switch (color) {
            case "オレンジ":
                vegetables.add("にんじん");
                vegetables.add("かぼちゃ");
                break;

            case "赤":
                vegetables.add("トマト");
                vegetables.add("赤パプリカ");
                vegetables.add("梅干し");
                break;

            case "黄":
                vegetables.add("とうもろこし");
                vegetables.add("さつまいも");
                vegetables.add("じゃがいも");
                break;

            case "緑":
                vegetables.add("ほうれん草");
                vegetables.add("ブロッコリー");
                vegetables.add("きゅうり");
                break;

            case "紫":
                vegetables.add("ブルーベリー");
                vegetables.add("ナス");
                break;

            case "白":
                vegetables.add("大根");
                vegetables.add("白ネギ");
                break;

            default:
                vegetables.add("選ばれた色に関連する情報がありません。");
                break;
        }
        return new Color(color, new ArrayList<>(vegetables), color, null);  // SetをListに変換して返す
    }
}







