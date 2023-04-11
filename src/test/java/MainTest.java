import dev.michael21official.RASTECHSummer.Kaczuszka;
import dev.michael21official.RASTECHSummer.Main;
import org.junit.Test;


import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.*;

public class MainTest {

    @Test
    public void calculateSumHeight() {
        List<Kaczuszka> kaczuszki = new ArrayList<>();
        kaczuszki.add(new Kaczuszka(3, 5));
        kaczuszki.add(new Kaczuszka(2, 1));
        kaczuszki.add(new Kaczuszka(4, 3));

        int sumHeight = Main.calculateSumHeight(10, kaczuszki);
        assertEquals(9, sumHeight);


    }
    @Test
    public void calculateSumHeight_emptyList() {
        List<Kaczuszka> kaczuszki = new ArrayList<>();
        int sumHeight = Main.calculateSumHeight(10, kaczuszki);
        assertEquals(0, sumHeight);
    }

    @Test
    public void calculateSumHeight_allDucksTooWide() {
        List<Kaczuszka> kaczuszki = new ArrayList<>();
        kaczuszki.add(new Kaczuszka(3, 5));
        kaczuszki.add(new Kaczuszka(2, 1));
        kaczuszki.add(new Kaczuszka(4, 3));
        int sumHeight = Main.calculateSumHeight(2, kaczuszki);
        assertEquals(2, sumHeight);
    }

    @Test
    public void calculateSumHeight_allDucksFitInOneRow() {
        List<Kaczuszka> kaczuszki = new ArrayList<>();
        kaczuszki.add(new Kaczuszka(3, 5));
        kaczuszki.add(new Kaczuszka(2, 1));
        kaczuszki.add(new Kaczuszka(4, 3));
        int sumHeight = Main.calculateSumHeight(10, kaczuszki);
        assertEquals(9, sumHeight);
    }

    @Test
    public void calculateSumHeight_someDucksFitInOneRow() {
        List<Kaczuszka> kaczuszki = new ArrayList<>();
        kaczuszki.add(new Kaczuszka(3, 5));
        kaczuszki.add(new Kaczuszka(2, 1));
        kaczuszki.add(new Kaczuszka(4, 3));
        int sumHeight = Main.calculateSumHeight(6, kaczuszki);
        assertEquals(6, sumHeight);
    }

}
