package step1;

public class For5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//������ 1�ܳ��� 2�ܳ���...

		int i,j;
		for(i=0; i<10; i++) {//1��_9��
			for(j=2;j<10;j++) {//2-9�ݺ�
				if(i==0) {//0�϶��� ������ �ݺ� 1���϶� ����� for�� ����
					System.out.println(j+"��\t");	
				} else {
					System.out.println(j+"*"+i+"="+(j*i+"\t"));	
				}
			}
			System.out.println();
		}
	}

}