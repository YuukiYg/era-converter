package com.yuukiyg.sample.converter;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Locale;

/**
 *
 */
public class EraConverter {

    /**
     * @param era 明治:1、大正:2、昭和:3、平成:4、令和:5 <br>
     * @param eraYear 和暦での年。平成20年であれば「20」を指定
     * @param month 月
     * @param day 日
     * @return "yyyy/MM/dd" 形式の文字列
     */
    public static String japaneseDateToGregorianDate(int era, int eraYear, int month, int day) {
        // 英語ロケールでフォーマットを作成
        DateFormat format = new SimpleDateFormat("yyyy/MM/dd", new Locale("en", "EN", "EN"));

        // 日本語ロケールでカレンダを取得
        Calendar cal = Calendar.getInstance(new Locale("ja", "JP", "JP"));

        // 入力チェック
        if (era <= 0 || era >= 6) {
            throw new IllegalArgumentException("era must be 1-5");
        }
        if (eraYear <= 0) {
            throw new IllegalArgumentException("eraYear must be > 0");
        }
        if (month <= 0 || month >= 13) {
            throw new IllegalArgumentException("month must be 1-12");
        }
        if (day <= 0 || day >= 32) {
            throw new IllegalArgumentException("day must be 1-31");
        }

        cal.clear();
        cal.set(Calendar.ERA, era);
        cal.set(Calendar.YEAR, eraYear);
        cal.set(Calendar.MONTH, month - 1); // Calendarクラスでは0月～11月として扱うので、-1する。
        cal.set(Calendar.DATE, day);

        return format.format(cal.getTime());
    }

}
