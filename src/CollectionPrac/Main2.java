package CollectionPrac;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;

public class Main2 {
    public static void main(String[] args){
        ArrayList<String> colors = new ArrayList<>();
        colors.add("Red");
        colors.add("Green");
        colors.add("Blue");
        System.out.println(colors.get(1));

        colors.set(1, "Red");
        System.out.println(colors.get(1));

        colors.remove("Red");
        System.out.println(colors);

        colors.remove(1);
        System.out.println(colors);

        colors.add("Red");
        colors.add("Green");
        colors.add("Blue");

        for (String i:colors){
            System.out.println(i);
        }

        String[] arr = {"red","green","blue"};


        ArrayList<String> arrColors =  new ArrayList<>(Arrays.asList(arr));

        Collections.sort(arrColors);

//        Collections.sort(arrColors,(s1,s2)->s1.compareTo(s2));
        System.out.println(arrColors);
                Long x =  1000l;
                Long y = -1000l;
        int X=Long.compare(x, y);
        if (X==1){
            System.out.println("True");
        }else {
            System.out.println("False");
        }
        System.out.println(Long.compareUnsigned(x, y)==0?"TRUE":"FALSE");
//    ArrayList<Point> points = new ArrayList<>();
//    points.add(new Point(1,2));
//    points.add(new Point(1,3));
//    points.add(new Point(2,3));
//        Comparator<Point> x_y_compare = new Comparator<Point>() {
//            @Override
//            public int compare(Point o1, Point o2) {
//                int temp=  Integer.compare(o1.getX(), o2.getX());
//                if (temp == 0){
//                   return Integer.compare(o1.getY(), o2.getY());
//                }
//                return temp;
//            }
//        };
//        Collections.sort(points, x_y_compare);
//        for (Point p: points){
//            System.out.println(p);
//        }
        System.out.println("-================================================-");
        ArrayList<Point> points = new ArrayList<>();
        points.add(new Point(3,5));
        points.add(new Point(2,6));
        points.add(new Point(5,2));
        points.add(new Point(6,0));

        System.out.println("-================================================-");
        Predicate<Point> Sumpoint = point -> point.getX() +point.getY()>7;
        Predicate<Point> Sumpoint2 = point -> {
            if (point.getX()>5){
                return point.getX() + point.getY()>7;
            }
            else {
                return point.getX() + point.getY()>6;
            }
        };
        System.out.println("Sumpoint2");
        for (Point i : points){
            if (Sumpoint2.test(i)){
                System.out.println(i);
            }
        }
        Function<Point,Integer> Sumpoint3 = point -> point.getX() + point.getY();
        Function<Point,Integer> Sumpoint4 = point -> {
            return point.getX() > point.getY()? point.getY() - point.getX(): point.getY()+ point.getX();
        };
        System.out.println("Sumpoint3");
        for (Point i: points){
            System.out.println(Sumpoint3.apply(i));
        }
        System.out.println("Sumpoint4");
        for (Point i: points){
            System.out.println(Sumpoint4.apply(i));
        }
        System.out.println("Consumer");
        Consumer<Point> printMessage = point -> {
            if (point.getX()>point.getY()){
                System.out.println(point.getY() - point.getX());
            }
            else {
                System.out.println(point.getX() - point.getY());
            }

        };
        for (Point i : points){
            printMessage.accept(i);
        }
        System.out.println("Stream");
        points.stream()
                .filter(point -> point.getX()>3)
                .forEach(System.out::println);
        System.out.println("not Stream test");
        for (Point i:points){
            if(i.getX()>3){
                System.out.println(i);
            }
        }
        System.out.println("/=====Predicate=====/");
        Predicate<Point> predicate = point -> point.getX() >3;
        for (Point i: points){
            if (predicate.test(i)){
                System.out.println(i);
            }
        }
    }
}
