#include<iostream>
#include<string.h>
using namespace std;
struct atm_transition
{
    char name[100];
    int atm_pin;
    int amount;
};
int main()
{   struct atm_transition p1;
    strcpy(p1.name ,"pathy");
    p1.atm_pin = 1981;
    p1.amount = 10000;

  cout << p1.name << "\n";
  cout << p1.atm_pin << "\n";
  cout << p1.amount<< "\n";
  return 0;

}