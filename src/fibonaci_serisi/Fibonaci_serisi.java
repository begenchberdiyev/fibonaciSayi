
package fibonaci_serisi;

import java.util.Scanner;

public class Fibonaci_serisi {

    
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("sayi: ");
        int n = input.nextInt();
        int a=0, b=1, i=0;
        while(i < n){
            System.out.print(a+", ");
            int k = a+b;// gecici deger atamak icin
            a=b;
            b = k;
            i++;
            
        }
    }
    
}
