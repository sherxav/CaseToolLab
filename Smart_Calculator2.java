package assignment;

import java.util.Scanner;

public class Smart_Calculator2  {
public double principal;
public double rate;
public double time;
	Scanner scanner = new Scanner(System.in);
	// Non-parameterized constructor
	//Simple Interest
	public double Smart_Calculator() {
		System.out.println("Enter principal amount: ");
        this.principal = scanner.nextInt();

        System.out.println("Enter interest rate: ");
        this.rate = scanner.nextDouble();

        System.out.println("Enter time (in years): ");
        this. time = scanner.nextInt();
        double interest=(principal*rate*time)/100;
        System.out.println("The Simple Interest of "+principal+"is "+interest);
        return interest;}
	//Parameterized constructor
        public void Smart_Calculator(double principal, double rate, double time) {
            this.principal = principal;
            this.rate = rate;
            this.time = time;}
            // Getter and Setter
            public double getPrincipal() {
                return principal;
            }

            public void setPrincipal(double principal) {
                this.principal = principal;
            }

            public double getRate() {
                return rate;
            }

            public void setRate(double rate) {
                this.rate = rate;
            }

            public double getTime() {
                return time;
            }

            public void setTime(double time) {
                this.time = time;
            }
	//Methods
            public double Compound_Interest() {
        		System.out.println("\nEnter the Principal amount for Compound Interest: ");
        		this.principal=scanner.nextInt();
        		System.out.println("Enter the rate: ");
        		this.rate=scanner.nextInt();
        		System.out.println("Enter the time: ");
        		this.time=scanner.nextInt();
        		double CI = principal*Math.pow(1+(rate/100),time);
        		System.out.println("\nThe Compound Interest is "+CI);
        		return CI;
        	}
            
            public double mean() {
            	//	int numbers[];
            		int size,i;
            		int sum =0;
            		System.out.println("\nEnter for how many nos u wanna find mean ");
            		size = scanner.nextInt();
            		int[] arr = new int[size];
            		System.out.println("\nEnters numbers one by one: ");
            		for(i=0;i<size;i++) {
            			arr[i] = scanner.nextInt();
            			sum = sum + arr[i];
            		}
            		double mean = sum/size;
            		System.out.println("\nThe mean of the numbers are "+mean);
            		return mean;
            	}
            
            public int Factorial(int a) {
        		System.out.println("\nEnter number: ");
        		int i;
        		int fact=1;
        		for(i=1;i<=a;i++) {
        			fact=fact*i;
        		}
        		System.out.println("\nThe factorial of the number " +a+" is "+fact);
        		return fact;
        	}
            
            
	public int Percentage() {
		System.out.println("\nEnter the total marks: ");
		int total = scanner.nextInt();
		System.out.println("\nEnter the marks obtained: ");
		int obtained= scanner.nextInt();
		int per = (obtained * 100)/total;
		System.out.println("\nThe Percentage of the marks obtained are "+per);
		return per;	
	}
}
