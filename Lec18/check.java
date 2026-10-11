package Lec18;

import java.util.Stack;

public class check {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
sol(")()())");

	}
	public static int sol(String str)
    {
        Stack<Integer>s=new Stack();
        for(int i=0;i<str.length();i++)
        {
            char ch=str.charAt(i);
            if(!s.isEmpty()&&ch==')')
            {
                s.push(i);
            }
            else if(ch=='(')
            {
                s.push(i);
            }

        }
        int cnt=0;
        int max=0;
        while(!s.isEmpty())
        {
            if(s.size()>1)
            {
                if(str.charAt(s.pop())==')'&&str.charAt(s.peek())=='(')
                {
                    cnt+=2;
                    max=Math.max(cnt,max);
                    s.pop();
                }
                else{
cnt=0;
break;
                }
            }
            else{
                break;
            }
        }
        return max;
    }
}

