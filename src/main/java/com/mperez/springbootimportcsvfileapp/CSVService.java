package com.mperez.springbootimportcsvfileapp;

import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

@Service
public class CSVService {
  @Autowired
  DataSetRepository repository;

  public void save(MultipartFile file) {
    try {
      List<DataSetModelo> modelos = CSVHelper.csvToDataSet(file.getInputStream());
      repository.saveAll(modelos);
    } catch (IOException e) {
      throw new RuntimeException("fallo guardar datos de csv: " + e.getMessage());
    }
  }

  public ByteArrayInputStream load() {
    List<DataSetModelo> dataSetModelos = repository.findAll();

    ByteArrayInputStream in = CSVHelper.dataSetModelosToCSV(dataSetModelos);
    return in;
  }

  public List<DataSetModelo> getAllDataSetModelo() {
    return repository.findAll();
  }
}

