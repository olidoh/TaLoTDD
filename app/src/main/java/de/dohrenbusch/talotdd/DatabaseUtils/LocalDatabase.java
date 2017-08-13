package de.dohrenbusch.talotdd.DatabaseUtils;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

/**
 * Created by Marc-Oliver Dohrenbusch on 13.08.2017.
 */

public class LocalDatabase extends SQLiteOpenHelper
{
    /**
     * Datenbank zum Speichern der Datensätze
     */
    protected static SQLiteDatabase database;

    /**
     * Basis Konstruktor.
     * @param context
     * @param name
     * @param factory
     * @param version
     */
    public LocalDatabase(Context context, String name, SQLiteDatabase.CursorFactory factory, int version)
    {
        super(context, name, factory, version);
    }

    /**
     * Methode zur Erstellung der Datenbank.
     * @param db Datenbank.
     */
    public void onCreate(SQLiteDatabase db) {}

    /**
     * Methode, die beim Upgrade der Datenbank aufgerufen wird.
     * @param db
     * @param oldVersion
     * @param newVersion
     */
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {}
}
