package application;

import java.util.Locale;
import java.util.Scanner;

import entites.Product;

public class Program {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		Product product = new Product();
		
		System.out.println("Enter Product data");
		System.out.print("Name: ");
		product.name=sc.nextLine();
		System.out.print("Price: ");
		product.price=sc.nextDouble();
		System.out.print("Quantity: ");
		product.quantity=sc.nextInt();
		
		
		System.out.printf("Product data : "+product.name+" , "+"$ "+product.price+" , "+product.quantity+" Units"+" , "+"Total: $"+product.TotalValueStock());
        System.out.println();
		System.out.print("Enter the number of products added in Stock: ");
        int n = sc.nextInt();
        product.addProduct(n);
        System.out.print("Updated data : " + product.name+ " , "+"$ "+ product.price+" , "+product.quantity+" Units "+" , Total:"+" $ "+product.TotalValueStock());
        System.out.println();
        System.out.print("Enter the number of products removed in Stock: ");
        int x = sc.nextInt();
        product.removeProduct(x);
        System.out.print("Updated data :"  + product.name+ " , " + "$ "+ product.price+" , "+product.quantity+ "Units" +  ", Total: "+" $ "+product.TotalValueStock());
		sc.close();
	}

}
