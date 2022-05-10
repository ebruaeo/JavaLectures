package Ch1_ElementaryProgramming;

public class Ch1_2_MathematicalOperations {
    public static void main(String[] args) {
        /*
            Matematik operatörleri: +, -, *, /, %
            +: toplama işlemidir. int ve double sayılarda toplama yapar
            -: int ve double sayılarda çıkartma yapar
            *: int ve double sayılarda çarpma yapar
            /: int ve double sayılarda bölme yapar.
                integer division (tam sayı bölmesi): iki tane tam sayı bölünürse sonuç tam sayıdır. Örn; 3/2 = 1
                double division: sayılardan en az bir tanesi double sayı olmalıdır. Sonuç double olur. Örn; 3.0 / 2 = 1.5
                                                                                                            3 / 2.0 = 1.5
                                                                                                            3.0 / 2.0 = 1.5
                    3 ile 3.0 bilgisayar için aynı değildir. 3 sayısı bilgisayar için integer 3 iken 3.0 ise double 3 olur.
            %: remainder demek. Bölümünden kalan bulur. Matematikte modüler aritmetik olarak geçer. Örn; 9 % 2 = 1, 13 % 8 = 5, 49 % 7 = 0
         */

        System.out.print("3 + 5 = ");
        System.out.println(3 + 5);

        System.out.print("3 + 5 + 9 = ");
        System.out.println(3 + 5 + 9);

        int i1 = 3 + 7 + 18; // assignment yaparken eşittir sağ tarafı hesaplanıp sol tarafa atanır.
        System.out.print("i1: ");
        System.out.println(i1);

        int i2 = 3 - 7 + 2;
        System.out.print("i2: ");
        System.out.println(i2);

        double d1 = 3 + 7 - 2.1;
        System.out.print("d1: ");
        System.out.println(d1);

        // expression: hesaplama gerektiren ifadelerdir. Örn; 3 + 7 - 2.1

        // integer division
        int i3 = 3 / 2;
        System.out.print("i3: ");
        System.out.println(i3);

        // double division
        double d2 = 3.0 / 2;
        System.out.print("d2: ");
        System.out.println(d2);
        d2 = 3 / 2.0;

        // remainder
        int r1 = 9 % 2;
        System.out.print("r1: ");
        System.out.println(r1);

        r1 = 13 % 8;
        System.out.print("r1: ");
        System.out.println(r1);

        r1 = 49 % 7;
        System.out.print("r1: ");
        System.out.println(r1);

        int i4 = 7;
        int i5 = 11;
        int i6 = i4 * i5; // değişkenlerle bu şekilde matematiksel işlem yapılabilir
        System.out.print("i6: ");
        System.out.println(i6);

        i6 = i5 / i4; // integer division
        System.out.print("i6: ");
        System.out.println(i6);

        double d4 = i5; // int olan bir sayıyı double bir sayıya çevirme
        double d5 = d4 / i4; // double division
        System.out.print("d5: ");
        System.out.println(d5);


        /*
            Operator precedence = Operatör önceliği = işlem önceliği
                - Parantez içi daima önce yapılır
                - çarpma bölme sonra yapılır. Soldan sağa yapılır. Örn; 9 / 3 * 3 -> 3 * 3 -> 9
                - en son toplama çıkartma yapılır.

                ** Garanti olması açısından parantez kullanarak işlem sırası belirtilir.
         */

        double d3 = (2 + 5) * 3.0 / (7 - 4);
        System.out.print("(2 + 5) * 3.0 / (7 - 4) =  ");
        System.out.println(d3);


        // quiz time
        // 58973 192
        int k = 58973 % 192;
        System.out.print("58973 % 192 =");
        System.out.println(k);
        System.out.print("k= ");
        System.out.println(k);

        int div = 6 / 5;
        System.out.print("div=");
        System.out.println(div);
        double divi = 6.0 / 5;
        System.out.print("divi=");
        System.out.println(divi);
    }
}
