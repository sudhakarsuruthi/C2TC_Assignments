package Assignment4;

import java.util.Scanner;

public class Main {
 public static void main(String[] args) {
     Scanner sc = new Scanner(System.in);

     // Input choice
     int choice = sc.nextInt();
     int hours = sc.nextInt();
     double costPerHour = sc.nextDouble();

     Airfare airfare = null;

     // Create object based on user choice
     switch (choice) {
         case 1:
             airfare = new AirIndia(hours, costPerHour);
             break;
         case 2:
             airfare = new KingFisher(hours, costPerHour);
             break;
         case 3:
             airfare = new Indigo(hours, costPerHour);
             break;
         default:
             System.out.println("Invalid choice!");
             sc.close();
             return;
     }

     // Display result
     airfare.display();
     sc.close();
 }
}