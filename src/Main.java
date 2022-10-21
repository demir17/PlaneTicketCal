import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int distance, age, tripType;

        System.out.println("Please enter your destination distance: ");
        distance = sc.nextInt();
        System.out.println("Please enter your age: ");
        age = sc.nextInt();
        System.out.println("Please choose your trip type.\n" +
                "1. One way ticket\n" +
                "2. Two way ticket");
        tripType = sc.nextInt();

        double distanceCost = distance * 0.10;
        double ageDiscount;
        double typeTwoDiscount;
        double totalCost;
        if ((distance > 0 && age >= 0) && (tripType == 1 || tripType == 2)){

            if(age < 12){
                ageDiscount = distanceCost * 0.50;
                distanceCost = distanceCost - ageDiscount;
                if(tripType == 2){
                    typeTwoDiscount = distanceCost * 0.20;
                    distanceCost = distanceCost - typeTwoDiscount;
                    totalCost = distanceCost * 2;
                    System.out.println("You have to pay : " + totalCost + "TL");
                }
                else {
                    totalCost = distanceCost;
                    System.out.println("You have to pay : " + totalCost + "TL");
                }

            }

            if(age >= 12 && age <= 24){
                ageDiscount = distanceCost * 0.10;
                distanceCost = distanceCost - ageDiscount;
                if(tripType == 2){
                    typeTwoDiscount = distanceCost * 0.20;
                    distanceCost = distanceCost - typeTwoDiscount;
                    totalCost = distanceCost * 2;
                    System.out.println("You have to pay : " + totalCost + "TL");
                }
                else {
                    totalCost = distanceCost;
                    System.out.println("You have to pay : " + totalCost + "TL");
                }

            }

            if(age > 24 && age < 65){
                ageDiscount = distanceCost * 1;
                distanceCost = distanceCost - ageDiscount;
                if(tripType == 2){
                    typeTwoDiscount = distanceCost * 0.20;
                    distanceCost = distanceCost - typeTwoDiscount;
                    totalCost = distanceCost * 2;
                    System.out.println("You have to pay : " + totalCost + "TL");
                }
                else {
                    totalCost = distanceCost;
                    System.out.println("You have to pay : " + totalCost + "TL");
                }

            }

            if(age >= 65){
                ageDiscount = distanceCost * 0.30;
                distanceCost = distanceCost - ageDiscount;
                if(tripType == 2){
                    typeTwoDiscount = distanceCost * 0.20;
                    distanceCost = distanceCost - typeTwoDiscount;
                    totalCost = distanceCost * 2;
                    System.out.println("You have to pay : " + totalCost + "TL");
                }
                else {
                    totalCost = distanceCost;
                    System.out.println("You have to pay : " + totalCost + "TL");
                }

            }




        }
        else {
            System.out.println("You entered wrong data.");
        }
    }
}
