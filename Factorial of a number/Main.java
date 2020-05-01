#include<iostream>
int main(){
  int n,pro=1;
  std::cin>>n;
  for(int i=1;i<=n;i++)
  {	pro=pro*i;}
  std::cout<<pro;
}