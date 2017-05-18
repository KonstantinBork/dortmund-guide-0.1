package de.Dortmund.Guide;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

public class Sight extends Activity {
	
	//Erstellen der Activity
	@Override
	public void onCreate(Bundle savedInstanceState){
		super.onCreate(savedInstanceState);
		setContentView(R.layout.sight);		
		
		//Initialisierung der beiden TextView mit individuellem Design + Text
		TextView t1 = (TextView)findViewById(R.id.TextView01);
		t1.setTextSize(25);
		
		TextView t2 = (TextView)findViewById(R.id.TextView02);
		t2.setTextSize(15);
		
		//Übernahme des Button-Index
		Intent intent = getIntent();
		int index = intent.getIntExtra("clickedButton",0);
		
		//Initialisierung des ImageView
		ImageView iv = (ImageView)findViewById(R.id.ImageView01);
		
		//Ausgabe des Textes je nach ausgewählter Sehenswürdigkeit
		if(index == 1){
			iv.setImageResource(R.drawable.reinoldikirche);
			t1.setText(R.string.reinoldikirche);
			t2.setText(R.string.rkirchetger);
		}
		else if(index == 2){
			iv.setImageResource(R.drawable.apple);
			t1.setText(R.string.stadion);
			t2.setText(R.string.stadiontger);
		}
		else if(index == 3){
			iv.setImageResource(R.drawable.apple);
			t1.setText(R.string.westfalenpark);
			t2.setText(R.string.wparktger);
		}
		else if(index == 4){
			iv.setImageResource(R.drawable.apple);
			t1.setText(R.string.westfalenhallen);
			t2.setText(R.string.whallentger);
		}
		else if(index == 5){
			iv.setImageResource(R.drawable.apple);
			t1.setText(R.string.zoo);
			t2.setText(R.string.zootger);
		}
	}
}
