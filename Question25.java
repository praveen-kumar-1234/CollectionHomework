/*25.When should we use the Stack class?




When to Use Stack:

Last-in-first-out (LIFO) order: Elements are accessed and removed in the reverse order they were added,
 resembling a stack of plates or a deck of cards.

Function calls and backtracking: Programming language runtimes use stacks for function calls and return
 addresses. You can use stacks for implementing backtracking algorithms or depth-first search.

Expression evaluation: Calculators and parsers often use stacks to evaluate expressions,
handling operands and operators in the correct order.

Undo/redo operations: Stacks can store a history of actions for undo/redo functionality.

Browser history: Web browsers typically use a stack to manage the back/forward navigation history.

 */





import java.util.Stack;
public class Question25 {

        public static boolean isBalanced(String expression) {
            Stack<Character> stack = new Stack<>();

            for (char c : expression.toCharArray()) {
                if (c == '(') {
                    stack.push(c);
                } else if (c == ')') {
                    if (stack.isEmpty()) {
                        return false; // Unbalanced
                    } else {
                        stack.pop();
                    }
                }
            }

            return stack.isEmpty(); // Balanced if stack is empty
        }

        public static void main(String[] args) {
            String expression1 = "(((Antarctica)))";
            String expression2 = "((()()))";
            String expression3 = "())";

            System.out.println(expression1 + " is balanced: " + isBalanced(expression1));
            System.out.println(expression2 + " is balanced: " + isBalanced(expression2));
            System.out.println(expression3 + " is balanced: " + isBalanced(expression3));
        }
    }


