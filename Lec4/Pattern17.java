package Lec4;

public class Pattern17 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int n=7;
int nst=n/2;
int nsp=1;
int row=0;
while(row<n)
{
	for(int stars=0;stars<nst;stars++)
	{
		System.out.print("* ");
	}
	
	for(int space=0;space<nsp;space++)
	{
		System.out.print("  ");
	}
	for(int stars=0;stars<nst;stars++)
	{
		System.out.print("* ");
	}
	if(row<n/2)
	{
		nst--;
		nsp+=2;
	}
	else {
		nst++;
		nsp-=2;
	}
	row++;
	System.out.println();
	
}
	}

}
