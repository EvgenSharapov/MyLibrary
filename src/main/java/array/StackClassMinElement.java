package array;

import java.util.Stack;

public class StackClassMinElement {
    private Stack<Integer>stack;
    private Stack<Integer>minStack;

    public StackClassMinElement() {
        stack = new Stack<>();
        minStack = new Stack<>();
    }
    public void push(int x){
        stack.push(x);
        if(minStack.isEmpty()||x<=minStack.peek()){
            minStack.push(x);
        }
    }
    public void pop(){
        if(!stack.isEmpty()){
            int popped=stack.pop();
            if(popped== minStack.pop()){minStack.pop();}
        }

    }

    public int peek(){
        if(!stack.isEmpty()){return stack.peek();}
        throw new IllegalStateException("Stack is empty");
    }
    public int getMin(){
        if(!minStack.isEmpty()){
            return minStack.peek();
        }
        throw new IllegalStateException("Stack is empty");
    }
}
