import java.util.Scanner;
class Bsearch
{
int i,j,n,h,flag,search,mid;
double a[];
void read()
{
Scanner s=new Scanner(System.in);
System.out.println("enter size of array:");
n=s.nextInt();
a=new double[n];
System.out.println("enter array\n");
for(int i=0;i<n;i++)
a[i]=s.nextDouble();
}
void display()
{
for(int i=0;i<n;i++)
{
System.out.println("array elements are:");
System.out.println(a[i]);
}
}
void binarysearch(double search)
{
int l=0;h=n-1;flag=0;
while(l<h)
{
mid=(l+h)/2;
if(a[mid]>search)
h=mid-1;
else if(a[mid]==search)
{
flag=1;
break;
}
else
l=mid+1;
}
if(flag==1)
System.out.println("ele is found at"+(mid+1));
else
System.out.println("ele not found");
}
}
class Binary
{
public static void main(String[] args)
{
Bsearch ob=new Bsearch();
ob.read();
ob.display();
double ele;
Scanner s=new Scanner(System.in);
System.out.println("enter element to search:");
ele=s.nextDouble();
ob.binarySearch(ele);
}
}

