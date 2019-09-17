package com.tianya.osc;

import com.alibaba.fastjson.JSON;
import com.tianya.util.HttpMethod;

/**
 * @Author: yizhen
 * @Date: 2018/12/6 10:16
 */
public class AuthLoginUtils {

	private static String url = "https://www.oschina.net/action/openapi/token?callback=json&client_id=sW9a1Tf8AP8IIbUydQrr&client_secret=jkaHxvkGmrbpjZcebnDUhQbF6ieu9Qqc&dataType=json&redirect_uri=https://www.wenber.com";

	public static void main(String[] args) {
		AuthLoginUtils utils = new AuthLoginUtils();
		String freshToken = utils.getFreshToken(url, "78585b0c-54d2-4bb8-84ec-93f8b9bb8d72").getRefreshToken();
	}

	private AccessToken  getFreshToken(String url, String token) {
		HttpMethod http = new HttpMethod();
		url += "&grant_type=refresh_token";
		url += "&refresh_token=" + token;
		String data = http.get(getCodeUrl(url));
		AccessToken accessToken = JSON.parseObject(data, AccessToken.class);
		return accessToken;
	}

	private static String  getCodeUrl(String url) {
		url += "&grant_type=authorization_code";
		String code = "UZS8ge";
		String codeUrl = url + "&code=" + code;
		return codeUrl;
	}
}
