package br.padroes.strategy;

public class Cliente {
	public static final int EVENTVIEWER = 1;
	public static final int FILE = 2;
	public static final int DATABASE = 3;
	protected int log;
	protected Logger logger;

	public Cliente(int log) {
		switch (log) {
		case EVENTVIEWER:
			logger = new LoggerEventViewer();
			log = EVENTVIEWER;
			break;
		case FILE:
			logger = new LoggerFile();
			log = FILE;
			break;
		case DATABASE:
			logger = new LoggerDatabase();
			log = DATABASE;
			break;
		default:
			throw new RuntimeException("Cargo n�o encontrado :/");
		}
	}

	public void logComEstrategia() {
		logger.definirLog(this);
	}
}
