package Ch1_ElementaryProgramming;

public class Ch1_6_NumericTypeConversion {
    public static void main(String[] args) {
        /*
            Data tiplerinin birbirlerine dönüştürülmesine type conversion (casting) denir
            Dönüşüm örnekleri;
                int -> double
                int -> String
                int -> char
                String -> int
                String -> double
                .
                .
                .
         */

        // int -> String
        String intToStr = String.valueOf(3);
        String intToStr2 = 3 + "";

        // double -> String
        String doubleToStr = String.valueOf(3.12);
        String doubleToStr2 = 3.12 + "";

        // char -> String
        String charToStr = String.valueOf('x');
        String charToStr2 = 'x' + "";

        // String -> int: string integer bir sayıyı represent etmeli. Örn; "123", "4", Anti örnek; "12x", "12.46", "askjd"
        // Çevirme işlemi gerçekleşmezse hata fırlatılır (oluşur)
        int strToInt = Integer.parseInt("123"); // her double bir integer olmadığı için double sayılar verilemez
        System.out.println(strToInt);

        // String -> double: int'e çevirme koşulları aynıdır
        double strToDouble = Double.parseDouble("123.12");
        double strToDouble2 = Double.parseDouble("123"); // her integer bir double olduğu için integer sayılar da bu şekilde dönüştürülebilir

        // String -> char: stringin tek karakter içermesi gerekir. Örn; "x", "y", anti örnek: "asd", "a12"
        char strToChar = "a".charAt(0);


        // int -> double: her integer aynı zamanda bir double olduğu için dönüşüme gerek yoktur
        double intToDouble = 3;

        // int -> char
        char intToChar = (3 + "").charAt(0); // -> "3".charAt(0)
        char intToChar2 = (String.valueOf(3)).charAt(0); // -> "3".charAt(0)

        // double -> int
        int doubleToInt = (int) (3.0);

        // ** double -> int işlemlerinde dikkatli olmak gerekir
        int doubleToInt2 = (int)(3.12); // 3.12 -> 3

        // double -> char
        char doubleToChar = (4.5 + "").charAt(0);
        char doubleToChar2 = (String.valueOf(4.5)).charAt(0);

        // char double olmaz. tek elemanlı olmalıdır.

        // char -> int
        int charToInt = Integer.parseInt('2' + ""); // -> Integer.parseInt("2")





    }
}
