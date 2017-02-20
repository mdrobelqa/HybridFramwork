package dataProvider;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Properties;

public class ConfigDataProvider2 {
	private String	url          ="https://www.ups.com/?cookie=us_en_home&flash=false&Site=Corporate&setCookie=yes";
	private String	ChromePath   ="F:\\chromepath\\chromedriver.exe";
	private String	IEPath       = "F:\\iepath\\IEDriverServer.exe";
	private String	ExcelPath    ="./ApplicationTestData/AppData.xlsx";

	public String getUrl() {
		
		return url;
	}
	public String getChromePath() {
		return ChromePath;
	}
	public String getIEPath() {
		return IEPath;
	}
	public String getExcelPath() {
		return ExcelPath;
	}
	Properties pro;
	public ConfigDataProvider2(){
		File src=new File("./Configuration/config.properties");
		
		try {
			FileInputStream fis = new FileInputStream(src);
			
		 pro=new Properties();
			pro.load(fis);
			
		}
		catch (Exception e) {
			System.out.println("Exception is"+e.getMessage());
		}
			

	}
}

