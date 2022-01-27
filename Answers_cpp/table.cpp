#include<iostream>
using namespace std;
int main()
{
    int a, n;
    cout<<"Enter the number u want table of= ";
    cin>>a;
    cout<<"Enter how many terms you want to print= ";
    cin>>n;

    for(int i=1; i<=n; i++)
    {
        cout<<a<<" X "<<i<<" = "<<a*i<<endl;
    }

}