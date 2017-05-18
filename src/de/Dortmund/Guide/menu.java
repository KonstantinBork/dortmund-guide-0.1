package de.Dortmund.Guide;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;

public class menu extends Activity implements OnClickListener  {
	//Deklarierung der einzelnen Buttons
	private Button button1;
	private Button button2;
	private Button button3;
	private Button button4;
	private Button button5;
	
    //Erstellen der Activity
	@Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.menu);
        
        //Initialisierung der Buttons
        button1 = (Button)findViewById(R.id.rkirche);
        button1.setOnClickListener(this);
        
        button2 = (Button)findViewById(R.id.stadion);
        button2.setOnClickListener(this);
        
        button3 = (Button)findViewById(R.id.westfalenpark);
        button3.setOnClickListener(this);
        
        button4 = (Button)findViewById(R.id.westfalenhallen);
        button4.setOnClickListener(this);
        
        button5 = (Button)findViewById(R.id.zoo);
        button5.setOnClickListener(this);
    }

	//Handlung bei Klick eines Buttons
	@Override
	public void onClick(View v) {
		//Initialisierung eines Intents,um Daten einer neuen Activity zu übergeben
		Intent intent;
		
		//falls button1
		if(v == button1){
			intent = new Intent(menu.this, Sight.class);	//starten der neuen Activity
			intent.putExtra("clickedButton",1);	//Übergabe des Button-Index
			startActivity(intent);
			onPause();	//pausieren dieser Activity
		}
		else if(v == button2){
			intent = new Intent(menu.this, Sight.class);
			intent.putExtra("clickedButton", 2);
			startActivity(intent);
			onPause();
		}
		else if(v == button3){
			intent = new Intent(menu.this, Sight.class);
			intent.putExtra("clickedButton", 3);
			startActivity(intent);
			onPause();
		}
		else if(v == button4){
			intent = new Intent(menu.this, Sight.class);
			intent.putExtra("clickedButton", 4);
			startActivity(intent);
			onPause();
		}
		else if(v == button5){
			intent = new Intent(menu.this, Sight.class);
			intent.putExtra("clickedButton", 5);
			startActivity(intent);
			onPause();
		}
	}		
}