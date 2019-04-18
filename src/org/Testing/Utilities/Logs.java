package org.Testing.Utilities;

import org.apache.log4j.Logger;
import org.apache.log4j.xml.DOMConfigurator;

public class Logs 
{
	public static void TakeLogs(String classname, String message)
	{
		DOMConfigurator.configure("../YT_Framework1/Layout.xml");
		Logger l = Logger.getLogger(classname);
		l.info(message);
	}
}
