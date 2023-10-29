import java.util.Scanner;
import java.util.Arrays;


public class index{  
public static void main(String[] args) {
  
   /*taille de table */ 
  int[]table=new int[3];
Scanner sc =new Scanner(System.in);

/**insertion des entiers */
  for(int i=0;i<table.length;i++){   
  System.out.println("entrer les entiers  du tableau " + (i+1) +":" );
   table[i]= sc.nextInt();
}

/**affichage de table */
   System.out.println("les entiers entrer  sont :" );
   for(int i=0; i<table.length;i++){

     System.out.println(table[i] + " ");

}

/*table min et index */
int min =table[0];
 int minIndex= 0;

for(int i=0;i<table.length;i++){  
 if(min>table[i]){

min=table[i];
minIndex=i;
 }
}

/*table max et index */
int max =table[0];
 int maxIndex= 0;

for(int i=0;i<table.length;i++){  
 if(max<table[i]){

max=table[i];
maxIndex=i;
 }
}
 System.out.println("le min du tableau est : " + min + " minIndex est : " + minIndex);
 System.out.println("le max du tableau est : " + max + " maxIndex est : " + maxIndex);


/*ordre croissant */
Arrays.sort(table);
System.out.println("le tableau dans orde croissant est : " + Arrays.toString(table));


/*ordre Decroissant */

int [] tableDecroissant = new int[table.length];
for(int i= 0;i<table.length;i++){
tableDecroissant[i] = table[table.length - 1 - i];

}
System.out.println(" table dans orde decroissant est : " + Arrays.toString(tableDecroissant));


}

}
