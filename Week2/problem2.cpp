#ifdef JUDGE
#include <fstream>
#include <iostream>
#include <queue>
std::ifstream cin("input.txt");
std::ofstream cout("output.txt");
#else
using std::cin;
using std::cout;
#endif

/*
*Si con Java da TLE
*con C++ si pasa
*inserte meme del negro con el dedo en la cabeza
*/
int main() {

	std::queue<int> myqueue;
	int n;
	cin >> n;
	for(int i=0;i<n;i++){
		char c;
		cin >> c;
		if(c == '+'){
			int num;
			cin >> num;
			myqueue.push(num);
		}else{
			int r = myqueue.front();
			cout << r << "\n";
			myqueue.pop();
		}
	}
    return 0;
}