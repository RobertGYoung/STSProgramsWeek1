package com.revature.sts03;

public class PrivateStudent extends PrivatePerson implements ExamInterface {

	private String course;
	private int score;
	
	

	public String getCourse() {
		return course;
	}

	public void setCourse(String course) {
		this.course = course;
	}

	public int getScore() {
		return score;
	}
	public void setScore(int score) {
		this.score=score;
	}
	@Override
	public String doSomething() {
		return "Learns";
		
	}

	@Override
	public void apprear() {
		// TODO Auto-generated method stub
		
		System.out.println(this.getName()+"'s score is: "+score+"/"+MAXSCORE);
		
		
		}
		
	}
	
	
	

