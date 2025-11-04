package com.automation.SeleniumFramework.Utils;

import java.io.FileInputStream;
import java.util.HashMap;
import java.util.Map;

import org.apache.poi.ss.usermodel.*;
import org.apache.poi.xssf.usermodel.*;

public class ExcelUtils {

	public static Map<String, String> getDataForTestCase(String testCaseId){
		try {
			FileInputStream fis = new FileInputStream("TestData.xlsx");
	        
	        Workbook workbook = new XSSFWorkbook(fis);
	        Sheet sheet = workbook.getSheet("TestData");
	 
	        int rowCount = sheet.getPhysicalNumberOfRows();
	        int colCount = sheet.getRow(0).getPhysicalNumberOfCells();
	 
	        Map<String, String> rowData = new HashMap<>();
	 
	        for (int i = 1; i < rowCount; i++) {
	            Row row = sheet.getRow(i);
	            Cell firstCell = row.getCell(0);
	 
	            if (firstCell != null && firstCell.toString().equalsIgnoreCase(testCaseId)) {
	                // Found required test case row
	                for (int j = 1; j < colCount; j++) {
	                    Cell cell = row.getCell(j);
	                    String rawValue = (cell == null) ? "" : cell.toString().trim();
	 
	                    if (rawValue.contains("=")) {
	                        String[] parts = rawValue.split("=", 2);
	                        rowData.put(parts[0], parts[1]);  // key=value
	                    }
	                }
	                break;
	            }
	        }
	 
	        workbook.close();
	        return rowData;
		}catch(Exception e) {
			e.printStackTrace();
//			ExceptionHandler.handleException(e);
		}
		return null;
    }
}
