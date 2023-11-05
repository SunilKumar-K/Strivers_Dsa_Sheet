
    class stack{
        int arr[];
        int top = -1;
        int capacity;

        public stack(int size)
        {
           arr = new int[size];
           capacity = size;
        }

        public void push(int x)
        {
            if(top == capacity)
            {
                System.out.println("stack is full");
            }
            else{
                top += 1;
                arr[top] = x;
                System.out.println("inserted " + x);
            }
        }

        public void pop()
        {
            if(top == 0)
            {
                System.out.println("stack is empty");
            }
            else{
                System.out.println("pop out "+ arr[top]);
                top -= 1;
            }
        }

        public static void main(String[] args) {
             stack s = new stack(5);
             s.push(15);
             s.push(20);
             s.push(25);
             s.push(30);
             s.push(35);
             s.pop();
             s.pop();
             s.push(40);
             System.out.println(s.top);
        }
    }

    
