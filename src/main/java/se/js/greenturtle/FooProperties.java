package se.js.greenturtle;

import javax.validation.constraints.NotNull;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Configuration;

@Configuration
@ConfigurationProperties(prefix="gt.foo", ignoreUnknownFields=false)
public class FooProperties {
	@NotNull
	private String yada;
	@NotNull
	private String bar;
	
	private String baz;
	
	public String getYada() {
		return yada;
	}
	public void setYada(String yada) {
		this.yada = yada;
	}
	public String getBar() {
		return bar;
	}
	public void setBar(String bar) {
		this.bar = bar;
	}
	public String getBaz() {
		return baz;
	}
	public void setBaz(String baz) {
		this.baz = baz;
	}
}
