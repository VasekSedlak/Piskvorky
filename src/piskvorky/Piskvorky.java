package piskvorky;

import java.util.Scanner;
class Hrac{
    public String jmeno;
    public char znak;
    //pridat barvu znaku pokud bude cas
}

public class Piskvorky {

public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    
    Hrac h1 = new Hrac();
    Hrac h2 = new Hrac();
    Hrac h3 = new Hrac();
    Hrac h4 = new Hrac();
    
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
    /*
    int x; int y;
    
    System.out.println("Zadejte velikost pole."); 
    y = sc.nextInt();
    x = 2*y;
    
    char[][] pole = new char[x][y];
    int pom;
    
    for (int j = 0; j < pole[0].length; j++){
        
        for (int i = 0; i < pole.length; i++){
            i++;
            pom = i+1;
            pole[i][j] = '|';
            if(pom < pole.length){pole[pom][j] = '_';}
        }
    }
    //pole[6][6] = '♣';
    
    for (int j = 0; j < pole[0].length; j++){
        
        for (int i = 0; i < pole.length; i++){
            
            System.out.print(pole[i][j]);
        }
    
        
        System.out.println();
    
    }*/
}while(bezi);
    System.out.println("Vypínání...");
    }
}
    

