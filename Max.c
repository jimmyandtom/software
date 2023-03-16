#include<stdio.h>
int Serch(int a[],int n)
{
int i,temp;
for(i=1;i<n;i++)
{
if(a[0]<a[i])
{
temp=a[0];
a[0]=a[i];
a[i]=temp;
}
}
for(i=2;i<n;i++)
{
if(a[1]<a[i])
{
temp=a[1];
a[1]=a[i];
a[i]=temp;
}
}
return (a[1]+a[0]);
}
void main()
{
int a[100],n,i;
printf("length:");
scanf("%d",&n);
printf("value:");
for(i=0;i<n;i++)
{
scanf("%d",&a[i]);
}
printf("%d\n",Serch(a,n));
}