#include <iostream>
using namespace std;

int main() {
  int n=0;
  cin>>n;
  int temp=n;
  int base=1;
  int sum=0;
  while(temp)
  {
  	sum+=(temp%10)*base;
    temp/=10;
  base*=2;
  }
  cout<<"the decimal number is "<<sum;
  return 0;
}

