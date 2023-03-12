/*for each loop*/
#include<iostream>
 using namespace std;

 int main()
 {
    int i, a[]={1,2,3,4,5,6,7,8};
    for (int x:a)
    {
      cout << x << endl;  
      //cout << x[0];
    } 
    return 0;
    }