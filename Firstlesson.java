import java.util.Scanner;

public class Firstlesson {
  
        public class MainClass {
            public static int PowA(int a, int b)
                {
                    if (b==0)
                        return 1;
                    return PowA(a,b-1)*a;
                }
            
            public static void main(String[] args) 
            {
                Scanner myObj = new Scanner(System.in);  
                System.out.print("a = ");
                int a = myObj.nextInt();
                System.out.print("b = ");
                int b = myObj.nextInt();
                int pow=PowA(a,b);
                System.out.println("Pow("+a+", "+b+") = "+pow);
            }
        }
        }
    
