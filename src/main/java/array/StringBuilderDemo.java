package array;


public class StringBuilderDemo {
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder();

        System.out.println("string = " + sb.toString());
        System.out.println("length of string = "  + sb.length());
        System.out.println("capacity of sb = " + sb.capacity());

        sb.append("Mani ");
        sb.append("Ahmadi Arsham");

        System.out.println("string inside = " + sb.toString());
        System.out.println("length of = "  + sb.length());
        System.out.println("capacity of sb = " + sb.capacity());
    }
}
