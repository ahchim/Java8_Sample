package com.ahchim.util;

public class TimeUtil {
	private Long start;
	private Long end;
	private Long period;
	
	// 현재시간 값을 저장한 TimeUtil instance를 반환
	public static TimeUtil setStart(){
		TimeUtil timeUtil = new TimeUtil();
		timeUtil.start = System.currentTimeMillis();
		return timeUtil;
	}
	// setStart에서 넘겨주는 timeUtil instance를 생성
	public static void setEnd(TimeUtil timeUtil){
		timeUtil.end = System.currentTimeMillis();
		timeUtil.period = timeUtil.end - timeUtil.start;
		System.out.println("duration: " + timeUtil.period);
	}
}
