package com.CannedHead.dedo;

import android.app.Activity;
import android.content.Intent;
import android.graphics.Typeface;
import android.os.Bundle;
import android.view.KeyEvent;
import android.view.View;
import android.widget.Button;

public class Menu extends Activity{

	static boolean comeback = false; 
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		setContentView(R.layout.main);
		//set up animation transition
		//overridePendingTransition(R.anim.abc_slide_in_top, R.anim.abc_slide_in_bottom);
		
		Single.inicio = false;
		
		//Single.cancelTimer= false; 
		
		// Font path
        String fontPath = "fonts/FUTRFW.TTF";
        
 
      
 
        // Loading Font Face
        Typeface tf = Typeface.createFromAsset(getAssets(), fontPath);
 
		
		
		//Declare the single button
		Button single = (Button)this.findViewById(R.id.single1); 
		Button world =  (Button)this.findViewById(R.id.worldbut); 
		// Applying font
       single.setTypeface(tf);
       world.setTypeface(tf);
		
		
		//Ad a clicklistener to the single button 
		single.setOnClickListener(new View.OnClickListener(){

			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				
				Intent singleIntent = new Intent (Menu.this, Single.class); 
				startActivity(singleIntent); 
				finish(); 
				
			}
			
			
		}); 
		
		
		
	}
	
	//Back Button  
	public boolean onKeyDown(int keyCode, KeyEvent event){
	    if(keyCode == KeyEvent.KEYCODE_BACK) { 
	    		finish();
	    		System.exit(0); 
	             
	           // return true;
	    }
	    return false;
	}
	
	
	
	
	@Override
	protected void onPause() {
		// TODO Auto-generated method stub
		super.onPause();
	}
	
	

}
