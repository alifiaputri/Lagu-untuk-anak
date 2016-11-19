package id.sch.smktelkom_mlg.project.xirpl603122130.tugasakhir;

import android.media.MediaPlayer;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;

import java.io.IOException;

public class MainActivity3 extends AppCompatActivity {

    private Button btnPlay;
    private Button btnPause;
    private Button btnStop;
    private MediaPlayer mp;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main10);

        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        mp = new MediaPlayer();
        btnPlay = (Button) findViewById(R.id.btnPLAY);
        btnPause = (Button) findViewById(R.id.btnPAUSE);
        btnStop = (Button) findViewById(R.id.btnSTOP);
        stateAwal();

        btnPlay.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                play();
                btnPlay.setEnabled(false);
                btnPause.setEnabled(true);
                btnStop.setEnabled(true);
            }
        });

        btnPause.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                pause();
            }
        });
        btnStop.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                stop();
            }
        });
    }


    /**
     * State Awal / Pertama Dijalankan
     */
    public void stateAwal() {
        btnPlay.setEnabled(true);
        btnPause.setEnabled(false);
        btnStop.setEnabled(false);
    }

    /**
     * Dijalankan Oleh Tombol Play
     */
    private void play() {
/** Memanggil File MP3 "indonesiaraya.mp3" */
        mp = MediaPlayer.create(this, R.raw.garudapancasila);
        try {
            mp.prepare();
        } catch (IllegalStateException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
/** Menjalankan Audio */
        mp.start();
/** Penanganan Ketika Suara Berakhir */
        mp.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
            @Override
            public void onCompletion(MediaPlayer mp) {
                stateAwal();
            }
        });
    }

    /**
     * Dijalankan Oleh Tombol Pause
     */
    public void pause() {
        if (mp.isPlaying()) {
            if (mp != null) {
                mp.pause();
            }
        } else {
            if (mp != null) {
                mp.start();
            }
        }
    }

    /**
     * Dijalankan Oleh Tombol Stop
     */
    public void stop() {
        mp.stop();
        try {
            mp.prepare();
            mp.seekTo(0);
        } catch (Throwable t) {
            t.printStackTrace();
        }
        stateAwal();
    }


    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        if (item.getItemId() == android.R.id.home) {
            onBackPressed();
            stop();
            return true;
        }
        return super.onOptionsItemSelected(item);
    }
}

