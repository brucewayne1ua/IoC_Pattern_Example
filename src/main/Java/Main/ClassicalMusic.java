package Main;

import javax.annotation.PreDestroy;


public class ClassicalMusic implements Music {

	public void DoMyInit() {
		System.out.println("Do MyInit");
	}

	@PreDestroy
	public void DoMyDestroy() {
		System.out.println("Do MyDestroy");
	}

	@Override
	public String getSong() {
		return "Some Classical Music";
	}
}
