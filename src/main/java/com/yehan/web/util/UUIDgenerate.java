package com.yehan.web.util;

import java.util.UUID;

public class UUIDgenerate {
	public String getUUID() {
		String uuid = UUID.randomUUID().toString();
		return uuid;
	}
}
