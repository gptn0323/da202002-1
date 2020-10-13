import java.util.Scanner;
public class Main {
	//	���� ǥ������� �ۼ��� ������� �����մϴ�.
	//	�������� ��ȯ�մϴ�.
	static int calc(String exp) {
		//	������ ���� ����
		int[] stack = new int[1000];
		int top = -1;
		
		//	exp ���ڿ��� ���ִ� ��� ���ڿ� ���ؼ� ó���մϴ�.
		for(int i = 0; i < exp.length(); i++) {
			//	1. i��° ���ڸ� �н��ϴ�.
			char ch = exp.charAt(i);
			//	2. ������ ��� ���ÿ� push�մϴ�.
			if(ch >= '0' && ch <= '9') {
				stack[++top] = ch - '0';
			}
			//	3. �������� ��� ���ÿ��� �ι� ���� ���� ������� push�մϴ�.
			else if(ch == '+' || ch == '-' || ch == '*' || ch == '/') {
				//	���ÿ� ������ ������ 2�� �̻��� �ƴ� ��� ���� �߻�
				if(top < 1) {
					System.out.println("Error");
					return 0; 
				}
				int b = stack[top--];
				int a = stack[top--];
				int r = 0;
				if(ch == '+') r = a+b;
				else if(ch == '-') r = a-b;
				else if(ch == '*') r = a*b;
				else if(ch == '/') r = a/b;
				//	���� ����� ���ÿ� push�մϴ�.
				stack[++top] = r;
			}
		}

		//	������ ���� ���� �ִ� ���� ����̹Ƿ� ���� ���� �������� ��ȯ�մϴ�.
		return stack[top];
	}
	public static void main(String[] args) {
		//	�Է��� ���ؼ� Scanner ������Ʈ�� �����մϴ�.
		Scanner scan = new Scanner(System.in);
		
		//	���ڿ��� �޽��ϴ�.
		String ex = scan.next();
		//	�������� ����մϴ�.
		System.out.println(ex + " = " + calc(ex));
	}
}
