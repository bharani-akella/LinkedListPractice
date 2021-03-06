package interview;
import java.util.*;
public class LoopStartNode {
Node head;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LoopStartNode ll=new LoopStartNode();
		ll.insertFirst(10);
		ll.insertFirst(20);
		ll.insertFirst(30);
		ll.insertFirst(40);
		ll.insertFirst(50);
		ll.head.next.next.next.next.next=ll.head.next.next;
		ll.checkLoop();
	
	}
	
	public void checkLoop(){
		Node fast=head;
		Node slow=head;
		boolean loop=false;
		
		while(fast.next!=null){
			fast=fast.next.next;
			slow=slow.next;
			if(fast==slow){
				loop=true;
				break;
			}
		}
		if(loop==false){
			System.out.println("Null terminated");
			return;
		}
		slow=head;
		while(slow!=fast){
			slow=slow.next;
			fast=fast.next;
			if(slow==fast){
				System.out.println("Loop starts at "+fast.data);
				return;
			}
		}
	}
	
	public int length(){
		Node temp=head;
		int count=0;
		while(temp!=null){
			count++;
			temp=temp.next;
		}
		return count;
	}
	
	
	
	public void insertFirst(int d){
		Node n1=new Node(d);
		if(head==null){
			head=n1;
			return;
		}
		n1.next=head;
		head=n1;
	}
	
	public void printL(){
		Node temp=head;
		while(temp!=null){
			if(temp.next==null){
				System.out.print(temp.data);	
				return;
			}
			System.out.print(temp.data+"->");
			temp=temp.next;
		}
	}

}
