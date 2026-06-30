package javastudies.dataStructures.objectArray.roomRental.application;

import javastudies.dataStructures.objectArray.roomRental.entities.Rent;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("How many rooms will be rented? ");
        int roomsToBeRented = scanner.nextInt();

        Rent[] vect = new Rent[10];

        for (int i = 0; i < roomsToBeRented; i++) {
            scanner.nextLine();
            System.out.println("Rent #" + (i+1));
            System.out.print("Name: ");
            String name = scanner.nextLine();
            System.out.print("Email: ");
            String email = scanner.nextLine();
            System.out.print("Room: ");
            int roomNumber = scanner.nextInt();

            vect[roomNumber] = new Rent(name, email);
        }

        System.out.println("Busy Rooms: ");
        for (int i = 0; i < vect.length; i++) {
            if (vect[i] != null) {
                System.out.println(i + ": " + vect[i]);
            }
        }
        scanner.close();
    }
}
