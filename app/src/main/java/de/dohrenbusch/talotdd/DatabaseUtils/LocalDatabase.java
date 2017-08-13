package de.dohrenbusch.talotdd.DatabaseUtils;

import android.content.ContentValues;
import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteDatabase.CursorFactory;
import android.database.sqlite.SQLiteException;
import android.database.sqlite.SQLiteOpenHelper;
import android.util.Log;

import de.dohrenbusch.talotdd.R;

/**
 * Created by Marc-Oliver Dohrenbusch on 13.08.2017.
 */

public class LocalDatabase extends SQLiteOpenHelper
{
    /**
     * Datenbank zum Speichern der Datensätze
     */
    protected static SQLiteDatabase database;

    private String tag;

    /**
     * Basis Konstruktor.
     * @param context
     * @param name
     * @param factory
     * @param version
     */
    public LocalDatabase(Context context, String name, CursorFactory factory, int version)
    {
        super(context, name, factory, version);
        tag = context.getString(R.string.log);
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

    /**
     * Schreibt einen Datensatz in die Tabelle
     * @param cv
     * @param tableName
     */
    public void putDatasetIn(ContentValues cv, String tableName)
    {
        try
        {
            database = getWritableDatabase();
            database.insert(tableName, null, cv);
        }
        catch (SQLiteException e)
        {
            Log.e(tag, e.toString());
        }

    }
}
