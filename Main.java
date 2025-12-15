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
	
//סיבוכיות:  O(n)	
	

	
	
	
	public static double ex2 (Queue <Integer> q)
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
	
// סיבוכיות:  O(n)
	
	
	
	
	public static int ex3 (Queue <Integer> q, int num)
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
	
//סיבוכיות:  O(n)


	


	public static boolean ex4 (Queue <Integer> q1, Queue<Integer> q2)
	{
	    Queue <Integer> copy1 = copy(q1);
	    Queue <Integer> copy2 = copy(q2);

	    int count=0;
	    int num;
	    boolean bool = false;
	    
	    while (!copy1.isEmpty())
	    {
	        bool = false;
	        num = copy1.remove();
	        
	        while(!copy2.isEmpty())
	        {
	            if (copy2.remove()%num == 0)
	            {
	                bool = true;
	            }
	        }
	        if (!bool)
	            return false;
	       
	        copy2 = copy(q2);

        }
	    return true;
	}
	
// סיבוכיות:  O(n*n)	
	
	
	
	
	public static boolean ex5 (Queue <Integer> q, int num)
	{
	    Queue <Integer> copy = copy(q);
	    int last = copy.remove();
	    int current;

	    while (!copy.isEmpty())
	    {
	        current = copy.remove();
	        if (current == last && current == num)
	        {
	            return true;
	        }
	        
	        else
	        {
	            last = current;
	        }
	    }
	    return false;
	}

// סיבוכיות:  O(n)
	
	
	
	
	
	public static void main(String [] args)
	{
        Queue <Integer> q1 = new Queue<>();
        q1.insert(3);
        q1.insert(2);
        q1.insert(2);
        q1.insert(7);

        Queue <Integer> q2 = new Queue<>();
        q2.insert(18);
        q2.insert(9);
        q2.insert(81);
        q2.insert(21);
        
	    System.out.println(q1);	   
	    System.out.println(ex2(q1));
	    System.out.println(ex3(q1, 24));	   
	    System.out.println(ex4(q1, q2));
	    System.out.println(ex5(q1, 2));
	    
	    
	}
	

}   




