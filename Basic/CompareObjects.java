
public class CompareObjects {
    //objects in java can be compared using equals() funciton
    public static void main(String[] args) {
        Object obj1 = new Object();
        Object obj2 = new Object();
        //comparing obj1 and obj2
        System.out.println(obj1.equals(obj2));
        Object obj3 = obj1;
        //comparing obj3 and obj1
        System.out.println(obj3.equals(obj1));
    }
}
