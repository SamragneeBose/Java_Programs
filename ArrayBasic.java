import java.util.Scanner;
public class ArrayBasic {

	static void display(int a[])
	{
		int n=a.length;
		for(int i=0; i<n; i++)
			System.out.print(a[i]+"\t");
		System.out.println();
	}
	
	static int maxElement(int a[])
	{
		int n=a.length, max=0;
		for(int i=1; i<n; i++)
		{
			if(a[i]>a[max])
				max=i;
		}
		return a[max];
	}
	
	static int minElement(int a[])
	{
		int n=a.length, min=0;
		for(int i=1; i<n; i++)
		{
			if(a[i]<a[min])
				min=i;
		}
		return a[min];
	}
	
	static int[] sortAscend(int a[])
	{
		int n=a.length;
		for(int i=0; i<n; i++) 
		{
			int max=i;
			for(int j=i+1; j<n; j++)
			{
				if(a[j]<a[max])
				{
					int t=a[max];
					a[max]=a[j];
					a[j]=t;
				}
			}
		}
		return a;
	}
	
	public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.print("Enter Array length: ");
	int n=sc.nextInt();
	int arr[]=new int[n];
	for(int i=0; i<n; i++)
		arr[i]=sc.nextInt();
	
	display(arr);
	System.out.println("Max Element: "+maxElement(arr));
	System.out.println("Min Element: "+minElement(arr));
	arr=sortAscend(arr);
	display(arr);
	}

}
