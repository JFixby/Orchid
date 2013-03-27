package org.torproject.jtor.socks.impl;

public class SocksRequestException extends Exception {
	
	private static final long serialVersionUID = 844055056337565049L;
	
	SocksRequestException() {}
	SocksRequestException(String msg) {
		super(msg);
	}
	
	SocksRequestException(Throwable ex) {
		super(ex);
	}
}
