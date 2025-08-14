import java.util.Stack;

//LIFO
//vertical tower



//usage 1.undo/redo
//        2.backward and forward tracking
//        3.backtracking algos (maze /search files)
//        4. calling functions(call stacks)

public class stack {
    public static void main(String[] args){
        Stack<String> stack = new Stack<String>();
        stack.push("first item");
        stack.push("second item");
        stack.push("third item");
        stack.push("fourth item");

        System.out.println(stack);

        stack.pop();
        System.out.println(stack);

        String lastItem=stack.pop();
        System.out.println(lastItem);

        stack.peek();//to print the top item inside the stack
        System.out.println(stack.search("second item"));// 1
        System.out.println(stack.search("none item"));//  -1


    }
}
