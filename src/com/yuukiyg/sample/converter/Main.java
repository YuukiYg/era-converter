package com.yuukiyg.sample.converter;

public class Main {
    public static void main(String[] args) {
        // 平成31年4月30日
        System.out.println("平成31年4月30日 :\t" + EraConverter.japaneseDateToGregorianDate(4, 31, 4, 30));

        // 令和元年4月30日
        System.out.println("令和元年4月30日:\t" + EraConverter.japaneseDateToGregorianDate(5, 1, 4, 30));



        // 平成31年5月1日
        System.out.println("平成31年5月1日 :\t" + EraConverter.japaneseDateToGregorianDate(4, 31, 5, 1));

        // 令和元年5月1日
        System.out.println("令和元年5月1日 :\t" + EraConverter.japaneseDateToGregorianDate(5, 1, 5, 1));



        // 平成32年1月1日
        System.out.println("平成32年1月1日 :\t" + EraConverter.japaneseDateToGregorianDate(4, 32, 1, 1));

        // 令和2年1月1日
        System.out.println("令和2年1月1日  :\t" + EraConverter.japaneseDateToGregorianDate(5, 2, 1, 1));
    }

}
