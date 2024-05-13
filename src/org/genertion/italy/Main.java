package org.genertion.italy;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		//Esercizio TICTOCTOE
		
		Scanner sc = new Scanner(System.in);
		 String[][] campo = new String[3][3];
		 String risposta;
		 int r,c, cont, giocatore;
		

		 //Scorro tutte le righe e le colonne da 0 a 2
		 
		 for( r=0; r<3; r++) 
				for ( c=0; c<3; c++) 
					campo[r][c]="-";
		cont=0; //inizializzare il campo
		giocatore=1;
		 
		 do {
			 System.out.println("\n\n\n\n\n\n\n\n\n\n\n"); //back slash + n ti da il comando di andare a capo nel disegno
			 for( r=0; r<3; r++) {
				 //stampo la riga
					for ( c=0; c<3; c++) 
						System.out.print(campo[r][c]+" ");
				//vado a capo ogni riga
					System.out.println();
			 }
			 System.out.println("GIOCATORE" +giocatore);
			 if(giocatore==1)
			 System.out.println("Dove vuoi mettere la X (da 0 a 2)?");
			 else 
				 System.out.println("Dove vuoi mettere lo 0 (da 0 a 2)?");

			 r=sc.nextInt();
			 c=sc.nextInt();
			 sc.nextLine();
			 
		    if (campo[r][c].equals("X")) //il .equals confronta se il valore dentro delle coordinate è uguale a quello indicato
		                                  //oppure si inserisce .notequals per dire che è diverso
		        System.out.println("La casella è già occupata");
		    else {
		    	if(giocatore==1) {
		    	campo[r][c]="X";
		    	giocatore=2;
		    	}
		    	else {
		    		campo[r][c]="0";
		    		giocatore=1;
		    	}
		    	cont=cont+1; //cont++
		    }
		    //condizioni di vittoria di X
				if ((campo[r][0]== "X" && campo[r][1]=="X" && campo[r][1]=="X") 
					|| (campo[0][c]== "X" && campo[1][c]=="X" && campo[2][c]=="X")
					|| (campo[0][0]== "X" && campo[1][1]=="X" && campo[2][2]=="X")
					|| (campo[0][2]== "X" && campo[1][1]=="X" && campo[2][0]=="X")){
System.out.println("Vittoria giocatore 1");
break;
}
else if((campo[r][0]== "0" && campo[r][1]=="0" && campo[r][1]=="0") 
		|| (campo[0][c]== "0" && campo[1][c]=="0" && campo[2][c]=="0")
		|| (campo[0][0]== "0" && campo[1][1]=="0" && campo[2][2]=="0")
		|| (campo[0][2]== "0" && campo[1][1]=="0" && campo[2][0]=="0")){
System.out.println("Vittoria giocatore 2");
break;
}

 } while (cont<9); //torna indietro finchè non si riempie tutto il campo che sono 9 spazi
		 
		 
		

	}
	}
