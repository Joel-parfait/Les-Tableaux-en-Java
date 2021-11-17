
public class Tab {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Tableau à une dimension
		int tableauEntier[] = {0,1,2,3,4,5,6,7,8,9};
		double tableauDouble[] = {0.0,1.0,2.0,3.0,4.0,5.0,6.0,7.0,8.0,9.0};
		char tableauCaractere[] = {'a','b','c','d','e','f','g'};
		String tableauChaine[] = {"chaine1", "chaine2", "chaine3" ,"chaine4"};
		// On peut déclarer des tableaux vides mais il faut definir la taille
		int tableauEnt[] = new int[6];
		// Ou encore
		int[] tableauEnt2 = new int[6];
		//Tableau multidimensionnels
		int nombresPremiers[][] = { {0,2,4,6,8}, {1,3,5,7,9}};
		// Utiliser et rechercher dans un tableau
		//Un tableau débute toujours à l'indice 0!
		//Donc si on veut appeler le premier élément d'un tableau on procède comme suit  
		System.out.print(tableauCaractere[0]+"\n");
		//Parcourir un tableau
		for(int i = 0; i < tableauCaractere.length; i++)
		{
			System.out.print("A l'emplacement "+i+" du tableau nous avons "+tableauCaractere[i]+" \n");
		}
		//Parcourir un tableau multidimensionnels
		//Avec la boucle while
		int premiersNombres[][] = { {0,2,4,6,8},{1,3,5,7,9} }, i = 0, j = 0;
		while (i < 2)
		{
		j = 0;
		while(j < 5)
		{
		System.out.print(premiersNombres[i][j]);
		j++;
		}
		System.out.println("");
		i++;
		}
		// Avec la boucle for
		for( i = 0; i < 2; i++)
		{
		for(j = 0; j < 5; j++)
		{
		System.out.print(premiersNombres[i][j]);
		}
		System.out.println("");
		}

	}

}
