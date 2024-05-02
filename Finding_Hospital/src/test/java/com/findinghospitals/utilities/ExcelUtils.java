package com.findinghospitals.utilities;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelUtils {
	static FileOutputStream file;
	static XSSFWorkbook workbook;

	public static List<String> readExcel() throws IOException {
		FileInputStream file1 = new FileInputStream(System.getProperty("user.dir") + "\\DataDriven\\inputExcel.xlsx");
		XSSFWorkbook workbook = new XSSFWorkbook(file1);
		XSSFSheet sheet = workbook.getSheet("Sheet1");
		XSSFRow row1 = sheet.getRow(0);
		XSSFRow row2 = sheet.getRow(1);
		XSSFRow row3 = sheet.getRow(2);
		String cityName = row1.getCell(0).toString();
		String type = row2.getCell(0).toString();
		String name = row3.getCell(0).toString();

		List<String> excelInputs = new ArrayList<String>();
		excelInputs.add(cityName);
		excelInputs.add(type);
		excelInputs.add(name);

		workbook.close();
		file1.close();
		return excelInputs;
	}

	public static void writeExcel1(List<String> lst1, List<String> lst2) throws IOException {
		file = new FileOutputStream(System.getProperty("user.dir") + "\\DataDriven\\outputExcel.xlsx");
		workbook = new XSSFWorkbook();
		XSSFSheet sheet1 = workbook.createSheet("HospitalNames");
		XSSFRow row1 = sheet1.createRow(0);
		row1.createCell(0).setCellValue("Hospital Name");
		row1.createCell(1).setCellValue("Rating");
		for (int i = 1; i <= lst1.size(); i++) {
			for (int j = 0; j < 2; j++) {
				XSSFRow row = sheet1.createRow(i);
				row.createCell(0).setCellValue(lst1.get(i - 1));
				row.createCell(1).setCellValue(lst2.get(i - 1));
			}
		}
		// Writing into Excel
		workbook.write(file);
		file.close();
	}

	public static void writeExcel1(List<String> lStrings) throws IOException {
		file = new FileOutputStream(System.getProperty("user.dir") + "\\DataDriven\\outputExcel.xlsx");
		XSSFSheet sheet = workbook.createSheet("TopCities");
		XSSFRow row1 = sheet.createRow(0);
		row1.createCell(0).setCellValue("Top Cities");
		for (int i = 1; i <= 7; i++) {
			XSSFRow row2 = sheet.createRow(i);
			row2.createCell(0).setCellValue(lStrings.get(i - 1));
		}
		// Writing into Excel
		workbook.write(file);
		file.close();
	}
	
	public static void writeExcel2(List<String> lst1, List<String> lst2) throws IOException {
		file = new FileOutputStream(System.getProperty("user.dir") + "\\DataDriven\\outputExcel.xlsx");
		XSSFSheet sheet1 = workbook.createSheet("AllSpecialities");
		XSSFRow row1 = sheet1.createRow(0);
		row1.createCell(0).setCellValue("AllSpecialities");
		row1.createCell(1).setCellValue("Rating");
		for (int i = 1; i <= lst1.size(); i++) {
			for (int j = 0; j < 2; j++) {
				XSSFRow row = sheet1.createRow(i);
				row.createCell(0).setCellValue(lst1.get(i - 1));
				row.createCell(1).setCellValue(lst2.get(i - 1));
			}
		}
		// Writing into Excel
		workbook.write(file);
		file.close();
	}
	
	public static void writeExcel3(String str) throws IOException {
		file = new FileOutputStream(System.getProperty("user.dir") + "\\DataDriven\\outputExcel.xlsx");
		XSSFSheet sheet = workbook.createSheet("ErrorMessage");
		XSSFRow row1 = sheet.createRow(0);
		row1.createCell(0).setCellValue("Error Message");
		XSSFRow row2= sheet.createRow(1);
		row2.createCell(0).setCellValue(str);
		// Writing into Excel
		workbook.write(file);
		file.close();
	}
	

}
