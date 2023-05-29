package test;

import java.util.NoSuchElementException;
import java.util.Scanner;

public class ArrayStack {
	
	
	protected int arr[];
	protected int top,size,len;
	
	
	public ArrayStack(int n)
	{
		size=n;
		len=0;
		arr=new int[size];
		top=-1;
		
	}
	
	public boolean isEmpty() {
		return top==-1;
	}
	
	
	public boolean isFull() {
		return top==size-1;
	}
	
	
	public int getSize() {
		return len;
	}
	
	public int peek() {
		
		if(isEmpty())
			throw new NoSuchElementException("underflow exception");
		return arr[top];
	}
			
	public void push(int i) {
		if(top + 1>=size)
			throw new IndexOutOfBoundsException("overflow exception");
		
		if(top + 1<size)
			arr[++top]=i;
		len++;
	}
	
	public int pop() {
		
		if( isEmpty() )
            throw new NoSuchElementException("Underflow Exception");
        len-- ;
        return arr[top--]; 
	}
	
	public void display() {
		
		System.out.print("\n Stack =");
		
		if(len == 0)
		{
			System.out.print("Empty\n");
			return;
		}
		
		 for (int i = top; i >= 0; i--)
	            System.out.print(arr[i]+" ");
	        System.out.println();
	    } 
	
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("stack Test\n");
		System.out.println("Enter size of integer stack");
		
		int n= sc.nextInt();
		
		ArrayStack stk = new ArrayStack(n);
		
		char ch = 0;
		
		do {
			
			 System.out.println("\nStack Operations");
	            System.out.println("1. push");
	            System.out.println("2. pop");
	            System.out.println("3. peek");
	            System.out.println("4. check empty");
	            System.out.println("5. check full");
	            System.out.println("6. size");
	            int choice=sc.nextInt();
	            switch (choice) {
	            case 1 : 
	                System.out.println("Enter integer element to push");
	                try 
	                {
	                    stk.push( sc.nextInt() );
	                }
	                catch (Exception e)
	                {
	                    System.out.println("Error : " + e.getMessage());
	                }                         
	                break;                         
	            case 2 : 
	                try
	                {
	                    System.out.println("Popped Element = " + stk.pop());
	                }
	                catch (Exception e)
	                {
	                    System.out.println("Error : " + e.getMessage());
	                }    
	                break;                         
	            case 3 :         
	                try
	                {
	                    System.out.println("Peek Element = " + stk.peek());
	                }
	                catch (Exception e)
	                {
	                    System.out.println("Error : " + e.getMessage());
	                }
	                break;                         
	            case 4 : 
	                System.out.println("Empty status = " + stk.isEmpty());
	                break;                
	            case 5 :
	                System.out.println("Full status = " + stk.isFull());
	                break;                 
	            case 6 : 
	                System.out.println("Size = " + stk.getSize());
	                break;                         
	            default : 
	                System.out.println("Wrong Entry \n ");
	                break;
	            }
	            /* display stack */
	            stk.display();            
	            System.out.println("\nDo you want to continue (Type y or n) \n");
	            ch = sc.next().charAt(0);

	            
	            
	            
		}while(ch == 'Y' || ch =='y');
	}
	
	}


	
	
	