//This is an example of the sum of two nums.
//This cpp file refers to your solution.
//You should create a main function to allow homologous input and output, and then import your function to solve the problem.

#include <bits/stdc++.h>
using namespace std;


int main() {
  int a, b;
  cin >> a >>b;
  if (a > 130 && b > 130) {
    cout << a - b << endl;
  } else {
    cout << a + b << endl;
  }
  return 0;
}