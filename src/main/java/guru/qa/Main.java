package guru.qa;

public class Main {

    public static void main(String[] args) {

        boolean bool = true; // true, false
        char character = 'a'; // символ UTF-16 (буквы и цифры)

        byte aByte = 127; // -128 .. 127
        short aShort = 32767; // -32,768 .. 32,767
        int aInt = 2147483647; // -2147483648 .. 2147483647
        // int withError = aInt + 10000000000; // error: integer number too large
        long aLong = 9223372036854775807L; // -9223372036854775808L .. 9223372036854775807L

        float aFloat = 0.1F;
        double aDouble = 0.2;

        System.out.println(aInt + aDouble);
        System.out.println(aByte - aShort + aLong - aFloat);

        int aInt2 = aInt * 1000;
        System.out.println(aInt2); // over

        int[] arr = new int[]{1, 2, 3, 4, 5};
        System.out.println(arr[2]);


        String str = "Hello! Hello! How low?";


        int a = 10 + 20;
        System.out.println(a);
        int b = 100 - 50;
        System.out.println(b);
        int c = 10 / 3;
        System.out.println(c);
        int d = 10 % 3;
        System.out.println(d);
        int e = 100 * 2;
        System.out.println(e);

        int all = a + b - c * d % e;
        System.out.println(all);

        byte f = 5;
        long g = 94374738394043043L;
        short h = 30000;
        float i = 0.5F;
        double j = 0.5;

        double all2 = f + g - h * i + j / 100;
        System.out.println(all2);

        System.out.println(str + " " + all);

        boolean result1 = 3 > 2;
        System.out.println(result1);
        boolean result2 = 3 >= 2;
        System.out.println(result2);
        boolean result3 = 3 < 2;
        System.out.println(result3);
        boolean result4 = 3 <= 2;
        System.out.println(result4);
        boolean result5 = 3 != 2;
        System.out.println(result5);
        boolean result6 = 3 == 2;
        System.out.println(result6);
        boolean result7 = !(3 > 2) && 3 > 2;
        System.out.println(result7);
        boolean result8 = !(3 > 2) || 3 > 2;
        System.out.println(result8);

        String wakeUp = "Wake up, Neo!";
        String sweetDream = "Oh! Sweet dreams are made of this";

        int time = 10;

        if (time > 7 && time <= 10) {
            System.out.println(wakeUp);}
        else {
            System.out.println(sweetDream);
        };
    }
}
