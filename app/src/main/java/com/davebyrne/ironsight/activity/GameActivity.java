package com.davebyrne.ironsight.activity;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

import com.davebyrne.ironsight.R;

public class GameActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_game);

        Intent i = getIntent();
        String s = getIntent().getStringExtra("gameId");
        //Game game = (Game) i.getSerializableExtra("gameId");

        final TextView tv1 = (TextView) findViewById(R.id.textView);
        final TextView tv2 = (TextView) findViewById(R.id.textView2);
        final TextView tv3 = (TextView) findViewById(R.id.textView3);

        tv1.setText(s);
//        tv2.setText(game.getGenre());
//        tv3.setText(game.getYear());
    }
}
