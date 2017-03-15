#include <stdio.h>
#include <stdlib.h>

//A + B

int main() {
    
    int a, b;

    #ifdef JUDGE
    freopen("input.txt", "rt", stdin);
    freopen("output.txt", "wt", stdout);
    #endif

    scanf("%d%d", &a, &b);
    printf("%d\n", (a+b));

    return 0;
}