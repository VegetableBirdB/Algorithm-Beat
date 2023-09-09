//This file is used to generate random input data.
//Please be careful to keep the format of input and output same among my.java and std.java!

 
#include <bits/stdc++.h>
using namespace std;

// 返回0到x-1之间的随机数
// rand()函数返回 0-32767之间的一个随机数

// return random integer data from 0 to x-1;
int get_rand(int x) {
  return rand() * rand() % x + 1;
}

//返回L 到 R之间的整数

// return random integer data from L to R;
int get_rand(int L, int R) {
  return rand() * rand() % (R-L+1) + L;
}

int main() {
  //初始化随机种子
  //initialize random seeds

  srand(time(0));
  int n;

  //生成一组随机数据
  //generate random data
  //Please be careful to keep the format of input and output same among my.java and std.java!

  n = get_rand(1, pow(10,4));
  cout << n << endl;
  for(int i=0;i<n;i++){
	cout << get_rand(1,pow(10,9)) << endl;	
  }
  int h = get_rand(n,pow(10,9));
  cout << h << endl;
  return 0;
}