package de.dohrenbusch.talotdd.Liegenschaftsdaten;

/**
 * Created by Marc-Oliver Dohrenbusch on 06.08.2017.
 * Represents a Liegenschaft
 */

public class Liegenschaft
{
    // The name of the property
    private String strName;
    // The street and housenumber of the property
    private StrasseHausnummer strasseHausnummer;
    // The postcode and the name of the city
    private PlzOrt plzOrt;
    // The federal state of the property
    private Bundesland bundesland;


    /**
     * Constructor
     * @param strName name of the property as a string.
     * @param strasseHausnummer strasse hausnummer of the prpoerty as a StrasseHausnummer.
     * @param plzOrt plz and citiy of the property as a PlzOrt.
     * @param bundesland federal state of the property as a Bundesland.
     */
    public Liegenschaft(String strName, StrasseHausnummer strasseHausnummer, PlzOrt plzOrt,
                        Bundesland bundesland)
    {
        this.strName = strName;
        this.strasseHausnummer = strasseHausnummer;
        this.plzOrt = plzOrt;
        this.bundesland = bundesland;
    }
}
