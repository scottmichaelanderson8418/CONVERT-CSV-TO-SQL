package com.printsearch;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStream;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Utility class providing various data cleaning and conversion tools.
 */
public class DataTools {

	/** Scanner object for input operations. */
	public static Scanner Scanner = new Scanner(System.in);

	/**
	 * Cleans up decimal columns by removing all alphabetic characters from the
	 * input string.
	 *
	 * @param obj the input string to be cleaned
	 * @return the cleaned string with alphabetic characters removed
	 */
	public static String cleanUpDecimalColumns(String obj) {
		obj = obj.replaceAll("[a-zA-Z]", "");
		return obj;
	}

	/**
	 * Removes null or blank values from specified columns in a list of string
	 * arrays. The specified columns are replaced with an empty string if a match is
	 * found.
	 *
	 * @param strListB the list of string arrays to be processed
	 * @return a new list of string arrays with the cleaned data
	 */
	public static List<String[]> removeNull(List<String[]> strListB) {
		Pattern pattern = Pattern.compile("[a-zA-Z]", Pattern.CASE_INSENSITIVE);
		List<String[]> newList = new ArrayList<>();
		int[] columnNumber = { 7, 8, 11, 12 };

		for (int i = 0; i < strListB.size(); i++) {
			newList.add(new String[strListB.get(i).length]);
		}

		for (int i = 0; i < strListB.size(); i++) {
			for (int k : columnNumber) {
				newList.get(i)[k] = strListB.get(i)[k];
			}
		}

		for (int i = 0; i < strListB.size(); i++) {
			for (int k : columnNumber) {
				Matcher matcher = pattern.matcher(strListB.get(i)[k]);
				if (matcher.find()) {
					strListB.get(i)[k] = "";
					newList.get(i)[k] = strListB.get(i)[k];
				}
			}
		}

		return newList;
	}

	/**
	 * Cleans up all number columns in a list of PrintDrawing objects.
	 *
	 * @param obj the list of PrintDrawing objects to be cleaned
	 * @return the cleaned list of PrintDrawing objects
	 */
	public static List<PrintDrawing> cleanUpAllNumberCol(List<PrintDrawing> obj) {
		for (int i = 1; i < obj.size(); i++) {

			PrintDrawing drawing = obj.get(i);

			drawing.setXlsmPath(drawing.getXlsmPath());
			drawing.setXlsxPath(drawing.getXlsxPath());
			drawing.setPdfPath(drawing.getPdfPath());
			drawing.setScannedPath(drawing.getScannedPath());
			drawing.setDmgDrawingPath(drawing.getDmgDrawingPath());
			drawing.setDrawingName(drawing.getDrawingName());

			drawing.setDia1(cleanUpDecimalColumns(cleanUp(removeHashes(drawing.getDia1()))));
			drawing.setDia2(cleanUp(removeHashes(drawing.getDia2())));
			drawing.setFace1(cleanUp(removeHashes(drawing.getFace1())));
			drawing.setFace2(cleanUp(removeHashes(drawing.getFace2())));

			drawing.setCust(drawing.getCust());
			drawing.setOem(drawing.getOem());
			drawing.setBearingMin(drawing.getBearingMin());
			drawing.setBearingMax(drawing.getBearingMax());
			drawing.setCustPin(drawing.getCustPin());
			drawing.setCustRev(drawing.getCustRev());
			drawing.setDate(drawing.getDate());
			drawing.setDateCreated(drawing.getDateCreated());
			drawing.setNewBasePrice(drawing.getNewBasePrice());
			drawing.setOriginatingCustomer(drawing.getOriginatingCustomer());
			drawing.setPartNo(drawing.getPartNo());
			drawing.setPrevPartNo(drawing.getPrevPartNo());
			drawing.setProductCode(drawing.getProductCode());
			drawing.setRevNumber(drawing.getRevNumber());
			drawing.setSteps(drawing.getSteps());
			drawing.setSubcontractor(drawing.getSubcontractor());
			drawing.setType(drawing.getType());
		}
		return obj;
	}

