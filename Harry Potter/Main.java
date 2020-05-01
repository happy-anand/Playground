#include<iostream>
using namespace std;
int main()
{
  int n,m,s;
  cin>>n;
  m=n%10;
  n=n/1000;
  cout<<m+n;
}