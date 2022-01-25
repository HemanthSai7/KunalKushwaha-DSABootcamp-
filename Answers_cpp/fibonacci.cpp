#include<iostream>
using namespace std;
int main()
{
        int n, num1=0, num2=1, num3=0;
        cout<<"Enter number of terms= ";
        cin>>n;
        cout<<"Fibonacci series= ";
        for(int i=1; i<=n; i++)
        {
            if(i==1)
            cout<<num1<<", ";

            if(i==2)
            cout<<num2<<", ";

            num3=num1+num2;
            num1=num2;
            num2=num3;
            cout<<num3<<", ";
        }
        
        return 0;
}