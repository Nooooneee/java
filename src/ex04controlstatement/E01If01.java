package ex04controlstatement;

import java.io.IOException;

/*
if��(���ǹ�) ����1
	if(���ǹ�){
		���๮��;
	}
-if���� ���ǹ��� �ݵ�� �񱳽� Ȥ�� �������̾�� �Ѵ� .
-�� ������� boolean������ true Ȥ�� false�� ��ȯ�ؾ��Ѵ�. 
-������ ������ �ϳ���� �߰�ȣ ������ �����ϴ�.
 */
public class E01If01 {

	public static void main(String[] args) throws IOException {

		//������ �������� �� �ʱ�ȭ
		int num = 10;		 
		 
		//�Ʒ� ������ ���ǽ��� �ƴ� ������̹Ƿ� ������ �߻��ȴ�.
//		if(num%2) {
//			System.out.println("�߸��� ���ǽ��Դϴ�.");
//		}
//		if(num) {
//			System.out.println("�̰͵� �߸��� ���ǽ��Դϴ�.");
//		}

		/*
		 if���� ������ �Ʒ��� ���� boolean���� ��ȯ�ϴ� ���ǽ��̸�
		 �ȴ�.		 
		 */
		if(num%2==0) {
			/*
			Ư���� ���� 2�� ������ �������� 0�̶�� ¦���� �Ǵ��Ҽ�
			�ִ�.
			 */
			System.out.printf("%d�� ¦���Դϴ�", num);
		}
		// �Ѵ� �����Ͽ� ����And�� true�� ��ȯ�Ѵ�.
		if(num%2==0 && num>=10) {
			// ���� �ش繮���� ��µȴ�.
			System.out.printf("%n%d�� ¦���̰� 10���� ũ�ų�����.%n", num);
		}
		
		//��쿡 ���� ������ ����Ǵ� if���� �ʿ��� ��찡�ִ�.
		if(true) {
			System.out.println("������ ����Ǵ� if���Դϴ�.");
		}
		
		/*
		if(���ǽ�);
			=> ���ǽĿ� ������� ���� ������ ����Ǵ� �߸��� ������
			�����ݷ��� ������ ���� ��Ÿ���Ƿ� ��뿡 �����ؾ� �Ѵ�.
		 */
		if(num%2 != 0);
		/*
		10�� Ȧ���� �ƴ����� �� if���� �߸��Ǿ����Ƿ� �Ʒ� ������ 
		����ȴ�. �� if������ ����� ����.
		 */
		{
			System.out.printf("%d�� Ȧ���Դϴ�.", num);
		}
		
		/*
		���ǰ˻��� ������ ������ 1���� ��쿡�� �߰�ȣ({})�� ������ �� 
		�ִ�. ��, ���๮�� 2�� �̻��̶�� �� ���常 if���� ���ԵǹǷ� 
		�ݵ�� �߰�ȣ�� ����ؾ� �Ѵ�. 
		 */
		if(num%2 == 0) 
			System.out.println("\n"+ num +"�� ¦���̴�");
		
		//num�� 10�̹Ƿ� ���ǽ��� false�� ��ȯ�Ͽ� ��µ��� �ʴ´�.
		if(num%2 != 0) { 
			System.out.println("num�� "+ num +"�Դϴ�.");
			System.out.println(num +"�� Ȧ���Դϴ�.");
		} 

		/*
		�ó�����] ����ڰ� �Է��� ���ڰ� �������� �Ǵ��ϴ� ���α׷��� 
			if���� �̿��ؼ� �ۼ��Ͻÿ�.
			����) System.in.read() : Ű���带 ���� �Է��� ������ �ƽ�
				Ű�ڵ带 ���������� ��ȯ�ϴ� �޼���. �α��� �̻� �Է�
				�ϴ��� ù��°	���ڸ� �Էµȴ�.  
		 */
		System.out.print("�ϳ��� ���ڸ� �Է��ϼ���:");
		int asciiCode = System.in.read();
		System.out.println("�Է��� ���ڴ�:"+ asciiCode);
		
		/*
		�ƽ�Ű�ڵ带 �˰������� �������
		���� 0�� 9�� ���� �ƽ�Ű�ڵ� 48, 57 �̹Ƿ� �ش� �����ȿ� 
		�ִٸ� ���ڷ� �Ǵ��� �� �ִ�. 
		 */
		if(asciiCode>=48 && asciiCode<=57) {
			System.out.println("�Է��� ���ڴ� �����Դϴ�.");		
		}
		else {
			System.out.println("�Է��� ���ڴ� ���ڰ� �ƴմϴ�.");
		}
		
		/*
		�ƽ�Ű�ڵ带 �𸦶� ����������� ���� '0'�� '9'�� ���ǿ� �״��
		����Ѵ�. �ش� ���ڰ� �ᱹ �ƽ�Ű�ڵ带 ��ȯ�ϹǷ� �� if���� 
		������ ����� ����ϰ� �ȴ�. 
		 */
		if(asciiCode>='0' && asciiCode<='9') {
			System.out.println("�Է��� ���ڴ� �����Դϴ�.[1]");
		}
		else {
			System.out.println("�Է��� ���ڴ� ���ڰ� �ƴ� �����Դϴ�.[1]");
		}		
	}
}