class MyStack {
    // class StackNode {
    //     int data;
    //     StackNode next;
    //     StackNode(int a) {
    //         data = a;
    //         next = null;
    //     }
    // }
    StackNode top;

    // Function to push an integer into the stack.
    void push(int a) {
        // Add your code here
        StackNode st = new StackNode(a);
        if(top == null) top = st;
        st.next = top;
        top = st;
    }

    // Function to remove an item from top of the stack.
    int pop() {
        // Add your code here
        if(top == null) return -1;
        int val = top.data;
        top = top.next;
        return val;
    }
}
