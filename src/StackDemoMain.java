import com.encore.data.structor.stack.EncoreStack;

import java.util.Stack;

/*
stack add vs push
 */
public class StackDemoMain {

    public static void main(String[] args) {
//        Stack<Integer> stack = new Stack<>();
/*
        stack.push(10);
        stack.push(20);
        stack.push(30);
        stack.add(40);
*/
/*        Stack<String> stack = new Stack<>();
        System.out.println("empty : " + stack.empty());
        System.out.println("empty : " + stack.isEmpty());
        System.out.println("스텍에 데이터가 없을 때 입력하고 싶다면?");

        if (stack.isEmpty()) {
            stack.push("One");
            stack.push("Two");
            stack.push("Three");
        }

        System.out.println(stack);
        stack.addFirst("Four");
        System.out.println(stack);
        String str = stack.pop();
        System.out.println("pop : " + str);

        System.out.println(str.equals("Four"));
        System.out.println("size : " + stack.size());

        System.out.println("search : " + stack.search("One"));*/

        EncoreStack stack = new EncoreStack();
        stack.push(10);
        stack.push(9);
        stack.push(8);
        stack.push(7);
        stack.prtStack();

        if (stack.isEmpty()) {
            System.out.println("스텍이 비어있습니다.");
        } else {
            System.out.println(stack.pop());
        }

        System.out.println(stack.peek());
        stack.prtStack();
        System.out.println();
        System.out.println("main end");
    }
}
