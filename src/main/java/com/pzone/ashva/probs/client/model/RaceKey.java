package com.pzone.ashva.probs.client.model;

import java.util.List;

import com.google.common.base.Joiner;
import com.google.common.base.Objects;
import com.google.common.base.Splitter;

public class RaceKey {
	private Integer localDate;
	private String pzoneCode;
	private Integer raceNo;

	public RaceKey() {

	}

	public RaceKey(Integer localDate, String pzoneCode, Integer raceNo) {
		this.localDate = localDate;
		this.pzoneCode = pzoneCode;
		this.raceNo = raceNo;
	}

	public RaceKey(String dbRaceKey) {
		final List<String> keys = Splitter.on('~').splitToList(dbRaceKey);
		this.localDate = Integer.parseInt(keys.get(0));
		this.pzoneCode = keys.get(1);
		this.raceNo = Integer.parseInt(keys.get(2));
	}

	/**
	 * @return the localDate
	 */
	public Integer getLocalDate() {
		return localDate;
	}

	/**
	 * @return the pzoneCode
	 */
	public String getPzoneCode() {
		return pzoneCode;
	}

	/**
	 * @return the raceNo
	 */
	public Integer getRaceNo() {
		return raceNo;
	}

	@Override
	public int hashCode() {
		return Objects.hashCode(getLocalDate(), getPzoneCode(), getRaceNo());
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		RaceKey other = (RaceKey) obj;
		return getLocalDate().equals(other.getLocalDate()) && getPzoneCode().equals(other.getPzoneCode())
				&& getRaceNo().equals(other.getRaceNo());
	}

	@Override
	public String toString() {
		return Joiner.on("~").join(getLocalDate(), getPzoneCode(), getRaceNo());
	}

}
