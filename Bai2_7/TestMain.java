package Bai2.Bai2_7;

public class TestMain {
    public static void main(String[] args) {
        MyLine l1 = new MyLine(0, 0, 3, 4);
        System.out.println(l1); // toString()
        System.out.println("Length is: " + l1.getLength());
        System.out.println("Gradient is: " + l1.getGradient());

        l1.setBegin(new MyPoint(1, 1));
        l1.setEnd(new MyPoint(4, 5));
        System.out.println("New Begin is: " + l1.getBegin());
        System.out.println("New End is: " + l1.getEnd());
        System.out.println("New Length is: " + l1.getLength());
    }
}