package com.pzone.ashva.probs.client.model;

public class AsProbKey {
	private Integer localDate;

	private String publicId;

	private String raceKey;

	private String asType;

	AsProbKey() {
	}

	public Integer getLocalDate() {
		return localDate;
	}

	void setLocalDate(Integer localDate) {
		this.localDate = localDate;
	}

	public String getRaceKey() {
		return raceKey;
	}

	void setRaceKey(String raceKey) {
		this.raceKey = raceKey;
	}

	public String getAsType() {
		return asType;
	}

	void setAsType(String asType) {
		this.asType = asType;
	}

	public String getPublicId() {
		return publicId;
	}

	public void setPublicId(String publicId) {
		this.publicId = publicId;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((asType == null) ? 0 : asType.hashCode());
		result = prime * result + ((localDate == null) ? 0 : localDate.hashCode());
		result = prime * result + ((publicId == null) ? 0 : publicId.hashCode());
		result = prime * result + ((raceKey == null) ? 0 : raceKey.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		AsProbKey other = (AsProbKey) obj;
		if (asType == null) {
			if (other.asType != null)
				return false;
		} else if (!asType.equals(other.asType))
			return false;
		if (localDate == null) {
			if (other.localDate != null)
				return false;
		} else if (!localDate.equals(other.localDate))
			return false;
		if (publicId == null) {
			if (other.publicId != null)
				return false;
		} else if (!publicId.equals(other.publicId))
			return false;
		if (raceKey == null) {
			if (other.raceKey != null)
				return false;
		} else if (!raceKey.equals(other.raceKey))
			return false;
		return true;
	}
}
