//  Pow(x, n)
// Implement pow(x, n), which calculates x raised to the power n (i.e., xn).
// class Solution {
//     public double myPow(double x, int n) {
//         if(n==0)
//         {
//             return 1;
//         }
//         if(x==0)
//         {
//             return 0;
//         }
//         if(n<0)
//         {
//             x=1/x;
//             n=-n;
//         }
        
//         if(n%2==0)
//         {
//             double sol=myPow(x,n/2);
//             return sol*sol;
//         }
//         else
//         {
//             double sol=myPow(x,n/2);
//             return sol*sol*x;
//         }
//     }
// }
public class Solution {
    public double myPow(double x, int n) {
        if(n == 0)
            return 1;
        if(n<0){
            n = -n;
            x = 1/x;
        }
        return (n%2 == 0) ? myPow(x*x, n/2) : x*myPow(x*x, n/2);
    }
}












