package de.dohrenbusch.talotdd.Liegenschaftsdaten;

/**
 * Created by Marc-Oliver Dohrenbusch on 06.08.2017.
 * Class represents a federal state.
 */

public class Bundesland
{
    // The name of the federal state.
    private String strName;

    /**
     * Constructor
     * @param name of the federal state
     */
    public Bundesland(String name)
    {
        this.strName = name;
    }

    /**
     * Gets the name of the federal state.
     * @return the name of the federal state as a string.
     */
    public String getStrName()
    {
        return this.strName;
    }
}
