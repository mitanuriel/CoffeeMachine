import java.util.Scanner;

public class Main {
    private static int water = 400;
    private static int milk = 540;
    private static int beans = 120;
    private static int cups = 9;
    private static int money = 550;

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

         new Main().run();

         printCoffeeMachineState();


    }

    public static void run(){
        Scanner scanner = new Scanner(System.in);

        printCoffeeMachineState();

        System.out.println("Write action (buy, fill, take): ");
        String action = scanner.nextLine();

        switch (action){
            case "buy":
                buyCoffee(scanner);
                break;
            case "fill":
                fillSupplies(scanner);
                break;
            case "take":
                takeMoney();
                break;
        }



        }

    private static void printCoffeeMachineState(){
        System.out.println("The coffee machine has: ");
        System.out.println(water + " ml of water ");
        System.out.println(milk + " ml of milk ");
        System.out.println(beans + " g of coffee beans ");
        System.out.println(cups + " disposable cups ");
        System.out.println("$" + money + " of money ");
    }

    private static void buyCoffee(Scanner scanner){
        System.out.println("What do you want to buy? 1 - espresso, 2 - latte, 3 - cappuccino");

        int choice = scanner. nextInt();
        makeCoffee(choice);

    }

    private static void makeCoffee(int choice){
        int waterNeeded = 0, milkNeeded = 0, beansNeeded = 0, cost = 0;

        switch(choice){
            case 1:
                waterNeeded = 250;
                beansNeeded = 16;
                cost = 4;
                break;
            case 2:
                waterNeeded = 350;
                milkNeeded = 75;
                beansNeeded = 20;
                cost = 7;
                break;
            case 3:
                waterNeeded = 200;
                milkNeeded = 100;
                beansNeeded = 12;
                cost = 6;
                break;

        }
        if(water >= waterNeeded && milk >= milkNeeded && beans >= beansNeeded && cups >= 1 ){
            water -= waterNeeded;
            milk -= milkNeeded;
            beans -= beansNeeded;
            money += cost;
            cups--;

        }



    }
    private static void fillSupplies(Scanner scanner){
        System.out.println("How much water do you need?");
        int addedWater = scanner.nextInt();
        System.out.println("How much milk do you need?");
        int addedMilk = scanner.nextInt();
        System.out.println("How much coffee beans do you need?");
        int addedBeans = scanner.nextInt();
        System.out.println("How many cups do you need?");
        int addedCups = scanner.nextInt();

        water += addedWater;
        milk += addedMilk;
        beans += addedBeans;
        cups += addedCups;
    }

    private static void takeMoney(){
        System.out.println("I gave you $" + money);
        money = 0;

    }

}


