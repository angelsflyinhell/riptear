package com.angelsflyinhell.riptear.runtime;

import java.io.*;
import java.util.Arrays;
import java.util.HashMap;

public class Runtime {

    public static HashMap<String, String> TOKENS = new HashMap<>();
    public static HashMap<String, String> VARIABLES = new HashMap<>();
    public static boolean EXECUTE = false;

    public static void std(String path) {
        try {
            BufferedReader br = new BufferedReader(new FileReader(new File(path)));
            String string;
            while ((string = br.readLine()) != null)
                handleInput(string);
        } catch (FileNotFoundException fileNotFoundException) {
            Error.fileNotFound("runtime.std", fileNotFoundException);
        } catch (IOException ioException) {
            Error.ioException("runtime.std", ioException);
        }
    }

    public static void handleInput(String in) {
        String[] args = in.replaceAll("\\s", "").split("->| ");
//        System.out.println(Arrays.toString(args));
        switch (args[0]) {
            case "inner":
                EXECUTE = true;
                break;
            case "innerEnd":
                EXECUTE = false;
                break;
            case "nar":
                if(!EXECUTE)
                    break;
                String[] split = args[1].split("=");
                VARIABLES.put(split[0], split[1]);
                break;
            case "is?":

                break;
            case "b":

                break;
            case "is?End":

                break;
        }
    }

    public static void initTokens() {
        TOKENS.put("nar", "VARIABLE");
        TOKENS.put("inner", "CLASS");
        TOKENS.put("export", "RETURN");
        TOKENS.put("is?", "SWITCH");
    }

}
