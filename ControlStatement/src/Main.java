import java.util.Scanner;

public class Main {
    public static void main(String[] arg) {

        String name = "전병선";

        {
            String greetings;
            greetings = "안녕하세요?" + name + "씨";

            System.out.println(greetings);

            // String greetings; 에러 - 같은 이름을 갖는 변수를 선언할 수 없음.
            // String name; 에러 - 내부 블럭에서 재정의할 수 없음!
        }

        System.out.println(name);
        // System.out.println(greetings); 에러 - 내부 블럭 변수에 접근할 수 없음.

        // for(var i = 0; i < array.length; i++); // 빈 명령문 : empty statement

        int age = 22;
        boolean login = false;

        if(age > 18) {
            login = true;
            // scriptExecution = true;
        }
        System.out.println("결과" + login);

        int score = 90;
        byte rate;
        if(score > 90) rate = 1;
        else if (score > 80) rate = 2;
        else rate = 3;

        System.out.println("등급: " + rate);

        String message;
        switch (rate) {
            case 1 :
                message = "아주 훌륭합니다.";
                break;
            case 2 :
                message = "참 잘 했어요.";
                break;
            case 3 :
                message = "좋습니다.";
                break;
            default:
                message = "분발하세요.";
        }
        System.out.println(message);

        int month = 10;
        String season;
        switch (month) {
            case 3, 4, 5 :
                season = "봄";
                break;
            case 6, 7, 8 :
                season = "여름";
                break;
            case 9, 10, 11 :
                season = "가을";
                break;
            case 12, 1, 2 :
                season = "겨울";
                break;
            default:
                season = "에러";
        }
        System.out.println(season);

        rate = 0;
        message = "";

        Scanner scanner = new Scanner(System.in);
        System.out.println("점수를 입력하세요 : ");
        score = scanner.nextInt();  // 숫자값을 입력받는다.

        if(score > 90) rate = 1;
        else if (score > 80) rate = 2;
        else if (score > 70) rate = 3;
        else rate = 4;

        switch (rate) {
            case 1 :
                message = "아주 훌륭합니다.";
                break;
            case 2 :
                message = "참 잘 했어요.";
                break;
            case 3 :
                message = "좋습니다.";
                break;
            default:
                message = "분발하세요.";
        }
        System.out.println(message);
    }


}
