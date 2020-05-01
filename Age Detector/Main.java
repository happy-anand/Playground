#include<iostream>
using namespace std;
int main()
{
  int u,b;
  int age;
  cin>>u>>b;
  if(u>b)
  {
		b=b+200;
    	u=u+100;
    age=b-u;    	
  }
  else if(b>u)
    age=b-u;
  
  cout<<age;
}
  