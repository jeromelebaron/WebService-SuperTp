package fr.afcepf.atod26.ws.supertp.exception;

public class WSControlerException extends Exception {

	/**
	 * Sérialisation.
	 */
	private static final long serialVersionUID = 753457236971727032L;
	/**
	 * Constructeur vide.
	 */
	public WSControlerException() {
		super();
	}
	/**
	 * Constructeur avec message.
	 * @param paramMessage le message de l'exception.
	 */
	public WSControlerException(String paramMessage) {
		super(paramMessage);
	}

}
