package com.nintriva.wizkids;

import java.util.ArrayList;
import java.util.Random;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;

public class AnimatedImage extends ImageView	{
	
	private boolean visib;
	private Animation _myAnim;
	private ArrayList<Object> _imgs;
	private Random _myRand;
	private Resources _myRes;
	
	public boolean isVisib() {
		return visib;
	}

	public void setVisib(boolean visib) {
		this.visib = visib;
		_imgs = new ArrayList<Object>();
		_myRand = new Random();
		_myRes = getResources();
		_imgs.add(_myRes.getDrawable(R.drawable.bug));
		_imgs.add(_myRes.getDrawable(R.drawable.donkey));
		_imgs.add(_myRes.getDrawable(R.drawable.fish));
		_imgs.add(_myRes.getDrawable(R.drawable.fly));
		_imgs.add(_myRes.getDrawable(R.drawable.frog));
		_imgs.add(_myRes.getDrawable(R.drawable.gold));
		_imgs.add(_myRes.getDrawable(R.drawable.icq));
		this.setImageDrawable((Drawable)_imgs.get(_myRand.nextInt(7)));
	}

	public AnimatedImage(Context context) {
		super(context, null);
		this.setVisib(false);
		this.set_myAnim(AnimationUtils.loadAnimation(context, R.anim.default_anim)); 
	}
	
	public AnimatedImage(Context context, AttributeSet attrs) {
		super(context, attrs);
		this.setVisib(false);
		this.set_myAnim(AnimationUtils.loadAnimation(context, R.anim.default_anim));
	}

	public AnimatedImage(Context context, AttributeSet attrs, int defStyle) {
		super(context, attrs, defStyle);
		this.setVisib(false);
		this.set_myAnim(AnimationUtils.loadAnimation(context, R.anim.default_anim));
	}

	public Animation get_myAnim() {
		return _myAnim;
	}

	public void set_myAnim(Animation _myAnim) {
		this._myAnim = _myAnim;
	}
	
	public void start_myAnim()	{
		this.startAnimation(_myAnim);
	}
}