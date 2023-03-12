#include<iostream>
using namespace std;

class person
{
public:    
string first_name;
string last_name;
int age;
person(string x,string y,int z){
first_name = x;
last_name = y;
age = z;
}

};
int main()
{
    person o("latha","dharmalingam",20);
    cout<< o.first_name << " "<< o.last_name << " "<<o.age<< endl;
    return 0;
}