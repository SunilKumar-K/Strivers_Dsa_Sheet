
public class linkedStacks {

	public static void main(String[] args) {
		
		linkedStacks ls = new linkedStacks();
		
		ls.push(5);
		ls.push(10);
		ls.push(15);
		ls.pop();
        ls.display();
        ls.pop();
		ls.push(20);
        ls.push(30);
		ls.display();
		System.out.print(ls.size);
		

	}
	
	
	public void push(int data)
	{
		stack s = new stack(data);
		s.next = top ;
		top = s ;
		System.out.println(top.data +" pushed into the stack");
		size++;
	}
	
	public void pop()
	{
		System.out.println(top.data + " pop out form the stack.");
		top = top.next;
		size--;
	}
	
	public void display()
	{
		stack current = top;
		while(current != null)
		{
			System.out.print(current.data + "-->");
			current = current.next;
		}
		System.out.println("end");
	}
	
	
	public int size = 0;
	public stack top = null;
	
	class stack{
		int data;
		stack next;
		
		public stack(int data)
		{
			this.data = data;
			this.next = next;
		}
	}

}
