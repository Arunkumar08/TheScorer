package com.thescorer.main;

import android.content.Intent;
import android.support.v4.app.FragmentActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;

import com.worksofarun.thescorer.R;
import com.thescorer.main.service.viewservices.ViewLoaderService;
import com.thescorer.main.viewhelpers.ViewLoaderServiceFactory;
import com.thescorer.main.viewhelpers.ViewTypeEnum;


public class SelectTournaTypeActivity extends FragmentActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_select_tourna_type);
        Button button = (Button) findViewById(R.id.buttonToClick);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                System.out.println("Button Clicked at last");
                Intent intent = new Intent(SelectTournaTypeActivity.this, TournamentHomePageActivity.class);
                startActivity(intent);
            }
        });
        ViewLoaderService service = ViewLoaderServiceFactory.getViewLoaderService(this, ViewTypeEnum.SELECT_SPORTS_VIEW);
        service.loadView();
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_select_tourna_type, menu);
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
}
