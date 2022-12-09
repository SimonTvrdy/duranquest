package com.company.days;

/**
 * enum Day uchovává dny v týdnu.
 * Každý den má název a nějaké popisek.
 * @author Šimon Tvrdý
 * @version 0.1a
 * @since Java 16
 */
public enum Day {
    PONDELI("Pondělí","Máma: 'Tomáááááášíííííííííí!!!!!!! OOOOOOOOOOOOVLLLLLLLLLLLAAAAAAAAADAAAAAAAAAAAAAAAAČČČČČČČČČČČ A KAFEEEEEEEEEEEEE!!!!!'"),
    UTERY("Úterý","Máma: 'Vstávej Tomáši, musíš mi udělat kafe, nebo ti zabavím počítač.'"),
    STREDA("Středa","Nevlastní táta: 'TOMANEEEEEEEEEEE, MAZEJ POSEKAT ZAHRADU'"),
    CTVRTEK("Čtvrtek","Máma: 'Proč smažíš?!?!?!?!?! TÁÁHNIII DO ŠKOLYYYY!!!!!!!'"),
    PATEK("Pátek","Nevlastní táta: 'Máš už zabaleno na chalupu?!?!?!?! a noutbúk necháš doma!!!!'");

    private String name;
    private String info;

    Day(String name, String info) {
        this.name = name;
        this.info = info;
    }

    /**
     *
     * @return vrací název dne
     */

    public String getName() {
        return name;
    }

    /**
     *
     * @return vrací popisek
     */
    public String getInfo() {
        return info;
    }
}
