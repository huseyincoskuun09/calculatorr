package general;

import java.util.Scanner;

public class method {
	
	
	
	public static void main(String[] args) {
	
		Scanner scanner = new Scanner(System.in);
		System.out.println("Which calculation ?");
		System.out.print("1.Addition  "
				         + "2.Multiply  "
				         + "3.Divide  "
				         + "4.Extraction  ");
		int cevap = scanner.nextInt();
		
		System.out.println("Enter the first number ");
		int sayı1 = scanner.nextInt();
		System.out.println("Enter the second number");
		int sayı2 = scanner.nextInt();
		
		
		if(cevap == 1 ) {
			
			
			
			System.out.println("The result is : " +toplama(sayı1,sayı2) );
		}
		
		else if(cevap == 2) {
		
			System.out.println("The result is: " +carpma(sayı1,sayı2) );
		}
		
		else if(cevap == 3) {
			
			System.out.println("The result is: " +bolme(sayı1,sayı2) );
		}
		else {
			
			System.out.println("The result is  : " +cıkarma(sayı1,sayı2) );
		}
		
		
		
	}
	
	public static int toplama(int a ,int b) {
		
		int result = a+ b ;
		return result;
		
	}
	
public static int carpma(int x,int y) {
		
		int result = x*y;
		return result;
		
	}

public static int bolme(int a ,int b) {
	
	int result = a/b ;
	return result;
	
}

public static int cıkarma(int a ,int b) {
	
	int result = a -b ;
	return result;
	
}
	
		
	}


