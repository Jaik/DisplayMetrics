package com.example.displaymetrics;

import android.os.Bundle;
import android.app.Activity;
import android.util.DisplayMetrics;
import android.util.FloatMath;
import android.view.Menu;
import android.widget.TextView;

public class MainActivity extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		TextView tv = (TextView) findViewById(R.id.display_txt);
		
		DisplayMetrics dm = new DisplayMetrics();
		getWindowManager().getDefaultDisplay().getMetrics(dm);
		float height=dm.heightPixels/dm.xdpi;
	    float width=dm.widthPixels/dm.ydpi;

	    
	    
		tv.setText("Density: " +dm.density+"\nDensity DPI: "+dm.densityDpi+"\nHeight Pixels: "+dm.heightPixels+"\nScaled Density: "+dm.scaledDensity+"\nWidth Pixels: "+dm.widthPixels+"\nXDPI: "+dm.xdpi+"\nYDPI: "+dm.ydpi+"\nThe screen size is:"+Math.sqrt(height*height+width*width)+"\nHeight: "+height+"\nWidth: "+width );
	}

//	@Override
//	public boolean onCreateOptionsMenu(Menu menu) {
//		// Inflate the menu; this adds items to the action bar if it is present.
//		getMenuInflater().inflate(R.menu.main, menu);
//		return true;
//	}

}
