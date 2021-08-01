/*

Given two strings s and t, return true if t is an anagram of s, and false otherwise.

 

Example 1:

Input: s = "anagram", t = "nagaram"
Output: true
Example 2:

Input: s = "rat", t = "car"
Output: false

source:leetcode


*/

public class Anagram {

    public static boolean isAnagram(String s, String t) {
        if (s.length() != t.length())
            return false;
        int findChar[] = new int[26];

        for (int i = 0; i < s.length(); i++) {
            int index = s.charAt(i) - 'a';
            findChar[index]++;

        }

        for (int i = 0; i < t.length(); i++) {
            if (findChar[t.charAt(i) - 'a'] > 0) {
                int index = t.charAt(i) - 'a';
                findChar[index]--;
            }

        }

        for (int c : findChar) {
            if (c > 0) {
                return false;
            }

        }
        return true;
    }

    public static void main(String[] args) {
        System.out.println(isAnagram("aacc", "ccac"));
    }
}
