package com.sura.ensayandojenkis.domain.exception;

public class BusinessException extends Exception{

	/**
	 * Esta variable se utiliza para que el JRE(JavaRunEnviorement) 
	 * pueda detectar esta clase de excepciones personalizadas
	 * que estamos creando, dado el caso de que necesite hacer alusion a esta clase.
	 */
	private static final long serialVersionUID = 1L;
	
	public BusinessException(Exception e,String message){
		super(message);
	}
	
	public BusinessException(String message){
		super(message);
	}
	
	public BusinessException(){
		super();
	}

}
