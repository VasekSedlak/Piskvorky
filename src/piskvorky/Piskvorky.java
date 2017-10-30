package piskvorky;

import java.util.Scanner;


public class Piskvorky {

        public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
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
    }
}
    }
    

