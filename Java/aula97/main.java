package aula97;

// laço for each

public class main {
    public static void main(String[] args) {

        String[] vect = new String[] { "Maria", "Bob", "Alex" };

        for (int i = 0; i < vect.length; i++) {
            System.out.println(vect[i]);
        }

        for (String obj : vect) {
            System.out.println(vect);
        }
    }
}
