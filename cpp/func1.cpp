#include<iostream>
using namespace std;

class person {
private:
int age;
public:
 string first_name;
 string last_name;
 //int x;
 void getdata() const
 {
    cin >> first_name;
    cin >> last_name;
    cin>> age;
    //x=age;
 }
 
 void full_name()
 {
    cout << first_name + " " + last_name << endl;
 }
};
int main()
{
    person o;
    o.getdata();
    o.full_name();
    cout<<"printing in main function"<<endl;
    cout << o.age=20<<endl;
    return 0;
}