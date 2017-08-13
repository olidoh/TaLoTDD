package de.dohrenbusch.talotdd.DatabaseUtils;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteDatabase.CursorFactory;
import android.util.Log;

import java.io.File;

import de.dohrenbusch.talotdd.R;

/**
 * Created by Marc-Oliver Dohrenbusch on 13.08.2017.
 */

public class CreateDatabase extends LocalDatabase
{
    /**
     * Context.
     */
    private Context context;

    private String log;

    /**
     * Konstruktor
     * @param context
     * @param name
     * @param factory
     * @param version
     */
    public CreateDatabase(Context context, String name, CursorFactory factory, int version)
    {
        super(context, name, factory, version);
        this.context = context;
        database = this.getWritableDatabase();
        if (!databaseExists(this.context, context.getString(R.string.sql_db_name)))
        {
            onCreate(database);
        }
        this.log = context.getString(R.string.log);
    }


    @Override
    public void onCreate(SQLiteDatabase db)
    {
        try
        {

            database.execSQL(context.getString(R.string.sql_create_t_Liegenschaft));
        }
        catch (Exception ex)
        {
            Log.e(log, " Create Database:" + ex.toString());
        }
        super.onCreate(db);
    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {
        super.onUpgrade(db, oldVersion, newVersion);
    }

    /**
     * Prüft ob die Datenbank bereits existiert.
     * @param context der Context
     * @param dbName Name der Datenbank
     * @return true, falls die Datenbank bereits existiert
     */
    public Boolean databaseExists(Context context, String dbName)
    {
        File dbFile = context.getDatabasePath(dbName);
        return dbFile.exists();
    }
}
