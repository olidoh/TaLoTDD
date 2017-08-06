package de.dohrenbusch.talotdd.Liegenschaftsdaten;

/**
 * Created by Marc-Oliver Dohrenbusch on 06.08.2017.
 * Represents an address.
 */

public class StrasseHausnummer
{
    // Address datas.
    private String strStrasse;
    private String strHausnummer;

    /**
     * Constructor
     * @param strasse Strasse
     * @param hausnummer Hausnummer
     */
    public StrasseHausnummer(String strasse, String hausnummer)
    {
        this.strStrasse = strasse;
        this.strHausnummer = hausnummer;
    }

    /**
     * Gets the street
     * @return street as string
     */
    public String getStrStrasse()
    {
        return this.strStrasse;
    }

    /**
     * Gets the housenumber.
     * @return housenumber as string.
     */
    public String getStrHausnummer()
    {
        return this.strHausnummer;
    }

    /**
     * Gets the street with housenumber (blank between street and housenumber).
     * @return street, a blank and the housenumber.
     */
    public String getWholeAddress()
    {
        return this.strStrasse + " " + this.strHausnummer;
    }


}
