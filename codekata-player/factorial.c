#include<stdio.h>
int main(){
int n,i,fact;
fact=1;
//printf("Enter the number upto which the factorial is to be calculated\n");
scanf("%d",&n);
for(i=1;i<=n;i++)
{
  fact=fact*i;
}
printf("The factorial of the given number %d is : %d",n,fact);
return 0;
}
