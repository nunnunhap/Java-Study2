public class Main {
    public static void main(String[] args) {

    System.out.println(1 +2); // 3
    System.out.println("1"+2); // 12

        int x = 10;
        ++x;
        System.out.println(x); // 11
        System.out.println(x--); // 11

        int x1 = 10;
        int x2 = 10;
        int y1 = 2 * ++x1;
        int y2 = 2 * x2++;

        System.out.println(x1 + "," + x2 + "," + y1 + "," + y2); // 11, 11, 22, 20

        System.out.println(3 > 0 ? 't' : 'f');

        x1 = 10;
        x2 = 10;
        y1 = 100;
        y2 = 101;

        System.out.println(x1 == x2 && y1 == y2);
        System.out.println(x1 == x2 || y1 == y2);
        System.out.println(!(x1 == x2));



    }
}
