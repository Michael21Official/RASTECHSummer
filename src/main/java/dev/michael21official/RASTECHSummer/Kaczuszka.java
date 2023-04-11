package dev.michael21official.RASTECHSummer;

public class Kaczuszka implements Comparable<Kaczuszka> {
    int w; // wysokość kaczuszki
    int s; // szerokość kaczuszki

    public Kaczuszka(int w, int s) {
        this.w = w;
        this.s = s;
    }

    // porównywanie kaczuszek według wysokości
    public int compareTo(Kaczuszka other) {
        return Integer.compare(this.w, other.w);
    }
}
