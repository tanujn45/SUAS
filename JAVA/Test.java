// Code by Tanuj Namdeo
// Written in Beautiful JAVA

import java.util.Scanner;

class Author {
	private String authorName;
	private int age;
	private String place;

	// Constructor function
	Author(String name, int age, String place) {
		this.authorName = name;
		this.age = age;
		this.place = place;
	}

	// Getter methods
	String getAuthorName() {
		return this.authorName;
	}

	int getAge() {
		return this.age;
	}

	String getPlace() {
		return this.place;
	}
}

class Book extends Author {
	private String name;
	private int price;
	private Author auth;

	// Constructor function
	Book(String n, int p, Author at) {
		// Calling the constructor of parent class
		super(at.getAuthorName(), at.getAge(), at.getPlace());
        
        this.name = n;
		this.price = p;
		this.auth = at;
	}

	void showDetails() {
		System.out.println("\nName of the book- " + this.name);
		System.out.println("Price of the book- " + this.price);
		System.out.println("Author of the book- " + this.auth.getAuthorName());
		System.out.println("Age of the author- " + this.auth.getAge());
		System.out.println("Author's place of birth- " + this.auth.getPlace());
	}
}

public class Test {
	public static void main(String[] S) {
		Scanner s = new Scanner(System.in);
		
		String name, authName, place;
		int age, price;

		System.out.println("Name of the book- ");
		name = s.nextLine();
		
		System.out.println("Price of the book- ");
		price = s.nextInt();
		// To clear Scanner buffer
		s.nextLine();

		System.out.println("Name of the author- ");
		authName = s.nextLine();
		
		System.out.println("Age of the author- ");
		age = s.nextInt();
		// To clear Scanner buffer
		s.nextLine();
		
		System.out.println("Place of birth of the author- ");
		place = s.nextLine();
		
		Author at = new Author(authName, age, place);
		
		Book b = new Book(name, price, at);

		b.showDetails();
	}
}