	/**
	 * Cleans up a specified range of PrintDrawing objects.
	 *
	 * @param obj the list of PrintDrawing objects to be cleaned
	 * @return the cleaned list of PrintDrawing objects
	 */
	public static List<PrintDrawing> cleanUp(List<PrintDrawing> obj) {
		for (int i = 1; i < 11; i++) {
			PrintDrawing drawing = obj.get(i);

			drawing.setXlsmPath(cleanUp(drawing.getXlsmPath()));
			drawing.setXlsxPath(cleanUp(drawing.getXlsxPath()));
			drawing.setPdfPath(cleanUp(drawing.getPdfPath()));
			drawing.setScannedPath(cleanUp(drawing.getScannedPath()));
			drawing.setDmgDrawingPath(cleanUp(drawing.getDmgDrawingPath()));
			drawing.setDrawingName(cleanUp(drawing.getDrawingName()));
			drawing.setDia1(cleanUp(drawing.getDia1()));
			drawing.setDia2(cleanUp(drawing.getDia2()));
			drawing.setFace1(cleanUp(drawing.getFace1()));
			drawing.setFace2(cleanUp(drawing.getFace2()));
			drawing.setCust(cleanUp(drawing.getCust()));
			drawing.setOem(cleanUp(drawing.getOem()));
			drawing.setBearingMin(cleanUp(drawing.getBearingMin()));
			drawing.setBearingMax(cleanUp(drawing.getBearingMax()));
			drawing.setCustPin(cleanUp(drawing.getCustPin()));
			drawing.setCustRev(cleanUp(drawing.getCustRev()));
			drawing.setDate(cleanUp(drawing.getDate()));
			drawing.setDateCreated(cleanUp(drawing.getDateCreated()));
			drawing.setNewBasePrice(cleanUp(drawing.getNewBasePrice()));
			drawing.setOriginatingCustomer(cleanUp(drawing.getOriginatingCustomer()));
			drawing.setPartNo(cleanUp(drawing.getPartNo()));
			drawing.setPrevPartNo(cleanUp(drawing.getPrevPartNo()));
			drawing.setProductCode(cleanUp(drawing.getProductCode()));
			drawing.setRevNumber(cleanUp(drawing.getRevNumber()));
			drawing.setSteps(cleanUp(drawing.getSteps()));
			drawing.setSubcontractor(cleanUp(drawing.getSubcontractor()));
			drawing.setType(cleanUp(drawing.getType()));
		}
		return obj;
	}

