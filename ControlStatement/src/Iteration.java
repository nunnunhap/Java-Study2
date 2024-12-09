import java.util.Scanner;

public class Iteration {
    public static void main(String[] arg) {

        int i = 0;
        while(i < 5) {
            System.out.println("당신을 사랑합니다.");
            i++;
        }

        int [] values = {60, 50, 30, 80, 90};
        int index = 0;
        int sum = 0;

        while (index < values.length) {
            var value = values[index];
            sum += value;
            System.out.println("값 : " + value);
            index++;
        }
        System.out.println("합계 : " + sum);

        i = 0;
        do {
            System.out.println("당신을 사랑합니다.");
            ++i;
        } while (i < 5);
        
        for(i = 0; i < 5; i++) {
            System.out.println("사랑사랑");
        }

        sum = 0;
        for (var value : values) {
            sum += value;
            System.out.println("값 : " + value);
        }
        System.out.println("합계 : " + sum);

        int [] aveTemp = {-4, -1, 4, 11, 17, 21, 24, 25, 20, 13, 6, -1};

        sum = 0;
        for(i =0; i < aveTemp.length; i++) {
            sum += aveTemp[i];
        }
        var average = sum / aveTemp.length;
        System.out.println("평균 : " + average);

    }
}
