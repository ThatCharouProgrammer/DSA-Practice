package GRIND_75;

import java.util.Locale;

public class Q5_ValidPalindrome {
    public boolean isPalindrome(String s) {

        if (s == null || s.equals("")){
            return true;
        }

        // remove non-alphanumeric characters
        s = s.replaceAll("[^a-zA-Z0-9]", "");
        // convert to lowercase
        s = s.toLowerCase();

        String revStr = "";

        // reverse string
        /*for (int i = s.length()-1; i >= 0 ; i--) {
            revStr += s.charAt(i) + "";
        }

        // compare string
        return s.equals(revStr);*/

        // the above commented out code is quite heavy on space and time complexity
        // by using some clever for loop tricks we can cut that time drastically
        int i = 0;

        int j = s.length() -1;

        // https://techvidvan.com/tutorials/java-for-loop/
        for (; i < j; i ++, j --){
            if (s.charAt(i) != s.charAt(j)){
                return false;
            }
        }

        return true;

    }

    public static void main(String[] args){
        Q5_ValidPalindrome obj = new Q5_ValidPalindrome();

        String s = "A man, a plan, a canal: Panama";
        String s2 = "race a car";
        String s3 = " ";

        System.out.println(obj.isPalindrome(s));
        System.out.println(obj.isPalindrome(s2));
        System.out.println(obj.isPalindrome(s3));

    }
}
