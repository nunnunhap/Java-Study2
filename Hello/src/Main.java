// 이것은 첫번째 자바 프로그램입니다.
public class Main {
    public static void main(String[] args) {
        Hello hello = new Hello();
        String message = hello.sayHello("유영");
        System.out.println(message);


        int orgValue = 32768;
        short convValue = (short) orgValue;
        System.out.println(convValue); // -32768

        float forgValue = 12.5F;
        int fconvValue = (int) forgValue;
        System.out.println(fconvValue); // 12

        final double PI = 3.14159; // final 예약어는 변수를 최종화하겠다는 것을 의미하므로 반드시 초기화
        // PI = 999;
        System.out.println(PI);

        var age = 22; // int로 데이터타입이 설정됨.
        // age = 22.9;
        System.out.println(age);

        String msg = "안녕하세요? 자바 프로그램입니다."; // msg는 String 타입의 객제
        System.out.println(msg);

        // 배열은 참조타입의 일종
        // int [] aveTemp; // 평균기온
        // int [] aveTemp = new int[12];
        // aveTemp[0] = 30;
        int [] aveTemp = {-4, -1, 4, 11, 17, 21, 24, 25,20, 13, 6, -1};
        // System.out.println(aveTemp[12]); // Exception

        int [][] scores = new int [5][3];
        int [][] scores1 = {
                {90, 80, 50},
                {80, 20, 90},
                {100, 100, 100},
                {50, 30, 40},
                {70, 80, 90}
        };
        System.out.println(scores1[1][2]); // 90





    }
}
