package pizzaAssignment;

import java.util.Scanner;

public class OrderPizza {
	Scanner sc = new Scanner(System.in);
	String size;
	String topping;
	String choice;
	int totalPrice;
	int smallPizzaPrice = 15;
	int mediumPizzaPrice = 20;
	int largePizzaPrice = 25;
	int additionalToppingPepSmall = 2;
	int additionalToppingPepMedLarge = 3;
	int extraCheese = 1;

	void pizzaOrder() {
		System.out.println(" What pizza size would you like to order ? ");
		size = sc.next();
		switch (size) {
		case "Small":

			System.out.println("Would you like to add any additional topping");
			choice = sc.next();
			if (choice.equals("Yes")) {
				System.out.println(" would you like to add peproni ,cheese or Both");
				topping = sc.next();
				switch (topping) {
				case "Peproni":
					totalPrice = smallPizzaPrice + additionalToppingPepSmall;
					System.out.println("The total price is = " + totalPrice + " Enjoy your food ");
					break;
				case "Cheese":
					totalPrice = smallPizzaPrice + extraCheese;
					System.out.println("The total price is = " + totalPrice + " Enjoy your food ");
					break;
				case "Both":
					totalPrice = smallPizzaPrice + extraCheese + additionalToppingPepSmall;
					System.out.println("The total price is = " + totalPrice + " Enjoy your food ");

					break;
				default:
					System.out.println(" Plese enter correct order ");
					break;

				}
			} else if (choice.equals("No")) {
				System.out.println(" The total price is = " + smallPizzaPrice);
				break;
			}
			break;

		case "Medium":
			System.out.println("Would you like to add any additional topping");
			choice = sc.next();
			if (choice.equals("Yes")) {
				System.out.println(" would you like to add peproni ,cheese or Both");
				topping = sc.next();
				switch (topping) {
				case "Peproni":
					totalPrice = mediumPizzaPrice + additionalToppingPepMedLarge;
					System.out.println("The total price is = " + totalPrice + " Enjoy your food ");
					break;
				case "Cheese":
					totalPrice = mediumPizzaPrice + extraCheese;
					System.out.println("The total price is = " + totalPrice + " Enjoy your food ");
					break;
				case "Both":
					totalPrice = mediumPizzaPrice + extraCheese + additionalToppingPepMedLarge;
					System.out.println("The total price is = " + totalPrice + " Enjoy your food ");

					break;
				default:
					System.out.println(" Plese enter correct order ");
					break;

				}
			} else if (choice.equals("No")) {
				System.out.println(" The total price is = " + mediumPizzaPrice);
				break;
			}
			break;

		case "Large":
			System.out.println("Would you like to add any additional topping");
			choice = sc.next();
			if (choice.equals("Yes")) {

				System.out.println(" would you like to add peproni ,cheese or Both");
				topping = sc.next();
				switch (topping) {
				case "Peproni":
					totalPrice = largePizzaPrice + additionalToppingPepMedLarge;
					System.out.println("The total price is = " + totalPrice + " Enjoy your food ");
					break;
				case "Cheese":
					totalPrice = largePizzaPrice + extraCheese;
					System.out.println("The total price is = " + totalPrice + " Enjoy your food ");
					break;
				case "Both":
					totalPrice = largePizzaPrice + extraCheese + additionalToppingPepMedLarge;
					;
					System.out.println("The total price is = " + totalPrice + " Enjoy your food ");

					break;

				default:
					System.out.println(" Plese enter correct order ");
					break;
				}
			} else if (choice.equals("No")) {
				System.out.println(" The total price is = " + largePizzaPrice);
				break;
			}
			break;

		default:
			System.out.println("Plese enter correct order");
			break;
		}

	}

}
