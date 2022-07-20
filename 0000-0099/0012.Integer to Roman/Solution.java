public class Solution {
    public static String intToRoman(int num) {
        String Roman = "";
        while (num >= 1000) {
            Roman += "M";
            num -= 1000;
        }
        while (num >= 400 && num < 1000) {
            if (num >= 900) {
                Roman += "CM";
                num -= 900;
            }
            else if (num >= 500 && num < 900) {
                Roman += "D";
                num -= 500;
            }
            else {
                Roman += "CD";
                num -= 400;
            }
        }
        while (num >= 100 && num < 400) {
            Roman += "C";
            num -= 100;
        }
        while (num >= 40 && num < 100) {
            if (num >= 90) {
                Roman += "XC";
                num -= 90;
            }
            else if (num >= 50 && num < 90) {
                Roman += "L";
                num -= 50;
            }
            else {
                Roman += "XL";
                num -= 40;
            }
        }
        while (num >= 10 && num < 40) {
            Roman += "X";
            num -= 10;
        }
        while (num >= 4 && num < 10) {
            if (num >= 9) {
                Roman += "IX";
                num -= 9;
            }
            else if (num >= 5 && num < 9) {
                Roman += "V";
                num -= 5;
            }
            else {
                Roman += "IV";
                num -= 4;
            }
        }
        while (num >= 1 && num < 4) {
            Roman += "I";
            num -= 1;
        }
        return Roman;
    }
}
