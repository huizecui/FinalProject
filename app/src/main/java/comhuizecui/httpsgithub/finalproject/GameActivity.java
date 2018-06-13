package comhuizecui.httpsgithub.finalproject;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ImageView;
import android.widget.TextView;

public class GameActivity extends AppCompatActivity {

    public static final String EXTRA_DRINKNO = "gameNo";

    private ImageView dGamePhoto;
    private TextView dGameName;
    private TextView dGameescription;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_game);

        int drinkNo = (Integer)getIntent().getExtras().get(EXTRA_DRINKNO);

        Game game = Game.GAMES[drinkNo];

        dGamePhoto = (ImageView) findViewById(R.id.iv_drink);
        dGameName = (TextView) findViewById(R.id.tv_name);
        dGameescription = (TextView) findViewById(R.id.tv_description);

        dGamePhoto.setImageResource( game.getImageResourceId() );
        dGamePhoto.setContentDescription( game.getName() );

        dGameName.setText( game.getName() );

        dGameescription.setText( game.getDescription() );
    }

    @Override
    public void onBackPressed()
    {
        super.onBackPressed();
        overridePendingTransition(R.anim.slide_in_right, R.anim.slide_out_right);
    }
}
