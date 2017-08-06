package de.dohrenbusch.talotdd.Liegenschaftsdaten;

/**
 * Created by Marc-Oliver Dohrenbusch on 06.08.2017.
 * Represents a city.
 */

public class PlzOrt
{
    //Postcode of the city
    private String strPostcode;
    //Name of the city
    private String strName;

    /**
     * Constructor.
     * @param postcode the postcode as a string
     * @param name the name of the city as a string.
     */
    public PlzOrt(String postcode, String name)
    {
        this.strPostcode = postcode;
        this.strName = name;
    }

    /**
     * Gets the postcode of the city.
     * @return the postcode as string.
     */
    public String getStrPostcode()
    {
        return this.strPostcode;
    }

    /**
     * Gets the name of the city.
     * @return the name of the city as string.
     */
    public String getStrName()
    {
        return this.strName;
    }
}
