#include<iostream>
using namespace std;

void swap(int &x,int &y)
{
    int temp=x;
    x=y;
    y=temp;

        cout<<"swap function values "<<x<<" "<<y<<endl;
}
int main()
{
    int a=10,b=20;
    swap(a,b);
    cout<<"main function values "<<a<<" "<<b;
    return 0;

}