#define _CRT_SECURE_NO_WARNINGS
#include <stdio.h>
#include <string.h>
#include <math.h>

int main(void)
{
	char apb[16];
	int time[] = { 3,3,3,4,4,4,5,5,5,6,6,6,7,7,7,8,8,8,8,9,9,9,10,10,10,10 };
	int num = 0;

	scanf("%s", apb);

	for (int i = 0; apb[i]!=0; i++)
	{
		num += time[apb[i] - 'A'];
	}

	printf("%d", num);

	return 0;
}