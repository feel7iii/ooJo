//package com.atom.ooJo.configure.secure;
//
//import javax.sql.DataSource;
//
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.beans.factory.annotation.Qualifier;
//import org.springframework.context.annotation.Bean;
//import org.springframework.context.annotation.Configuration;
//import org.springframework.security.authentication.encoding.Md5PasswordEncoder;
//import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
//import org.springframework.security.config.annotation.web.builders.HttpSecurity;
//import org.springframework.security.config.annotation.web.builders.WebSecurity;
//import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
//import org.springframework.security.web.authentication.rememberme.JdbcTokenRepositoryImpl;
//
//import com.atom.ooJo.common.login.CustomUserDetailsService;
//import com.atom.ooJo.common.login.LoginSuccessHandler;
//
//@Configuration
//public class WebSecurityConfiguration extends WebSecurityConfigurerAdapter {
//
//	@Autowired
//	private CustomUserDetailsService customUserDetailsService;
//
//	@Autowired
//	@Qualifier(value = "dataSource")
//	private DataSource dataSource;
//
//	@Override
//	public void configure(WebSecurity web) throws Exception {
//		super.configure(web);
//		web.ignoring()
//			.antMatchers("/mui/**")
//			.antMatchers("/etc/**")
//			.antMatchers("/oth/**");
//	}
//
//	@Override
//	protected void configure(HttpSecurity http) throws Exception {
//		http.authorizeRequests()
//				.antMatchers("/login").permitAll()
//				.anyRequest().authenticated()
//			.and().formLogin()
//				.loginPage("/login").failureUrl("/login?error")
//				.defaultSuccessUrl("/")
//				.permitAll()
//			.and().logout()
//				.logoutUrl("logout").logoutSuccessUrl("/login?loggedOut")
//				.invalidateHttpSession(true).deleteCookies("JSESSIONID")
//				.permitAll()
//			.and().sessionManagement()
//				.sessionFixation().changeSessionId()
//				.maximumSessions(1).expiredUrl("/login?maxSessions")
//			.and().and().csrf().disable()
//				// 数据库中必须存在名为persistent_logins的表
//			.rememberMe().tokenValiditySeconds(60 * 60 * 2)
//				// 指定记住登录信息所使用的数据源
//			.tokenRepository(tokenRepository());
//	}
//
//	@Override
//	protected void configure(AuthenticationManagerBuilder builder) throws Exception {
//		builder.userDetailsService(customUserDetailsService).passwordEncoder(passwordEncoder());
//		// 不删除凭据，以便记住用户
//		builder.eraseCredentials(false);
//	}
//
//	@Bean
//	public Md5PasswordEncoder passwordEncoder() {
//		return new Md5PasswordEncoder();
//	}
//
//	@Bean
//	public JdbcTokenRepositoryImpl tokenRepository() {
//		JdbcTokenRepositoryImpl jtr = new JdbcTokenRepositoryImpl();
//		jtr.setDataSource(dataSource);
//		return jtr;
//	}
//
//	@Bean
//	public LoginSuccessHandler loginSuccessHandler() {
//		return new LoginSuccessHandler();
//	}
//}