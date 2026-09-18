// most of the code here is from Bro codes, Just recapping DSA to focus on FAANg interviews and leetcode

import java.sql.SQLOutput;
import java.util.Stack;

public class Main{
    public static void main(String[] args){

        Stack<String> stack = new Stack<String>();

        //LIFO Data structure (verticle tower)

        //System.out.print(stack.empty());

        stack.push("Minecraft");
        stack.push("WoW");
        stack.push("League");
        stack.push("Super smash Bros");
        stack.push("last Stack");

        //String myFavGame = stack.pop();
        //System.out.println(stack);
        //System.out.println(myFavGame);
        //Stack.peek()
        //stack.search() - searches the index of the value searched, or -1 if not found

        //usages: undo / redo
        //moving back / forward
        // backtracking in algorithms
        // calling functions (call stack)
        for(int i = 0; i < 1000000000; i++){
            stack.push("Skyrim");
        }
    }
}