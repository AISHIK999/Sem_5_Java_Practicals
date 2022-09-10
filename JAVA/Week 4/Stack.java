class Stack{
    // Create a stack in java
    private int[] stack;
    private int top;
    private int size;
    public Stack(int size){
        this.size = size;
        stack = new int[size];
        top = -1;
    }
    public void push(int data){
        if(top == size-1){
            System.out.println("Stack is full");
        }
        else{
            top++;
            stack[top] = data;
        }
    }
    public int pop(){
        if(top == -1){
            System.out.println("Stack is empty");
            return -1;
        }
        else{
            int data = stack[top];
            top--;
            return data;
        }
    }
    public int peek(){
        if(top == -1){
            System.out.println("Stack is empty");
            return -1;
        }
        else{
            return stack[top];
        }
    }
    public boolean isEmpty(){
        if(top == -1){
            return true;
        }
        else{
            return false;
        }
    }
    public boolean isFull(){
        if(top == size-1){
            return true;
        }
        else{
            return false;
        }
    }
    public void display(){
        if(top == -1){
            System.out.println("Stack is empty");
        }
        else{
            for(int i = top; i >= 0; i--){
                System.out.println(stack[i]);
            }
        }
    }

    public static void main(String[] args) {
        Stack s = new Stack(5);
        s.push(10);
        s.push(20);
        s.push(30);
        s.push(40);
        s.push(50);
        s.push(60);
        s.display();
        System.out.println("Peek: " + s.peek());
        System.out.println("Pop: " + s.pop());
        System.out.println("Peek: " + s.peek());
        System.out.println("Is stack empty: " + s.isEmpty());
        System.out.println("Is stack full: " + s.isFull());
    }
}