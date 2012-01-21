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
import android.widget.Toast;


public class WizkidsActivity extends Activity	{
	private ArrayList<AnimatedImage> images;
	private ArrayList<Button> buttons;
	private ArrayList<Integer> stack;
	Random _myRand;
	Animation _rotate;

	@Override
	public void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.main);

		images	= new ArrayList<AnimatedImage>();
		buttons	= new ArrayList<Button>();
		stack	= new ArrayList<Integer>();
		_myRand	= new Random();
		_rotate = AnimationUtils.loadAnimation(getApplicationContext(), R.anim.rotate);

		images.add((AnimatedImage)findViewById(R.id.img0));
		images.add((AnimatedImage)findViewById(R.id.img1));
		images.add((AnimatedImage)findViewById(R.id.img2));
		images.add((AnimatedImage)findViewById(R.id.img3));
		images.add((AnimatedImage)findViewById(R.id.img4));
		images.add((AnimatedImage)findViewById(R.id.img5));
		images.add((AnimatedImage)findViewById(R.id.img6));
		images.add((AnimatedImage)findViewById(R.id.img7));
		images.add((AnimatedImage)findViewById(R.id.img8));
		images.add((AnimatedImage)findViewById(R.id.img9));
		images.add((AnimatedImage)findViewById(R.id.img10));
		images.add((AnimatedImage)findViewById(R.id.img11));
		images.add((AnimatedImage)findViewById(R.id.img12));
		images.add((AnimatedImage)findViewById(R.id.img13));
		images.add((AnimatedImage)findViewById(R.id.img14));
		images.add((AnimatedImage)findViewById(R.id.img15));
		images.add((AnimatedImage)findViewById(R.id.img16));
		images.add((AnimatedImage)findViewById(R.id.img17));
		images.add((AnimatedImage)findViewById(R.id.img18));
		images.add((AnimatedImage)findViewById(R.id.img19));
		images.add((AnimatedImage)findViewById(R.id.img20));
		images.add((AnimatedImage)findViewById(R.id.img21));
		images.add((AnimatedImage)findViewById(R.id.img22));
		images.add((AnimatedImage)findViewById(R.id.img23));
		images.add((AnimatedImage)findViewById(R.id.img24));
		images.add((AnimatedImage)findViewById(R.id.img25));
		images.add((AnimatedImage)findViewById(R.id.img26));
		images.add((AnimatedImage)findViewById(R.id.img27));
		images.add((AnimatedImage)findViewById(R.id.img28));
		images.add((AnimatedImage)findViewById(R.id.img29));
		images.add((AnimatedImage)findViewById(R.id.img30));
		images.add((AnimatedImage)findViewById(R.id.img31));
		images.add((AnimatedImage)findViewById(R.id.img32));
		images.add((AnimatedImage)findViewById(R.id.img33));
		images.add((AnimatedImage)findViewById(R.id.img34));
		images.add((AnimatedImage)findViewById(R.id.img35));

		buttons.add((Button)findViewById(R.id.b0));
		buttons.add((Button)findViewById(R.id.b1));
		buttons.add((Button)findViewById(R.id.b2));
		buttons.add((Button)findViewById(R.id.b3));
		buttons.add((Button)findViewById(R.id.b4));
		

		int number = _myRand.nextInt(36);
		int i = 0;

		do	{
			int index = _myRand.nextInt(36);
			if(!images.get(index).isVisib())	{
				images.get(index).setVisib(true);
				images.get(index).set_myAnim(_rotate); //set some random animations here
				i++;
			}
		}	while(i != number);

		for(AnimatedImage image : images)	{
			image.start_myAnim();
		}

		stack.clear();
		i = 0;
		
		do	{
			Integer answer = _myRand.nextInt(36);
			if(!(stack.contains(answer)) && answer != (number))	{
				buttons.get(i).setText(String.valueOf(answer));
				stack.add(answer);
				i++;
			}
		} while (i != 5);
		
		i = _myRand.nextInt(5);
		buttons.get(i).setText(String.valueOf(number));
		buttons.get(i).setOnClickListener(new OnClickListener() {			
			@Override
			public void onClick(View v) {
				Toast.makeText(getApplication(), "Correct Answer", Toast.LENGTH_SHORT).show();
			}
		});		
	}
}