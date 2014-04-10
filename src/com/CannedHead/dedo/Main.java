package com.CannedHead.dedo;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.KeyEvent;

public class Main extends Activity {

	public boolean onKeyDown(int keyCode, KeyEvent event){
	    if(keyCode == KeyEvent.KEYCODE_BACK) { 
	    		finish();
	    		System.exit(0); 
	             
	            return true;
	    }
	    return false;
	}
	
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.splashlogo); 
        
        Thread logoTimer = new Thread(){
        	
        	public void run(){
        		
        	try{
        		sleep(2000);
        		Intent menuIntent = new Intent("com.CannedHead.dedo.MENU"); 
        		startActivity(menuIntent); 
        		// set animation 
        		overridePendingTransition(R.anim.abc_slide_in_top, R.anim.abc_slide_in_bottom); 
        		
        		} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
        		finally{
        			finish(); 
        		}
        	}
        	
        }; 
        
       logoTimer.start();
        
    }
    
}









// MENU 

/* @Override
public boolean onCreateOptionsMenu(Menu menu) {
    
    // Inflate the menu; this adds items to the action bar if it is present.
    getMenuInflater().inflate(R.menu.splash, menu);
    return true;
}

*/