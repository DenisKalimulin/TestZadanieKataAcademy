import java.util.Scanner;

public class Calculator {
    static String op;
    static String abc1;
    static String abc2;
    static int a, b;


    public static void main(String[] args) throws ArrayIndexOutOfBoundsException {
        System.out.println("Введите выражение в формате (a + b) арабскими или римскими числами от 1 до 10 включительно");
        Scanner console = new Scanner(System.in);
        String str = console.nextLine();

        if (str.matches(".*[0123456789].*")) {
            String[] split = str.split(" ");
            a = Integer.parseInt(split[0]);
            b = Integer.parseInt(split[2]);
            op = split[1];
            System.out.println(arabCalc(a, b, op));
        } else {
            String[] split = str.split(" ");
            abc1 = split[0];
            abc2 = split[2];
            op = split[1];
            System.out.println(romanResult(RomCalc(abc1, abc2, op)));
        }
    }
    public static String arabCalc(int a, int b, String op){
        int result = 0;
        String resultat = null;
        if(a <= 10 && b <= 10){
            if(op.equals("+")){
                result = a + b;
                resultat = Integer.toString(result);
            } else if(op.equals("-")){
                result = a - b;
                resultat = Integer.toString(result);
            } else if(op.equals("*")){
                result = a * b;
                resultat = Integer.toString(result);
            } else if (op.equals("/")){
                result = a / b;
                resultat = Integer.toString(result);
            }
            return resultat;
        } else {
            return "Числа должны быть не больше 10";
        }
    }
    public static int RomCalc(String num1, String num2, String op){
        String [] roman = {"I", "II", "III", "IV", "V", "VI", "VII", "VIII", "IX", "X"};
        int result = 0;
        for (int i = 0; i < roman.length; i++) {
            if(num1.equals(roman[i])){
                a = i + 1;
            }
        }
        for (int i = 0; i < roman.length; i++) {
            if(num2.equals(roman[i])){
                b = i + 1;
            }
        }
        if (op.equals("+")){
            result = (a + b) - 1;
        } else if (op.equals("-")){
            result = (a - b) - 1;
        } else if (op.equals("*")){
            result = (a * b) - 1;
        } else if(op.equals("/")){
            result = (a / b) - 1;
        }
        return result;
    }
    public static String romanResult(int resultArab){
        String [] result = {"I", "II", "III", "IV", "V", "VI", "VII", "VIII", "VIIII", "X",
                "XI", "XII", "XIII", "XIV", "XV", "XVI", "XVII", "XVIII", "XIX", "XX",
                "XXI", "XXII", "XXIII", "XXIV", "XXV", "XXVI", "XXVII", "XXVIII", "XXIX", "XXX",
                "XXXI", "XXXII", "XXXIII", "XXXIV", "XXXV", "XXXVI", "XXXVII", "XXXVIII", "XXXIX", "XL",
                "XLI", "XLII", "XLIII", "XLIV", "XLV", "XLVI", "XLVII", "XLVIII", "XLIX", "L",
                "LI", "LII", "LIII", "LIV", "LV", "LVI", "LVII", "LVIII", "LIX", "LX",
                "LXI", "LXII", "LXIII", "LXIV", "LXV", "LXVI", "LXVII", "LXVIII", "LXIX", "LXX",
                "LXXI", "LXXII", "LXXIII", "LXXIV", "LXXV", "LXXVI", "LXXVII", "LXXVIII", "LXXIX", "LXXX",
                "LXXXI", "LXXXII", "LXXXIII", "LXXXIV", "LXXXV", "LXXXVI", "LXXXVII", "LXXXVIII", "LXXXIX", "XC",
                "XCI", "XCII", "XCIII", "XCIV", "XCV", "XCVI", "XCVII", "XCVIII", "XCVIX", "C"};
        return result[resultArab];
    }
}