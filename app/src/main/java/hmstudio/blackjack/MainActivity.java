package hmstudio.blackjack;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }



    public void newGame (View v){
        if(v.getId() == R.id.newgamebut) {
            Intent gameintent = new Intent(MainActivity.this, GameActivity.class);
            startActivity(gameintent);
        }
    }

    public void startStats(View v){



    }

}
