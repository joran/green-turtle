package se.js.greenturtle;

import javax.validation.constraints.NotNull;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

@Component
@ConfigurationProperties(prefix="gt.foo")
public class FooSettings {
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
