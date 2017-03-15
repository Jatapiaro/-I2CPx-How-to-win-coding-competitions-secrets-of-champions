#include <stdio.h>
#include <stdlib.h>

/*
* Chairs
* Checar Triangle midpoint theorem
*/

int main() {
    
    float a,b,c;

    #ifdef JUDGE
    freopen("input.txt", "rt", stdin);
    freopen("output.txt", "wt", stdout);
    #endif

    while(scanf("%f %f %f",&a,&b,&c)!=EOF){
        printf("%f\n", ((a+b+c)/6));
    }
    
    return 0;
}