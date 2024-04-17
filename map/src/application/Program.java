package application;

import java.util.Map;
import java.util.TreeMap;

public class Program {
    public static void main(String[] args) {

        Map<String, String> cookies = new TreeMap<>();

        cookies.put("username", "José");
        cookies.put("email", "jose@gmail.com");
        cookies.put("phone", "99112221");

        cookies.remove("email");
        cookies.put("phone", "99222333");

        System.out.println("Contem 'phone' key: " + cookies.containsKey("phone"));
        System.out.println("Numero de telefone: " + cookies.get("phone"));
        System.out.println("Email: " + cookies.get("email"));
        System.out.println("Tamanho: " + cookies.size());

        System.out.println("TODOS OS COOKIES:");
        for (String key : cookies.keySet()){
            System.out.println(key + ": " + cookies.get(key));
        }
    }
}
