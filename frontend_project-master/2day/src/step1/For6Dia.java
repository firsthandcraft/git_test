package step1;

import java.util.Scanner;

public class For6Dia {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//������ ����� 
        // TODO Auto-generated method stub
        //������ ����� 
        int dia;
        Scanner sc = new Scanner(System.in);
        System.out.println("������ �Է� ");
        dia =sc.nextInt();
        String textLine="";
        String textLine2="";
        
        
        for(int i= 0; i<dia; i++) {
            textLine +='*';
            
            System.out.println(textLine);
            /*for (int j = dia; j > 0; j--) {
                textLine-='*';
                System.out.println(textLine);
            } //for*/
        }
        
        
		
		
		
	}

}