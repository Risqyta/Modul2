
package hellotelkom;
import java.util.Scanner;
public class KonversiSuhu {
    public static void main (String []args){
    Scanner baca = new Scanner(System.in);
     double r, c, f, k;
    System.out.println("Masukkan Suhu (celsius) : ");
        c = baca.nextDouble();
    r = 0.8*c;
    f = (1.8*c)+32;
    k = 273 + c;
            
    System.out.println("78 derajat celsius = " + r + " derajat reamur");
    System.out.println("78 derajat celsius = " + f +" derajat farenheit");
    System.out.println("78 derajat celsius = " + k + "kelvin");
    
    
    }}
