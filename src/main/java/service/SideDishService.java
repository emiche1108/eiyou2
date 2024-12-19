package service;

import java.util.ArrayList;
import java.util.List;

import model.Dish;



public class SideDishService {

    // 野菜に基づいたレシピを取得するメソッド
    public static List<Dish> getRecipesForVegetable(String vegetable) {
        List<Dish> recipes = new ArrayList<>();

        
        switch (vegetable) {
            case "にんじん":
                recipes.add(new Dish("にんじんしりしり", "細切りにんじんと卵を炒めた沖縄の家庭料理"));
                recipes.add(new Dish("キャロットスープ", "温かいスープ"));
                break;

            case "かぼちゃ":
                recipes.add(new Dish("かぼちゃのグラタン", "冬の定番グラタン"));
                recipes.add(new Dish("かぼちゃの煮物", "甘辛い味付けの定番"));
                break;

            case "トマト":
                recipes.add(new Dish("トマトパスタ", "フレッシュトマトのシンプルなパスタ"));
                recipes.add(new Dish("トマトスープ", "酸味の効いたスープ"));
                break;

            case "赤パプリカ":
                recipes.add(new Dish("赤パプリカのマリネ", "爽やかな酸味の前菜"));
                recipes.add(new Dish("赤パプリカのピクルス", "さっぱりとした副菜"));
                break;

            case "梅干し":
                recipes.add(new Dish("梅干しおにぎり", "シンプルで定番の一品"));
                recipes.add(new Dish("梅干しドレッシングサラダ", "梅干しを使った和風サラダ"));
                break;

            case "とうもろこし":
                recipes.add(new Dish("バターコーン", "甘いコーンをバターで炒めた一品"));
                recipes.add(new Dish("とうもろこしの天ぷら", "サクサクの衣が美味しい副菜"));
                break;

            case "さつまいも":
                recipes.add(new Dish("さつまいもの甘露煮", "やさしい甘さの煮物"));
                recipes.add(new Dish("スイートポテト", "おやつにもなる副菜"));
                break;

            case "じゃがいも":
                recipes.add(new Dish("ポテトサラダ", "マヨネーズたっぷりの定番サラダ"));
                recipes.add(new Dish("じゃがバター", "冬の定番"));
                break;

            case "ほうれん草":
                recipes.add(new Dish("ほうれん草のおひたし", "和風のさっぱりした副菜"));
                recipes.add(new Dish("ほうれん草のソテー", "バターで香ばしく炒めた一品"));
                break;

            case "ブロッコリー":
                recipes.add(new Dish("ブロッコリーのチーズ焼き", "チーズたっぷりの焼き物"));
                recipes.add(new Dish("ブロッコリーの茹でサラダ", "シンプルで健康的なサラダ"));
                break;

            case "きゅうり":
                recipes.add(new Dish("きゅうりとわかめの酢の物", "さっぱりした味付けの和風副菜"));
                recipes.add(new Dish("きゅうりと塩昆布", "夏にぴったりの副菜"));
                break;

            case "ブルーベリー":
                recipes.add(new Dish("ブルーベリーのヨーグルト", "デザート感覚の副菜"));
                break;

            case "ナス":
                recipes.add(new Dish("ナスの煮びたし", "優しい味わいの和風副菜"));
                recipes.add(new Dish("ナスの味噌炒め", "こってり味でご飯が進む一品"));
                break;

            case "大根":
                recipes.add(new Dish("大根ステーキ","グリルした大根に甘辛いソースをかけた一品"));
                recipes.add(new Dish("大根と豚肉の煮物", "家庭的な味の煮物"));
                break;

            case "白ネギ":
                recipes.add(new Dish("白ネギのグリル", "シンプルで甘みを楽しめる副菜"));
                recipes.add(new Dish("白ネギと鶏のスープ", "温かいスープ"));
                break;

            default:
                recipes.add(new Dish("基本サラダ", "シンプルな野菜サラダ"));
                break;
        }

        return recipes;
    }
}



