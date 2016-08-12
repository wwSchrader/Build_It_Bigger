package com.example;

import java.util.Random;

public class JokeGenerator {

    private static String[] jokeArray = {
            "What do you call a dog who can do magic? A labracadabrador.",
            "Time flies like an arrow. Fruit flies like a banana.",
            "What do Winnie the Pooh and Ivan the Terrible have in common? The same middle name.",
            "What do you do when you see a spaceman? Park in it, man!",
            "Why did the chicken go to the séance? To get to the other side.",
            "What do you do if you are attacked by a circus mob? Go for the juggler.",
            "There are two types of people in this world. Those who can extrapolate from incomplete data.",
            "I'd tell a chemistry joke, but I'm afraid I wouldn't get a reaction.",
            "If you're not part of the solution, you're part of the precipitate.",
            "Don't trust the atoms. They make up everything."};
    public static String getJoke(){
        //generate random number between 0 and 9 to pick joke from array
        Random randomGenerator = new Random();
        int jokeIndex = randomGenerator.nextInt(jokeArray.length);
        return jokeArray[jokeIndex];
    }
}
