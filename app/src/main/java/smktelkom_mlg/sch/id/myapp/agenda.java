package smktelkom_mlg.sch.id.myapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

public class agenda extends AppCompatActivity {
    private Button buttondaftar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_agenda);
        buttondaftar = (Button) findViewById(R.id.buttondaftar);
        ImageView paperNote = (ImageView) findViewById(R.id.papar_note);
        paperNote.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(agenda.this, Share.class);
                startActivity(intent);
            }
        });
//        Memfungsikan button daftar
        buttondaftar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(agenda.this, MainActivity.class);
                startActivity(intent);
            }
        });
    }
//    Untuk mendisablekan button back
    protected void onPause(){
        super.onPause();
        overridePendingTransition(android.R.anim.slide_in_left, android.R.anim.slide_out_right);
    }
}
