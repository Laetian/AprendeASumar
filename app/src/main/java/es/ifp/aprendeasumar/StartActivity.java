package es.ifp.aprendeasumar;

import androidx.appcompat.app.AppCompatActivity;

import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class StartActivity extends AppCompatActivity {

    protected TextView label1;
    protected TextView label2;

    protected Button button1;
    protected Button button2;
    protected Button button3;

    private int a=0;
    private int b=0;
    private int c=0;
    private int d=0;
    private int e=0;
    private int f=0;

    private String comprobador="";
    private int comprobador1=0;

    private MediaPlayer mp;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        label1=(TextView) findViewById(R.id.label1_start);
        label2=(TextView) findViewById(R.id.label2_start);

        button1=(Button) findViewById(R.id.button1_start);
        button2=(Button) findViewById(R.id.button2_start);
        button3=(Button) findViewById(R.id.button3_start);


        a= (int) (Math.floor(Math.random() * (9 - 1 + 1)) + 1);
        b= (int) (Math.floor(Math.random() * (9 - 1 + 1)) + 1);

        label2.setText(a+" + "+b);

        c=a+b;

        d= (int) (Math.floor(Math.random() * ((c+2) - (c-2) + 1)) + (c-2));
        if(d==c){
            d=c+1;
        }
        e= (int) (Math.floor(Math.random() * ((c+2) - (c-2) + 1)) + (c-2));
        if(e==c){
            e=c-1;
        }

        f= (int) (Math.floor(Math.random() * (3 - 1 + 1)) + 1);

        if (f==1)
        {
            button1.setText(String.valueOf(c));
            button2.setText(String.valueOf(d));
            button3.setText(String.valueOf(e));
        }
        else if (f==2)
        {
            button1.setText(String.valueOf(d));
            button2.setText(String.valueOf(e));
            button3.setText(String.valueOf(c));
        }
        else
        {
            button1.setText(String.valueOf(e));
            button2.setText(String.valueOf(c));
            button3.setText(String.valueOf(d));
        }

        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                comprobador=button1.getText().toString();
                comprobador1=Integer.parseInt(comprobador);

                if (comprobador1==c){
                    mp= MediaPlayer.create(StartActivity.this, R.raw.win);
                    mp.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
                        @Override
                        public void onCompletion(MediaPlayer mp) {
                            mp.stop();
                        }
                    });
                    mp.start();

                    finish();
                    startActivity(getIntent());

                }
                else
                {                    mp= MediaPlayer.create(StartActivity.this, R.raw.lost);
                    mp.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
                        @Override
                        public void onCompletion(MediaPlayer mp) {
                            mp.stop();
                        }
                    });
                    mp.start();


                }

            }
        });

        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                comprobador=button2.getText().toString();
                comprobador1=Integer.parseInt(comprobador);

                if (comprobador1==c){
                    mp= MediaPlayer.create(StartActivity.this, R.raw.win);
                    mp.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
                        @Override
                        public void onCompletion(MediaPlayer mp) {
                            mp.stop();
                        }
                    });
                    mp.start();

                    finish();
                    startActivity(getIntent());

                }
                else
                {                    mp= MediaPlayer.create(StartActivity.this, R.raw.lost);
                    mp.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
                        @Override
                        public void onCompletion(MediaPlayer mp) {
                            mp.stop();
                        }
                    });
                    mp.start();


                }

            }
        });

        button3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                comprobador=button3.getText().toString();
                comprobador1=Integer.parseInt(comprobador);

                if (comprobador1==c){
                    mp= MediaPlayer.create(StartActivity.this, R.raw.win);
                    mp.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
                        @Override
                        public void onCompletion(MediaPlayer mp) {
                            mp.stop();
                        }
                    });
                    mp.start();

                    finish();
                    startActivity(getIntent());

                }
                else
                {                    mp= MediaPlayer.create(StartActivity.this, R.raw.lost);
                    mp.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
                        @Override
                        public void onCompletion(MediaPlayer mp) {
                            mp.stop();
                        }
                    });
                    mp.start();


                }

            }
        });



    }
}