import java.util.Scanner;

public class Main {
	//	�Է°� n�� ���Ͽ�, 1���� n���� �Ҽ��� ������ ��� ��ȯ�ϴ� �Լ�
	static int pi(int n) {
		//	�Ҽ��� ������ �� pcount��� ������ �����ϰ� 0���� �ʱ�ȭ�մϴ�.
		int pcount = 0;
		//	1���� n���� for ������ ���鼭, �ش� ���� �Ҽ��̸� pcount�� ������ŵ�ϴ�.
		for(int p = 1; p <= n; p++) {
			//	p�� �Ҽ��̸�, pcount�� 1 ����
			//	%�� �������������Դϴ�.
			//	10%3 = 10�� 3���� ���� ������ = 1
			//	if( p%d == 0 ) --> p�� d�� �����������.
			//	����� ������ ������ ���� dcount �����ϰ� 0���� �ʱ�ȭ�Ѵ�.
			int dcount = 0;
			for(int d = 1; d <= p; d++) {
				//	p�� d�� ���� �� �ִٸ�, d�� p�� ����̹Ƿ� dcount�� 1 ������Ų��.
				if(p%d == 0) dcount++;
			}
			//	����� ������ 2���, p�� �Ҽ��̹Ƿ� pcount�� 1 ������Ų��.
			if(dcount==2) pcount++;
		}
		
		return pcount;
	}
	//	�ӵ��� ������ ������ ������.
	//	����� ������ 2����� ������ �״�� ���� �ӵ��� ������.
	//	�Ҽ��� ����� 1�� �ڱ��ڽ��̹Ƿ� 1�� �ڱ��ڽ��� ������ ���� ���ؼ� ����������� �Ҽ��� �ƴϴ�.
	//	�� ����� �����ؼ� �������� �մϴ�.
	static int pi1(int n) {
		//	����ó���� ���ؼ� ��������� �����մϴ�.
		//	¦���Ҽ��� ���� 2�ۿ� ���ٴ� ����� �̿��ؼ� ��������� �غ����� �մϴ�.
		if(n<2) return 0;
		if(n==2) return 1;
		int pcount = 1;
		//	���� Ȧ�� �Ҽ��� ���غ����� �մϴ�.
		for( int p = 3; p <= n; p+=2 ) {
			//	������ �������� ���� ������, Ż���ϴ� ��ɾ� break�� �̿��Ͽ� �����մϴ�.
			boolean isPrime = true;
			//	d�� 2���� p-1���� �ݺ������ϸ鼭, p�� �������߸��� for������ ���������� �ؼ�
			//	�ӵ��� ���Դϴ�.
			//	��� ����� ������·� �����մϴ�.
			//	sqrt(p)���� �۰ų� �������� ũ�ų� ���� ���� ������ p�� �ռ������ ����� �̷�Ե˴ϴ�. 
			for(int d = 3; d*d <= p; d+=2) {
				if(p%d==0) {
					isPrime = false;
					break;
				}
			}
			if(isPrime) pcount++;
		}
		return pcount;
	}
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("Input n : ");
		int n = scanner.nextInt();
		
		long t = System.currentTimeMillis();
		System.out.println("pi("+n+")="+pi1(n));
		long t1 = System.currentTimeMillis();
		System.out.println("Elapsed time is "+(t1-t)+"ms.");
	}

}
