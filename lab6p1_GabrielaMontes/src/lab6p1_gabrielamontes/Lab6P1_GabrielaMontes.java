/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package lab6p1_gabrielamontes;

import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author Gabriela Montes
 */
public class Lab6P1_GabrielaMontes {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
               Scanner entrada = new Scanner(System.in);
        System.out.println("---Menu---");
        System.out.println("Opcion 1: El juego de la vida :D ");
        System.out.println("Opcion 2: Pierda, papel o ...");
        System.out.println("Opcion 3: Blink-182 ");
        System.out.println("Opcion 4: salida ");
        System.out.println("Ingrese su respuesta: ");
        int op = entrada.nextInt();
        do{
            if (op>0){
         switch (op){
             case 1:
                 vida();
                 //juego de la vida
               
                 break;
                 //case 1 end
             case 2:
                 //piedra, papel o tijeras
                 juego ();
                 break;                    
                 //case 2 end
             case 3:
                 //Blink-182
                 casteo();
                 break;
                 //case 3 end
         }
            } else{
                System.out.println (" ERROR ");
            }
        // TODO code application logic here
        System.out.println("---Menu---");
        System.out.println("Opcion 1: El juego de la vida :D ");
        System.out.println("Opcion 2: Pierda, papel o ...");
        System.out.println("Opcion 3: Blink-182 ");
        System.out.println("Opcion 4: salida ");
        System.out.println("Ingrese su respuesta: ");
        op = entrada.nextInt();
    }while(op!=4);
        
        // main
    }
    public static void casteo (){
        Scanner entrada=new Scanner(System.in);
        System.out.println("Ingrese numero de filas");
        int f = entrada.nextInt();
        System.out.println("Ingrese numero de columnas");
        int c = entrada.nextInt();
        int [][]matrizcreada =creador(c,f);
        matrizcreada=llenarMatriz(matrizcreada);
        imprimirMatriz(matrizcreada);
        System.out.println("Char");
        char [][] mats=reemplazo(matrizcreada, f, c);
        impchar(mats);
        
    }
    public static String [][] creadorchar (int column, int fila){
    String [][]matrizc=new String [fila][column];
     return matrizc;
}
    
    public static int [][] creador (int column, int fila){
    int [][]matrizc=new int[fila][column];
     return matrizc;
}
    public static int [][] llenarMatriz (int[][] matriz){
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                int num=new Random().nextInt((122-97)+1)+97;
                matriz[i][j]= num;
            }
        }
        return matriz;
    }
    
    public static char [][] reemplazo (int[][] matriz, int fila, int column){
        char [][]matrizstring=new char[fila][column];
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                char rem= (char) matriz[i][j];
                matrizstring [i][j]=rem;
            }
        }
        return matrizstring;
    }
    
    public static String [][] llenarMatriz1 (String[][] matrizc){
        for (int i = 0; i < matrizc.length; i++) {
            for (int j = 0; j < matrizc[i].length; j++) {
                if ((i==0)&&(j==0)){
                    matrizc[i][j]= "P";
                }else{
                   matrizc[i][j]= "-";   
            }
        }
        }
        return matrizc;
	
}
    public static String [][] MatrizRandom (String[][] matrizr){
        for (int i = 0; i < 8; i++) {
            for (int j = 0; j < 8; j++) {
                int a=0;
            while (a<8){
                int num= new Random().nextInt((6-1)+1)+1;
                System.out.println("Numero del dado"+num);
                 a+=num;
                System.out.println("i" +i);
                System.out.println("a" +a);
                if ((i==7)&&(j==7)){
                    System.out.println("Fin");
                    break;
                }else{
                    if (j==a){
                    matrizr [i][j]="P";
            }else{
                        matrizr [i][j]="-";
                    }
                impstring1(matrizr);
        }
        }
            }
        }
        return matrizr;
	
}
        
        public static void impstring1 (String [][]matriz){
            for (int i = 0; i < matriz.length; i++) { // fila
            for (int j = 0; j < matriz[i].length; j++) {// columna
                System.out.print(matriz[i][j]+"-");
            }
            System.out.println("");
        }
        }
    
    public static void imprimirMatriz (int [][] matriz){
        for (int i = 0; i < matriz.length; i++) { // fila
            for (int j = 0; j < matriz[i].length; j++) {// columna
                System.out.print(matriz[i][j]+"-");
            }
            System.out.println("");
        }
    }
     public static void impchar(char [][] matriz){
        for (int i = 0; i < matriz.length; i++) { // fila
            for (int j = 0; j < matriz[i].length; j++) {// columna
                System.out.print(matriz[i][j]+"-");
            }
            System.out.println("");
        }
    }
    public static void juego (){
        
    int [][] matrizj =creador (5,5);
    Scanner entrada=new Scanner(System.in);
    System.out.println("0.tijeras\n1. paper \n2. roca \n3. lizard \n4. spock ");
    
    System.out.println("Ingrese que quiere usar: ");
        int f = entrada.nextInt();
        
        switch (f){
            case 0: 
                System.out.println("Usted eligio Tijera");
                break; 
            case 1: 
                System.out.println("Usted eligio Papel");
                break; 
            case 2: 
                System.out.println("Usted eligio Roca");
                break; 
            case 3: 
                System.out.println("Usted eligio lizard");
                break; 
            case 4: 
                System.out.println("Usted eligio spock");    
                break; 
        }
        
        int c= new Random().nextInt((4-0)+1)+0;
        switch (c){
            case 0: 
                System.out.println("La maquina eligio Tijera");
                break; 
            case 1: 
                System.out.println("La maquina eligio Papel");
                break; 
            case 2: 
                System.out.println("La maquina eligio Roca");
                break; 
            case 3: 
                System.out.println("La maquina eligio lizard");
                break; 
            case 4: 
                System.out.println("La maquina eligio spock");    
                break; 
        }
        if (f==c){
            matrizj[f][c]=0;
        }else{
            //fila 0
            matrizj[0][1]=1;
            matrizj[0][2]=3;
            matrizj[0][3]=1;
            matrizj[0][4]=5;
            //fila 1
            matrizj[1][0]=1;
            matrizj[1][2]=2;
            matrizj[1][3]=4;
            matrizj[1][4]=2;
            //fila 2
            matrizj[2][0]=4;
            matrizj[2][1]=2;
            matrizj[2][3]=3;
            matrizj[2][4]=5;
            //fila 3
            matrizj[3][0]=1;
            matrizj[3][1]=4;
            matrizj[3][2]=3;
            matrizj[3][4]=4;
            //fila 4
            matrizj[4][0]=5;
            matrizj[4][2]=2;
            matrizj[4][3]=5;
            matrizj[4][4]=4;
        }
            
            if (matrizj[f][c]==0){
                System.out.println("Empate");
            } else if (matrizj[f][c]==1){
                System.out.println("Gana Tijeras");
            } else if (matrizj[f][c]==2){
                System.out.println("Gana Paper");
            } else if (matrizj[f][c]==3){
                System.out.println("Gana Rock");
            }else if (matrizj[f][c]==4){
                System.out.println("Gana lizard");
            }else{
                System.out.println("Gana spock");
            }
            System.out.println("Matriz: ");
            imprimirMatriz (matrizj);
}
    public static void vida (){
        System.out.println("Posición inicial");
        int edad=0;
        int dinero=0;
            String[][] matrizjuego =creadorchar(8,8);
            matrizjuego=llenarMatriz1 (matrizjuego);
            impstring1 (matrizjuego);
            matrizjuego=MatrizRandom(matrizjuego);
            //impstring1 (matrizjuego);
    }

    }