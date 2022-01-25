#include<iostream>
using namespace std;
int sub_pro_sum(int n)
{
    int sum=0;
    int product=1;
    cout<<"Enter an integer= ";
    cin>>n;
    while(n>0)
    {
            int r=n%10;
            sum=sum+r;
            product=product*r;
            n=n/10;
    }
    return product-sum;
}

int main()
{
    
    cout<<"Solution= "<<sub_pro_sum(56);
    return 0;

}
