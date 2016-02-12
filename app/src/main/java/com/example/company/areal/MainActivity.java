package com.example.company.areal;

import android.annotation.TargetApi;
import android.content.Intent;
import android.graphics.drawable.Drawable;
import android.media.MediaPlayer;
import android.os.Build;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.util.Log;
import android.view.View;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.Toast;
import android.widget.ToggleButton;

import java.io.IOException;
import java.io.InputStream;

import static android.widget.Toast.LENGTH_LONG;

public class MainActivity extends AppCompatActivity {

    static final int REQUEST_IMAGE_CAPTURE = 1;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
////PLAY USING URL
//       String url = "https://www.youtube.com/watch?v=ZIXdNdGlqaw"; // your URL here
//        MediaPlayer mediaPlayer = new MediaPlayer();
//        mediaPlayer.setAudioStreamType(STREAM_MUSIC);
//        Log.d("main", "sdaddwd1");
//        try {
//            mediaPlayer.setDataSource(url);
//        } catch (IOException e) {
//           Log.d("main","error");
//                    e.printStackTrace();
//        }
//        Log.d("main","sdaddwd2");
//
//        mediaPlayer.start();
//        Log.d("main", "sdaddwd22");


        Button bt = (Button) (Button) findViewById(R.id.button);
        bt.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Log.d("main", "lllalsd");//outputlogcat
                String imagename = "xapso";//declare string variable for image resource name
                int resvalue = getResources().getIdentifier(imagename, "drawable", getPackageName());//all resources have integer values and we need to extract it,this is the line of code that does that
                ImageView viewer = (ImageView) findViewById(R.id.imageView);//i select the imageview id on which we apply this action
                viewer.setImageResource(resvalue);//set image resource value to one we want changed i.e the res we just named

                //New intent activity

                Intent detailActivity = new Intent(MainActivity.this, detail.class);
                //yield of rails


                startActivity(detailActivity);


            }
        });


    }

    @TargetApi(Build.VERSION_CODES.HONEYCOMB)
    @Override
    public boolean onCreateOptionsMenu(final Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);


        MenuItem item = menu.add(Menu.NONE, Menu.NONE, 102, "sound");
        item.setShowAsAction(MenuItem.SHOW_AS_ACTION_ALWAYS);
        item.setOnMenuItemClickListener(new MenuItem.OnMenuItemClickListener() {
            @Override
            public boolean onMenuItemClick(MenuItem item) {
                Toast.makeText(MainActivity.this, "sound playing", LENGTH_LONG).show();
                MediaPlayer mediaPlayer = MediaPlayer.create(MainActivity.this, R.raw.startaction_01);
                Log.d("media", "sss1");
                mediaPlayer.start();
                Log.d("media", "sss2");

                return false;


            }
        });
        return true;
    }


    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);

    }


    public void handlerformenu(MenuItem item) {
        String Image = "rgg.png";
        ImageView view = (ImageView) (ImageView) findViewById(R.id.imageView2);
        try {
            InputStream stream = getAssets().open(Image);
            Drawable drawable = Drawable.createFromStream(stream, null);
            view.setImageDrawable(drawable);
        } catch (IOException e) {
            e.printStackTrace();
        }

    }


}

