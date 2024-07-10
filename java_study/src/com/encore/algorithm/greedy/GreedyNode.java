package com.encore.algorithm.greedy;

public class GreedyNode implements Comparable<GreedyNode> {
	
	private String 	actionName ; 
	private int		startTime ; 
	private int		endTime ;
	
	public GreedyNode() {
	}

	public GreedyNode(String actionName, int startTime, int endTime) {
		this.actionName = actionName;
		this.startTime = startTime;
		this.endTime = endTime;
	}

	public String getActionName() {
		return actionName;
	}

	public void setActionName(String actionName) {
		this.actionName = actionName;
	}

	public int getStartTime() {
		return startTime;
	}

	public void setStartTime(int startTime) {
		this.startTime = startTime;
	}

	public int getEndTime() {
		return endTime;
	}

	public void setEndTime(int endTime) {
		this.endTime = endTime;
	}

	@Override
	public int compareTo(GreedyNode o) {
		// TODO Auto-generated method stub
		return this.endTime - o.endTime ; 
	}
	
	
}





