class student{
    public void id(String n, int r){
        System.out.println(n+"\n"+r+"\n");
    }
}
public class createObj {
    public static void main(String[] args) {
        student s = new student();
        s.id("Harshit",25589);
        s.id("Nishant", 25622);
        s.id("Mani", 25586);
        s.id("Kaushal", 25623);
        s.id("Rahul", 25625);
    }
}
