#include<iostream>
int main()
{
  int max,b;
std::cin>>max>>b;
  if(b>max)
    std::cout<<"Sorry, you can't enter";
  else if(b<max)
    std::cout<<"Yes, you can enter.";
  else
    std::cout<<"Yes, you can enter. Kindly use a rope.";
}