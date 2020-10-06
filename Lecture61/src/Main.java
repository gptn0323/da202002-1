//	�ڹٿ����� ��ü(������Ʈ)�� �����ϱ� ���ؼ��� ��ü�� ����� Ŭ������ �������־�� �մϴ�.
//	Ŭ������ ������ �Լ�(�޼ҵ�)��� ������ �˴ϴ�.
//	�츮�� �̹� ����ϰ� �ִ� Main Ŭ������ ��ü�� ���� �� �ִ� Ŭ�����Դϴ�.
//	Example �̶�� Ŭ������ �������� �մϴ�.
class Example {
	//	Ŭ���� �ȿ� ������ �������� �� �ֽ��ϴ�.
	//	Ŭ���� �ȿ� �ִ� �������� ������Ʈ���� ���� ��������� �޶� ������ �������Դϴ�.
	int t;
	//	Ŭ���� �̸��� ���� �̸��� �Լ��� �����ڶ�� �մϴ�.
	//	�����ڴ� Ŭ���� ������Ʈ�� ������ �� �ڵ����� ȣ��Ǵ� �Լ��Դϴ�.
	//	��ȯ Ÿ���� ���� �̸��� �����ϴ�.
	Example() {
		System.out.println("�����ڰ� ȣ��Ǿ����ϴ�.");
		t = 0;
	}
	//	�Լ��� �������� �Ķ���͸� �� �� �ֽ��ϴ�.
	//	�Ķ���ʹ� �޸�(,)�� �и��Ǿ� �����մϴ�.
	public void set(int n, int k) {
		t = n*k;
	}
	public void print() {
		System.out.println("���� t ���� "+t+"�Դϴ�.");
	}
}

//	Stack �ڷᱸ���� ����ϱ� ���ؼ� Stack�̶�� Ŭ������ �����մϴ�.
//	Stack�� �뵵���� �پ��ϰ� ����ϱ� ���ؼ� ���ø� Ŭ������ ����մϴ�.
//	���ø� Ŭ������ �پ��� ����Ÿ���� Ŭ���� ������ �� ����Ͽ� �ϳ��� �ҽ��� ������ �پ��� ����� ����� ������ �� 
//	�ֽ��ϴ�.
//	���ø� Ŭ������ Ŭ���� �̸� �ڿ� < E > �� ���� ���ð�ȣ�� �̿��մϴ�.
//	���ø� Ŭ������ Ŭ������ ����ϴ� ������ E ��ſ� �������� ���� Ÿ���� �̿��ؼ� �ش� Ŭ������ �پ��ϰ� �� �� 
//	�ֵ��� �մϴ�.  ��) ���ڿ��� ��� ����(Stack<String>), ���ڸ� ��� ����(Stack<Integer)).
class Stack<E> {
	//	�ڹٿ��� �迭�� ����Ϸ��� <����Ÿ��>[] <��� ���� �̸�>; ���·� ������ ���־�� �մϴ�.
	E[] data;			//	���� �����͸� ������ ����
	int top;			//	������ �� �� �����͸� ������ ����
	//	������
	Stack() {
		//	1. 1024���� �����͸� ������ �� �ֵ��� �迭 ũ�⸦ 1024�� ����ϴ�.
		data = (E[])new Object[1024];
		//	2. top ������ -1�� �ʱ�ȭ�մϴ�.
		top = -1;
	}
	//	���ÿ� ������ v�� �־��ִ� �Լ� push
	public void push(E v) {
		//	1. top ������ 1 ������ŵ�ϴ�.
		top++;		//	top = top+1;   top += 1;
		//	2. data �迭�� top �ε��� ��ġ�� v ���� �����մϴ�.
		data[top] = v;
		//	���� �δܰ踦 ���ٿ� ǥ�� ����
		//data[++top] = v;
	}
	//	���ÿ��� �ֻ��� �������� �����մϴ�.
	public void pop() {
		//	0. top�� ����Ű�� �迭���� null�� ���������� �ش� �����Ͱ� ����� �� �ְ� �մϴ�.
		data[top] = null;
		//	1. top ������ 1 ���ҽ�ŵ�ϴ�.
		top--;
		//	���� �δܰ踦 ���ٿ� ǥ�� ����
		//data[top--] = null;
	}
	//	�ֻ��� �������� ��ȯ�մϴ�.
	public E top() {
		//	1. top ������ �ε����� �迭���� ��ȯ�մϴ�.
		return data[top];
	}
	//	������ ����ִ��� �˻��Ѵ�.
	public boolean empty() {
		//	1. top�� ���� -1�̸� true�� ��ȯ.  �׿ܿ� false.
		return top == -1;
	}
	public int size() {
		//	1. ���ÿ� �ִ� ������ ������ top+1 ���� ��
		return top+1;
	}
}
//	���� ���� ����Ʈ�� ������ �����մϴ�.
//	���Ḯ��Ʈ�� �ڷᱸ���� Node�� ����ϱ� ������ Node Ŭ������ �������־�� �մϴ�.
class Node<E> {
	E value;		//	���� �����ϴ� ������ ����
	Node<E> next;	//	���� ��带 �����ϴ� ����
	//	������ (�ַ� �ʱ�ȭ ���)
	Node(E v) { value = v; next = null; }
	//	get next
	public Node<E> getNext() { return next; }
	//	set next
	public void setNext(Node<E> n) { next = n; }
	//	get value
	public E getValue() { return value; }
}
//	���Ͽ��� ���� Ŭ����
class StackL<E> {
	Node<E> head;		//	��ũ�� ����Ʈ�� ó���� �����ϴ� ����
	StackL() { head = null; }
	public void push(E v) {
		//	1.	���ο� ��带 ����
		Node<E> newNode = new Node(v);
		//	2. ������ ����� ���� ��带 head�� ����
		newNode.setNext(head);
		//	3. head�� �����ϴ� ��带 newNode�� ����
		head = newNode;
	}
	public void pop() {
		//	1. head�� �����ϴ� ����� ���� ��尪���� head���� �ٲ۴�.
		head = head.getNext();
	}
	public E top() {
		//	1. head�� �����ϴ� ����� value ���� ��ȯ�Ѵ�.
		return head.getValue();
	}
	public int size() {
		//	1. �ּ��ϰԵ� ��ũ�� ����Ʈ�� ���� ��ȸ�ϰų� push, pop�� ��, ���� �ϳ��� ����, ���ҽ�Ű��
		//	������ size�� �˱� ����ϴ�.
		return 0;
	}
}
public class Main {
	public static void main(String[] args) {
		//	Example Ŭ������ ��ü�� �����ϱ� ���ؼ��� new��� Ű���带 �̿��ؼ� ������Ʈ�� �����մϴ�.
		Example obj = new Example();
		//	��ü�� �Լ��� ȣ���ϱ� ���ؼ��� <��ü �̸�>.<�Լ� �̸�>(); ���·� �մϴ�.
		obj.set(3, 5);
		obj.print();
		Example obj1 = new Example();
		obj.print();
		obj1.print();
		//	���� �׽�Ʈ ���α׷�
		StackL<String> stack = new StackL();
		stack.push("���Ȳ�");
		stack.push("���޷�");
		stack.push("��ȭ");
		System.out.println("�ֻ��� ������ : "+stack.top());
		System.out.println("���� ������ ���� : "+stack.size());
		stack.pop();
		System.out.println("�ֻ��� ������ : "+stack.top());
		System.out.println("���� ������ ���� : "+stack.size());
		stack.push("������");
		System.out.println("�ֻ��� ������ : "+stack.top());
		System.out.println("���� ������ ���� : "+stack.size());
	}
}
