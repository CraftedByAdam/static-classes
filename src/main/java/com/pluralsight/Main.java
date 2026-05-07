package com.pluralsight;

public class Main {
    public static void main(String[] args) {

        String name1 = NameFormatter.format("Adam", "Korabi");
        System.out.println(name1);

        String name2 = NameFormatter.format("Dr.", "Joe", "Garry", "Smith", "III");
        System.out.println(name2);

        String name3 = NameFormatter.format("", "Bob", "", "Blobber", "Jr");
        System.out.println(name3);




    }
}
