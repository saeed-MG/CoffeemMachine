package machine;
public class CoffeeMachine {
    public static void main(String[] args) {
        java.util.Scanner scanner = new java.util.Scanner(System.in);
        boolean b = true;
        while (b) {
            System.out.println("Write action (buy, fill, take, remaining, exit):");
            String input = scanner.next();
            switch (input) {
                case "buy":
                    buy(scanner);
                    break;
                case "fill":
                    try {
                        fill(scanner);
                    } catch (Exception e) {
                        System.out.println("Sorry invalid input!!!\n");
                        break;
                    }
                    break;
                case "take":
                    take();
                    break;
                case "remaining":
                    remaining();
                    break;
                case "exit":
                    b = false;
                    break;
                default:
                    System.out.println("Sorry invalid input!!!\n");
                    break;
            }
        }

    }
    // Stage 5/6: Keep track of the supplies
    // work endlessly to make coffee for all interested persons until the shutdown signal is given

    static int water = 400;
    static int milk = 540;
    static int coffeeBeans = 120;
    static int cups = 9;
    static int money = 550;

    private static void buy(java.util.Scanner scanner) {
        System.out.println("\nWhat do you want to buy? 1 - espresso, 2 - latte, 3 - cappuccino, back - to main menu:");
        String buy = scanner.next();
        switch (buy) {
            case "1":
                espresso();
                break;
            case "2":
                latte(350, 75, 20, 7, 75);
                break;
            case "3":
                cappuccino(200, 100, 12, 6, 200);
                break;
            case "back":
                System.out.println();
                break;
            default:
                System.out.println("Sorry invalid input!!!\n");
                break;
        }
    }

    private static void remaining() {
        System.out.println("\nThe coffee machine has:\n" + water + " of water");
        System.out.println(milk + " of milk\n" + coffeeBeans + " of coffee beans");
        System.out.println(cups + " of disposable cups\n$" + money + " of money\n");
    }

    private static void take() {
        System.out.println("I gave you $" + money + "\n");
        money -= money;
    }

    private static void fill(java.util.Scanner scanner) {
        System.out.println("\nWrite how many ml of water do you want to add:");
        water = water + scanner.nextInt();
        System.out.println("Write how many ml of milk do you want to add:");
        milk = milk + scanner.nextInt();
        System.out.println("Write how many grams of coffee beans do you want to add:");
        coffeeBeans = coffeeBeans + scanner.nextInt();
        System.out.println("Write how many disposable cups of coffee do you want to add:");
        cups = cups + scanner.nextInt();
        System.out.println();
    }

    private static void cappuccino(int i, int i2, int i3, int i4, int i5) {
        if (water >= i && milk >= i2 && coffeeBeans >= i3 && cups >= 1) {
            water = water - i;
            milk = milk - i2;
            coffeeBeans = coffeeBeans - i3;
            cups = cups - 1;
            money = money + i4;
            System.out.println("I have enough resources, making you a coffee!\n");
        } else if (water < i && milk < i2 && coffeeBeans < i3) {
            System.out.println("Sorry, not enough water, milk and coffee beans!\n");
        } else if (water < i && milk < i2 && cups < 1) {
            System.out.println("Sorry, not enough water, milk, cups!\n");
        } else if (water < i && coffeeBeans < i3 && cups < 1) {
            System.out.println("Sorry, not enough water, coffee beans and cups!\n");
        } else if (milk < i5 && coffeeBeans < i3 && cups < 1) {
            System.out.println("Sorry, not enough milk, coffee beans and cups!\n");
        } else if (water < i && milk < i2) {
            System.out.println("Sorry, not enough water and milk!\n");
        } else if (water < i && coffeeBeans < i3) {
            System.out.println("Sorry, not enough water and coffee beans!\n");
        } else if (water < i && cups < 1) {
            System.out.println("Sorry, not enough water and cups!\n");
        } else if (milk < i2 && coffeeBeans < i3) {
            System.out.println("Sorry, not enough milk and coffee beans!\n");
        } else if (coffeeBeans < i3 && cups < 1) {
            System.out.println("Sorry, not enough coffee beans and cups!\n");
        } else if (milk < i2 && cups < 1) {
            System.out.println("Sorry, not enough milk and cups!\n");
        } else if (water < i) {
            System.out.println("Sorry, not enough water!\n");
        } else if (milk < i2) {
            System.out.println("Sorry, not enough milk!\n");
        } else if (coffeeBeans < i3) {
            System.out.println("Sorry, not enough coffee beans!\n");
        } else if (cups == 0) {
            System.out.println("Sorry, not enough cups!\n");
        } else {
            System.out.println("Sorry, not enough water, milk, coffee beans and cups!\n");
        }
    }

