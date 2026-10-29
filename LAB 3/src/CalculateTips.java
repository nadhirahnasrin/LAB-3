import java.util.Scanner;

public class CalculateTips {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		double subtotal, gratuityRate;
        double gratuity, total;
        
        System.out.print("Enter the subtotal and a gratuity rate: ");
        subtotal = input.nextDouble();
        gratuityRate = input.nextDouble();

        gratuity = subtotal * gratuityRate / 100;
        total = subtotal + gratuity;

        System.out.printf("The gratuity is $%.2f and total is $%.2f%n",
                gratuity, total);

        input.close();
    }
	
	
	
}
