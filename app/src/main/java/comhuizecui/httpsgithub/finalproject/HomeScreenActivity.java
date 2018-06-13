/**
 * Name:Huize Cui
 * Course:CS40S
 * Teacher:Mr.Hardman
 * Lab FinalProject
 * Date Last Modified: 6/11/18
 */
package comhuizecui.httpsgithub.finalproject;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class HomeScreenActivity extends AppCompatActivity {

    private ListView hOptionsList;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home_screen);

        hOptionsList = (ListView) findViewById(R.id.lv_options);

        String[] options = new String[]{"Games","Stores","Share Your Experience","Researching..."};

        //To use an array as the options for a ListView, we need an ArrayAdapter
        ArrayAdapter<String> arrayAdapter = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, options);

        AdapterView.OnItemClickListener itemClickListener = new AdapterView.OnItemClickListener()
        {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int position, long id)
            {
                Intent gamesIntent = new Intent( HomeScreenActivity.this, GameCategoryActivity.class);

                Intent mapsIntent;
                Intent shareIntent;

                Intent chooser;

                Uri mapsIntentUri = Uri.parse("geo:49.885082, -97.312148?z=10&q=" + Uri.encode("gamestop") );

                if( position == 0 )
                {
                    startActivity( gamesIntent );
                    overridePendingTransition(R.anim.slide_in_left, R.anim.slide_out_left);
                }
                else if ( position == 1 )
                {
                    mapsIntent = new Intent(Intent.ACTION_VIEW, mapsIntentUri);

                    if (mapsIntent.resolveActivity(getPackageManager()) != null )
                    {
                        startActivity(mapsIntent );
                        overridePendingTransition(R.anim.slide_in_left, R.anim.slide_out_left);
                    }
                }
                else if ( position == 2 )
                {
                    shareIntent = new Intent(Intent.ACTION_SEND);

                    shareIntent.setType("text/plain");

                    shareIntent.putExtra( Intent.EXTRA_TEXT, "I want to say this about FinaProject; \n" );
                    shareIntent.putExtra( Intent.EXTRA_EMAIL, "info@starbuzz.com");


                    chooser = Intent.createChooser( shareIntent, "Please select an app...");
                    startActivity(chooser);
                    overridePendingTransition(R.anim.slide_in_left, R.anim.slide_out_left);
                }
            }
        };

        hOptionsList.setAdapter(arrayAdapter);
        hOptionsList.setOnItemClickListener(itemClickListener);
    }

    @Override
    public  void onBackPressed()
    {
        //This line this method do everything that the back button is supposed dp
        super.onBackPressed();
        overridePendingTransition(R.anim.slide_in_right, R.anim.slide_out_right);
    }
}
