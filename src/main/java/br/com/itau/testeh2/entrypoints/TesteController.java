package br.com.itau.testeh2.entrypoints;

import org.springframework.http.ResponseEntity;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TesteController {
	
	@GetMapping("/teste")
	public ResponseEntity<?> teste(){
		return ResponseEntity.ok().build();
	}
	
	@GetMapping("/login")
	public ResponseEntity<?> login(){
		Usuario usuario = new Usuario();
		usuario.setUserName("username");
		usuario.setToken("token");
		usuario.setRefreshToken("refreshToken");
		Authentication authentication = new UsernamePasswordAuthenticationToken(usuario, "usuario", null);
		SecurityContextHolder.getContext().setAuthentication(authentication);
		return ResponseEntity.ok().build();
	}
}
