package Ch2_ConditionalStatements;

import java.util.Scanner;

public class Ch2_1_IfStatement {
    public static void main(String[] args) {
        int a = 15;
        int password = 1234;
        boolean b = true;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter password:");
        int userPassword = Integer.parseInt(scanner.nextLine());
        //if bloğu bir koşulun doğru olup olmadığını kontrol eder. Eğer true dönüyorsa if bloğu içerisindeki kodlar çalışır.
        //if bloğu içerisinde kontrol edilen durum false dönerse if bloğu içerisindeki kodlar çalışmadan geçilir.
        if(userPassword == password){
            System.out.println("Successfull");
        }
    }
}
