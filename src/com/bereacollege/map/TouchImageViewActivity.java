package com.bereacollege.map;



import android.app.Activity;
import android.os.Bundle;
import android.view.Window;


public class TouchImageViewActivity extends Activity {
    /** Called when the activity is first created. */
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        
        
        requestWindowFeature(Window.FEATURE_CUSTOM_TITLE);
 
        setContentView(R.layout.main);
 
        getWindow().setFeatureInt(Window.FEATURE_CUSTOM_TITLE, R.layout.title_layout);
        
        setContentView(R.layout.main);
        TouchImageView img = (TouchImageView) findViewById(R.id.snoop);
        img.setImageResource(R.drawable.campusmap_onesheet);
        img.setMaxZoom(5f);
    }
}