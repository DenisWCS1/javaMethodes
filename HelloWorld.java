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