package aula96;

//aula boxing e anboxing e wrapper class

public class program {
    public static void main(String[] args) {
        int x = 20;

        Object obj = x;

        System.out.println(obj);

        int y = (int) obj;

        System.out.println(obj);
    }
}
