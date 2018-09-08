package in.sample.java.string;

public class StringDemo {
    public static void main(String[] args) {
        String a = "Pradeep";
        String b = new String("Pradeep");
        String c = new String("Pradeep");

        if (a == b) {
            System.out.println("a==b");
        } else {
            System.out.println("not a==b");
        }

        if (a.equals(b)) {
            System.out.println("a.equals(b)");
        } else {
            System.out.println("not a.equals(b)");
        }

        if (a == c) {
            System.out.println("a==c");
        } else {
            System.out.println("not a==c");
        }

        if (a.equals(c)) {
            System.out.println("a.equals(c)");
        } else {
            System.out.println("not a.equals(c)");
        }
    }
}
