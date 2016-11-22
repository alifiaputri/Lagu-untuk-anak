package id.sch.smktelkom_mlg.project.xirpl603122130.MariBernyanyi;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

public class MainHome extends AppCompatActivity {

    Button bWajib;
    Button bDaerah;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.mainhome);

        findViewById(R.id.buttonWajib).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(MainHome.this, MainActivity.class));
            }
        });
        findViewById(R.id.buttonDaerah).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(MainHome.this, MainActivity000.class));
            }
        });
    }
}
