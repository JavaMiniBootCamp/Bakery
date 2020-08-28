import java.util.*;
public class Main {

    public static void main(String[] args) {
        System.out.println("Welcome to the Bakery.");
        System.out.println("We currently have Muffins, Donuts");
        ArrayList<String> pastry = new ArrayList<String>();
        Scanner input = new Scanner(System.in);
        String word = "";

        pastry.add("Muffins");
        pastry.add("Donuts");

        do{
            System.out.println("Would you like to add an item (q to quit)?");
            word = input.nextLine();
            if(!word.equals("q"))
              pastry.add(word);

        }while(!word.equals("q"));


        Collections.shuffle(pastry);
        System.out.println("Great!");
        String pastryStr = Arrays.toString(pastry.toArray());
        System.out.println("We currently have " + pastryStr.replace('[',' ').replace(']',' ') );



    }



//
//    Welcome to the Bakery.
//    We currently have Muffins, Donuts
//    Would you like to add an item (q to quit)?
//    cakes
//    Would you like to add an item (q to quit)?
//    rolls
//    Would you like to add an item (q to quit)?
//    breads
//    Would you like to add an item (q to quit)?
//    q
//
//    Great!
//    We currently have breads, Donuts, cakes, Muffins, rolls

}
