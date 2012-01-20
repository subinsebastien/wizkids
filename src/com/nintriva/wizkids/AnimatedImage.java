package com.nintriva.wizkids;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.ImageView;

public class AnimatedImage extends ImageView	{
	
	private boolean visib;
	
	public boolean isVisib() {
		return visib;
	}

	public void setVisib(boolean visib) {
		this.visib = visib;
	}

	public AnimatedImage(Context context) {
		super(context, null);
		this.visib = true;
	}
	
	public AnimatedImage(Context context, AttributeSet attrs) {
		super(context, attrs);
		this.visib = true;
	}

	public AnimatedImage(Context context, AttributeSet attrs, int defStyle) {
		super(context, attrs, defStyle);
		this.visib = true;
	}
}