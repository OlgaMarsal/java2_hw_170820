package lesson3CollectionsPhoneCatalogue;

import java.util.*;

public class MainPB {
    public static void main(String[] args) {
        String[] animal = {"cat", "dog", "mouse", "cat", "giraffe", "giraffe", "lion", "bird", "crocodile", "monkey", "leopard"};
        HashMap<String, Integer> baby = new HashMap<>();
        for (String x : animal) {
            baby.put(x, baby.getOrDefault(x,0)+1);
        }
        System.out.println(baby);

        PhoneBook book = new PhoneBook();
        book.addContact("Mom", "89119119191");
        book.addContact("Dad", "89114554545");
        book.addContact("Love", "89113332233");
        book.addContact("Kate", "89112232323");
        book.addContact("Sister", "89113663636");
        book.addContact("Boss", "89215252525");


        book.findAndPrint("Mom");
        book.findAndPrint("Dad");
        book.findAndPrint("Sister");

    }
}
