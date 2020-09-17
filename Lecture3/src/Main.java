import java.util.Scanner;		//	Scanner Ŭ���� ����� ���ؼ� �߰� �ʿ�.
public class Main {
	//	1���� n���� ���� ���ϴ� �Լ��Դϴ�.
	static long sum(int n) {
		long s = 0;
		for(int i=1;i<=n;i++) {
			s += i;		// 	s = s + i;
		}
		return s;
	}
	static long sum1(long n) {
		return n*(n+1)/2;
	}
	public static void main(String[] args) {
		//	Scanner Ŭ���� ������Ʈ�� �ϳ� �����մϴ�.
		Scanner scan = new Scanner(System.in);

		//	�Է� ���ð��� �ð��� �帣�⶧���� ������ ��Ȯ���� ���ؼ� �Է��� �����ϴ� �� �ۿ��� ó���մϴ�.
		System.out.print("n�� �Է��ϼ��� : ");
		int n = scan.nextInt();
		
		//	System.currentTimeMillis() �Լ��� ���� �ð��� ms ������ �����ݴϴ�.
		//	Ư����¥, �ð��� 0���� �ؼ�, ������ ���� �����ݴϴ�.
		//	Ư���۾��� ����ð��� �����ϱ� ���ؼ� Ư���۾� �������� �ð��� ����ؼ� start ������ �����մϴ�
		long start = System.currentTimeMillis();
		
		//	�̰����� Ư�� �۾��� �մϴ�.
		System.out.println("Sum from 1 to "+n+" is "+sum1(n)+".");
		
		//	Ư���۾��� ������ ���� �ð��� end�� �����մϴ�.
		long end = System.currentTimeMillis();
		
		//	��� �ð��� (end-start) ms�� �˴ϴ�.
		System.out.println("Elapsed time is "+(end-start)+"ms.");
	}
}
