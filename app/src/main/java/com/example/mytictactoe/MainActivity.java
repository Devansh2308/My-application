package com.example.mytictactoe;

import android.content.Context;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    int a=1,i=0,z=0;
int [] b={2,2,2,2,2,2,2,2,2,2};
    public void ImageTapped(View view){
        ImageView MyTapped = (ImageView) view;
        int c = Integer.parseInt(MyTapped.getTag().toString());
        if(b[c]==2) {

            if (a == 1) {

                MyTapped.setImageResource(R.drawable.cross);
                MyTapped.animate().rotation(360).setDuration(1000);
                b[c]=a;
                a = 0;
                i++;
            } else {


                MyTapped.setImageResource(R.drawable.circle);
                MyTapped.animate().rotation(360).setDuration(1000);
                b[c]=a;
                a = 1;
                i++;
            }

        }
        {

            if((b[1]==0 && b[2]==0 && b[3]==0)||(b[4]==0 && b[5]==0 && b[6]==0) || (b[7]==0 && b[8]==0 && b[9]==0) || (b[1]==0 && b[5]==0 && b[9]==0) || (b[3]==0 && b[5]==0 && b[7]==0)||(b[1]==0 && b[4]==0 && b[7]==0) || (b[2]==0 && b[5]==0 && b[8]==0)||(b[3]==0 && b[6]==0 && b[9]==0) && z==0)
            {
                Context context = getApplicationContext();
                CharSequence text ="Player 2 Wins";
                int duration = Toast.LENGTH_SHORT;
                Toast toast = Toast.makeText(context,text,duration);
                toast.show();
                z=1;

            }
            if((b[1]==1 && b[2]==1 && b[3]==1)||(b[4]==1 && b[5]==1 && b[6]==1) || (b[7]==1 && b[8]==1 && b[9]==1) || (b[1]==1 && b[5]==1 && b[9]==1) || (b[3]==1 && b[5]==1 && b[7]==1)||(b[1]==1 && b[4]==1 && b[7]==1) || (b[2]==1 && b[5]==1 && b[8]==1)||(b[3]==1 && b[6]==1 && b[9]==1) && z==0)
            {
                Context context = getApplicationContext();
                CharSequence text ="Player 1 Wins";
                int duration = Toast.LENGTH_SHORT;
                Toast toast = Toast.makeText(context,text,duration);
                toast.show();
                z=1;
            }
        }

    }
    public void playagainTapped(View view){
        a=1;
        z=0;
        for(int j=0; j<10;j++)
        {
            b[j]=2;
        }
        ImageView d = (ImageView) findViewById(R.id.img1);
        d.setImageResource(R.drawable.question);
        ImageView e= (ImageView) findViewById(R.id.img2);
        e.setImageResource(R.drawable.question);
        ImageView f = (ImageView) findViewById(R.id.img3);
        f.setImageResource(R.drawable.question);
        ImageView g = (ImageView) findViewById(R.id.img4);
        g.setImageResource(R.drawable.question);
        ImageView h = (ImageView) findViewById(R.id.img5);
        h.setImageResource(R.drawable.question);
        ImageView i = (ImageView) findViewById(R.id.img6);
        i.setImageResource(R.drawable.question);
        ImageView j = (ImageView) findViewById(R.id.img7);
        j.setImageResource(R.drawable.question);
        ImageView k = (ImageView) findViewById(R.id.img8);
        k.setImageResource(R.drawable.question);
        ImageView l = (ImageView) findViewById(R.id.img9);
        l.setImageResource(R.drawable.question);


    }


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
}
