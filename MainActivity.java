package com.example.anshu.assignment1;

import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v4.widget.TextViewCompat;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.TextView;
import android.widget.Toast;

import java.util.Random;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
                        .setAction("Action", null).show();
            }
        });
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
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

    public void correct(View view)
    {
        TextView mytext=(TextView)findViewById(R.id.TVrandom);
        String str  = mytext.getText().toString();
        int flag=0;
        int num = Integer.parseInt(str);
        if(num>2) {
            for (int i = 2; i < num / 2; i++) {
                if (num % i == 0) {
                    flag = 1;
                }
            }
        }
        if(flag==0|| num==2)
        {
        Toast.makeText(getApplicationContext(),"CORRECT ANSWER",
                Toast.LENGTH_LONG).show();
        }

        else if (flag==1 || num==1) {
            Toast.makeText(getApplicationContext(), "INCORRECT ANSWER",
                    Toast.LENGTH_LONG).show();
        }
        }


    public void incorrect(View view)
    {
        TextView mytext=(TextView)findViewById(R.id.TVrandom);
        String str  = mytext.getText().toString();
        int flag=0;
        int num = Integer.parseInt(str);
        if(num>2) {
            for (int i = 2; i < num / 2; i++) {
                if (num % i == 0) {
                    flag = 1;
                }
            }
        }
        if(flag==0|| num==2)
        {
            Toast.makeText(getApplicationContext(),"INCORRECT ANSWER",
                    Toast.LENGTH_LONG).show();
        }

        else if (flag==1 || num==1)
        {
            Toast.makeText(getApplicationContext(),"CORRECT ANSWER",
                    Toast.LENGTH_LONG).show();
        }    }

    public void generator(View view)
    {
        Random rand=new Random();
        int number =rand.nextInt(1000)+1;
        TextView myText= (TextView)findViewById(R.id.TVrandom);
        String mystring = String.valueOf(number);
        myText.setText(mystring);
    }
}
