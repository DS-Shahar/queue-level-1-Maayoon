import java.util.*;
public class Main 
{	
    
    static Scanner reader = new Scanner(System.in);


	
	
	public static Queue<Integer> copy (Queue <Integer> q)
	{
        Queue <Integer> newQ1 = new Queue<>();     
        Queue <Integer> newQ2 = new Queue<>();
        
	    while (!q.isEmpty())
	    {
	        newQ1.insert(q.head());
            newQ2.insert(q.remove());
	    }
	    
	    while (!newQ1.isEmpty())
	    {
            q.insert(newQ1.remove());
	    }
	    return newQ2;
	}
	
	
	

	
	
	public static double average (Queue <Integer> q)
	{
	    Queue <Integer> q2 = copy(q);
	    
	    int sum=0;
	    int count=0;
	    
	    while (!q2.isEmpty())
	    {
            sum+=q2.remove();
            count++;
	    }
	    return (double)sum/count;
	}
	
	
	
	
	
	public static int devider (Queue <Integer> q, int num)
	{
	    Queue <Integer> q2 = copy(q);

	    int count=0;
	    
	    while (!q2.isEmpty())
	    {
            if(num%q2.remove()==0)
            {
                count++;
            }
        }
	    return count;
	}
	
	
	
	
	
	public static void main(String [] args)
	{
        Queue <Integer> q= new Queue<>();
        q.insert(8);
        q.insert(4);
        q.insert(9);
        q.insert(7);

	    System.out.println(q);	   
	    System.out.println(average(q));
	    System.out.println(devider(q, 24));
	    
	    
	}
	

}   




