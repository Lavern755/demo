package com.example.exam;

public class LC28 {
    public static void main(String[] args) {
        LC28 lc28 = new LC28();
        String aystack = "hello";
        String needle = "ll";
        System.out.println(lc28.strStr(aystack, needle));

        aystack = "aaaaa";
        needle = "bba";
        System.out.println(lc28.strStr(aystack, needle));

        aystack = "aaaaa";
        needle = "";
        System.out.println(lc28.strStr(aystack, needle));
    }
    public int strStr(String haystack, String needle) {
        int index = haystack.indexOf(needle);
        return index;
    }
}
