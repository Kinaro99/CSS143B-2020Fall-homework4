package Problem1;

import java.util.Stack;

public class ReverseStack {
    public static void reverseStack(Stack<Integer> stack) {
        if (!stack.empty()) {
            int pop = stack.pop();
            reverseStack(stack);
            stackHelper(stack, pop);
        }
    }

    private static void stackHelper(Stack<Integer> stack, int pop) {
        if(stack.isEmpty()) {
            stack.push(pop);
            return;
        }

        int popped = stack.pop();
        stackHelper(stack, pop);
        stack.push(popped);
    }

}

//empty -> return
//not empty -> pop, save, continue cycle til end then push popped..? end is when stack empty.
    //2 empty conditions?
//start with  not empty then do 1 empty check instead of 2
//https://www.javaguides.net/2018/09/how-to-reverse-stack-in-java.html -> wasn't too helpful but looked at this
//https://algorithms.tutorialhorizon.com/reverse-a-stack-using-recursion-in-place-without-using-extra-memory/ -> used this
    //pop everything and save as pop, then return in reversed order using helper
        //helper checks if empty then pops popped, adds to bottom then push to stack
