import java.util.Scanner;

public class PaymentReceipt {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		String item1, item2;
        int quantity1, quantity2;
        double price1, price2;
        double amount1, amount2;
        double subtotal, governmentTax, serviceCharge, total;
        
        System.out.print("Enter first item name: ");
        item1 = input.nextLine();

        System.out.print("Enter quantity for first item: ");
        quantity1 = input.nextInt();

        System.out.print("Enter unit price for first item: ");
        price1 = input.nextDouble();

        input.nextLine();
        
        System.out.print("Enter second item name: ");
        item2 = input.nextLine();

        System.out.print("Enter quantity for second item: ");
        quantity2 = input.nextInt();

        System.out.print("Enter unit price for second item: ");
        price2 = input.nextDouble();

        amount1 = quantity1 * price1;
        amount2 = quantity2 * price2;

        subtotal = amount1 + amount2;
        governmentTax = subtotal * 0.06;
        serviceCharge = subtotal * 0.10;
        total = subtotal + governmentTax + serviceCharge;
        

System.out.println("\n===== PAYMENT RECEIPT =====");

System.out.println("Item 1: " + item1);
System.out.println("Quantity: " + quantity1);
System.out.printf("Unit Price: RM%.2f%n", price1);
System.out.printf("Amount: RM%.2f%n", amount1);

System.out.println();

System.out.println("Item 2: " + item2);
System.out.println("Quantity: " + quantity2);
System.out.printf("Unit Price: RM%.2f%n", price2);
System.out.printf("Amount: RM%.2f%n", amount2);

System.out.println("----------------------------");
System.out.printf("Subtotal: RM%.2f%n", subtotal);
System.out.printf("Government Tax: RM%.2f%n", governmentTax);
System.out.printf("Service Charge: RM%.2f%n", serviceCharge);
System.out.printf("Total Payment: RM%.2f%n", total);

input.close();

	}
	
}
