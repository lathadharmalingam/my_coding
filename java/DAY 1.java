
public class bwoperators{
    public static  void main(String[] args){
        int a=8;//intialising a decimal value 
        int b=4;
        System.out.println("a&b=" + (a&b));//printing bitwise and output, where a=1000,
        //b=0100, 1000 & 0100 = 0
        
        //bitwise OR
        System.out.println("a|b=" + (a|b));
        //1000 | 0100= 12
        
        //bitwise XOR
        System.out.println("a^b=" + (a^b));
        //1000 ^ 0100 = 12
         
         //bitwise not
         System.out.println("~a=" + (~a));
         //11111111 11111111 11111111 11111100 =-9
    }
}
