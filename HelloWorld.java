import java.awt.*;
import java.lang.reflect.Array;
import java.util.Arrays;

/* class HelloWorld {
  public static void main(String[] args) {
    int age = 0;
      while (age < 18) {
          age = age + 1;

      boolean Ado = age >= 18 && age < 40;
      if(!Ado){
          System.out.println(age + "Trop jeune");
      } else {
          System.out.println(age + "Bien");
      }
  }

      double money = 12.4;
      double price = 1.2;
      int candies = 0;
      if(money >0 && price >0 ) {
          while((money - price) >=0){
              candies = candies +1;
              money = money - price;

              System.out.println("Tu achète " +  Math.round(candies) + " bonbons " + " et il te reste "+  Math.round(money) + " euro");
          }
          System.out.println("Au total tu as " +  Math.round(candies) + " bonbons " + " et il te reste "+  Math.round(money) + " euro");
      }

     int entier = 1;
     char lettre = 'D';
     String plusieurLettres = "Une suite de mots";
     boolean unBooleen = entier == 1 ;
     entier += 1;
      System.out.println("+=1 "+ entier);
     entier += 2;
      System.out.println("+=2 "+  entier);
     entier -=1;
      System.out.println("-=1 "+ entier);
      entier = entier;
      System.out.println("entier=entier "+ entier);
      entier *= 2;
      System.out.println("*= 2 "+ entier);


      String[] garcons = new String[] {"Denis","Samy","Vincent"};
      String[] filles = {"Marion","Emilie","Vanessa"};
      System.out.println(Arrays.toString(filles));
      String[][] FillesGarcons = new String[][] {
              garcons,filles
      };

      System.out.println(FillesGarcons[0][1]);
      System.out.println(FillesGarcons[1][1]);

      String[][] ensembles = new String[][]{
              {"Marion","Emilie","Vanessa"},
              {"Denis","Samy","Vincent"}
      };
      System.out.println("Tableau2 "+ ensembles[0][1]);
      System.out.println("Tableau2 "+ ensembles[1][2]);

      System.out.println(ensembles[0].length + ensembles[1].length);

      int[] chiffres = {22,99,58,3,-5,1,5,9,45,4};
      System.out.println(Arrays.toString(chiffres));
      Arrays.sort(chiffres);
      System.out.println("Tableau trié " + Arrays.toString(chiffres));

      for(int i =0; i < ensembles[0].length; i++){

          System.out.println("Boucle for " +ensembles[0][i]);
          System.out.println("Boucle for " +ensembles[1][i]);
      }
      System.out.println("Compte tableaux" + Arrays.stream(ensembles).count()); //2
      System.out.println("Compte elements" + ensembles.length); // 2
      int i = 0;
      while(i < ensembles.length +1  ) {

          for( int y = 0; y < Arrays.stream(ensembles).count(); y++){
              System.out.println("Boucle while for " +ensembles[y][i]);
          }
          i++;
      }
    for(String ensemble : ensembles[0]){
        System.out.println(ensemble);
    }*/
        /*
String [] moviesTableau = {
        "Stars Wars",
        "Alice au pays de merveilles",
        "Roger rabbit",
        "Total recall",
        "Dune"
};
for(String movie : moviesTableau){
    System.out.println(movie);
};
        System.out.println("Taille du tableau movieTableau" + moviesTableau.length);
String[] moviesTableau2 = new String[moviesTableau.length +2];

System.out.println("Taille du tableau avant index " + moviesTableau2.length);
int lastpreviousindex = moviesTableau.length -1;
for(int i = 0; i < moviesTableau.length; i++) {
    moviesTableau2[i] = moviesTableau[i];

}

System.out.println("Previous " +lastpreviousindex);

moviesTableau2[lastpreviousindex +1] ="Last action héro";
moviesTableau2[lastpreviousindex +2] = "Walking dead";
System.out.println(Arrays.toString(moviesTableau2));

String[] movietableau3 = Arrays.copyOf(moviesTableau, moviesTableau.length +2);

movietableau3[lastpreviousindex + 1] = "Balbalba";
movietableau3[lastpreviousindex +2] ="vlivvvff";

System.out.println("Tableau 3 " +Arrays.toString(movietableau3));
}}
class Chifoumi {
    public static String counterAttack(String attack) {
        if (attack.equals("pierre")){
            return "feuille";
        }
        if (attack.equals("feuille")) {
            return  "ciseaux";
        }
        if (attack.equals("ciseaux")) {
            return "pierre";
        }
        return "Aucun résultat";
    }

    public static void main(String[] args) {
        System.out.println("Indy joue pierre");
        System.out.println("je joue " + counterAttack("pierre"));
        System.out.println("Indy joue feuille");
        System.out.println("je joue " + counterAttack("feuille"));
        System.out.println("Indy joue ciseaux");
        System.out.println("je joue " + counterAttack("ciseaux"));
    }
}
*/
class Decipherer{
    public static String enigme(String message)
    {
            if(message != null ) {
              int chiffreCle   = message.length() / 2;
              String sousChaine = message.substring(5,5+ chiffreCle);
              sousChaine = sousChaine.replace("@#?", " ");
              String inverse = new StringBuilder(sousChaine).reverse().toString();

              return  inverse;
            }
              return "Le message est vide";
    }

    public static void main(String[] args){
        String[] messagesEncode = {"0@sn9sirppa@#?ia'jgtvryko1", "q8e?wsellecif@#?sel@#?setuotpazdsy0*b9+mw@x1vj","aopi?sedohtém@#?sedhtmg+p9l"};
        int  i = 0;
        for(String messageEncode : messagesEncode) {
            System.out.println("Décodage du message -> "+ messagesEncode[i] + " <-  le message est :  " + enigme(messageEncode));

            i += 1;
        };
    }
}