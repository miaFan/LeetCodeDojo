package com.thoughtworks.fmt;

public class Solution {
    public String reverseString(String s) {
        String reversedString = "";
        char[] stringChars = s.toCharArray();

        for(int i = stringChars.length-1; i >= 0; i--){
            reversedString += stringChars[i];
        }
        return reversedString;
    }
}
