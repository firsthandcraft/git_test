package step1;

import java.util.Scanner;

public class I {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Ű����� ���� �Է¹��� ���ڸ� ������
		Scanner sc = new Scanner(System.in);
		System.out.println("������ �Է�(2~9)");
		int i =sc.nextInt();
		int a;
		
		System.out.println("����� ������:"+i+"���Դϴ�.");

		for(a=1; a<=9; a++) {
			System.out.println(i+"*"+a+"="+i*a);		}
		

		
		
		
	}

	

}