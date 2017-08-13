package de.dohrenbusch.talotdd;

import android.content.ContentValues;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

import de.dohrenbusch.talotdd.DatabaseUtils.CreateDatabase;

public class MainActivity extends AppCompatActivity
{
    /**
     * Create database
     */
    CreateDatabase createDatabase;


    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // An dieser Stelle wird die Datenbank erstellt.
        if(!createDatabase.databaseExists(this, this.getString(R.string.sql_db_name)))
        {
            createDatabase = new CreateDatabase(this, this.getString(R.string.sql_db_name), null, 1);
        }

        createDatabase.getWritableDatabase();
        ContentValues cv = new ContentValues();
        cv.put("strLiegenschaft", "Nürnberg");

        createDatabase.putDatasetIn(cv, "t_Liegenschaft");


    }
}
