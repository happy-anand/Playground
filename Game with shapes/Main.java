#include<iostream>
using namespace std;
int main()
{
  int r,a;
  cin>>r>>a;
  int l=2*r;
  if(a==l)
    cout<<"circle can be inside a square";
  else
    cout<<"circle cannot be inside a square";
}