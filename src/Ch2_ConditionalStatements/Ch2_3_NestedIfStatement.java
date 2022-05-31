package Ch2_ConditionalStatements;

import java.util.Objects;

public class Ch2_3_NestedIfStatement {
    public static void main(String[] args) {
        int grade = 95;
        /* Birden fazla koşul olduğu durumlarda if-elseif yapısı kullanılır. Hangi koşul doğruysa o if bloğunun
        içerisine yazılmış kodlar çalışır.
        Eğer else bloğu varsa, hiçbir koşul çalışmadığı zaman else bloğu içerisindeki kodlar çalışır.

         */
        if (grade >= 90) {
            System.out.println("AA");
        } else if (grade >= 80 && grade < 90) {
            System.out.println("BA");
        } else if (grade >= 70 && grade < 80) {
            System.out.println("BB");
        } else if (grade >= 60 && grade < 70) {
            System.out.println("CB");
        }

        // şart bloklarıyla çalışırken blok içerisine tek satır kod yazıyorsak süslü parantez kullanmasak da kod çalışır.
        // Ancak kod okunurluğu açısından daha iyi olması için yinede süslü parantez kullanmayı tercih ederiz.


        String ebrununModu = "mutlu";
        if (ebrununModu == "kızgın"){
            System.out.println("Onu öf, ona hediye al");
        } else if(ebrununModu == "mutlu"){
            System.out.println("Onu öf, ona hediye al");
        } else if (ebrununModu == "üzgün") {
            System.out.println("Onu öf, ona hediye al");
        } else if (ebrununModu == "sıkılmış") {
            System.out.println("Onu öf, ona hediye al");
        }
        String tür = "pop";
        if (Objects.equals(tür,"slow")){
            System.out.println("çalınıyors.");
        } else if (tür == "R&B"){
            System.out.println("çalınıyorr");
        } else if (tür == "pop") {
            System.out.println("çalınıyorpop");
        }
    }

}
