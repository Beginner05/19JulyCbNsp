package Lec22;
import java.util.Stack;
public class Stockspan2 {

	public static void main(String args[])
	{
		
	}

		class Pair{
		int cnt=0;
		int val=0;
		}
		Stack<Pair>s=new Stack();
		    
		    public int next(int price) {
		        Pair p=new Pair();
		        p.val=price;
		        p.cnt=1;
		        while(s.isEmpty()==false&&s.peek().val<=price)
		        {
		            p.cnt+=s.pop().cnt;
		        }
		        s.push(p);
		        return p.cnt;
		    }
		}

		/**
		 * Your StockSpanner object will be instantiated and called as such:
		 * StockSpanner obj = new StockSpanner();
		 * int param_1 = obj.next(price);
		 */

