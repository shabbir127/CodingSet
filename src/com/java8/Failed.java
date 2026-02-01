package com.java8;

import java.util.Arrays;
import java.util.List;

public class Failed {

	

	public static void main(String[] args) {
		
	
			Subscription subscription1=new Subscription("shabbir",12000,PlanType.PREMIUM,true);
			Subscription subscription2=new Subscription("rohit",1000,PlanType.STANDARD,false);
			List<Subscription> subscriptions=Arrays.asList(subscription1,subscription2);
	
		List<Subscription> updatedSubscriptions =
		        subscriptions.stream()
		                .filter(s -> s.getMonthlySpend() > 10_000)
		                .filter(s -> s.getPlanType() == PlanType.STANDARD
		                          || s.getPlanType() == PlanType.PREMIUM)
		                .peek(s -> {
		                    if (s.isStudent()) {
		                        s.setMonthlySpend(s.getMonthlySpend() * 0.5);
		                    }
		                })
		                .toList();   // use collect(Collectors.toList()) for Java 8

		List<Subscription> updatedSubscriptions2=subscriptions.stream()
				.filter(s-> s.getMonthlySpend() < 10000)
				.filter(s->s.getPlanType()== PlanType.NORMAL
				|| s.getPlanType() == PlanType.STANDARD)
				.peek(s-> {
					if(s.isStudent())
					{
						s.setMonthlySpend(s.getMonthlySpend() * 0.5);
					}
				}).toList();
				
		
		
		// Print result
        updatedSubscriptions.forEach(s ->
                System.out.println(
                        s.getUserId() + " | " +
                        s.getPlanType() + " | " +
                        s.getMonthlySpend()
                )
        );
	}
	
}





enum PlanType {
    PREMIUM, STANDARD, NORMAL;
}

class Subscription {
    private String userId;
    private double monthlySpend;
    private PlanType planType;
    private boolean student;

    // constructor, getters, setters
    public Subscription(String userId, double monthlySpend, PlanType planType, boolean student) {
        this.userId = userId;
        this.monthlySpend = monthlySpend;
        this.planType = planType;
        this.student = student;
    }

    public String getUserId() {
        return userId;
    }

    public double getMonthlySpend() {
        return monthlySpend;
    }

    public void setMonthlySpend(double monthlySpend) {
        this.monthlySpend = monthlySpend;
    }

    public PlanType getPlanType() {
        return planType;
    }

    public boolean isStudent() {
        return student;
    }
}
