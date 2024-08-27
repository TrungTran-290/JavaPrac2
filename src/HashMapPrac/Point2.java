package HashMapPrac;

import java.util.Objects;

public class Point2 {
    protected String obj1;
    protected Integer obj2;

    public Point2(String obj1, Integer obj2) {
        this.obj1 = obj1;
        this.obj2 = obj2;
    }

    public String getObj1() {
        return obj1;
    }

    public void setObj1(String obj1) {
        this.obj1 = obj1;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Point2 point2 = (Point2) o;
        return Objects.equals(obj1, point2.obj1) && Objects.equals(obj2, point2.obj2);
    }

    @Override
    public int hashCode() {
        return Objects.hash(obj1, obj2);
    }
    @Override
    public String toString(){
        return "Person{Name= "+ obj1+" Age= "+ obj2+"}";
    }
}
