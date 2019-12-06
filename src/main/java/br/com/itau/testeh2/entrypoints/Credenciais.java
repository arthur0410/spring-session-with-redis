package br.com.itau.testeh2.entrypoints;

public class Credenciais {
	
	private String token;
	private String refreshToken;
	
	public Credenciais(String token, String refreshToken) {
		this.token = token;
		this.refreshToken = refreshToken;
	}
	
	
	public String getToken() {
		return token;
	}
	public String getRefreshToken() {
		return refreshToken;
	}
}
