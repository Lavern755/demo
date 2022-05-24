package com.example.exam;

/**
 * @author liwen
 */
public class AbideString {
    public static void main(String[] args) {
        AbideString abideString = new AbideString();
        String str1 = "aabBccd";
        System.out.println("aaccd".equals(abideString.abideRule(str1)));

        String str2 = "aaBbccCd";
        System.out.println("aacd".equals(abideString.abideRule(str2)));

        String str3 = "commMmon";
        System.out.println("common".equals(abideString.abideRule(str3)));
    }

    public String abideRule(String inputStr) {
        StringBuilder ans = new StringBuilder();
        String[] arr = inputStr.split("");
        int startPos = 0;
        int currentPost = 0;
        int right = arr.length - 1;
        while (currentPost < arr.length) {
            String curPosChar = arr[currentPost];
            String nextPosChar = currentPost >= right ? "" : arr[currentPost + 1];
            if (!curPosChar.equals(nextPosChar) && curPosChar.equalsIgnoreCase(nextPosChar)) {
                currentPost += 2;
                startPos = currentPost;
                continue;
            }

            ans.append(arr[startPos++]);
            currentPost++;
        }
        return ans.toString();
    }
}
