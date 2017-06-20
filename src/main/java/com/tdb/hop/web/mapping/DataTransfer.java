package com.tdb.hop.web.mapping;

public class DataTransfer {
	private long bedId;
	private long oxygenSensorId;
	private long phSensorId;
	private long temperatureSensorId;
	
	private String oxygenSensorReading;
	private String phSensorReading;
	private String temperatureSensorReading;
	
	public DataTransfer(long bedId, long oxygenSensorId, long phSensorId, long temperatureSensorId, 
			String oxygenSensorReading, String phSensorReading, String temperatureSensorReading)
	{
		this.bedId = bedId;
		this.oxygenSensorId = oxygenSensorId;
		this.phSensorId = phSensorId;
		this.temperatureSensorId = temperatureSensorId;
		
		this.oxygenSensorReading = oxygenSensorReading;
		this.phSensorReading = phSensorReading;
		this.temperatureSensorReading = temperatureSensorReading;
		
	}
	
	public DataTransfer()
	{
		
	}
	
	public long getBedId()
	{
		return this.bedId;
	}
	
	public long getOxygenSensorId()
	{
		return this.oxygenSensorId;
	}
	
	public long getPhSensorId()
	{
		return this.phSensorId;
	}
	
	public long getTemperatureSensorId()
	{
		return this.temperatureSensorId;
	}
	
	public String getOxygenSensorReading()
	{
		return this.oxygenSensorReading;
	}
	
	public String getPhSensorReading()
	{
		return this.phSensorReading;
	}
	
	public String getTemperatureSensorReading()
	{
		return this.temperatureSensorReading;
	}
}
