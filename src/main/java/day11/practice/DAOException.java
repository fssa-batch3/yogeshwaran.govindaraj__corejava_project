package day11.practice;

public class DAOException extends Exception {
	
	public DAOException(String msg) {
		super(msg);
	}
	
	public DAOException(Throwable te) {
		super(te);
	}
	
	public DAOException(String msg, Throwable te) {
		super(msg, te);
	}

}
