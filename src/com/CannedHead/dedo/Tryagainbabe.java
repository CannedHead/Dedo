package com.CannedHead.dedo;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.KeyEvent;
import android.widget.TextView;

public class Tryagainbabe extends Activity {

	
	
	
	public boolean onKeyDown(int keyCode, KeyEvent event){
	    if(keyCode == KeyEvent.KEYCODE_BACK) {
	            Intent Act2Intent = new Intent(Tryagainbabe.this, Menu.class);              
	            startActivity(Act2Intent);          
	            finish();
	            return true;
	    }
	    return false;
	}
	
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.tryagainbabe);  
        
        Single.inicio = false; 
       // final TextView winner = (TextView) findViewById(R.id.babe); 
       // winner.setText("try again babe");
        
        
        
        
    }
    
}
