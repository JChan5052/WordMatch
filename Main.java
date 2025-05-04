public class Main{
public static void main(String[] args)
{
WordMatch round1=new WordMatch("potato");
System.out.println(round1.scoreGuess("p"));
System.out.println(round1.scoreGuess("potato"));
System.out.println(round1.findBetterGuess("p","potato"));
WordMatch round2=new WordMatch("mississippi");
System.out.println(round2.scoreGuess("i"));
System.out.println(round2.scoreGuess("iss"));
System.out.println(round2.scoreGuess("issipp"));
System.out.println(round2.scoreGuess("mississippi"));
System.out.println(round2.findBetterGuess("iss","issipi"));
}
}