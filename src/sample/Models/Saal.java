package sample.Models;

/**
 * Created by Fabrice on 19.06.2017.
 */
public class Saal {
    private String id;
    private String anzahlSitzplaetze;
    private String name;
    private String leinwandhoehe;
    private boolean dreidfaehigkeit;

    public Saal(String id, String anzahlSitzplaetze, String name, String leinwandhoehe, boolean dreidfaehigkeit){
        this.id = id;
        this.anzahlSitzplaetze = anzahlSitzplaetze;
        this.name = name;
        this.leinwandhoehe = leinwandhoehe;
        this.dreidfaehigkeit = dreidfaehigkeit;
    }

}
