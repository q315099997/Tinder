package cn.tinder.das.exception;

public class ExportException extends RuntimeException {
	public ExportException(){
		super();
	}
	public ExportException(String message, Throwable cause,
			boolean enableSuppression, boolean writableStackTrace)
	{
		//super(message, cause, enableSuppression, writableStackTrace);
	}

	public ExportException(String message, Throwable cause)
	{
		super(message, cause);
	}

	public ExportException(String message)
	{
		super(message);
	}

	public ExportException(Throwable cause)
	{
		super(cause);
	}
    
	@Override
	public String toString()
	{
		String message = getLocalizedMessage();
	    return (message != null) ? (message) : "";
		//return "LoginException [toString()=" + super.toString() + "]";
	}

	private static final long serialVersionUID = 1L;
}
