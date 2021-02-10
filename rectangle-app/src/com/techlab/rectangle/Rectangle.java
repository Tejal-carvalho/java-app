package com.techlab.rectangle;

public class Rectangle {
	private float width;
	private float height;

	public float getHeight() {
		return height;
	}

	public float getWidth() {
		return width;
	}

	public void setHeight(float newHeight) {
		if(newHeight<0) {
			height=0;
		}
		else if(newHeight>100) {
			height=100;
		}
			
		else {
		height = newHeight;
		}

	}

	public void setWidth(float newWidth) {
		if(newWidth<0) {
			width=0;
		}
		else if(newWidth>100) {
			width=100;
		}
		else {
		width = newWidth;
		}
	}
}
