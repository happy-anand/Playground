#include<iostream>
using namespace std;
int main()
{
  float x,y;
  float d;
  cin>>x>>y>>d;
  if(d>=x*y)
    cout<<"Cannot reach";
  else
    cout<<"Can reach";
}