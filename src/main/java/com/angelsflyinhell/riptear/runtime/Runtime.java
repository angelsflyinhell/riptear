package com.angelsflyinhell.riptear.runtime;

import java.io.*;
import java.util.Arrays;
import java.util.HashMap;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Runtime {

    public static HashMap<String, String> TOKENS = new HashMap<>();
    public static HashMap<String, String> VARIABLES = new HashMap<>();
    public static HashMap<String, String> CASES = new HashMap<>();
    public static boolean EXECUTE = false;
    public static boolean SWITCH = false;

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
        String trigger = "\\bif|then|else|print|var\\b";

        Pattern pattern = Pattern.compile(trigger, Pattern.CASE_INSENSITIVE);
        Matcher matcher = pattern.matcher(in);

        while (matcher.find())
        {
            System.out.println(matcher.group() + " | " + in);
        }

//        String[] args = in.replaceAll("\\s", "").split(">>");
//        System.out.println(Arrays.toString(args));
//        switch (args[0]) {
//            case "inner":
//                EXECUTE = true;
//                break;
//            case "innerEnd":
//                EXECUTE = false;
//                break;
//            case "check?":
//                SWITCH = true;
//                break;
//            case "check?End":
//                SWITCH = false;
//                break;
//            case "var":
//                String[] innerAttrib = in.split(">>");
//                VARIABLES.put(innerAttrib[1].replaceAll(" ", ""), innerAttrib[2].replaceFirst(" ", ""));
//                break;
//            case "print":
//
//                String[] outs = in.split(">>");
//                if (VARIABLES.containsKey(outs[1].replaceFirst(" ", "")))
//                    System.out.println(VARIABLES.get(outs[1].replaceFirst(" ", "")));
//                else
//                    System.out.println(outs[1].replaceFirst(" ", ""));
//                break;
//        }
    }

    public static String resolveTags(String in) {
        return in.replaceAll("<s>", " ").replaceAll("<br>", "\n");
    }

    public static void initTokens() {
        TOKENS.put("nar", "VARIABLE");
        TOKENS.put("inner", "CLASS");
        TOKENS.put("export", "RETURN");
        TOKENS.put("is?", "SWITCH");
    }

}
