package com.chandra.jai.limitsservice;

public class LimitConfiguration {
	
	private int minimum;
	private int maximum;
	
	protected LimitConfiguration(int minimum,int maximum)
	{
		this.minimum=minimum;
		this.maximum=maximum;
	}
	
	public LimitConfiguration()
	{}

	public int getMinimum() {
		return minimum;
	}

	public int getMaximum() {
		return maximum;
	}
	
	

}