	/**
	 * Converts a list of PrintDrawing objects to a list of PrintDrawingDto objects.
	 *
	 * @param obj the list of PrintDrawing objects to be converted
	 * @return the list of converted PrintDrawingDto objects
	 */
	public static List<PrintDrawingDto> convertObj(List<PrintDrawing> obj) {
		List<PrintDrawingDto> aniloxRollListDto = new ArrayList<>();

		for (int i = 1; i < obj.size(); i++) {
			PrintDrawingDto objDto = new PrintDrawingDto();

			objDto.setBearingMax(obj.get(i).getBearingMax());
			objDto.setXlsmPath(obj.get(i).getXlsmPath());
			objDto.setXlsxPath(obj.get(i).getXlsxPath());
			objDto.setPdfPath(obj.get(i).getPdfPath());
			objDto.setScannedPath(obj.get(i).getScannedPath());
			objDto.setDmgDrawingPath(obj.get(i).getDmgDrawingPath());
			objDto.setDrawingName(obj.get(i).getDrawingName());

			System.out.println("obj.get(i).getDia1() = " + obj.get(i).getDia1());
			objDto.setDia1(Float.parseFloat(obj.get(i).getDia1()));
			objDto.setDia2(Float.parseFloat(obj.get(i).getDia2()));
			objDto.setFace1(Float.parseFloat(obj.get(i).getFace1()));
			objDto.setFace2(Float.parseFloat(obj.get(i).getFace2()));
			objDto.setCust(obj.get(i).getCust());
			objDto.setOem(obj.get(i).getOem());
			objDto.setBearingMin(obj.get(i).getBearingMin());
			objDto.setBearingMax(obj.get(i).getBearingMax());
			objDto.setCustPin(obj.get(i).getCustPin());
			objDto.setCustRev(obj.get(i).getCustRev());
			objDto.setDate(obj.get(i).getDate());
			objDto.setDateCreated(obj.get(i).getDateCreated());
			objDto.setNewBasePrice(obj.get(i).getNewBasePrice());
			objDto.setOriginatingCustomer(obj.get(i).getOriginatingCustomer());
			objDto.setPartNo(obj.get(i).getPartNo());
			objDto.setPrevPartNo(obj.get(i).getPrevPartNo());
			objDto.setProductCode(obj.get(i).getProductCode());
			objDto.setRevNumber(obj.get(i).getRevNumber());
			objDto.setSteps(obj.get(i).getSteps());
			objDto.setSubcontractor(obj.get(i).getSubcontractor());
			objDto.setType(obj.get(i).getType());

			aniloxRollListDto.add(objDto);
		}
		return aniloxRollListDto;
	}

	/**
	 * Method to write SQL script to a text file.
	 *
	 * @param masterSQLScript List of SQL script lines to be written to the file
	 */
	public static void writeSQLScript(List<String> masterSQLScript) {
		FileWriter fw = null;

		String line = "";
		// Create New File Method

		createNewFile();
		int i = 1;
		try {

			BufferedWriter writer = new BufferedWriter(new FileWriter("HARPER_ACCESS_1.sql"));

			while (i < masterSQLScript.size() - 1) {

				writer.write(masterSQLScript.get(i).toString());

				writer.newLine();

				i++;
			}

			writer.close();

		} catch (IOException e) {
			e.printStackTrace();
		}

	}

	/**
	 * Cleans up all fields in a list of PrintDrawing objects.
	 *
	 * @param obj List of PrintDrawing objects to be cleaned up
	 * @return Cleaned up list of PrintDrawing objects
	 */
	public static List<PrintDrawing> cleanUpAll(List<PrintDrawing> obj) {
		String fillword = "NONE";

		for (int i = 1; i < obj.size(); i++) {
			PrintDrawing drawing = obj.get(i);
			// Clean up each field in the PrintDrawing object
			drawing.setBearingMax(cleanUp(drawing.getBearingMax()));
			drawing.setBearingMin(cleanUp(drawing.getBearingMin()));
			drawing.setCust(cleanUp(drawing.getCust()));
			drawing.setCustPin(cleanUp(drawing.getCustPin()));
			drawing.setCustRev(cleanUp(drawing.getCustRev()));
			drawing.setDate(cleanUp(drawing.getDate()));
			drawing.setDateCreated(cleanUp(drawing.getDateCreated()));
			drawing.setDia1(cleanUp(drawing.getDia1()));
			drawing.setDia2(cleanUp(drawing.getDia2()));
			drawing.setDmgDrawingPath("NONE");
			drawing.setDrawingName(cleanUp(drawing.getDrawingName()));
			drawing.setFace1(cleanUp(drawing.getFace1()));
			drawing.setFace2(cleanUp(drawing.getFace2()));
			drawing.setNewBasePrice(cleanUp(drawing.getNewBasePrice()));
			drawing.setOem(cleanUp(drawing.getOem()));
			drawing.setOriginatingCustomer(cleanUp(drawing.getOriginatingCustomer()));
			drawing.setPartNo(cleanUp(drawing.getPartNo()));
			drawing.setPdfPath(cleanUp(drawing.getPdfPath()));
			drawing.setPrevPartNo(cleanUp(drawing.getPrevPartNo()));
			drawing.setProductCode(cleanUp(drawing.getProductCode()));
			drawing.setRevNumber(cleanUp(drawing.getRevNumber()));
			drawing.setScannedPath("NONE");
			drawing.setSteps(cleanUp(drawing.getSteps()));
			drawing.setSubcontractor(cleanUp(drawing.getSubcontractor()));
			drawing.setType(cleanUp(drawing.getType()));
			drawing.setXlsmPath(cleanUp("NONE"));
			drawing.setXlsxPath(cleanUp("NONE"));
		}
		return obj;
	}

