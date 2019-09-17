package com.tianya.osc;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @Author: yizhen
 * @Date: 2018/12/6 10:31
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class AccessToken {

	private String accessToken;

	private String refreshToken;

	private String tokenType;

	private Integer expiresIn;

	private Integer uid;
}
