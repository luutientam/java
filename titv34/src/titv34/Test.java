package titv34;

public class Test {

    public static void main(String[] args) {
        MyDate md1 = new MyDate(15, 5, 2025);
        MyDate md2 = new MyDate(11, 1, 2021);
        MyDate md3 = new MyDate(30, 3, 2030);

        System.out.println(md1); // 15/5/2021
        System.out.println(md2);
        System.out.println(md3);
        System.out.println("hash code : " + md1.hashCode());
        System.out.println("hash code : " + md2.hashCode());

        System.out.println("hash code : " + md3.hashCode());

    }
}
