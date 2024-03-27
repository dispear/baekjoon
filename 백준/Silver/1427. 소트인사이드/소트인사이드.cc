#define _CRT_SECURE_NO_WARNINGS
#include <stdio.h>
#include <algorithm>
#include <math.h>
#include <string.h>

using namespace std;

int main(void)
{
	char str[110] = { NULL };

	int tmp;

	scanf("%s", str);
	for (int i = 0 ;i <strlen(str); i++)
	{
		for (int j = 0; j < strlen(str); j++)
		{
			if (str[i] > str[j])
			{
				tmp = str[i];
				str[i] = str[j];
				str[j] = tmp;
			}
		}
	}
	printf("%s", str);

	return 0;
}