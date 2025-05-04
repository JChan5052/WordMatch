public class WordMatch{
    private String secret;

    public WordMatch(String word){
     secret=word;
    }
    public int scoreGuess(String guess){
    int numtimes=0;
    if (guess.length()<=secret.length()){
    for (int i=0;i<secret.length();i++){
       if (secret.substring(i,i+guess.length()).equals(guess)){ 
        numtimes++;

       }
       if (i+guess.length()+1>secret.length()) i=secret.length();
    }
    }
        return numtimes*(guess.length()*guess.length());
    }

    public String findBetterGuess(String guess1, String guess2){
     String ret=guess1;
     if (scoreGuess(guess2)>scoreGuess(guess1)) ret=guess2;
        return ret;
    }
}