package Ch2_ConditionalStatements;

public class Ch2_4_LogicalOperators {
    public static void main(String[] args) {
        boolean a = true;
        boolean b = false;

            // && (ve) operatörü
            if (a && b){ //çalışmaz
            System.out.println("a and b are true");
        }
        // ve operatörü ile bağlanmış iki veya daha fazla statement varsa, o bloğun çalışması için tüm
        // statementların true değer döndürmesi gerekir.

        // || (veya) operatörü
        if (a || b) { // çalışır
            System.out.println("a or b is true");
        }
        /*
        veya operatörü ile bağlanmış iki veya daha fazla statement varsa, o bloğun çalışması için minimum bir
        statementın true değer döndürmesi yeterlidir.
         */

        int x = 10;
        int y = 15;
        // ! (değil) operatörü
        if (x != y ){ // çalışır
            System.out.println("x and y are not equal.");
        }
        boolean isEqual = x == y;
        // boolean ile kullanımı :
        if (!(isEqual)){ // çalışır
            System.out.println("x and y are not equal");
        }

        boolean isBrown = false;
        if (!(isBrown)) {
            System.out.println("her eyes is beautiful.");
        }

        boolean isOktayRelax = false;
        if (!isOktayRelax){
            System.out.println("Ebru is angry.");
        }
    }
}
