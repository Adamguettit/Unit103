//Created by: Adam Guettit
//Created on: Feb 23
// Unit 1-03
// Mr. Coxall (ICS4U)

// This program converts mass to energy jules and kiloton bomb. 

import java.util.Scanner;

class Energy {

  public static void main(String[]args) {

    //Getting user input.
    Scanner userInput = new Scanner(System.in);
    System.out.print("Enter mass of ypur object in kg: ");

    double mass = userInput.nextDouble();
    userInput.close();

    try {

      if (mass >= 0) {
        // Light speed formula.
        double lightSpeed = 2.998 * Math.pow(10,8);
        double bomb = 4.2 * Math.pow(10,12);

        userInput.close();

        double energy = mass * Math.pow(lightSpeed,2);
        double kiloton = energy / bomb; 

        System.out.println(" " + mass + " kg of mass in energy is " + energy + " joules.");
        System.out.println(" " + mass + " kg of mass is also " + kiloton + " kiloton bomb.");

      } else {
        System.out.println("Mass can't be negative");
      }

    } catch (NumberFormatException nfe) {
      System.err.println("Invalid input, please make sure it's a number.");
    }
  }
}
