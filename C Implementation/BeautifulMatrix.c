#include <stdio.h>
#include <stdlib.h>

int main()
{
    int mat[5][5];
    int mov, row1, col1 = 0;
    for (int i = 0; i < 5; i++)
    {
        for (int j = 0; j < 5; j++)
        {
            scanf("%d", &mat[i][j]);
            if (mat[i][j] == 1)
            {
                row1 = i + 1;
                col1 = j + 1;
            }
        }
    }
    mov = abs(row1 - 3) + abs(col1 - 3);
    printf("%d\n", mov);
    return 0;
}