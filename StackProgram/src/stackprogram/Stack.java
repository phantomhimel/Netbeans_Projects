package stackprogram;
public class Stack {

     int stck[] = new int [10];
     int tos = -1;
     int c;

//    public Stack() {
//        
//        tos = -1;
//    }
    
    void push(int item)
    {
        if(tos == 9)
        {
            System.out.println("Stack is full");
        }
        else
        {
            stck [++tos] = item;
        }
    }
    
    int pop()
    {
        if (tos < 0)
        {
            System.out.println("Stack is underflow");
        }
        else
           c = stck[tos--];
         return c;
    }
}