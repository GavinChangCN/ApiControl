/**
 * www.xbongbong.com Inc.
 * Copyright (c) 2014 All Rights Reserved.
 */
package com.xbongbong.util;

import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *	Create by xbongbong-web-archetype
 *
 */
public class CookieUtil {
	
	public static void addCookie(HttpServletResponse resp, Cookie cookie) {
		cookie.setPath("/");
		resp.addCookie(cookie);
	}
	
	public static Cookie getCookie(HttpServletRequest req, String name) {
		if (req == null || req.getCookies() == null || req.getCookies().length == 0) {
			return null;
		}
		for (Cookie cookie : req.getCookies()) {
			if (name.equals(cookie.getName())) {
				return cookie;
			}
		}
		return null;
	}
	
}
