// Coded by Tanuj Namdeo
// Written in Beautiful Java

import java.util.Scanner;

class Date {
	// Declaring variables
	private int day, month, year;
	
	// Defining constructor method
	Date(int day, int month, int year) {
		this.day = day;
		this.month = month;
		this.year = year;
	}

	// Computing number of days
	int daysSinceJan1() {
		int i, feb = 28, n = 0;
		for(i = 0; i < this.month - 1; i ++) {
			if (i < 7 && i != 1) {
				n += 30 + ((i + 1) % 2);				
			}
			else if (i == 1) {
				n += feb;
			}
			else {
				n += 30 + (i % 2);
			}
		}
		if (this.month > 12) {
			return -1;
		}
		if(this.year % 4 == 0) {
			n ++;
			feb ++;
		}
		if (i == 1 && this.day <= feb) {
			n += this.day;
		}
		else if(i != 1) {
			if (i < 7 && this.day <= 30 + ((i + 1) % 2)) {
				n += this.day;
			}
			else if (i >= 7 && this.day <= 30 + i % 2) {
				n += this.day;	
			}
		}
		else {
			return -1;
		}
		return n;
	}
}

public class DateDemo {
	public static void main(String[] S) {

		int day, month, year; 
		Scanner s = new Scanner(System.in);

		System.out.print("Date - ");
		day = s.nextInt();

		System.out.print("Month - ");
		month = s.nextInt();

		System.out.print("Year - ");
		year = s.nextInt();

		Date d = new Date(day, month, year);
		if (d.daysSinceJan1() == -1) {
			System.out.println("WRONG DATE!");
		}
		else {
			System.out.println("Number of days since January 1 = " + d.daysSinceJan1());			
		}
	}
}