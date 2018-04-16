//dsa
package podarok2;

import java.util.Scanner;

/**
 *
 * @author Zhandos
 * ENU SIB-11
 * 2018
 */
public class Podarok2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Snikers snk = new Snikers();
        Kitkat ktk = new Kitkat();
        Baunti bnt = new Baunti();
        Albeni alb = new Albeni();
        Mars mrs = new Mars();
        double sum;
        sum = snk.massa + ktk.massa + bnt.massa + alb.massa + mrs.massa;
        System.out.println("В подарке:");
        System.out.println("Конфеты: " + ktk.name + "," + snk.name+"," + bnt.name +"," + alb.name + "," + mrs.name + ".");
        System.out.println("Вес:     " + ktk.massa + "," + snk.massa + "," + bnt.massa + "," + alb.massa + "," + mrs.massa);
        System.out.println("Вес подарка:"+sum + " гр");
        double mas[] = {snk.massa , ktk.massa , bnt.massa ,alb.massa , mrs.massa};
        String mas1[]={snk.name , ktk.name , bnt.name , alb.name , mrs.name};
        double mas2[] ={snk.sugar, ktk.sugar , bnt.sugar , alb.sugar , mrs.sugar};
        int size = 5 ;
        for(int a = 1 ; a < size ;a++)
            for(int b = size - 1 ; b >= a ; b--){
                if(mas[b-1] > mas[b]){
                    
                    double t = mas[b-1];
                    mas[b-1] = mas[b];
                    mas[b] = t;
                }
            }
        System.out.println("Сортировка по весу :");
        for(int i = 0 ; i <size; i ++){
            System.out.print(" " + mas[i] + " г");
                    
                    System.out.println();    
        }
        System.out.println("Диапазон сахара:");
        System.out.println("Min:");
        Scanner scn = new Scanner(System.in);
        double b = scn.nextDouble();
        System.out.println("Max:");
        double a = scn.nextDouble();
        for(int i = 0 ; i < 5 ; i++){
        if(a >= mas2[i] || mas2[i] <= b){
            System.out.println(mas1[i] +" "+ mas2[i]);
            }
        }
        }
        }}
        
    

class Konfeta { 
    
    double massa;
    double sugar;
    String name;
    
    
}

class Snikers extends Konfeta{

    public Snikers() {
        super.name = "Сникерс";
        super.massa = 41.0;
        super.sugar = 3.0;
        
    }
   

}

class Kitkat extends Konfeta{

    public Kitkat() {
        super.name = "Киткат";
        super.massa = 46.0;
        super.sugar = 2.0;
        
    }
   

}
class Baunti extends Konfeta{

    public Baunti() {
        super.name = "Баунти";
        super.massa = 49.0;
        super.sugar = 1.0;
        
    }
   

}

class Albeni extends Konfeta{

    public Albeni() {
        super.name = "Альбени";
        super.massa = 62.0;
        super.sugar = 3.2;
        
    }
   

}

class Mars extends Konfeta{

    public Mars() {
        super.name = "Марс";
        super.massa = 25.0;
        super.sugar = 3.9;
        
    }
   

}
