package hmstudio.blackjack;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

/**
 * Created by alex on 2016-03-30.
 */
public class GameActivity extends Activity{

    HandMath handmathobj = new HandMath();
    private int Usertotalint = 0;
    private int Dealertotalint = 0;
    private boolean Userbust =false;
    private boolean Dealerbust=false;

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_game);

        Deal();
    }

    public void HitUser(View v){
        if(Userbust){
            return;
        }

        TextView usertot = (TextView)findViewById(R.id.usertotaltext);

        String usertotalstr = usertot.getText().toString();
        Usertotalint = Integer.parseInt(usertotalstr);

        Usertotalint = Usertotalint + handmathobj.addUserTotal(Usertotalint);
        String displayer = Integer.toString(Usertotalint);
        usertot.setText(displayer);

        if(Usertotalint > 21){
            Userbust =true;
        }

    }


    public void StayUser(View v){
        TextView dealertot = (TextView)findViewById(R.id.dealertotaltext);


    while(Dealertotalint <= 16){

        Dealertotalint = Dealertotalint + handmathobj.addUserTotal(Dealertotalint);

        String dealerdisplayer = Integer.toString(Dealertotalint);
        dealertot.setText(dealerdisplayer);

        }

    }

    public void NewHand(View v){
        TextView dealertot = (TextView)findViewById(R.id.dealertotaltext);
        TextView usertot = (TextView)findViewById(R.id.usertotaltext);

        Usertotalint = 0;
        Dealertotalint = 0;
        Userbust = false;
        Dealerbust = false;

        String dealerdisplayer = Integer.toString(Dealertotalint);
        dealertot.setText(dealerdisplayer);

        String displayer = Integer.toString(Usertotalint);
        usertot.setText(displayer);

        Deal();
    }

    public void Deal(){
        TextView usertot = (TextView)findViewById(R.id.usertotaltext);
        TextView dealertot = (TextView)findViewById(R.id.dealertotaltext);

        String usertotalstr = usertot.getText().toString();
        Usertotalint = Integer.parseInt(usertotalstr);

        Usertotalint = Usertotalint + handmathobj.addUserTotal(Usertotalint);
        Usertotalint = Usertotalint + handmathobj.addUserTotal(Usertotalint);

        String userdisplayer = Integer.toString(Usertotalint);
        usertot.setText(userdisplayer);

        String dealertotalstr = dealertot.getText().toString();
        Dealertotalint = Integer.parseInt(dealertotalstr);

        Dealertotalint = Dealertotalint + handmathobj.addUserTotal(Dealertotalint);

        String dealerdisplayer = Integer.toString(Dealertotalint);
        dealertot.setText(dealerdisplayer);

    }
}
