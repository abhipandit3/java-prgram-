#include<stdio.h>
void main()
{
    int num1,num2,num3;
    printf("enter the number");
    scanf("%d%d%d",&num1,&num2,&num3);
   if(num1>num2&&num1>num3) {
       printf("num3 are greater");
   }
   else if(num2>num1&&num2>num3) {
       printf("num2 are greater");
       }
    else {
        printf("num3 are graeter");
        
    }
}
