package com.test.help;

import java.util.Locale;

public class GetLocaleInfo {

    public static void main(String[] args) {
        Locale currentLocale = Locale.getDefault();

        System.out.println(currentLocale.getDisplayLanguage());
        System.out.println(currentLocale.getDisplayCountry());

        System.out.println(currentLocale.getLanguage());
        System.out.println(currentLocale.getCountry());
    }
}
