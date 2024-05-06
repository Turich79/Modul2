package io.hexlet.util;

public class TextUtils {
    public static int getWordsCount(String frase) {
        if (frase.trim() == "") {
            return 0;
        }
        String[] fraseMas = frase.trim().split(" ");
        return fraseMas.length;
    }
}
