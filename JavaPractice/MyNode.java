package JavaPractice;


public class MyNode<K>implements INode<K>  {
	public  K key;
	public INode <K> next;

	

	public MyNode(K key) {
		this.key=key;
		this.next =null;
	}

	@Override
	public K getkey() {
		// TODO Auto-generated method stub
		return key;
	}

	@Override
	public void setkey(K key) {
		this.key = key;
		// TODO Auto-generated method stub
		
	}
	public INode <K> getNext() {
		return next;
	}
	public void setNext(INode next) {
		this.next = (MyNode<K>) next;
	}
}

