package com.CannedHead.dedo;



import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.os.CountDownTimer;
import android.view.KeyEvent;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class Single extends Activity{
	
	static boolean inicio = false;
	static int puntaje1 = 0 ;
	static int puntaje2 = 0 ;
	
	
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		setContentView(R.layout.singlegame);
		//String answer = ""; 
		
		final TextView contador2 = (TextView) findViewById(R.id.countBabe); 
		final TextView contador1 = (TextView) findViewById (R.id.countHoney); 
        Button player1but = (Button) findViewById(R.id.btnHoney); 
        Button player2but = (Button) findViewById(R.id.btnBabe);
        puntaje1 = 0 ;
      	puntaje2 = 0 ;
     
        countdownInicio(); 
        
      //Contador1

      //Button player Babe function 
        player1but.setOnClickListener(new View.OnClickListener() {
        	 
			@Override
			public void onClick(View v) { 
				if(inicio == true){
				puntaje1 ++; 
				//Update a label with a dynamic answer
				contador1.setText(""+puntaje1);
				}
			}
		});

        
      //Button player Honey function 
        player2but.setOnClickListener(new View.OnClickListener() {
        	 
			@Override
			public void onClick(View v) { 
				if(inicio == true){
				puntaje2 ++; 
				//Update a label with a dynamic answer
				contador2.setText(""+puntaje2);
				}
			}
		}); 
        
	}

	
			
			public void countdownInicio(){
				final TextView time1 = (TextView) findViewById(R.id.timerTop); 
				final TextView time2 = (TextView) findViewById(R.id.timerBottom);
				
				
				
				
				 //CONTADOR #3
				final CountDownTimer Cont3 = new CountDownTimer(30000, 1000) {

				  
			    public void onTick(long millisUntilFinished) {
			        time1.setText("Let's finger it: " + millisUntilFinished / 1000);
			    }
			    public void onFinish() {
			        time1.setText("");
					 
			        }
			    };
			 
			    //CONTADOR #4
				final CountDownTimer Cont4 = new CountDownTimer(30000, 1000) {

				  
			    public void onTick(long millisUntilFinished) {
			        time2.setText("Let's finger it: " + millisUntilFinished / 1000);
			    }
			    public void onFinish() {
			        time2.setText("");
			        detener(); 
			        
			        if (puntaje1 > puntaje2 ){
						Intent singleIntent = new Intent (Single.this, Tryagainbabe.class); 
						startActivity(singleIntent);
						}
			        else {
			        	
			        	Intent singleIntent = new Intent (Single.this, Tryagain.class); 
						startActivity(singleIntent);
			        }
					 
			        }
			    };
			 
				 //CONTADOR #2
				final CountDownTimer Cont2 = new CountDownTimer(10000, 1000) {

				  
			    public void onTick(long millisUntilFinished) {
			        time2.setText("Be Ready: " + millisUntilFinished / 1000);
			    }
			    public void onFinish() {
			        time2.setText("START");
					 
			        }
			    };
			    Cont2.start(); 
			    
			    //CONTADOR #1 Con funcionalidad 
				final CountDownTimer Cont1 = new CountDownTimer(10000, 1000) {

				  
			    public void onTick(long millisUntilFinished) {
			        time1.setText("Be Ready: " + millisUntilFinished / 1000);
			    }
			    public void onFinish() {
			        time1.setText("START");
			        
			       /* Intent singleIntent = new Intent (Single.this, Tryagain.class); 
					startActivity(singleIntent);*/
			        
					Cont3.start(); 
					Cont4.start(); 
					encender(); 
			        }
			    };
			    Cont1.start();
			}	
			
			
			
			// Detener botones
			public void detener(){
				
				inicio = false; 
				
				
			}
			
			
			// Encender botones  
			
			public void encender(){
				
				inicio = true; 
			}
			
			
			
			
			//Back Button  
			public boolean onKeyDown(int keyCode, KeyEvent event){
			    if(keyCode == KeyEvent.KEYCODE_BACK) { 
			    		finish();
			            Intent Act2Intent = new Intent(Single.this, Menu.class);  
			            startActivity(Act2Intent); 
			             
			            return true;
			    }
			    return false;
			}
			
}
