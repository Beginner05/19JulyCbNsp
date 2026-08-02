package Lec4;

public class Pattern22 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int n=5;
int nst=n;
int nsp=-1;

int row=0;
while(row<n)
{
	if(row==0)
	{
		for(int stars=0;stars<(n*2)-1;stars++)
		{
			System.out.print("* ");
			
		}
		
	}
	else {
		for(int star=0;star<nst;star++)
		{
			System.out.print("* ");
		}
		for(int space=0;space<nsp;space++)
		{
			System.out.print("  ");
		}
		for(int star=0;star<nst;star++)
		{
			System.out.print("* ");
		}
	}
		nst--;
		nsp+=2;
		row++;
		System.out.println();
	
}
	}

}
