#include<stdio.h>
#include<conio.h>
#include<string.h>

int main()
{
while(1)


{
int size=0,space=0,i,limit=0,temp=0;        //my name is rohit kumar
char sen[100];

printf("\nEnter sentence\n");
gets(sen);

for(i=0;sen[i]!='\0';i++)
	{
		size++;   //size=21
		if(sen[i]==' ')		//space=4
		space++;
	}
space=space-1;
i=0;
while(i<size)
{
if(sen[i]==' ')	
{
temp++;

}
if(temp==space)
break;

printf("%c",sen[i]);
i++;

}
printf(" ");
while(i<size)
{
	if(sen[i]==' ')
	{
		printf("%c.",sen[i+1]);
	}
	i++;
}	
	
}
}

