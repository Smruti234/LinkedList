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


   @Test
public void given3NumbersWhenAppendedShouldBeAddedToList() {		
	MyNode<Integer>myFirstNode  = new MyNode<Integer>(56);
	MyNode<Integer> mySecondNode = new MyNode<Integer>(30);
	MyNode<Integer> myThirdNode = new MyNode<Integer>(70);
	LinkedListTest myLinkedList = new LinkedListTest();
	myLinkedList.add(myFirstNode);
	myLinkedList.append(mySecondNode);
	myLinkedList.append(myThirdNode);
	myLinkedList.printMyNodes();
	boolean result = myLinkedList.head.equals(myFirstNode)&&
					 myLinkedList.head.getNext().equals(mySecondNode)&&
					 myLinkedList.tail.equals(myThirdNode);
	Assert.assertTrue(result);	
}
   
   
   @Test
public void given3NumbersWhenInsertingInBetweenShouldPassBeLinkList() {		
	MyNode<Integer>myFirstNode  = new MyNode<Integer>(56);
	MyNode<Integer> mySecondNode = new MyNode<Integer>(30);
	MyNode<Integer> myThirdNode = new MyNode<Integer>(70);
	LinkedListTest myLinkedList = new LinkedListTest();
	myLinkedList.add(myFirstNode);
	myLinkedList.append(mySecondNode);
	myLinkedList.insert(myFirstNode,mySecondNode);
	myLinkedList.printMyNodes();
	boolean result = myLinkedList.head.equals(myFirstNode)&&
					 myLinkedList.head.getNext().equals(mySecondNode)&&
					 myLinkedList.tail.equals(myThirdNode);
	Assert.assertTrue(result);	
   }
   
   @Test
   public void given3NumbersWhenDeleteInBetweenShouldPassBeLinkList() {		
   	MyNode<Integer>myFirstNode  = new MyNode<Integer>(56);
   	MyNode<Integer> mySecondNode = new MyNode<Integer>(30);
   	MyNode<Integer> myThirdNode = new MyNode<Integer>(70);
   	LinkedListTest myLinkedList = new LinkedListTest();
   	myLinkedList.add(myFirstNode);
   	myLinkedList.add(mySecondNode);
   	myLinkedList.add(myThirdNode);
   	myLinkedList.pop(myFirstNode);
   	myLinkedList.printMyNodes();
   	boolean result = myLinkedList.head.equals(myFirstNode)&&
   					 myLinkedList.head.getNext().equals(mySecondNode)&&
   					 myLinkedList.tail.equals(myThirdNode);
   	System.out.println(result);
   	Assert.assertTrue(result);	
      }
}




