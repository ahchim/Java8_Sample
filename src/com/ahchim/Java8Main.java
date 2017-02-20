package com.ahchim;

import java.time.Duration;
import java.time.Instant;

import com.ahchim.util.TimeUtil;

public class Java8Main {
	public static void main(String args[]){
		calcDurationBySystemMili();
		calcDuration();
		calcDurationBySystemMili();
		calcDuration();
		calcDurationBySystemMili();
		calcDuration();
	}
	
	// System.currentTimeMillis()�� �̿��� �ҿ�ð� ���
	public static void calcDurationBySystemMili(){
		TimeUtil timeUtil = TimeUtil.setStart();
		// task
		doAnyFunction();
		TimeUtil.setEnd(timeUtil);
	}
	
	// Java8�� Instant.now()�� �̿��� �ҿ�ð� ���
	public static void calcDuration(){
		Instant start = Instant.now();
		doAnyFunction();
		
		Instant end = Instant.now();
		Duration period = Duration.between(start, end);
		long millis = period.toMillis();
		
		System.out.println("�ҿ�ð�: " + millis);
	}

	private static void doAnyFunction() {
		double r = 0;
		for(long i=0; i<1000000000L; i++){
			r = r+i;
		}
	}
}
