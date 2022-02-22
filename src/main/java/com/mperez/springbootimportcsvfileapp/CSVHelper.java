package com.mperez.springbootimportcsvfileapp;

import java.io.BufferedReader;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.apache.commons.csv.CSVFormat;
import org.apache.commons.csv.CSVParser;
import org.apache.commons.csv.CSVPrinter;
import org.apache.commons.csv.CSVRecord;
import org.apache.commons.csv.QuoteMode;
import org.springframework.web.multipart.MultipartFile;

public class CSVHelper {
	public static String TYPE = "text/csv";
	static String[] HEADERs = { "id", "county_fips", "county_name", "state_name", "date", "county_vmt",
			"baseline_jan_vmt", "percent_change_from_jan", "mean7_county_vmt", "mean7_percent_change_from_jan",
			"date_at_low", "mean7_county_vmt_at_low", "percent_change_from_low" };

	public static boolean hasCSVFormat(MultipartFile file) {
		System.err.println(file.getContentType());
		if (TYPE.equals(file.getContentType()) || file.getContentType().equals("application/vnd.ms-excel")) {
			return true;
		}

		return false;
	}

	public static List<DataSetModelo> csvToDataSet(InputStream is) {
		try (BufferedReader fileReader = new BufferedReader(new InputStreamReader(is, "UTF-8"));
				CSVParser csvParser = new CSVParser(fileReader,
						CSVFormat.DEFAULT.withFirstRecordAsHeader().withIgnoreHeaderCase().withTrim());) {

			List<DataSetModelo> dataSetModeloList = new ArrayList<>();

			Iterable<CSVRecord> csvRecords = csvParser.getRecords();

			for (CSVRecord csvRecord : csvRecords) {
				DataSetModelo dataSetModelo = new DataSetModelo(Long.parseLong(csvRecord.get("Id")),
						Double.parseDouble(csvRecord.get("county_fips")), csvRecord.get("county_name"),
						csvRecord.get("state_name"), csvRecord.get("date"),
						Double.parseDouble(csvRecord.get("county_vmt")),
						Double.parseDouble(csvRecord.get("baseline_jan_vmt")),
						Double.parseDouble(csvRecord.get("percent_change_from_jan")),
						Double.parseDouble(csvRecord.get("mean7_county_vmt")),
						Double.parseDouble(csvRecord.get("mean7_percent_change_from_jan")),
						csvRecord.get("date_at_low"), Double.parseDouble(csvRecord.get("mean7_county_vmt_at_low")),
						Double.parseDouble(csvRecord.get("percent_change_from_low")));

				dataSetModeloList.add(dataSetModelo);
			}

			return dataSetModeloList;
		} catch (IOException e) {
			throw new RuntimeException("fallo to parse CSV file: " + e.getMessage());
		}
	}

	public static ByteArrayInputStream dataSetModelosToCSV(List<DataSetModelo> dataSetModeloList) {
		final CSVFormat format = CSVFormat.DEFAULT.withQuoteMode(QuoteMode.MINIMAL);

		try (ByteArrayOutputStream out = new ByteArrayOutputStream();
				CSVPrinter csvPrinter = new CSVPrinter(new PrintWriter(out), format);) {
			for (DataSetModelo dataSetModelo : dataSetModeloList) {
				List<String> data = Arrays.asList(String.valueOf(dataSetModelo.getId()),
						String.valueOf(dataSetModelo.getCounty_fips()), dataSetModelo.getCounty_name(),
						dataSetModelo.getState_name(),
						dataSetModelo.getDate(),
						String.valueOf(dataSetModelo.getCounty_vmt()),
						String.valueOf(dataSetModelo.getBaseline_jan_vmt()),
						String.valueOf(dataSetModelo.getPercent_change_from_jan()),
						String.valueOf(dataSetModelo.getMean7_county_vmt()),
						String.valueOf(dataSetModelo.getMean7_percent_change_from_jan()),
						String.valueOf(dataSetModelo.getDate_at_low()),
						String.valueOf(dataSetModelo.getMean7_county_vmt_at_low()),
						String.valueOf(dataSetModelo.getPercent_change_from_low())						);

				csvPrinter.printRecord(data);
			}

			csvPrinter.flush();
			return new ByteArrayInputStream(out.toByteArray());
		} catch (IOException e) {
			throw new RuntimeException("fallo to import data to CSV file: " + e.getMessage());
		}
	}
}
