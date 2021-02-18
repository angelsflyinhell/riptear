package com.angelsflyinhell.riptear.runtime;

public class Router {

    public static void defaultRouter(String in) {
        String[] args = in.split(" ");
        if(args.length >= 2) {
            if(args[0].equals("riptear") || args[0].equals("rt")) {
                Runtime.std(args[1]);
            }
        }else
            Error.insufficientInput("router.defaultRouter", new NullPointerException());
    }

}
