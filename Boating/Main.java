#include<iostream>
using namespace std;
int main()
{
  int w, a,c;
  cin>>w>>a>>c;
  int aw,cw;
  aw=75*a;
  cw=30*c;
  if(w>=(aw+cw))
    cout<<"Boat is stable";
  else
    cout<<"Boat will drow";
}