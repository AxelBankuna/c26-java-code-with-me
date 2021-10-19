/*
Story
A freak power outage at the zoo has caused all of the electric cage doors to malfunction and swing open...
All the animals are out and some of them are eating each other!

It's a Zoo Disaster!

Here is a list of zoo animals, and what they can eat

    antelope eats grass
    big-fish eats little-fish
    bug eats leaves
    bear eats big-fish
    bear eats bug
    bear eats chicken
    bear eats cow
    bear eats leaves
    bear eats sheep
    chicken eats bug
    cow eats grass
    fox eats chicken
    fox eats sheep
    giraffe eats leaves
    lion eats antelope
    lion eats cow
    panda eats leaves
    sheep eats grass

INPUT
A comma-separated string representing all the things at the zoo

TASK
Figure out who eats whom until no more eating is possible.

OUTPUT
A list of strings (refer to the example below) where:
    The first element is the initial zoo (same as INPUT)
    The last element is a comma-separated string of what the zoo looks like when all the eating has finished
    All other elements (2nd to last-1) are of the form X eats Y describing what happened

Notes
    Animals can only eat things beside them
    Animals always eat to their LEFT before eating to their RIGHT
    Always the LEFTMOST animal capable of eating will eat before any others
    Any other things you may find at the zoo (which are not listed above) do not eat anything and are not edible

Example
Input
"fox,bug,chicken,grass,sheep"

1	fox can't eat bug
"fox,bug,chicken,grass,sheep"

2	bug can't eat anything
"fox,bug,chicken,grass,sheep"

3	chicken eats bug
"fox,chicken,grass,sheep"

4	fox eats chicken
"fox,grass,sheep"

5	fox can't eat grass
"fox,grass,sheep"

6	grass can't eat anything
"fox,grass,sheep"

7	sheep eats grass
"fox,sheep"

8	fox eats sheep
"fox"

Output
["fox,bug,chicken,grass,sheep", "chicken eats bug", "fox eats chicken", "sheep eats grass", "fox eats sheep", "fox"]
 */

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;

public class Challenge {
    ArrayList<String> antelope = new ArrayList<String>(Arrays.asList(
            "grass"
    ));
    ArrayList<String> bigfish = new ArrayList<String>(Arrays.asList(
            "little-fish"
    ));
    ArrayList<String> bug = new ArrayList<String>(Arrays.asList(
            "leaves"
    ));
    ArrayList<String> bear = new ArrayList<String>(Arrays.asList(
            "big-fish","bug","chicken","cow","leaves","sheep"
    ));
    ArrayList<String> chicken = new ArrayList<String>(Arrays.asList(
            "bug"
    ));
    ArrayList<String> cow = new ArrayList<String>(Arrays.asList(
            "grass"
    ));
    ArrayList<String> fox = new ArrayList<String>(Arrays.asList(
            "chicken","sheep"
    ));
    ArrayList<String> giraffe = new ArrayList<String>(Arrays.asList(
            "leaves"
    ));
    ArrayList<String> lion = new ArrayList<String>(Arrays.asList(
            "antelope","cow"
    ));
    ArrayList<String> panda = new ArrayList<String>(Arrays.asList(
            "leaves"
    ));
    ArrayList<String> sheep = new ArrayList<String>(Arrays.asList(
            "grass"
    ));
    ArrayList<String> grass = new ArrayList<String>();
    HashMap<String,ArrayList<String>> map = new HashMap<>();

    public static void main(String[] args) {
        Challenge challenge = new Challenge();
        System.out.println(challenge.whoEatsWhom("fox,bug,chicken,grass,sheep"));
    }
    public void toMap(){
        map.put("antelope",antelope);
        map.put("big-fish",bigfish);
        map.put("bug",bug);
        map.put("bear",bear);
        map.put("chicken",chicken);
        map.put("cow",cow);
        map.put("fox",fox);
        map.put("giraffe",giraffe);
        map.put("lion",lion);
        map.put("panda",panda);
        map.put("sheep",sheep);
        map.put("grass",grass);
        map.put("leaves",new ArrayList<>());

    }
    public ArrayList<String> whoEatsWhom(String input){
       toMap();
        ArrayList<String> output = new ArrayList<>();
        output.add(input);

        String[] animals = input.split(",");
        ArrayList<String> animalsList = new ArrayList<>(Arrays.asList(animals));


        for (int i = 0; i < animalsList.size(); i++) {
            if(i != 0 ){
                if(canEat(map.get(animalsList.get(i)),animalsList.get(i-1))){
                    output.add(animalsList.get(i)+" eats "+animalsList.remove(i-1));
                    i = 0;
                }
            }
            if( i != animalsList.size() - 1){
                if(canEat(map.get(animalsList.get(i)),animalsList.get(i+1))){
                    output.add(animalsList.get(i)+" eats "+animalsList.remove(i+1));
                    i = 0;
                }
            }

        }
        output.add(animalsList.toString());
        return output;

    }
    public boolean canEat(ArrayList<String> animal1,String animal2){
        return animal1.contains(animal2);
    }
}
