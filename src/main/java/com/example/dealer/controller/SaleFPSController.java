package com.example.dealer.controller;

import java.io.IOException;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.dealer.model.SaleFPS;
import com.example.dealer.service.PDFGeneratorServiceSaleFPS;
import com.example.dealer.service.SaleFPSService;

import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;



@RestController
@RequestMapping("/api/v1/sale")
public class SaleFPSController {
	
	@Autowired
    private SaleFPSService salefpsService;

	@Autowired
    private PDFGeneratorServiceSaleFPS pdfGeneratorServiceSaleFPS;
	
    @GetMapping("/{fpsid}/{transactionDate}")
    public ResponseEntity<List<SaleFPS>> getStockByFpsid(
    		@PathVariable String fpsid,
    		@PathVariable String transactionDate){
    	List<SaleFPS> fpssale= salefpsService.getStockByFpsid(fpsid, transactionDate);
        
        if (fpssale != null) {
        	return ResponseEntity.ok(fpssale);
        } else {
            return ResponseEntity.notFound().build(); // Return 404 if not found
        }
    }
    
    @GetMapping("/download/pdf")
    public ResponseEntity<byte[]> generatePdf() {
        try {
            // Fetch data from the database
            List<String> saleFPSData = salefpsService.fetchAllSaleFPSData();

            // Generate PDF from data
            byte[] pdfBytes = pdfGeneratorServiceSaleFPS.generatePdfFromData(saleFPSData);

            // Set response headers
            HttpHeaders headers = new HttpHeaders();
            headers.add("Content-Disposition", "inline; filename=grievance_report.pdf");
            
            // Return PDF as byte array in response entity
            return new ResponseEntity<>(pdfBytes, headers, HttpStatus.OK);

        } catch (IOException e) {
            // Handle exceptions (for example, log the error)
            e.printStackTrace();
            return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }

}
