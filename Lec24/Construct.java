package Lec24;

public class Construct {

	class Node {
		int val;
		Node next;

	}

	int size = 0;
	Node head = null;
	Node tail = null;

	public void addFirst(int val) {
		Node nn = new Node(); // 2k
		nn.val = val;
		if (head == null) {
			head = nn;
			tail = nn;
		} else {
			nn.next = head;
			head = nn;
		}
		size++;

	}

	public void addLast(int val) {
		Node nn = new Node();
		nn.val = val;
		if (head == null) {
			head = nn;
			tail = nn;
		} else {
			tail.next = nn;
			tail = nn;
		}
		size++;
	}

	public void removeFirst() {
		if (head == null)
			return;
		head = head.next;
		size--;
	}

	public void display() {
		Node temp = head;
		while (temp != null) {
			System.out.print(temp.val + " ");
			temp = temp.next;
		}
	}

	public void removeLast() {
		if (head == tail) {
			head = null;
			tail = null;
			size--;
			return;
		}
		Node temp = head;
		while (temp.next != tail) {
			temp = temp.next;
		}
		temp.next = null;
		tail = temp;
		size--;
		return;
	}

	public void addAt(int idx, int val) {
		if (idx == 0) {
			addFirst(val);
			return;
		}
		if (idx == size) {
			addLast(val);
			return;

		}
		if (idx < 0 || idx > size)
			return;
		Node nn = new Node();
		nn.val = val;
		Node temp = getAt(idx - 1); // temp=3k;
		Node strg = temp.next;
		temp.next = nn;
		nn.next = strg;
		size++;
	}

	public void removeAt(int idx) {
		if (idx == 0) {
			removeFirst();

		}
		if (idx == size - 1) {
			removeLast();
		}
		if (idx < 0 || idx >= size)
			return;
		Node temp = getAt(idx - 1); // 2k
		temp.next = temp.next.next;
		size--;
	}

	public Node getAt(int idx) {
		if (idx == 0)
			return head;
		if (idx == size - 1)
			return tail;
		if (idx < 0 || idx >= size)
			return null;

		Node temp = head;
		while (idx > 0) {
			temp = temp.next;
			idx--;
		}

		return temp;
	}
}
