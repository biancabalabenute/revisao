package application;

import model.entities.Reservation;
import model.exceptions.DomainException;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");

        try {
            System.out.print("Numero do quarto: ");
            int number = sc.nextInt();
            System.out.print("Check-in (DD/MM/YYYY): ");
            Date checkin = sdf.parse(sc.next());
            System.out.print("Check-out (DD/MM/YYYY): ");
            Date checkout = sdf.parse(sc.next());

            Reservation reservation = new Reservation(number, checkin, checkout);
            System.out.println("Reserva: " + reservation);

            System.out.println("\nEntre com os dados para a atualização: ");
            System.out.print("Check-in (DD/MM/YYYY): ");
            checkin = sdf.parse(sc.next());
            System.out.print("Check-out (DD/MM/YYYY): ");
            checkout = sdf.parse(sc.next());

            reservation.updateDates(checkin, checkout);
            System.out.println("Reserva: " + reservation);
        } catch (ParseException e) {
            System.out.println("Formto de data invalido!");
        } catch (DomainException e) {
            System.out.println("Erro na reserva: " + e.getMessage());
        } catch (RuntimeException e) {
            System.out.println("Erro inesperado");
        }

        sc.close();
    }
}
