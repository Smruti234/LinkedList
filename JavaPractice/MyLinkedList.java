package JavaPractice;

import org.junit.Assert;
import org.junit.jupiter.api.Test;


public class MyLinkedList {
	@Test
	public void given3NumbersWhenAddedToLinkedListShouldBeAddedToTop() {		
		MyNode<Integer>myFirstNode  = new MyNode<Integer>(70);
		MyNode<Integer> mySecondNode = new MyNode<Integer>(30);
		MyNode<Integer> MyThirdNode = new MyNode<Integer>(56);
		LinkedListTest myLinkedList = new LinkedListTest();
		myLinkedList.add(myFirstNode);
		myLinkedList.add(mySecondNode);
		myLinkedList.add(MyThirdNode);
		myLinkedList.printMyNodes();
		boolean result = myLinkedList.head.equals(MyThirdNode)&&
						 myLinkedList.head.getNext().equals(mySecondNode)&&
						 myLinkedList.tail.equals(myFirstNode);
		Assert.assertTrue(result);	
    }
}


