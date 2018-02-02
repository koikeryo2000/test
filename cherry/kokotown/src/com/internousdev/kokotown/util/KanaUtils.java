package com.internousdev.kokotown.util;

public class KanaUtils {

	 /**
     * カタカナをひらがなに変換します。
     *
     * @param src
     *            変換対象の文字列
     * @return 変換後の文字列
     */
    public static String toHiragana(String src) {
        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < src.length(); i++) {
        	//1文字ずつ文字数分まわす
            char c = src.charAt(i);

            //カタカナ判定
            if ('\u30A0' <= c && c <= '\u30FF') {
            	//ひらがなに変換する
                sb.append((char) (c - '\u30A0' + '\u3040'));
            } else {
                sb.append(c);
            }
        }

        return sb.toString();
    }

}
