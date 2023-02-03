package org.example.main;

import org.example.xlsx.GerenciadorTabelas;
import org.example.xlsx.Tabelas;

import java.io.IOException;
import java.util.List;

public class Main
{
    public static void main( String[] args ) throws IOException {


        GerenciadorTabelas GerenciadorTabelas = new GerenciadorTabelas();

        GerenciadorTabelas.criar();

    }
}
