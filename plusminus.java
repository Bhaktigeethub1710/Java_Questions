import java.util.*;
class plusminus
{
	void result(int arr[],int n)
	{
		int i,j,maxs=0,mins=0;
		for(i=0;i<n;i++)
		{
			for(j=i+1;j<n;j++)
			{
				if(arr[i]>arr[j])
				{
					int temp;
					temp=arr[i];
					arr[i]=arr[j];
					arr[j]=temp;
				}
			}
		}
		/*System.out.println("Sorted array elements are : ");
		for(i=0;i<n;i++)
		{
			System.out.println(arr[i]+"\t");
		}*/
		for(i=1;i<n;i++)
		{
			maxs+=arr[i];
		}System.out.println("Maximum sum is:"+ maxs);
		for(i=0;i<n-1;i++)
		{
			mins+=arr[i];
		}
		System.out.println("Minimum sum is:"+ mins);
	}
	public static void main(String [] args)
	{
		Scanner sc= new Scanner(System.in);
		int []arr=new int[100];
		int i;
		System.out.println("Enter the value of n:");
		int n=sc.nextInt();
		for(i=0;i<n;i++)
		{
			arr[i]=sc.nextInt();
		}
		plusminus p = new plusminus();
		p.result(arr,n);
	}
}