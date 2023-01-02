package com.TestAutomationDemo.helper;

import com.TestAutomationDemo.utils.library;

public class ConfigFileReader {
	public static String getReportConfigPath() {
		String reportConfigPath = library.getProperty("reportConfigPath");
		if (reportConfigPath != null)
			return reportConfigPath;
		else
			throw new RuntimeException(
					"Report Config Path not specified in the Configuration.properties file for the Key:reportConfigPath");
	}
}
