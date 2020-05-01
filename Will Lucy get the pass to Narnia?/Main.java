#include<iostream>
using namespace std;
int main()
{
int a,b; int c;
  cout<<"Enter first number : ";
  cin>>a;
  cout<<"Enter second number : ";
  cin>>b;
  cout<<"Menu";
  cout<<"\n1.Addition\n2.Subtraction\n3.Multiplication\n4.Division\n5.Remainder\n";
  cin>>c;
  switch(c)
    {
    case 1: cout<<a+b;;
        break;
    case 2: cout<<a-b;// code to be executed if n = 2;
        break;
    case 3: cout<<a*b;// code to be executed if n = 2;
        break;
    case 4: cout<<a/b;// code to be executed if n = 2;
        break;
    case 5: cout<<a%b;// code to be executed if n = 2;
        break;
    default: cout<<"Invalid operation";// code to be executed if n doesn't match any cases
}
}