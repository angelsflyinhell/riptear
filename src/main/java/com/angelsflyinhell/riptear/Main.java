package com.angelsflyinhell.riptear;

import com.angelsflyinhell.riptear.cli.Printer;

import java.io.IOException;

public class Main {

    public static void main(String[] args) throws IOException {
        Printer.printLogo();
        Printer.printVersion();
        Printer.printAuthor();
        Printer.printReady();
    }

}
