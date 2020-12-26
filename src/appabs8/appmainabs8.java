package appabs8;

import java.util.Scanner;

import parentchildabs8.ElectronicProduct;

public class appmainabs8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter productId");
        int prodid=sc.nextInt();
        sc.nextLine();
        System.out.println("Enetr Product Nmae");
        String Prodname=sc.nextLine();
        System.out.println("Enter price of product");
        float price=sc.nextFloat();
        sc.nextLine();
        System.out.println("Enter dimension");
        String Dimension=sc.nextLine();
        System.out.println("Enter warranty");
        int warranty=sc.nextInt();
        sc.nextLine();
        ElectronicProduct electronicprod=new ElectronicProduct(prodid,Prodname,price,Dimension,warranty);
        System.out.println("Productid-"+electronicprod.getProductId());
        System.out.println("Product Name-"+electronicprod.getProductName());
        System.out.println("Prodduct price-"+electronicprod.getPrice());
        System.out.println("Dimension-"+electronicprod.getDimension());
        System.out.println("Warranty-"+electronicprod.getWarranty()+" years");
        System.out.println("Discount amount-"+electronicprod.calculatediscountr());
        
		
	}

}
