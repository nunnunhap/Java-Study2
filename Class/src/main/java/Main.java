import geometry.Point;

public class Main {
    public static void main(String[] args) {

        Point point = new Point(3, 4);
        Point point1 = new Point(100, 200);
        Point point2 = new Point(100, 200);

        point.setX(10);
        point.setY(20);

        int x = point.getX();
        int y = point.getY();

        System.out.println(x + y);

        if(point1 == point2) {
            System.out.println("point1 과 point2는 같다");
        }else {
            System.out.println("둘은 다르다."); // 둘은 서로 다른 객체이기 때문에 해당 내용 출력.
        }



    }
}
