import java.util.Scanner;

public class IT26300636Lab3Q1B{
	
	public static void main(String[] args){
	Scanner scanner = new Scanner(System.in);
	
	//price per kg
	System.out.print("Enter The Price Of 1 Kg rice: ");
	double pricePerKg = scanner.nextDouble();
	
	System.out.print("Enter the number of kilograme you want to buy: ");
	double quantity = scanner.nextDouble();
	
	//calculate totalAmount
	double totalAmount = pricePerKg * quantity;
	System.out.print("The total amount is: " + totalAmount );
	double totalAmount = scanner.nextDouble();
	
	//calculate TotalAmount
	double TotalAmount = totalAmount * 0.90;
	System.out.println("The total amount with 10% discount: " + TotalAmount);
	
	scanner.close();
	
	}
	
}