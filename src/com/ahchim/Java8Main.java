package com.ahchim;

import java.time.DayOfWeek;
import java.time.Duration;
import java.time.Instant;
import java.time.LocalDate;
import java.time.Month;
import java.time.temporal.TemporalAdjusters;

import com.ahchim.util.TimeUtil;

public class Java8Main {
	public static void main(String args[]){
		//calcDurationBySystemMili();
		//calcDuration();
		
		getDate();
		adjustDate();
	}
	
	// today.with() �Լ� ����ϱ� : TemporalAdjusters.dayOfWeekInMonth �Լ� ���
	public static void adjustDate(){
		LocalDate today = LocalDate.now();
		
		LocalDate next = today.with(TemporalAdjusters.dayOfWeekInMonth(2, DayOfWeek.SUNDAY));
		
		System.out.println("2�� 2��° �Ͽ���: " + next);
	}
	
	// LocalDate�� ��¥ �޾ƿ���
	public static void getDate(){
		LocalDate today = LocalDate.now();
		System.out.println("today: " + today);
		LocalDate myBirthday = LocalDate.of(1987, 6, 25);
		System.out.println("My Birthday: " + myBirthday);
		myBirthday = LocalDate.of(1987, Month.APRIL, 25);
		System.out.println("My Birthday: " + myBirthday);
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
