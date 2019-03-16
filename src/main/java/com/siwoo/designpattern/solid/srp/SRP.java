package com.siwoo.designpattern.solid.srp;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.PrintStream;
import java.net.URL;
import java.util.ArrayList;
import java.util.List;

public class SRP {

    public static void main(String[] args) throws IOException {
        Journal j = new Journal();
        j.addEntry("I cried today");
        j.addEntry("I ate a bug");
        j.addEntry("Changed mind");
        j.addEntry("Changed mind");
        System.out.println(j);

        Persistence p = new Persistence();
        String filename = "c:\\temp\\journal.txt";
        p.saveToFile(j, filename, true);
        Runtime.getRuntime().exec("notepad.exe " + filename);
    }
}

class Journal {
    private final List<String> entries = new ArrayList();
    private static int count = 0;

    public void addEntry(String text) {
        entries.add("" + (++count) + ": " + text);
    }

    public void remove(int index) {
        entries.remove(index);
    }

    //different concern.
    public void save(String filename) throws FileNotFoundException {
        try (PrintStream out = new PrintStream(filename)){
            out.println(toString());
        }
    }
    //different concern.
    public void load(String filename) {}
    //different concern.
    public void load(URL url) {}

    @Override
    public String toString() {
        return String.join(System.lineSeparator(), entries);
    }
}

class Persistence {

    public void saveToFile(Journal journal, String filename, boolean overwrite) throws FileNotFoundException {
        if (overwrite || new File(filename).exists()) {
            try (PrintStream out = new PrintStream(filename)) {
                out.println(journal.toString());
            }
        }
    }

    public Journal load(String filename) { return null; }
    public Journal load(URL url) { return null; }
}