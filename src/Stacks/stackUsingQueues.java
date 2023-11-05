import java.util.LinkedList;
import java.util.Queue;

class stack{
    Queue<Integer> q1 = new LinkedList<>();
    Queue<Integer> q2 = new LinkedList<>();

    int size;

    public void push(int x)
    {
        q2.add(x);
        while (!q1.isEmpty()) {
            q2.add(q1.peek());
            q1.remove();
        }

        Queue<Integer> q = q1;
        q1 = q2 ;
        q2 = q;
    }    
    public void pop()
    {
        if (q1.isEmpty())
             return;
        q1.remove();
    }

    public int size()
    {
        return q1.size();
    }
    public int top()
    {
        return q1.peek();
    }

            public static void main(String[] args) {
                stack s = new stack();
                s.push(15);
                s.push(20);
                s.push(30);
                s.push(40);
                System.out.println(s.size());
                System.out.println(s.top());
                s.pop();
                System.out.println(s.size());
                System.out.println(s.top());
            }

}