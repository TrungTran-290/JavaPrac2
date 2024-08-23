package CollectionPrac;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main4 {
    public static void test_stream(){
        List<Point> points = new ArrayList<>();
        points.add(new Point(7,2));
        points.add(new Point(3,4));
        points.add(new Point(2,6));
        points.add(new Point(7,1));
        int totalSum = points.stream()
                .flatMapToInt(point -> Arrays.stream(new int[]{point.getX(), point.getY()}))
                .sum();

        int sumX = points.stream()
                .mapToInt(Point::getX)
                .sum();
        System.out.println("Sum2: " + sumX);

        int sumX_ver2 = points.stream()
                .filter(point -> point.getX() >3)
                .mapToInt(Point::getX)
                .sum();
        System.out.println("Sum2: " + sumX_ver2);

        int sum3 = points.stream()
                .filter(point -> point.getX()>5)
                .mapToInt(point->{
                    return point.getX()* point.getX()+1-point.getY();
                })
                .sum();
        System.out.println("Sum2: " + sum3);

        System.out.println("--------");
        points.stream()
                .filter(point->point.getX() >4)
                .mapToInt( point ->{return point.getX()*point.getX()+1-point.getY();})
                .forEach(System.out::println);
        System.out.println("--------");

        long total5 = points.stream()
                .mapToLong(point->{return point.getX()* point.getX() -1 + point.getY();})
                .reduce(1l, (a,b)->a*b);
        System.out.println("Ketqua: "+total5);

        System.out.println("*---------*");
        double totalProduct = points.stream()
                .mapToDouble(point -> point.getX()* point.getX() -1 * point.getY())
                .reduce(1.0,(a,b)->a*b);
        System.out.println("Total: "+totalProduct);
        System.out.println("*---------*");

        long totalFinal = points.stream()
                .mapToInt(point->
                {
                   return point.getX()+ point.getY();
                }
                )
                .sum();
        System.out.println("Res: "+totalFinal);
        int vd = points.stream()
                .reduce(0,(res,point)-> res +point.getX() +point.getY(), Integer::sum);
        System.out.println("RESULT for vd: "+ vd);
        int vd2 = points.stream()
                .map(point -> point.getY() +point.getX())
                .reduce(0, (res,value) -> res + value);
        System.out.println("RESULT: "+ vd2);
    }
    public static void main(String[] args){
        test_stream();
    }
}
