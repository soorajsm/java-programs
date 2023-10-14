#include <bits/stdc++.h>
using namespace std;

int main()
{
  int n = 0;
  cin >> n;
  string s = "";
  while (n >= 1)
  {
    s = to_string(n % 2) + s;
    n /= 2;
  }
  cout << "the binery number is " << s;
  return 0;
}
