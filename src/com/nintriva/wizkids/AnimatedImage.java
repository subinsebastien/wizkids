package com.nintriva.wizkids;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;

public class AnimatedImage extends ImageView	{
	
	private boolean visib;
	private Animation _myAnim;
	
	public boolean isVisib() {
		return visib;
	}

	public void setVisib(boolean visib) {
		this.visib = visib;
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