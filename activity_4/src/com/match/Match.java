package com.match;

abstract class Match {
	private int currentScore;
	private float currentOver;
	private int target;
	
	public int getCurrentScore() {
		return currentScore;
	}
	public void setCurrentScore(int currentScore) {
		this.currentScore = currentScore;
	}
	public float getCurrentOver() {
		return currentOver;
	}
	public void setCurrentOver(float currentOver) {
		this.currentOver = currentOver;
	}
	public int getTarget() {
		return target;
	}
	public void setTarget(int target) {
		this.target = target;
	}
	
	abstract float calculateRunRate();
	abstract int calculateBalls();
	abstract void display(double reqRunRate, int balls);
	
}

class ODIMatch extends Match
{
	float remOvers = 50-super.getCurrentOver();
	int reqRuns = super.getTarget()-super.getCurrentScore();
	float calculateRunRate()
	{
		float runRate = this.reqRuns/this.remOvers;
		return runRate;
	}
	int calculateBalls()
	{
		return 6*(int)this.remOvers;
	}
	void display(double rRR, int balls)
	{
		System.out.println("Need "+this.reqRuns+" runs in "+balls+" balls");
		System.out.println("Required run rate : "+rRR);
	}
	
}

class TestMatch extends Match
{
	float remOvers = 90-super.getCurrentOver();
	int reqRuns = super.getTarget()-super.getCurrentScore();
	float calculateRunRate()
	{
		float runRate = reqRuns/remOvers;
		return runRate;
	}
	int calculateBalls()
	{
		return 6*(int)remOvers;
	}
	void display(double rRR, int balls)
	{
		System.out.println("Need "+reqRuns+" runs in "+balls+" balls");
		System.out.println("Required run rate : "+rRR);
	}
}

class T20Match extends Match
{
	float remOvers = 20-super.getCurrentOver();
	int reqRuns = super.getTarget()-super.getCurrentScore();
	float calculateRunRate()
	{
		float runRate = reqRuns/remOvers;
		return runRate;
	}
	int calculateBalls()
	{
		return 6*(int)remOvers;
	}
	void display(double rRR, int balls)
	{
		System.out.println("Need "+reqRuns+" runs in "+balls+" balls");
		System.out.println("Required run rate : "+rRR);
	}
}