	/**
	 * Removes non-numeric characters and formats a string.
	 *
	 * @param obj The string to be cleaned up
	 * @return The cleaned up string
	 */
	public static String removeHashes(String obj) {

		;
		String temp = "";
		char[] objChar = obj.toCharArray();

		obj = obj.toUpperCase();

		obj = obj.replaceAll("[^\\d.]", "");

		if (obj.equals("")) {
			obj = obj.replaceAll("", "00.00");
		}

		char[] objCharList = obj.toCharArray();

		int countPeriod = 0;
		for (int i = 0; i < objCharList.length; i++) {

			if (countPeriod == 1 && objCharList[i] == '.') {
				objCharList[i] = '0';
			}

			if (objCharList[i] == '.') {
				countPeriod++;
			}

		}
		obj = new String(objCharList);

		if (obj.length() > 5) {
			obj = obj.substring(0, 5);
		}

		return obj;
	}

	// the split() method splits the list of Strings "strList" into an array of
	// Strings called arrOfStr
	public static List<String[]> splitStringList(List<String> strList, List<String[]> strListB) {
		// System.out.println("splitStringList()...................");
		// System.out.println("*** Press Enter ***");
		// ;
		for (String x : strList) {

			String[] arrOfStr = x.split(",", -2);

			// the array of Strings "arrOfStr" is added as a single element in the
			// ArrayList<String[]> strListB
			strListB.add(arrOfStr);

		}
		return strListB;

	}

	// Method to create new file
	public static void createNewFile() {
		try {
			File myObj = new File("PrintDrawings.txt");

			if (myObj.createNewFile()) {
				System.out.println("File successfully created :)");
			} else {
				System.out.println("File already Exists");
			}

		} catch (IOException e) {
			System.out.println("An error occured");
			e.printStackTrace();
		}
	}

	public static void deleteFile() {
		try {
			Path fileToDeletePath = Paths.get("PrintDrawings.txt");
			Files.delete(fileToDeletePath);

		} catch (IOException e) {
			System.out.println("An error occured");
			e.printStackTrace();
		}
	}

	// Method to create String list
	public static List<String> createStrList(List<String> strList) {
		// System.out.println("createStrList().........");
		// System.out.println("*** Press Enter ***");
		// ;

		// Streams allow us to process data in a clear and concise way
		FileReader fd = null;
		String line = "";

		try {

			// Get the class loader
			ClassLoader classLoader = DataTools.class.getClassLoader();

			// Get the resource as an InputStream
			InputStream inputStream = classLoader.getResourceAsStream("resources/PrintDrawings.csv");

			// Use the InputStream to read the CSV data (e.g., with Apache Commons CSV)

			fd = new FileReader("PrintDrawings.csv");

			BufferedReader reader = new BufferedReader(fd);

			// readLine() --> reads each line of text and terminates when it
			// reaches the
			// of the line
			while ((line = reader.readLine()) != null) {

				strList.add(line);

			}

			// close instance of FileReader
			fd.close();

			// close instance of BufferedReader
			reader.close();

		} catch (FileNotFoundException e) {
			e.printStackTrace();

		} catch (NumberFormatException e) {
			e.printStackTrace();

		} catch (IOException e) {
			e.printStackTrace();
		}

		// for (int k = 0; k < 50; k++) {
		// System.out.println(strList.get(k).toString());
		// }

		return strList;
	}

