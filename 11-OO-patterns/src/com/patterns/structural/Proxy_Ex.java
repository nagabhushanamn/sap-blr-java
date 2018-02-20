package com.patterns.structural;

interface Training {
	public void getTraining();
}

// ---------------------------------------------------

class Trainer implements Training {
	public void getTraining() {
		System.out.println("Training..........");
	}
}

// --------------------------------------------------

class Security {
	public void doSecurity() {
		System.out.println("sec check...");
	}
}

class Logger {
	public void doLog() {
		System.out.println("do log..");
	}
}
// -----------------------------------------------------

class SapientProxy implements Training {

	Security security = new Security();
	Logger logger = new Logger();
	Trainer trainer = new Trainer();

	@Override
	public void getTraining() {
		security.doSecurity();
		logger.doLog();
		trainer.getTraining();
		logger.doLog();
		security.doSecurity();
	}

}

// ----------------------------------------------------
class Participant {

	SapientProxy proxy;

	public void setProxy(SapientProxy proxy) {
		this.proxy = proxy;
	}

	public void doLearn() {
		proxy.getTraining();
		System.out.println("Learning.....");
	}
}

// --------------------------------------------------

interface Service {
	String getService();
}
class PrimeMinister implements Service {
	@Override
	public String getService() {
		return " service from prime-minister";
	}
}
class PrimiMinisterProxy implements Service {
	PrimeMinister primeMinister = new PrimeMinister();
	@Override
	public String getService() {
		System.out.println("proxy verifying..public needs before PM approve the service");
		return primeMinister.getService();
	}
}
class Public {
	public Service service;
	public void setService(Service service) {
		this.service = service;
	}
	public void publicNeedBehav() {
		String serv = service.getService();
		System.out.println("pub : " + serv);
	}
}
// -----------------------------------------------------

public class Proxy_Ex {
	public static void main(String[] args) {

		// SapientProxy proxy = new SapientProxy();
		// Participant participant = new Participant();
		// participant.setProxy(proxy);
		//
		// participant.doLearn();

		// ------------------------------------------

		Service proxy = new PrimiMinisterProxy();
		Public public1 = new Public();
		public1.setService(proxy);
		public1.publicNeedBehav();

		//-------------------------------------------
	}
}
