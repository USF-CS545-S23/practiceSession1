/** A class representing a linked list. */
public class LinkedList {
	private Node head, tail;

	public LinkedList() {
		head = null;
		tail = null;
	}


	/** Creates a new node with the given element and adds it to the back of the list
	 *
	 * @param elem new value to append to the linked list
	 */
	public void append(int elem) {
		Node newNode = new Node(elem);
		if (head == null) {
			head = newNode;
			tail = newNode;
		}
		else {
			tail.setNext(newNode);
			tail = newNode;
		}
	}

	/** Prints all the nodes in the link list */
	public void printNodes() {
		Node current = head;
		while (current != null) {
			System.out.print(current.elem() + " ");
			current = current.next();
		}
		System.out.println();
	}

	/**
	 * Insert a new node with the given value before the tail
	 * @param value the value to insert before the tail
	 */
	public void insertBeforeTail(int value) {
		// FILL IN CODE
		// Create a new node with the given value
		// Find "prev" - the node before the tail
		// Insert the new node after "prev"

	}

	public static void main(String[] args) {
		LinkedList list1 = new LinkedList();
		list1.append(35);
		list1.append(40);
		list1.append(10);
		list1.append(5);
		list1.append(1);
		System.out.println("Original linked list: ");
		list1.printNodes();
		list1.insertBeforeTail(12);
		System.out.println("After inserting 12 before the tail: ");
		list1.printNodes();

	}
}
