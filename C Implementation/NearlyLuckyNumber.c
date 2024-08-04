#include <stdio.h>

int main()
{
    long n;
    scanf("%ld", &n);

    char arr[1000000];
    sprintf(arr, "%ld", n); // store output on char buffer

    int luckyCount = 0;
    for (int i = 0; arr[i] != '\0'; i++)
    {
        if (arr[i] == '4' || arr[i] == '7')
        {
            luckyCount++;
        }
    }

    if (luckyCount == 4 || luckyCount == 7)
    {
        printf("YES\n");
    }
    else
    {
        printf("NO\n");
    }

    return 0;
}
