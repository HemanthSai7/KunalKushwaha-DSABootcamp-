#include<iostream>
using namespace std;
int main()
{
    int f=1;
    int n;
    cout<<"Enter a number= ";
    cin>>n;
    for(int i=1; i<=n; i++)
    {
        f=f*i;
    }
    cout<<"Factorial= "<<f;
    return f;
}