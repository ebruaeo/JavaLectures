package Ch1_ElementaryProgramming;

import com.sun.security.jgss.GSSUtil;

public class Ch1_1_DataTypes {
    // yorum satırı
    /*
        yorum paragrafı
        satır 2
        satır 3
     */
    // main method: Programın başlama noktasıdır. Çalıştır dediğimizde program buradan çalışmaya başlar
    public static void main(String[] args) {
        // aşağıdaki kod satırı konsola Hello World! yazdırır.
        System.out.println("Hello World!"); // her işlem noktalı virgül ile bitmek zorundadır.
        System.out.println(5.8);

        /* Data types: int, double, string, char, boolean
            int: açılımı integer'dır. tam sayıları temsil etmek için kullanılır.
            double: ondalıklı sayıları temsil etmek için kullanılır
            string: harf, kelime ve cümleleri temsil eder. Tırnak işareti ile kullanılır. Örn; "Ebru Aeo", "lenovo", "java!"
            char: açılımı character'dir. Tek bir karakteri temsil eder. Tek tırnak ile kullanılır. Örn; 'a', 'X', '?'
            boolean: Bir olayın iki farklı durumu varsa o olayı temsil etmek için kullanılır. true ya da false değerini alır.
                    Örn; Ampulün açık veya kapalı olma durumu vardır. Açık durumu için true, kapalı için false denilebilir.
         */

        /* Değişken tanımlama (declaration): Bilgisayara kullanacağımız değişkenleri tanıtmaktır.
                değişken tanımlama formulü;
                    dataType variableName;
                    dataType: int, double, string etc.
                    variableName: değişken adıdır. keyfi olarak istenilen isim verilir. bazı kısıtlamaları vardır
         */

        // x isimli bir tam sayı değişkeni tanımlayalım
        int x; // bu satırla birlikte bilgisayar x değişkenini tanımış olur. x değişkeni bilgisayar için tam sayı tutan bir değişken anlamına gelir.

        // x değişkenine değer atayalım
        x = 4; // eşittir atama operatörüdür (assignment operator). x değişkeninin değeri artık 4 olur.
        System.out.println(x);
        // x değişkenine başka bir değer atayalım
        x = -3; // x değişkeninin değeri bu satırdan sonra -3 olarak kalır.
        System.out.println(x);

        // int x; -> declaration
        // x = 4; -> assignment

        // tek satırda declaration ve assignment yapmak
        int y = -9;
        System.out.print("y: "); // tırnak işareti içerisindeki y harfi değişkenlerle ilişkilendirilmez. harf olan y olarak düşünülür
        System.out.println(y);

        // double örneği
        double d = 3.14;
        System.out.print("d: ");
        System.out.println(d);

        // string örneği
        String str = "sample string"; // çift tırnak içerisinde yazılır
        System.out.print("str: ");
        System.out.println(str);

        // char örneği
        char ch = 'x'; // tek tırnak içerisinde tek karakter yazılır
        System.out.print("ch: ");
        System.out.println(ch);
        ch = '?';
        System.out.print("ch: ");
        System.out.println(ch);

        boolean b = true; // true ya da false olur
        System.out.print("b: ");
        System.out.println(b);
        b = false; // reassignment: tanımlı olan bir olan değişkene başka bir değer atamak
        System.out.print("b: ");
        System.out.println(b);

        boolean isLightOn = true;
        System.out.print("is light on? answer: ");
        System.out.println(isLightOn);

        // ** aynı isimli sadece 1 tane değişken tanımlayabilirsin
//        boolean b; // bu satır hatalı çünkü yukarda boolean b olarak declaration yapıldı.


        // quiz time
        int score = 17;
        System.out.println(score);
        double h = 3.14;
        System.out.print("h: ");
        System.out.println(h);
        String s = "Java programming ";
        String st = "is fun";
        System.out.print(s);
        System.out.println(st);
        char c;
        c = 'ö';
        boolean b1 = true;
        boolean b2 = b1;
        System.out.println("b1 and b2 have the same value");
        System.out.println(b1);
        System.out.println(b2);

        String username = "omerokumus1";
        String password = "123456";


    }
}
