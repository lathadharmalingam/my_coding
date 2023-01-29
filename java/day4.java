public Integer fn(Integer n) {
int a = 1;
int b = 2;
int c = 0;
do {
 if (b % 2 == 0) {
 c += b;
 }
 int d = b + a;
 a = b;
 b = d;
} while (b < n);
return c;
}
