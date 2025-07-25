class MyStack {
    private int[] arr;
    private int top;

    public MyStack() {
        arr = new int[1000];
        top = -1;
    }

    public void push(int x) {
        // Your Code
        if(top >= arr.length-1) return;
        top++;
        arr[top] = x;
    }

    public int pop() {
        // Your Code
        if(top == -1) return -1;
        int x = arr[top];
        top--;
        return x;
    }

    public int top() {
          return arr[top];
    }
  
    public int size() {
        return top + 1;
    }
}
