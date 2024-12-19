package main;

import java.time.LocalTime;
import java.time.ZoneId;
import java.time.ZonedDateTime;



public class GreetingUtil {
    public static String generateGreetingMessage() {
        ZonedDateTime now = ZonedDateTime.now(ZoneId.of("Asia/Tokyo"));
        LocalTime time = now.toLocalTime();
        
        if (time.isBefore(LocalTime.NOON)) {
            return "おはようございます！元気が出る朝の一品を提案します。";
            
        } else if (time.isBefore(LocalTime.of(18, 0))) {
            return "こんにちは～。お昼ごはんの副菜を提案します。";
            
        } else {
            return "お疲れ様です。今夜の副菜をご提案しましょうか？";
        }
    }
}
