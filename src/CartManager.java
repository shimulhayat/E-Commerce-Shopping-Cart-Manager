import java.util.Scanner;

public class CartManager {

    public static void main(String[] args) {

        CartItem eggs = new CartItem("Eggs", 10, 0);
        CartItem milk = new CartItem("Milk", 20, 0);
        CartItem noodles = new CartItem("Noodles", 30, 0);

        Scanner sc = new Scanner(System.in);

        while (true) {
            System.out.println("\n===== SHOPPING CART MENU =====");
            System.out.println("1. Add Eggs");
            System.out.println("2. Add Milk");
            System.out.println("3. Add Noodles");
            System.out.println("4. Increment an Item");
            System.out.println("5. Decrement an Item");
            System.out.println("6. Print Cart");
            System.out.println("7. Print Total");
            System.out.println("8. Exit");
            System.out.print("Enter your choice: ");

            int choice = sc.nextInt();

            if (choice == 1) {
                eggs.incrementQuantity();
                System.out.println("Eggs added.");
            } else if (choice == 2) {
                milk.incrementQuantity();
                System.out.println("Milk added.");
            } else if (choice == 3) {
                noodles.incrementQuantity();
                System.out.println("Noodles added.");
            } else if (choice == 4) {
                System.out.println("1. Eggs 2. Milk 3. Noodles");
                System.out.print("Select item to increment: ");
                int s = sc.nextInt();

                if (s == 1) eggs.incrementQuantity();
                else if (s == 2) milk.incrementQuantity();
                else if (s == 3) noodles.incrementQuantity();

            } else if (choice == 5) {
                System.out.println("1. Eggs 2. Milk 3. Noodles");
                System.out.print("Select item to decrement: ");
                int s = sc.nextInt();

                if (s == 1) eggs.decrementQuantity();
                else if (s == 2) milk.decrementQuantity();
                else if (s == 3) noodles.decrementQuantity();

            } else if (choice == 6) {
                System.out.println("\n--- CART ITEMS ---");
                if (eggs.getQuantity() > 0)
                    System.out.println("Eggs: " + eggs.getQuantity() + " Total: " + eggs.getLineTotal());

                if (milk.getQuantity() > 0)
                    System.out.println("Milk: " + milk.getQuantity() + " Total: " + milk.getLineTotal());

                if (noodles.getQuantity() > 0)
                    System.out.println("Noodles: " + noodles.getQuantity() + " Total: " + noodles.getLineTotal());

            } else if (choice == 7) {

                int total = eggs.getLineTotal() + milk.getLineTotal() + noodles.getLineTotal();
                System.out.println("Total payable: " + total);

            } else if (choice == 8) {
                System.out.println("Thank you!");
                break;
            } else {
                System.out.println("Invalid choice.");
            }
        }

        sc.close();
    }
}
