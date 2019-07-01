package paket;

public class Lista {

	private Klijent head;
	private int size = 1;

	public int getSize() {
		return size;
	}

	public void insert(Klijent x) {

		if (head == null) {
			head = x;

		} else {
			Klijent temp = head;
			while (temp.next != null) {
				temp = temp.next;
			}
			temp.next = x;
			
		}
		size++;
	}

	public void delete(int index) {
		if (index == 0) {
			head = head.next;
		} else {
			Klijent x = head;
			Klijent y = null;
			for (int i = 0; i < index - 1; i++) {
				x = x.next;
			}
			y = x.next;
			x.next = y.next;

		}
		size--;
	}

	public Klijent getKlijent(int index) {
		Klijent temp = head;
		Klijent temp1 = null;
		if (index == 0) {
			return head;
		} else {

			for (int i = 0; i <= size; i++) {
				if (i == index) {
					temp1 = temp;
					break;
				}
				temp = temp.next;

			}
			if (temp1 == null)
				throw new IllegalArgumentException("Invalid Blog ID");

			return temp1;
		}
	}

	public boolean isEmpty() {

		if (size == 0)
			return false;

		return true;
	}

	public void show() {
		Klijent klijent = head;
		while (klijent.next != null) {

			System.out.println(klijent);
			klijent = klijent.next;

		}
		System.out.println(klijent);
	}
}