    private static void latte(int i, int i2, int i3, int i4, int i5) {
        if (water >= i && milk >= i2 && coffeeBeans >= i3 && cups >= 1) {
            water = water - i;
            milk = milk - i2;
            coffeeBeans = coffeeBeans - i3;
            cups = cups - 1;
            money = money + i4;
            System.out.println("I have enough resources, making you a coffee!\n");
        } else if (water < i && milk < i2 && coffeeBeans < i3) {
            System.out.println("Sorry, not enough water, milk and coffee beans!\n");
        } else if (water < i && milk < i2 && cups < 1) {
            System.out.println("Sorry, not enough water, milk, cups!\n");
        } else if (water < i && coffeeBeans < i3 && cups < 1) {
            System.out.println("Sorry, not enough water, coffee beans and cups!\n");
        } else if (milk < i5 && coffeeBeans < i3 && cups < 1) {
            System.out.println("Sorry, not enough milk, coffee beans and cups!\n");
        } else if (water < i && milk < i2) {
            System.out.println("Sorry, not enough water and milk!\n");
        } else if (water < i && coffeeBeans < i3) {
            System.out.println("Sorry, not enough water and coffee beans!\n");
        } else if (water < i && cups < 1) {
            System.out.println("Sorry, not enough water and cups!\n");
        } else if (milk < i2 && coffeeBeans < i3) {
            System.out.println("Sorry, not enough milk and coffee beans!\n");
        } else if (coffeeBeans < i3 && cups < 1) {
            System.out.println("Sorry, not enough coffee beans and cups!\n");
        } else if (milk < i2 && cups < 1) {
            System.out.println("Sorry, not enough milk and cups!\n");
        } else if (water < i) {
            System.out.println("Sorry, not enough water!\n");
        } else if (milk < i2) {
            System.out.println("Sorry, not enough milk!\n");
        } else if (coffeeBeans < i3) {
            System.out.println("Sorry, not enough coffee beans!\n");
        } else if (cups == 0) {
            System.out.println("Sorry, not enough cups!\n");
        } else {
            System.out.println("Sorry, not enough water, milk, coffee beans and cups!\n");
        }
    }

    private static void espresso() {
        if (water >= 250 && coffeeBeans >= 16 && cups >= 1) {
            water = water - 250;
            coffeeBeans = coffeeBeans - 16;
            cups = cups - 1;
            money = money + 4;
            System.out.println("I have enough resources, making you a coffee!\n");
        } else if (water < 250 && coffeeBeans < 16) {
            System.out.println("Sorry, not enough water and coffee beans!\n");
        } else if (water < 250 && cups < 1) {
            System.out.println("Sorry, not enough water and cups!\n");
        } else if (coffeeBeans < 16 && cups < 1) {
            System.out.println("Sorry, not enough coffee beans and cups!\n");
        } else if (water < 250) {
            System.out.println("Sorry, not enough water!\n");
        } else if (coffeeBeans < 16) {
            System.out.println("Sorry, not enough coffee beans!\n");
        } else if (cups == 0) {
            System.out.println("Sorry, not enough cups!");
        } else {
            System.out.println("Sorry, not enough water, coffee beans and cups!\n");
        }
    }
}
