
public class linkedQueues {

	public static void main(String[] args)
	{
		linkedQueues lq = new linkedQueues();
		lq.enqueue(10);
		lq.enqueue(15);
		lq.enqueue(30);
		lq.enqueue(25);
		System.out.println(lq.size);
		lq.display();
		lq.dequeue();
		lq.dequeue();
		lq.display();
		System.out.println(lq.size);
        lq.enqueue(35);
		lq.display();
	}
	
	public queue front = null;
	public queue rear = null;
	public int size = 0;
	
	public void enqueue(int data)
	{
		queue q = new queue(data);
		if(front == null && rear == null)
		{
			front = q;
			rear = q;
			size++;
			System.out.println(rear.data + " enqueued into the queue");
		}
		else {
			rear.next = q;
			rear = q;
			System.out.println(rear.data + " enqueued into the queue");
			size++;
		}
	}
	
	public void dequeue()
	{
		System.out.println(front.data + " dequeued form the queue");
		front = front.next;
		size--;
	}
	
	public void display()
	{
		queue current = front;
		while(current != null)
		{
			System.out.print(current.data + "--> ");
			current = current.next;
		}
		System.out.println("End");
	}
	
	class queue{
		int data;
		queue next;
		
		public queue(int data)
		{
			this.data = data;
			this.next = next;
		}
	}
}
