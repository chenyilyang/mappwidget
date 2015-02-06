package com.ls.widgets.map.utils;

import android.graphics.Matrix;
import android.graphics.Rect;

public class TransformUtils 
{
    private static final Matrix matrix = new Matrix();
    
	public static Rect scaleRect(Rect coords, float scale, int pivotX, int pivotY)
	{
	    matrix.reset();
		matrix.setScale(scale, scale, pivotX, pivotY);
		
		float[] result = {coords.left, coords.top, coords.right, coords.bottom};
		matrix.mapPoints(result);
		
		return new Rect((int)result[0], (int)result[1], (int)result[2], (int)result[3]);
	}
}
