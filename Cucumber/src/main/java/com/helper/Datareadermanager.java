package com.helper;

import java.io.IOException;

public class Datareadermanager {
	private Datareadermanager()
	{
		
	}
	public static Datareadermanager getinstanceDRM()
	{
		Datareadermanager drm = new Datareadermanager();
		return drm;
	}
	public DataReader getinstanceDataReader() throws IOException
	{
		DataReader dr = new DataReader();
		return dr;
	}
	
	}


