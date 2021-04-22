package com.pzone.ashva.probs.client.model;

import java.util.List;

public class LiveProbs {
	private RaceKey raceKey;
	private TriggerType triggerType;
	private boolean isProbsGenerated;
	private String serverTime;
	private List<AsProbs> asProbs;

	public LiveProbs(RaceKey raceKey, TriggerType triggerType) {
		this.raceKey = raceKey;
		this.triggerType = triggerType;
	}

	public String getServerTime() {
		return serverTime;
	}

	public void setServerTime(String serverTime) {
		this.serverTime = serverTime;
	}

	public RaceKey getRaceKey() {
		return raceKey;
	}

	public void setRaceKey(RaceKey raceKey) {
		this.raceKey = raceKey;
	}

	public TriggerType getTriggerType() {
		return triggerType;
	}

	public void setTriggerType(TriggerType triggerType) {
		this.triggerType = triggerType;
	}

	public List<AsProbs> getAsProbs() {
		return asProbs;
	}

	public boolean isProbsGenerated() {
		return isProbsGenerated;
	}

	public void setAsProbs(List<AsProbs> asProbs) {
		this.asProbs = asProbs;
	}

}
