package utils;

import java.util.UUID;

public class RandomEmail {
    public static String generateString() {
        String uuid = UUID.randomUUID().toString();
        return uuid +"@gmail.com";
    }
}
