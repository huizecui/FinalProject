package comhuizecui.httpsgithub.finalproject;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class GameCategoryActivity extends AppCompatActivity {

    private ListView cGamesList;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_game_catayour);

        cGamesList = (ListView) findViewById(R.id.lv_drinks);

        ArrayAdapter<Game> arrayAdapter = new ArrayAdapter<Game>(this, android.R.layout.simple_list_item_1, Game.GAMES);

        AdapterView.OnItemClickListener itemClickListener = new AdapterView.OnItemClickListener()
        {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id)
            {
                Intent drinkIntent = new Intent( GameCategoryActivity.this, GameActivity.class);

                drinkIntent.putExtra( GameActivity.EXTRA_DRINKNO, position );

                startActivity( drinkIntent );
                overridePendingTransition( R.anim.slide_in_left,R.anim.slide_out_left);
            }
        };

        cGamesList.setAdapter(arrayAdapter);
        cGamesList.setOnItemClickListener( itemClickListener );

    }

    @Override
    public  void onBackPressed()
    {
        //This line this method do everything that the back button is supposed dp
        super.onBackPressed();
        overridePendingTransition(R.anim.slide_in_right, R.anim.slide_out_right);
    }
}