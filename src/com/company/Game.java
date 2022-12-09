package com.company;

import com.company.days.DayManager;
import com.company.entities.Player;

/**
 * Třída Game spravuje herní postup
 * @author Šimon Tvrdý
 * @version 0.1a
 * @since Java 16
 */
public class Game {

    /**
     * Název hry
     */
    private final String name = "Kindergarten - SPSMB DLC";

    /**
     * Verze hry
     */
    private final double version = 0.2;

    /**
     * Autor hry
     */
    private final String author = "Šíma";
    private GameDif gameDif;
    private GameDialog gameDialog;
    private DayManager dayManager;
    private Player player;

    public Game() {
        gameDialog = new GameDialog();
        dayManager = new DayManager();
        player = new Player();
    }

    /**
     * Metoda spouští hru
     * @throws Exception
     */
    public void start() throws Exception {
        gameDialog.intro(name, version, author);
        introMenu();
        dayManager.startDay();
    }

    /**
     * Metoda uvádí hráče do hry
     */
    private void introMenu() {
        gameDialog.say("Vítejte v kůži Tomáše Ďurána, který chodí na Střední průmyslovou školu do Mladé Boleslavi, kde se ztratila Kája společně s virtualní realitou. Naposledy byla viděna včera ve škole na poslední hodině programovaní. I přesto jste nedostali ředitelské volno a tak se vydáváte do školy.");
        gameDialog.say("Zvol si svoji obtížnost: ", "red");
        for (GameDif value : GameDif.values()) {
            gameDialog.say(value.toString(), "purple");
        }
        selectDif();
        storyIntro();
    }


    /**
     * Metoda pro výběr obtížnosti hry
     */
    private void selectDif() {
        String userInput = gameDialog.userInput();
        boolean check = false;
        for (GameDif value : GameDif.values()) {
            if(userInput.trim().equalsIgnoreCase(value.toString())){
                check = true;
                gameDif = value;
                break;
            }
        }
        if(!check){
            selectDif();
        }
    }

    /**
     * Metoda pro výpis úvodu hry
     */
    private void storyIntro() {
        gameDialog.say("Vybraná obtížnost: " + gameDif, "red");
        gameDialog.say("------------------------------------------------", "white");
        gameDialog.say("                   Hra začíná                  ");
        gameDialog.say("------------------------------------------------", "white");
        gameDialog.say("");
    }



}
