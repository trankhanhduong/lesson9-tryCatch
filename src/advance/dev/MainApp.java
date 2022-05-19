package advance.dev;

import java.util.Scanner;



public class MainApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("nhap vao tuoi cua ban");
		int age = sc.nextInt();
		
		try {
			checkAge(age);
		} catch (AgeException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}
	static void checkAge(int age) throws AgeException {
		if(age <18) throw new AgeException("ban chua 18");
		
	}
}
