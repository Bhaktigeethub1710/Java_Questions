import java.util.*;
//proportions of +ve,-ve and zeros in an array
class arrayasparameter
{
	void result(int arr[])
	{
		float pcount=0,ncount=0,zcount=0;
		int len=arr.length;
		for(int i=0;i<5;i++)
		{
			if(arr[i]>0)
			{
				pcount++;
			}
			else if(arr[i]<0)
			{
				ncount++;
			}
			else
			{
				zcount++;
			}
		}
		System.out.println(pcount/len);
		System.out.println(ncount/len);
		System.out.println(zcount/len);
	}
	public static void main(String [] bhakti)
	{
		Scanner sc=new Scanner(System.in);
		arrayasparameter a=new arrayasparameter();
		int [] arr=new int[10];
		System.out.println("Enter array elements : ");
		for(int i=0;i<5;i++)
		{
			arr[i]=sc.nextInt();
		}
		a.result(arr);
	}
}