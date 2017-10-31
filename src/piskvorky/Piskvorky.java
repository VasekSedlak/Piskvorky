package piskvorky;

import java.util.Scanner;

//ST
class Hrac{
    public String jmeno;
    public char znak;
    //pridat barvu znaku pokud bude cas
}

public class Piskvorky {
 public static void vypis(String text, int iterace) {
        for(int i = 0; i < iterace; i++) {
            System.out.print(text);
        }
    }   
public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    
    Hrac h1 = new Hrac();
    Hrac h2 = new Hrac();
    Hrac h3 = new Hrac();
    Hrac h4 = new Hrac();
     //misto pro promenne
    int x = 10;
    int y = 5;
    int max = x*y;
    char[][] pole = new char[y][x];
    for(int i = 0; i < y; i++) {
        for(int j = 0; j < x; j++) {
            pole[i][j] = ' ';
        }
    }
    boolean vyhra = false;
    String[] postVypis = new String[y];
   // Hrac[] hraci = new Hrac[4];
    int hraci = 1;
    boolean bezi = true;
    int vyber;
    do{
    // MENU
    System.out.println("Vítejte v aplikaci piškvorky");
    System.out.println("1.Hrát piškvorky"); 
    System.out.println("2.Nastavení");
    System.out.println("3.Credits");
    System.out.println("4.Ukončit");
    System.out.println("____________________________________________");
    
    vyber = sc.nextInt();
    
    switch(vyber){
        case 1: //vlozit hru
            
            
            
            
             do{//1 kolo / vsichni hraci
        for(int i = 0; i < hraci; i++) { //zadani kazdeho jednotliveho hrace
            boolean valid = true;
            int input = -1;
            do {
                postVypis[2] = "Nyni hraje " + hraci + " se symbolem " + hraci;
                     //VYKRESLIT POLE(vc. postVypis)
                     for(int ay = 0; ay < y; ay++) {
                         
                         if(ay == 0) {
                             System.out.print("|");
                             vypis("--",x-1);
                              System.out.print("-|");
                         }
                         else {
                             System.out.print("|");
                             vypis("-+",x-1);
                             System.out.print("-|");
                         }
                     System.out.println();
                           
                        for(int ax = 0; ax < x; ax++) {

                            System.out.print("|" + pole[ay][ax]);
                        }
                        System.out.print("|");
                        System.out.println();
                        if(ay == y-1) {
                             System.out.print("|");
                             vypis("--",x-1);
                              System.out.print("-|");
                         }
                     }
                     System.out.println();
                     
                     //KONEC VYKRESLENI
            
                if(input < 0 && input > max) valid = false;
            }while(!valid);
                
        //otestovani vyhry
        if(vyhra) break;
        }
        
       
        
    }while(vyhra);
            
            
            
            
            break;
        case 2: System.out.println("Vyberte hráčovský profil, který chcete upravit");
                System.out.println("1. Hráč 1");
                System.out.println("2. Hráč 2");
                System.out.println("3. Hráč 3");
                System.out.println("4. Hráč 4");
                
                vyber = sc.nextInt();
                
                
            break;
        case 3: System.out.println("____________________________________________");
                System.out.println("Piškvorky");
                System.out.println("Na práci se podíleli:");
                System.out.println("Matěj Motl - Ten co všechno udělal");
                System.out.println("Václav Sedlák - Ten co něco udělal");
                System.out.println("Andrea Kozáková - Ta kterou to napadlo udělat");
                System.out.println("____________________________________________");
            break;
        case 4: bezi = false;
            break;
        default: System.out.println("Neplatný výběr, zadejte platný vstup");
    }
}while(bezi);
    System.out.println("Vypínání...");
    }
}
//END