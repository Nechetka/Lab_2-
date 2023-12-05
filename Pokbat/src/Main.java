// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.

import area.WeatherStatus;
import ru.ifmo.se.pokemon.*;
import pokemons.*;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        Battle b = new Battle();
        WeatherStatus.setWeather(in.nextLine());
        Pokemon p1 = new Castform("Castform", 10);
        Pokemon p2 = new Numel("Numel", 10);
        Pokemon p3 = new Camerupt("Camerupt", 10);
        Pokemon p4 = new Honedge("Honedge", 10);
        Pokemon p5 = new Doublade("Doublade", 10);
        Pokemon p6 = new Aegislash_Blade("Aegislash_Blade", 10);

        b.addAlly(p1);
        b.addFoe(p2);
        b.addAlly(p3);
        b.addFoe(p4);
        b.addAlly(p5);
        b.addFoe(p6);

        b.go();
        }
    }
