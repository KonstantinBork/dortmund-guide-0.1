package de.Dortmund.Guide;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;

public class startActivity extends Activity implements OnClickListener {
	//Deklarierung des Buttons
	private Button startButton;
	
    //Erstellen der Activity
	@Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main);
        
        //Initialisierung des Buttons
        startButton = (Button)findViewById(R.id.start);
		startButton.setOnClickListener(this);
	}

	//Handlung bei Buttonklick
	@Override
	public void onClick(View v) {
		//wenn der Button gedrückt wurde
		if(v == startButton){
			startActivity(new Intent(startActivity.this, menu.class));	//starten einer neuen Activity
			finish();	//beenden dieser Activity
		}
	}
}
