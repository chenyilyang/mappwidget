package com.ls.widgets;

import android.app.Activity;
import android.content.Intent;
import android.graphics.drawable.AnimationDrawable;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

public class HomeActivity 
    extends Activity
{

    
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.home);
        
        initWidgets();
    }
    
    
    private void initWidgets()
    {
        Button button1 = (Button) findViewById(R.id.button_sample_1);
        button1.setOnClickListener(new View.OnClickListener()
        {    
            public void onClick(View arg0)
            {
                doOpenSample1();
            }
        });
        
        Button button2 = (Button) findViewById(R.id.button_sample_2);
        button2.setOnClickListener(new View.OnClickListener()
        {    
            public void onClick(View arg0)
            {
                doOpenSample2();
            }
        });
        
        Button button3 = (Button) findViewById(R.id.button_sample_3);
        button3.setOnClickListener(new View.OnClickListener()
        {    
        	public void onClick(View arg0)
            {
        		doOpenExBrowseActivity();
            }
        });
    }
    
    
    private void doOpenExBrowseActivity()
    {
    	Intent intent = new Intent(this, ExBrowseMapActivity.class);
        startActivity(intent);
    }
    
    private void doOpenSample1()
    {
        Intent intent = new Intent(this,Sample1Activity.class);
        startActivity(intent);
    }
    
    
    private void doOpenSample2()
    {
        Intent intent = new Intent(this,Sample2Activity.class);
        startActivity(intent);
    }    
    
}
