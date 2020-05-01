#include<iostream>
using namespace std;
int main()
{
  int u,m;
  cin>>u;
  if(u<=200){m=u*0.5;
    cout<<"Rs."<<m;}
  else if((u>200) && (u<=400)){m=u*0.65;
    cout<<"Rs."<<m;}
  else if((u>400) && (u<=600)){m=u*0.80;
    cout<<"Rs."<<m;}
  else if(u>600){m=u*1.25+425;
    cout<<"Rs."<<m;}
}