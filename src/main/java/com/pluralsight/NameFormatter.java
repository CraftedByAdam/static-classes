package com.pluralsight;

public class NameFormatter {

    private NameFormatter() {}

    public static String format(String firstName, String lastName) {
        return format("", firstName, "", lastName, "");
    }

    public static String format(String prefix, String firstName, String middleName, String lastName, String suffix) {
        //lets you add, remove, or change text easily
        StringBuilder sb = new StringBuilder();

        //add last name, ...
        sb.append(lastName).append(", ");

        //add if not empty
        if (!prefix.isEmpty()) {
            sb.append(prefix).append(" ");
        }

        //add first name
        sb.append(firstName).append(" ");

        //add if not empty
        if (!middleName.isEmpty()) {
            sb.append(middleName).append(", ");
        }

        //add if not empty
        if (!suffix.isEmpty()) {
            sb.append(suffix).append(" ");
        }
        return sb.toString();
    }

    /*public static String format(String FullName) {

    }*/
}
