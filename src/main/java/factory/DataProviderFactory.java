package factory;

import dataProvider.ConfigDataProvider;
import dataProvider.ExcelDataProvider;

public class DataProviderFactory 
{

	
	public static ConfigDataProvider getConfig()
	{
		
		ConfigDataProvider  conf =new ConfigDataProvider ();
		return conf;
		
	}
	public static ExcelDataProvider getExcel()
	{
		ExcelDataProvider excel = new ExcelDataProvider();
		return excel;
	}
}
