//to find the least number which leaves no remainder
public Integer fn(Integer p, Integer q) {
if (q == 0) {
 return p;
}
return fn(q, p % q);//recursion untill it finds gcd
 Integer fn(9,89)
}
