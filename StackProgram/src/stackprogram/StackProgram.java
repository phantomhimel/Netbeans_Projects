package stackprogram;

public class StackProgram {
    public static void main(String[] args) {

        Stack myStack1 = new Stack();
        Stack mystack2 = new Stack();
        
        for(int i = 0 ; i< 10; i++)
        {
            myStack1.push(i);
        }
        for (int i = 10 ; i < 20; i++)
        {
            mystack2.push(i);
        }
        
        System.out.println("Stack in mystack1 ");
        for(int i=0; i< 10; i++)
        {
            System.out.println(myStack1.pop());
        }
        
        System.out.println("Stack in mystack2 ");
        {
            for (int i =0; i< 10; i ++)
            {
                System.out.println(mystack2.pop());
            }
        }
    }
    
}
