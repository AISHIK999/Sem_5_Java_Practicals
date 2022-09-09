//Implement a stack or queue using array
class StackQueue {
    private int[] arr;
    private int top;
    private int size;
    private int capacity;
    private int front;
    private int rear;
    private int count;

    public StackQueue(int capacity) {
        this.capacity = capacity;
        arr = new int[capacity];
        top = -1;
        size = 0;
        front = 0;
        rear = capacity - 1;
        count = 0;
    }

    public void push(int data) {
        if (isFull()) {
            System.out.println("Stack is full");
        } else {
            top++;
            arr[top] = data;
            size++;
        }
    }

    public int pop() {
        if (isEmpty()) {
            System.out.println("Stack is empty");
            return -1;
        } else {
            int data = arr[top];
            top--;
            size--;
            return data;
        }
    }

    public int peek() {
        if (isEmpty()) {
            System.out.println("Stack is empty");
            return -1;
        } else {
            return arr[top];
        }
    }

    public boolean isEmpty() {
        return size == 0;
    }

    public boolean isFull() {
        return size == capacity;
    }

    public void enqueue(int data) {
        if (isFull()) {
            System.out.println("Queue is full");
        } else {
            rear = (rear + 1) % capacity;
            arr[rear] = data;
            count++;
        }
    }

    public int dequeue() {
        if (isEmpty()) {
            System.out.println("Queue is empty");
            return -1;
        } else {
            int data = arr[front];
            front = (front + 1) % capacity;
            count--;
            return data;
        }
    }

    public int front() {
        if (isEmpty()) {
            System.out.println("Queue is empty");
            return -1;
        } else {
            return arr[front];
        }
    }

    public int rear() {
        if (isEmpty()) {
            System.out.println("Queue is empty");
            return -1;
        } else {
            return arr[rear];
        }
    }

    public static void main(String[] args) {
        StackQueue stack = new StackQueue(3);
        StackQueue queue = new StackQueue(3);
        stack.push(1);
        stack.push(2);
        stack.push(3);
        queue.enqueue(1);
        queue.enqueue(2);
        queue.enqueue(3);
        System.out.println("Stack is full: " + stack.isFull());
        System.out.println("Stack is empty: " + stack.isEmpty());
        System.out.println("Stack peek: " + stack.peek());
        System.out.println("Stack pop: " + stack.pop());
        System.out.println("Queue is full: " + queue.isFull());
        System.out.println("Queue is empty: " + queue.isEmpty());
        System.out.println("Queue front: " + queue.front());
        System.out.println("Queue rear: " + queue.rear());
        System.out.println("Queue dequeue: " + queue.dequeue());
    }
}
