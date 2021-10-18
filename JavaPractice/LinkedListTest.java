package JavaPractice;

public class LinkedListTest {
	public INode head;
	public INode tail;
	
	public void MyLinkList() {
		this.head = null;
		this.tail = null;
	}

	public void add(INode newNode ) {
		
		if(this.tail == null)
			this.tail = newNode;
		 if (this.head == null)
			this.head = newNode;
		else {
			INode tempNode = this.head; 
			this.head= newNode;
			this.head.setNext(tempNode);
		}	
	}
	
	public void printMyNodes() {
		StringBuffer myNodes = new StringBuffer("My Nodes :");
		INode tempNode = head;
		while(tempNode.getNext()!= null) {
			myNodes.append(tempNode.getkey());
			if(!tempNode.equals(tail) )myNodes.append("->");
				tempNode = tempNode.getNext();	
		}
		myNodes.append(tempNode.getkey());
		System.out.println(myNodes);		
	}


	

}

