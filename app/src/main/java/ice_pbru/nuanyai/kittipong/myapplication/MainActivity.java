package ice_pbru.nuanyai.kittipong.myapplication;

import android.media.MediaPlayer;
import android.provider.MediaStore;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    private Button YButton;
    private Button ZButton;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        bindWidget();

        buttonController();



    }//main method

    private void buttonController() {
        YButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                MediaPlayer mediaPlayer = MediaPlayer.create(getBaseContext(),R.raw.end_game);
                mediaPlayer.start();
            }
        });


    }

    private void bindWidget() {
        YButton = (Button) findViewById(R.id.button);
        ZButton = (Button) findViewById(R.id.button2);


    }


}//main class
