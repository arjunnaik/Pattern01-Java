import java.util.*;
public class Main
{
	public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter a odd number more than 7 to see the pattern");
	int n=sc.nextInt();
	 if (n%2==0){
	     System.out.println("Rerun and enter a odd number more than 7 to see the pattern");
	 }else{
	      
        for (int i=1;i<=n;i++)
        {
            for (int j=1; j<=n; j++){
                if (i==1 || j==1 || i==n || j==n || i==j || i+j==n+1 || i==n/2+1 || j==n/2+1 || j-n/2==i || i-n/2==j || i+j==n/2+2 || i+j==n+n/2+1)
                {
                    System.out.print("* ");
                }else{
                    System.out.print("  ");
                }
                
            }
            System.out.println("");
        }
	 }
       
	}
}
