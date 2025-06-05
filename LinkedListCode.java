*******************************************************************************/
class Node{
    int data;
    Node next;
    Node(int data){
        this.data=data;
        this.next=null;
        
    }
    Node(int data,Node next){
        this.data=data;
        this.next=next;
    }
}
public class Main
{
    public static Node convertArr2LL(int arr[]){
        Node head=new Node(arr[0]);
        Node mover;
        mover=head;
        Node temp;
        for(int i=1;i<arr.length;i++){
            temp=new Node(arr[i]);
            mover.next=temp;
            mover=temp;
            
            
        }
        return head;
    }
    
	public static void main(String[] args) {
	    Node y=new Node(5);
	    int arr[]={2,3,4,5,6};
	    Node head=convertArr2LL(arr);
	    System.out.println(head.data);
		
	}
}
