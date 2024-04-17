package application;

import entities.Client;

public class Program {
    public static void main(String[] args) {
        Client c1 = new Client("José", "jose@gmail.com");
        Client c2 = new Client("José", "jose@gmail.com");

        String t1 = "Test";
        String t2 = "Test";

        System.out.println(c1.hashCode());
        System.out.println(c2.hashCode());
        System.out.println(c1.equals(c2));

        // false pq ta comparando o endereço de memoria em que estão alocados
        System.out.println(c1 == c2);
        // true pq ta comparando o conteudo do object, o texto contido em si
        System.out.println(t1 == t2);
    }
}
