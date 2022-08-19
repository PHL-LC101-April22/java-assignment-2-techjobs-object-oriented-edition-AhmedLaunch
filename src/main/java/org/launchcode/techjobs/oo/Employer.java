package org.launchcode.techjobs.oo;

import java.util.Objects;

public class Employer extends JobField {
    public static int nextId = 1;
    public Employer(String value) {
        super(nextId, value);
        nextId++;
    }






}
