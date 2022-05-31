package Ch1_ElementaryProgramming;

public class Ch1_3_AugmentedOperators {
    public static void main(String[] args) {
        /*
            Augmented operators: +=, -=, *= /=, %=, ++, --
            Örn;
                int x = 3;
                x += 5 -> x = x + 5

         */
        int x = 3;
        System.out.print("x: ");
        System.out.println(x);
        x += 7; // x = x + 7
        System.out.print("x: ");
        System.out.println(x);

        x = 3;
        x -= 2; // x = x - 2
        System.out.print("x: ");
        System.out.println(x);

        x = 3;
        x /= 2; // x = x / 2
        System.out.print("x: ");
        System.out.println(x);

        x = 3;
        x *= 2; // x = x * 2
        System.out.print("x: ");
        System.out.println(x);

        x = 3;
        x %= 2; // x = x % 2
        System.out.print("x: ");
        System.out.println(x);

        double y = 4.1;
        y += 3;
        System.out.print("y: ");
        System.out.println(y);

        // post increment
        x = 3;
        x++;
        System.out.print("x: ");
        System.out.println(x);

        // post decrement
        x = 3;
        x--;
        System.out.print("x: ");
        System.out.println(x);

        // pre increment
        x = 3;
        ++x;

        // pre decrement
        x = 3;
        --x;

        // ** post ve pre increment/decrement operatörlerini tek satırda yukarıdaki gibi kullan


        // Quiz time
        int a = 8;
        a += 7;
        System.out.print("a:");
        System.out.println(a);

        a = 4;
        a *= 2;
        a++;
        System.out.print("a:");
        System.out.println(a);


        a = 4;
        a *= 5;
        a -= 2;
        a %= 11;
        System.out.print("a:");
        System.out.println(a);


        int r = 3;
        r += 3;
        System.out.println(r);
        int v = 4;
        v *= 6;
        System.out.println(v);
        int g = 15;
        g++;
        System.out.println(g);
        int ö = 77;
        ö--;
        System.out.println(ö);

        double l = 3.5;
        l += 20;
        System.out.println(l);


    }
    }
