package com.csharma.java.concepts.mustdo;

public class LongestPalindromicSubstring {

    public String longestPalindrome(String s) {
       if(s == null || s.isEmpty()){
           return "";
       }

        int start = 0, end = 0;

        for (int i=0; i < s.length() ; i ++){
            int odd = expandFromCenter(s,i,i);
            int even = expandFromCenter(s,i,i +1);
       }


        return null;
    }

    private int expandFromCenter(String s, int left , int right){
        while(left >= 0 && right < s.length() && s.charAt(left) == s.charAt(right)){
            left --;
            right ++;
        }
return right -left -1;
    }
}
