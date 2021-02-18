package com.angelsflyinhell.riptear.runtime;

import java.io.FileNotFoundException;
import java.io.IOException;

public class Error {

    public static void fileNotFound(String cn, FileNotFoundException f) {
        System.out.println("err: lang.riptear." + cn + "~ file not found\n" +
                f.getLocalizedMessage());
    }

    public static void ioException(String cn, IOException f) {
        System.out.println("err: lang.riptear." + cn + "~\n" +
                f.getLocalizedMessage());
    }

    public static void insufficientInput(String cn, NullPointerException f) {
        System.out.println("err: lang.riptear." + cn + "~\n" +
                f.getLocalizedMessage());
    }

}
