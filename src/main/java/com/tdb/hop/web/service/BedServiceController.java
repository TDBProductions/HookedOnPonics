package com.tdb.hop.web.service;

import com.tdb.hop.web.mapping.DataTransfer;
import java.util.concurrent.atomic.AtomicLong;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class BedServiceController {
	
	private static final String template = "Test";
	private final AtomicLong counter = new AtomicLong();
	
	@RequestMapping("/datadrop")
	public DataTransfer dataTransfer(
			@RequestParam(value="bedId") long bedId,
			@RequestParam(value="oxygenSensorId") long oxygenSensorId,
			@RequestParam(value="phSensorId") long phSensorId,
			@RequestParam(value="temperatureSensorId") long temperatureSensorId,
			@RequestParam(value="oxygenSensorReading") String oxygenSensorReading,
			@RequestParam(value="phSensorReading") String phSensorReading,
			@RequestParam(value="temperatureSensorReading") String temperatureSensorReading)
	{
		// TODO: Mapping this POS
		return new DataTransfer();
	}
	
	
}
