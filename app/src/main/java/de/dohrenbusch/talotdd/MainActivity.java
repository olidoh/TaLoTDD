package de.dohrenbusch.talotdd;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

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
        createDatabase = new CreateDatabase(this, this.getString(R.string.sql_db_name), null, 1);

    }
}
