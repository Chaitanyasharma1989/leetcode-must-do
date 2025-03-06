package com.csharma.java.concepts.mustdo;

import java.util.ArrayList;
import java.util.List;

public class ShortestWayToFormString {

    /*
        Example 1:

        Input: source = "abc", target = "abcbc"
        Output: 2
        Explanation: The target "abcbc" can be formed by "abc" and "bc", which are subsequences of source "abc".
        Example 2:

        Input: source = "abc", target = "acdbc"
        Output: -1
        Explanation: The target string cannot be constructed from the subsequences of source string due to the character "d" in target string.
        Example 3:

        Input: source = "xyz", target = "xzyxz"
        Output: 3
        Explanation: The target string can be constructed as follows "xz" + "y" + "xz".
     */


    public static int shortestWayToFormString(String source, String target) {

        char[] sourceArray = source.toCharArray();
        char[] targetArray = target.toCharArray();

        int counter = 0;
        int sourceCounter = 0;
        int targetCounter = 0;

        List<String> subString = new ArrayList<>();
        StringBuilder stringBuilder = new StringBuilder();

        while (targetArray.length > counter) {
            if (sourceArray[sourceCounter] == targetArray[targetCounter]) {
                stringBuilder.append(sourceArray[sourceCounter]);
                sourceCounter++;
                targetCounter++;
            }else{
                targetCounter = targetCounter + 1;
                sourceCounter = 0;
                stringBuilder = new StringBuilder();
            }
            counter =  counter + 1;
        }
        return -1;
    }

    public static void main(String[] args) {
        ShortestWayToFormString.shortestWayToFormString("xyz", "xzyxz");
    }
}


