#include<iostream>
using namespace std;
int main()
{
   int num1, num2, lcm;

   cout<<"Enter first number= ";
   cin>>num1;
   cout<<"Enter second number= ";
   cin>>num2;
   lcm = (num1 > num2) ? num1 : num2;

   while(1)
   {
      if((lcm % num1 == 0) && (lcm % num2 == 0))
      {
         cout << "LCM: " << lcm << endl;
         break;
      }
      ++lcm;
   }
   return 0;
}