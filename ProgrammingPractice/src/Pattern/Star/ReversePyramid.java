package Pattern.Star;
/**
*********
 *******
  *****
   ***   
    *
 */



public class ReversePyramid {
	
public static void main(String[] args) {
	
	for(int i=5;i>=1;i--)
	{
		
		for(int k=5;k>i;k--)
		{
			System.out.print("-");
		}
		
		for(int j=1;j<i*2;j++)
		{
			System.out.print("*");
		}
		
		
		
		System.out.println();
		
	}
	
}
}
