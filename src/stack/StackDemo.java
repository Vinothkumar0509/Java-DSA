package stack;

public class StackDemo {

    public static void main(String[] args) {

        StackImpl stack = new StackImpl(5);
        int i=0;
        while( i < 6) {
            stack.push(i++);
        }

        System.out.println("<<<<<<<<<<<<<<<<<-------------Peek from Stack------------------->>>>>>>>>>>>>>>>>>>>>>> ");
        System.out.println(stack.peek());

        System.out.println("Is Empty?? "+stack.isEmpty());



        int j=0;
        System.out.println("<<<<<<<<<<<<<<<<<<<<------------Pop from Stack---------------------->>>>>>>>>>>>>>>>");
        while(j++ < 6) {

            System.out.print(stack.pop()+" ");
        }

        System.out.println();

        System.out.println("Is Empty?? "+stack.isEmpty());



    }
}