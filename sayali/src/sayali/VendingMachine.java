package sayali;

import java.util.Scanner;

public class VendingMachine {
	private static Scanner product;
	private static int change;
	private static Scanner product2;

	public static void main(String[] args) {
	    int Product = runMenu();
	    double Price = retrievePrice(Product);
	    setChange(moneyInserted(Price));
}

public static int runMenu(){
    product = new Scanner(System.in);
    int choice = 0 ;
    System.out.println("\n\nPlease enter your selection:"
                + "\n1: Choclate \t 10"
                + "\n2: ColdDrink \t 20"
                + "\n3: Biscuits \t 6.5"
                + "\n4: Exit ");
    choice = product.nextInt();
    return choice;        
}

public static double retrievePrice(int menuChoice){
    if (menuChoice == 1)
        return 10;
    if (menuChoice == 2)
        return 20;
    if (menuChoice == 3)
        return 6.5;
    else return 0;
}

public static int moneyInserted(double price){
    product2 = new Scanner(System.in);
    int money = 0;
    System.out.println("Your item costs: " + price + " \n3Please enter the amount of money:");
    money = product2.nextInt();
    while (money < price){
        System.out.println("Please insert sufficient funds");
        money = money + product2.nextInt();
    }
    return (int) (money - price) ;
}

public static void changeOut(int change){
    int quarters = 0;
    int dimes = 0;
    int nickels = 0;
    while (change >= 25){
        quarters = quarters + 1;
        change = change - 25;
    }
    while (change >= 10){
        nickels = dimes + 1;
        change = change - 10;
        while (change >= 5){
            nickels = nickels + 1;
            change = change - 5;
        }
    }
}

public static int getChange() {
	return change;
}

public static void setChange(int change) {
	VendingMachine.change = change;
}
}