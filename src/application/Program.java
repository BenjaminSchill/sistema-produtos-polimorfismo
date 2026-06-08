package application;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import entities.ImportedProduct;
import entities.Product;
import entities.UsedProduct;

public class Program {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in); 
		
		DateTimeFormatter dtf1 = DateTimeFormatter.ofPattern("dd/MM/yyyy"); 
		
		List<Product> list = new ArrayList<>();
		
		System.out.println("Enter the number of products: ");
		int N = sc.nextInt();
		sc.nextLine();
		
		for (int i = 1; i <= N; i++) { 
			System.out.println("Product #" + i + " data:");
			System.out.println("Common, used or imported (c/u/i)? ");
			char resp = sc.next().toLowerCase().charAt(0); 
			sc.nextLine();
			
			System.out.print("Name: ");
			String name = sc.nextLine(); 
			
			System.out.print("Price: ");
			Double price = sc.nextDouble(); 
			sc.nextLine(); 
			
			if (resp == 'c') { 
				list.add( new Product(name, price));
			}
			else if (resp == 'u') { 
				System.out.println("Manufacture date (DD/MM/YYYY): ");
				String date = sc.next();
				LocalDate ld = LocalDate.parse(date, dtf1);
				list.add(new UsedProduct(name, price, ld)); 
			}
			else if (resp == 'i') { 
				System.out.println("Customs fee: ");
				double customsFee = sc.nextDouble(); 
				list.add(new ImportedProduct(name, price, customsFee));
			}
			
		}
		System.out.println();
		
		System.out.println("PRICE TAGS:");
		for (Product prod : list) { 
			System.out.println(prod.priceTag());
		}
	
		sc.close();
	}
}