	/**
	 * Method to track the values of elements in lists as we loop through them.
	 *
	 * @param strList  List of strings to track
	 * @param strListB List of string arrays to track
	 * @param k        Index of the string array element to track
	 * @param i        Index of the string to track
	 */
	public static void trackVariableValues(List<String> strList, List<String[]> strListB, int k, int i) {
		System.out.println("k = " + k);
		System.out.println("strList.get(" + i + ")= " + strList.get(i));
		System.out.println("strListB.get(" + i + ")[" + k + "] = " + strListB.get(i)[k]);
		System.out.println();
	}

	/**
	 * Method to write a list of PrintDrawing objects to a text file.
	 *
	 * @param aniloxRollList List of PrintDrawing objects to be written to the file
	 */
	public static void writeStrListToFileFinal01(List<PrintDrawing> printDrawingList) {

		int headerRowIndex = 0;
		System.out.println("writeStrListToFileFinal().........");
		System.out.println("Press Enter");

		FileWriter fw = null;
		String line = "";

		deleteFile();
		System.out.println("file deleted.........");
		System.out.println("Press Enter");
		createNewFile();

		try (BufferedWriter writer = new BufferedWriter(new FileWriter("PrintDrawings.txt"))) {

			if (printDrawingList.isEmpty()) {
				return;
			}

			if (writer != null) {
				if (headerRowIndex == 0) {
					// Write header row
					writer.write(String.format("%-100S", "Bearing Max") + "\t");
					writer.write(String.format("%-100S", "Bearing Min") + "\t");
					writer.write(String.format("%-100S", "Cust") + "\t");
					writer.write(String.format("%-100S", "Cust Pin") + "\t");
					writer.write(String.format("%-100S", "Cust Rev") + "\t");
					writer.write(String.format("%-100S", "Date") + "\t");
					writer.write(String.format("%-100S", "Date Created") + "\t");
					writer.write(String.format("%-100S", "Dia 1") + "\t");
					writer.write(String.format("%-100S", "Dia 2") + "\t");
					writer.write(String.format("%-100S", "Dmg Drawing Path") + "\t");
					writer.write(String.format("%-100S", "Drawing Name") + "\t");
					writer.write(String.format("%-100S", "Face 1") + "\t");
					writer.write(String.format("%-100S", "Face 2") + "\t");
					writer.write(String.format("%-100S", "New Base Price") + "\t");
					writer.write(String.format("%-100S", "OEM") + "\t");
					writer.write(String.format("%-100S", "Originating Customer") + "\t");
					writer.write(String.format("%-100S", "Part No") + "\t");
					writer.write(String.format("%-100S", "PDF Path") + "\t");
					writer.write(String.format("%-100S", "Prev Part No") + "\t");
					writer.write(String.format("%-100S", "Product Code") + "\t");
					writer.write(String.format("%-100S", "Rev Number") + "\t");
					writer.write(String.format("%-100S", "Scanned Path") + "\t");
					writer.write(String.format("%-100S", "Steps") + "\t");
					writer.write(String.format("%-100S", "Subcontractor") + "\t");
					writer.write(String.format("%-100S", "Type") + "\t");
					writer.write(String.format("%-100S", "XLSM Path") + "\t");
					writer.write(String.format("%-100S", "XLSX Path") + "\t");
					writer.newLine();
					headerRowIndex++;
				}

				for (int k = 1; k < printDrawingList.size(); k++) {
					writer.write(String.format("%-100S", printDrawingList.get(k).getBearingMax().trim()));
					writer.write(String.format("%-100S", printDrawingList.get(k).getBearingMin().trim()));
					writer.write(String.format("%-100S", printDrawingList.get(k).getCust().trim()));
					writer.write(String.format("%-100S", printDrawingList.get(k).getCustPin().trim()));
					writer.write(String.format("%-100S", printDrawingList.get(k).getCustRev().trim()));
					writer.write(String.format("%-100S", printDrawingList.get(k).getDate().trim()));
					writer.write(String.format("%-100S", printDrawingList.get(k).getDateCreated().trim()));
					writer.write(String.format("%-100S", printDrawingList.get(k).getDia1().trim()));
					writer.write(String.format("%-100S", printDrawingList.get(k).getDia2().trim()));
					writer.write(String.format("%-100S", printDrawingList.get(k).getDmgDrawingPath().trim()));
					writer.write(String.format("%-100S", printDrawingList.get(k).getDrawingName().trim()));
					writer.write(String.format("%-100S", printDrawingList.get(k).getFace1().trim()));
					writer.write(String.format("%-100S", printDrawingList.get(k).getFace2().trim()));
					writer.write(String.format("%-100S", printDrawingList.get(k).getNewBasePrice().trim()));
					writer.write(String.format("%-100S", printDrawingList.get(k).getOem().trim()));
					writer.write(String.format("%-100S", printDrawingList.get(k).getOriginatingCustomer().trim()));
					writer.write(String.format("%-100S", printDrawingList.get(k).getPartNo().trim()));
					writer.write(String.format("%-100S", printDrawingList.get(k).getPdfPath().trim()));
					writer.write(String.format("%-100S", printDrawingList.get(k).getPrevPartNo().trim()));
					writer.write(String.format("%-100S", printDrawingList.get(k).getProductCode().trim()));
					writer.write(String.format("%-100S", printDrawingList.get(k).getRevNumber().trim()));
					writer.write(String.format("%-100S", printDrawingList.get(k).getScannedPath().trim()));
					writer.write(String.format("%-100S", printDrawingList.get(k).getSteps().trim()));
					writer.write(String.format("%-100S", printDrawingList.get(k).getSubcontractor().trim()));
					writer.write(String.format("%-100S", printDrawingList.get(k).getType().trim()));
					writer.write(String.format("%-100S", printDrawingList.get(k).getXlsmPath().trim()));
					writer.write(String.format("%-100S", printDrawingList.get(k).getXlsxPath().trim()));
					writer.newLine();
				}
			}

			writer.close();

		} catch (IOException e) {
			e.printStackTrace();
		}

	}

