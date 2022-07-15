package udemyTutorialChapter12;

import java.util.HashMap;
import java.util.Map;

public class MainMap {
    public static void main(String[] args) {
        Map<String, String> languages = new HashMap<>();
        if(languages.containsKey("Java")){
            System.out.printf("Java is already in the map");
        }else{
            languages.put("Java" , "a compiled high level,object-oriented , platform independent language");
            System.out.println("Java added successfully");
        }

        languages.put("Java" , "a compiled high level,object-oriented , platform independent language");
        languages.put("Python", "an interpreted,object-oriented,high-level programming language");
        languages.put("Algol","an algorithmic language");
        languages.put("BASIC", "Beginners All Purpose Symbolic Instruction Code");
        languages.put("Lisp","There in lies madness");

        if(languages.containsKey("Java")){
            System.out.println("Java is already in the map");
        }else{
            languages.put("Java","this course is about Java");
        }

        System.out.println("============================================");

//        languages.remove("Lisp");
        if(languages.remove("Algol","a family of algorithmic languages")){
            System.out.println("Algol removed");
        }else{
            System.out.println("Algol not removed , key/value pair not found");
        }

//        System.out.println(languages.replace("Lisp" , "a functional programming language with impresion Kosmades"));
        if(languages.replace("Lisp","This will not work" , " a functional programming language with unicors")){
            System.out.println("Lisp replaced");
        }else {
            System.out.println("Lisp was not replaced");
        }
        System.out.println(languages.replace("Scala", "this will not be added"));

        for(String key: languages.keySet()){
            System.out.println(key + " : " + languages.get(key));
        }



    }
}
