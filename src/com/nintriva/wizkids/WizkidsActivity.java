package com.nintriva.wizkids;

import java.util.ArrayList;
import java.util.Random;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.Toast;

public class WizkidsActivity extends Activity {
	private ArrayList<ImageView> images;
	private ArrayList<Button> buttons;
	private ArrayList<Integer> stack;
	Random _myRand;

	@Override
	public void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.main);

		images = new ArrayList<ImageView>();
		buttons = new ArrayList<Button>();
		stack = new ArrayList<Integer>();
		_myRand = new Random();

		images.add((ImageView)findViewById(R.id.img0));
		images.add((ImageView)findViewById(R.id.img1));
		images.add((ImageView)findViewById(R.id.img2));
		images.add((ImageView)findViewById(R.id.img3));
		images.add((ImageView)findViewById(R.id.img4));
		images.add((ImageView)findViewById(R.id.img5));
		images.add((ImageView)findViewById(R.id.img6));
		images.add((ImageView)findViewById(R.id.img7));
		images.add((ImageView)findViewById(R.id.img8));
		images.add((ImageView)findViewById(R.id.img9));
		images.add((ImageView)findViewById(R.id.img10));
		images.add((ImageView)findViewById(R.id.img11));
		images.add((ImageView)findViewById(R.id.img12));
		images.add((ImageView)findViewById(R.id.img13));
		images.add((ImageView)findViewById(R.id.img14));
		images.add((ImageView)findViewById(R.id.img15));
		images.add((ImageView)findViewById(R.id.img16));
		images.add((ImageView)findViewById(R.id.img17));
		images.add((ImageView)findViewById(R.id.img18));
		images.add((ImageView)findViewById(R.id.img19));
		images.add((ImageView)findViewById(R.id.img20));
		images.add((ImageView)findViewById(R.id.img21));
		images.add((ImageView)findViewById(R.id.img22));
		images.add((ImageView)findViewById(R.id.img23));
		images.add((ImageView)findViewById(R.id.img24));
		images.add((ImageView)findViewById(R.id.img25));
		images.add((ImageView)findViewById(R.id.img26));
		images.add((ImageView)findViewById(R.id.img27));
		images.add((ImageView)findViewById(R.id.img28));
		images.add((ImageView)findViewById(R.id.img29));
		images.add((ImageView)findViewById(R.id.img30));
		images.add((ImageView)findViewById(R.id.img31));
		images.add((ImageView)findViewById(R.id.img32));
		images.add((ImageView)findViewById(R.id.img33));
		images.add((ImageView)findViewById(R.id.img34));
		images.add((ImageView)findViewById(R.id.img35));

		buttons.add((Button)findViewById(R.id.b0));
		buttons.add((Button)findViewById(R.id.b1));
		buttons.add((Button)findViewById(R.id.b2));
		buttons.add((Button)findViewById(R.id.b3));
		buttons.add((Button)findViewById(R.id.b4));
		
		final Animation _myAnim = AnimationUtils.loadAnimation(getApplicationContext(), R.anim.rotate);
		images.get(0).clearAnimation();
		images.get(0).startAnimation(_myAnim);

		Integer number = _myRand.nextInt(36);
		Integer correct_answer =  36 - number;
		Integer i = 0;
		
		do	{
			Integer index = _myRand.nextInt(36);
			if(!(stack.contains(index)))	{
				images.get(index).setVisibility(View.INVISIBLE);
				stack.add(index);
				i++;
			}
		}	while(i != number);
		
		stack.clear();
		i = 0;
		
		do	{
			Integer answer = _myRand.nextInt(36);
			if(!(stack.contains(answer)) && answer != (correct_answer))	{
				buttons.get(i).setText(String.valueOf(answer));
				stack.add(answer);
				i++;
			}
		} while (i != 5);
		
		i = _myRand.nextInt(5);
		buttons.get(i).setText(String.valueOf(correct_answer));
		buttons.get(i).setOnClickListener(new OnClickListener() {			
			@Override
			public void onClick(View v) {
				Toast.makeText(getApplication(), "Correct Answer", Toast.LENGTH_SHORT).show();
			}
		});
	}
}