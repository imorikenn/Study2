package com.example.demo.common;

// Dao層で発生した例外を補足するためのクラス
public class DataNotFoundException extends Exception {
	public DataNotFoundException() {
	}

	public DataNotFoundException(String msg) {
		super(msg);
	}

	public DataNotFoundException(Throwable th) {
		super(th);
	}

	public DataNotFoundException(String msg, Throwable th) {
		super(msg, th);
	}
}
