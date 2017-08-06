package de.dohrenbusch.talotdd.DatabaseUtils;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import android.util.Log;

/**
 * Created by Marc-Oliver Dohrenbusch on 06.08.2017.
 * Klasse, die die Datenbank erstellt.
 */

public class CreateDatabase extends SQLiteOpenHelper
{
    // Represents the name of the database
    private String strDatabaseName;
    // represents the name of the tables "tabLiegenschaft", "tabAdresse", "tabOrt", "tabBundesland"
    private String tabLiegenschaft;
    private String tabAdresse;
    private String tabOrt;
    private String tabBundesland;

    private static final String LOG_TAG = CreateDatabase.class.getSimpleName();

    /**
     * Constructor.
     * @param context the context from the android app.
     */
    public CreateDatabase(Context context)
    {
        super(context, "PLAZTHALTER_DATENBANKNAM", null, 1);
        Log.d(LOG_TAG, "CreateDatabase hat die Datebank: " + getDatabaseName() + " erzeugt.");

    }

    @Override
    public void onCreate(SQLiteDatabase db) {

    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {

    }
}
