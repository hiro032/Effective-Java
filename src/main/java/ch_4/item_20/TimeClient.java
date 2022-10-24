package ch_4.item_20;

import java.time.ZoneId;
import java.time.ZonedDateTime;

public interface TimeClient {

	void setTime(int hour, int minute, int second);
	void setDate(int hour, int minute, int second);
	void setDateAndTime(int hour, int minute, int second);

	static ZoneId getZonedId(String zone) {
		return ZoneId.of(zone);
	}

	default ZonedDateTime getZonedDateTime() {
		return ZonedDateTime.now();
	}

}
