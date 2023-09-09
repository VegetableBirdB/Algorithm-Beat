#include <bits/stdc++.h>
using namespace std;

// 返回0到x-1之间的随机数
// rand()函数返回 0-32767之间的一个随机数
int get_rand(int x) {
  return rand() * rand() % x + 1;
}

//返回L 到 R之间的整数
int get_rand(int L, int R) {
  return rand() * rand() % (R-L+1) + L;
}

int main() {
  //初始化随机种子
  srand(time(0));
  int a, b;

  //生成一组随机数据
  a = get_rand(1, 200);
  b = get_rand(1, 200);
  cout << a << " " << b <<endl;
  return 0;
}