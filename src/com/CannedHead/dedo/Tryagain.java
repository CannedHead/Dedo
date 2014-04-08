package com.CannedHead.dedo;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.KeyEvent;
import android.widget.TextView;

public class Tryagain extends Activity {

	
	
	
	public boolean onKeyDown(int keyCode, KeyEvent event){
	    if(keyCode == KeyEvent.KEYCODE_BACK) {
	            Intent Act2Intent = new Intent(Tryagain.this, Menu.class);              
	            startActivity(Act2Intent);          
	            finish();
	            return true;
	    }
	    return false;
	}
	
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.tryagain);  
        Thread logoTimer = new Thread(){
        }; 
        
        Single.inicio = false; 
      //  final TextView winner = (TextView) findViewById(R.id.ganador); 
       // winner.setText("Try Again Honey. Babe rocks and is the winner is the winner");
        
        
        
        
    }
    
}
