package com.ls.widgets;

import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.Paint.Align;
import android.graphics.Point;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;

import com.ls.widgets.map.model.MapObject;

public class CaptionMapObject extends MapObject 
{

	private String caption;
	private Paint paint;
	
	public CaptionMapObject(Object id, Drawable drawable, Point position,
			Point pivotPoint, boolean isTouchable, boolean isScalable) {
		super(id, drawable, position, pivotPoint, isTouchable, isScalable);
		
		paint = new Paint(Paint.ANTI_ALIAS_FLAG);
		paint.setColor(Color.WHITE);
		paint.setTextAlign(Align.CENTER);
		paint.setTextSize(14);
		paint.setTypeface(Typeface.SANS_SERIF);
		paint.setFakeBoldText(true);
		paint.setShadowLayer(1, 0, 0, Color.BLACK);
	}

	
	public void setCaption(String caption)
	{
		this.caption = caption;
	}
	
	
	@Override
	public void draw(Canvas canvas) 
	{		
		super.draw(canvas);
		
		if (caption != null) {
			canvas.drawText(caption, posScaled.x, posScaled.y - 10, paint);
		}
	}
	
}
