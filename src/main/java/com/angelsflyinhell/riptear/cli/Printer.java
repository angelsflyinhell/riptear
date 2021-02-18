package com.angelsflyinhell.riptear.cli;

import com.angelsflyinhell.riptear.runtime.Error;
import com.angelsflyinhell.riptear.runtime.Router;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Printer {

    public static void printLogo() {
        System.out.println("\n" +
                "         _       __                 \n" +
                "   _____(_)___  / /____  ____ ______\n" +
                "  / ___/ / __ \\/ __/ _ \\/ __ `/ ___/\n" +
                " / /  / / /_/ / /_/  __/ /_/ / /    \n" +
                "/_/  /_/ .___/\\__/\\___/\\__,_/_/     \n" +
                "      /_/                           \n");

    }

    public static void printVersion() {
        System.out.println("v0.0.0.1a");
    }
    public static void printAuthor() {
        System.out.println("(C) Copyright       angelsflyinhell");
        System.out.println("GitHub              https://github.com/angelsflyinhell");
        System.out.println("Website             https://4c3711.xyz");
        System.out.println("Repository          https://github.com/angelsflyinhell/riptear\n\n");
    }

    public static void printReady() {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.print(System.getProperty("user.dir") + "@riptear $ ");
        try {
            Router.defaultRouter(br.readLine());
        } catch (IOException e) {
            Error.ioException("printer.printReady", e);
        }
        printReady();
    }

}
