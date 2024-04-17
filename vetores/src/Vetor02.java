public class Vetor02 {
    public static void main(String[] args) {
        String mes[] = {"Jan", "Fev", "Mar", "Abr", "Mai", "Jun", "Jul", "Ago", "Set", "Out", "Nov", "Dez"};
        int tot[] = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};

        for (int cont = 0; cont < mes.length; cont++) {
            System.out.println("O mes: " + mes[cont] + " tem " + tot[cont] + " dias");
        }
    }
}