	/**
	 * Method to print all fields of a list of PrintDrawing objects.
	 *
	 * @param obj List of PrintDrawing objects to be printed
	 */
	public static void printAll(List<PrintDrawing> obj) {
		System.out.println("Printing...........");
		int headerRowIndex = 0;

		for (int i = 0; i < obj.size(); i++) {
			if (headerRowIndex == 0) {
				// Print header row
				System.out.print(String.format("%-100S", "XLSM Path"));
				System.out.print(String.format("%-100S", "XLSX Path"));
				// Continue for other fields...
				headerRowIndex++;
			}

			// Print data rows
			System.out.print(String.format("%-100S", obj.get(i).getXlsmPath()));
			System.out.print(String.format("%-100S", obj.get(i).getXlsxPath()));
			// Continue for other fields...
		}
	}

	/**
	 * Cleans up a string by removing certain characters.
	 *
	 * @param obj The string to be cleaned up
	 * @return The cleaned up string
	 */
	public static String cleanUp(String obj) {
		int count = 10;

		while (count < 11) {
			obj = obj.replaceAll("/", "");

			obj = obj.replaceAll("\'", "");
			obj = obj.replaceAll("\"", "");
			obj = obj.replaceAll("`", "");
			obj = obj.replaceAll("\'", "");
			count++;
		}

		if (obj.equals("")) {
			obj = "NONE";
		}
		return obj;
	}

	/**
	 * Removes alphabetic characters from a string.
	 *
	 * @param obj The string to be cleaned up
	 * @return The cleaned up string
	 */
	public static String removeCharacters(String obj) {
		return obj.replaceAll("[a-zA-Z]", "");
	}

}
