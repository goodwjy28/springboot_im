package com.wyj.springboot.im.socketnio;

/**
 * 
 * @author wuyingjie
 * @date 2017年11月23日
 */

public class UserDescribe {
	
	private long userId;
	private String username;
	
	private long roomId;
	
	public long getUserId() {
		return userId;
	}
	
	public void setUserId(long userId) {
		this.userId = userId;
	}
	
	public String getUsername() {
		return username;
	}
	
	public void setUsername(String username) {
		this.username = username;
	}
	
	public long getRoomId() {
		return roomId;
	}
	
	public void setRoomId(long roomId) {
		this.roomId = roomId;
	}
	
	
}
