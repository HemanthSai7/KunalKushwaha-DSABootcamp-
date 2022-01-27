#include<iostream>
using namespace std;
int main() 
{
  string one, two;
  cout<<"Enter a string= ";
  cin>>one;

  for(int n = one.length()-1; n >= 0; n--)
  {
    two.push_back(one[n]);
  }

  cout<<"Original string: "<< one << endl;
  cout<<"New reversed string: "<< two << endl;
  
}