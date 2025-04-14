package org.example;

import java.util.HashMap;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
    }

    public static boolean isPalindrome(int number) {
        if(number < 0)
            number = number * -1;

        String str = Integer.toString(number);
            for(int i =0;i < (str.length() / 2);i++){
                if(str.charAt(i) != str.charAt(str.length() - 1 - i)){
                    return false;
                }
            }
        return true;
    }

    public static boolean isPerfectNumber(int number) {
        if(number < 0){
            return false;
        }
        int sum = 0;
        for(int i=1;i <= number/2 ; i++) {
            if (number % i == 0) {
                sum = sum + i;
            }
        }
        return sum == number;
    }

    public static String numberToWords(int number) {
        if(number < 0) {
            return "Invalid Value";
        }
        String str = Integer.toString(number);
        String[] arrStr = str.split("");
        HashMap <String,String> map = new HashMap<String, String>();
        map.put("1","One");
        map.put("2","Two");
        map.put("3","Three");
        map.put("4","Four");
        map.put("5","Five");
        map.put("6","Six");
        map.put("7","Seven");
        map.put("8","Eight");
        map.put("9","Nine");
        map.put("0","Zero");
        String newStr = "";

        for (String s : arrStr) {
            for (int j = 0; j < map.size(); j++) {
                if (Integer.parseInt(s) == j) {
                    newStr = newStr + map.get(s) + " ";
                }
            }
        }
        return newStr.trim();
    }


}
