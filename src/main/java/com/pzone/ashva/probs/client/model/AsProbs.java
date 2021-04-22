package com.pzone.ashva.probs.client.model;

import java.util.Map;


public class AsProbs {

	private AsProbKey asProbKey = null;
	private Map<String, Double> probs = null;

	public AsProbs(AsProbKey asProbKey, Map<String, Double> probs) {
		this.asProbKey = asProbKey;
		this.probs = probs;
	}

	public AsProbKey getAsProbKey() {
		return asProbKey;
	}

	public void setAsProbKey(AsProbKey asProbKey) {
		this.asProbKey = asProbKey;
	}

	public Map<String, Double> getProbs() {
		return probs;
	}

	public void setProbs(Map<String, Double> probs) {
		this.probs = probs;
	}

}
