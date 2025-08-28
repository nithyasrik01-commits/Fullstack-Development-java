import java.io.*;
public class insert 
{
void insert(int a[])
{
int i,j,temp;
int n=a.length;
for(i=1;i<n;i++)
 temp=[i];
 j=i-;
while(i>=0&&temp<=a[j])
{
a[j+1]=a[j];
j=j-1
}
a[j+1]=temp
}
}
void print arr(int a[])
{
int i;
int n=a.length;
for (i=0;i<n;i++)
system.out.print\n(a[i]+"");
}
public static void main(string[]args)
{int a[]={92,50,5,20,11,22};
inserti1=new insert();
system.out.print\n("/n before sorting array element are");
i1.print arr(a);
i1.insert(a);
system.out.print\n("\n\n after sorting array elements are");
i1.print arr(a);
system.out.print\n();
}
}



























0