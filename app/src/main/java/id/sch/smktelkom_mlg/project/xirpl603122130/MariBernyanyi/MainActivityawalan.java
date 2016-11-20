package id.sch.smktelkom_mlg.project.xirpl603122130.MariBernyanyi;

import android.content.Intent;
import android.os.Bundle;
import android.os.PersistableBundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

/**
 * Created by Mokleters on 20/11/2016.
 */
public class MainActivityawalan extends AppCompatActivity {
    @Override
    public void onCreate(Bundle savedInstanceState, PersistableBundle persistentState) {
        super.onCreate(savedInstanceState, persistentState);
        setContentView(R.layout.activitymainawalan);

        findViewById(R.id.daerah).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(MainActivityawalan.this, MainActivityawalan.class));
            }
        });
    }
}
