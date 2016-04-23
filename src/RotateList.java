public class RotateList {

	public static void main(String[] args) {
		int [] values = new int[]{1,2,3,4};
		Node head = constructList(values);
		printResult("链表创建后结构： ", head);
		Node newHead = reverseList(head);
		printResult("链表反转后结构： ", newHead);
	}
	
	/***
	 * 头插法创建链表
	 * @param values
	 * @return
	 */
	public static Node constructList(int [] values){
		Node head = new Node(values[0], null);
		for(int i = 1; i <= values.length -1; i++){
			Node node = new Node(values[i], null);
			node.next = head.next;
			head.next = node;
		}
		return head;
	}
	
	/***
	 * 反转链表
	 * @param head
	 * @return
	 */
	public static Node reverseList(Node head){
		Node pre = null;
		Node cur = head;
		Node next = cur.next;
		while(next != null){
			cur.next = pre;
			pre = cur;
			cur = next;
			next = cur.next;
		}
		cur.next = pre;
		return cur;
	}
	
	/***
	 * 打印结果
	 * @param comment
	 * @param head
	 */
	public static void printResult(String comment, Node head){
		System.out.print(comment);
		Node cur = head;
		while(cur != null){
			System.out.print(cur.value + " ");
			cur = cur.next;
		}
		System.out.println();
	}
}
