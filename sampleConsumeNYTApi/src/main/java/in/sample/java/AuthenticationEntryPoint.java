package in.sample.java;

import org.springframework.security.web.authentication.www.BasicAuthenticationEntryPoint;
import org.springframework.stereotype.Component;

@Component
public class AuthenticationEntryPoint extends BasicAuthenticationEntryPoint {

	@Override
	public void afterPropertiesSet() throws Exception {
		setRealmName("springboot");
		super.afterPropertiesSet();
	}

}
