package com.work.StereoTypeAnnotation;

import java.util.List;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Ipl {
	@Value("rcb")
	private String teamName;
	@Value("virat kohli")
	private String teamCaptain;
	
	public List<String> getPlayersName() {
		return playersName;
	}
	public void setPlayersName(List<String> playersName) {
		this.playersName = playersName;
	}
	@Value("#{temp}")
	private List<String> playersName; //Spring Expression Language
	public String getTeamName() {
		return teamName;
	}
	public void setTeamName(String teamName) {
		this.teamName = teamName;
	}
	public String getTeamCaptain() {
		return teamCaptain;
	}
	public void setTeamCaptain(String teamCaptain) {
		this.teamCaptain = teamCaptain;
	}
	@Override
	public String toString() {
		return "Ipl [teamName=" + teamName + ", teamCaptain=" + teamCaptain + ", playersName=" + playersName + "]";
	}
	public Ipl() {
	}
	
}
