package ch.cern.trec.st.utils;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Hernan
 */
import java.io.OutputStream;
import org.apache.poi.hssf.usermodel.*;

/**
 *
 * @author Hernan
 */
public class ExcelGenerator {

    private int currentVarCode;
    private int numCodeChar;

    public void  generateExcel(int codeRepetitions, int numCodes, String fixPart, String varPart, String[] cNames, String[] cContents, OutputStream out) throws Exception {
        
        HSSFWorkbook workbook = new HSSFWorkbook();
        HSSFSheet sheet = workbook.createSheet("Codes sheet");

        int rownum = 0;
        if (cNames.length > 0) {
            short cellnum = 0;
            HSSFRow row = sheet.createRow(rownum++);
            for (String header : cNames) {
                HSSFCell cell = row.createCell(cellnum++);
                HSSFRichTextString text = new HSSFRichTextString(header);
                cell.setCellValue(text);

            }
        }

        if (varPart != null) initalizeCode(varPart,numCodes);
        int numCodeRepetitions = 0;
        String lastVarCode = "";

        while (rownum - 1 < numCodes * codeRepetitions) {
            short cellnum = 0;
            HSSFRow row = sheet.createRow(rownum++);
            
            if (varPart!= null){
                HSSFCell cell = row.createCell(cellnum++);
                if (numCodeRepetitions == 0){
                    lastVarCode = getNextCode();
                }
                numCodeRepetitions = (numCodeRepetitions+1)%codeRepetitions;
                HSSFRichTextString text = new HSSFRichTextString(fixPart+lastVarCode);
                cell.setCellValue(text);
            }

            for (String header : cContents) {
                HSSFCell cell = row.createCell(cellnum++);
                HSSFRichTextString text = new HSSFRichTextString(header);
                cell.setCellValue(text);

            }
        }
        
        workbook.write(out);
    }

    private void initalizeCode(String varPart,int numcodes) {
        numCodeChar = varPart.length();
        currentVarCode = Integer.parseInt(varPart)+numcodes;
    }

    private String getNextCode() {
        String code = "" + currentVarCode;
        currentVarCode--;
        while (code.length() < numCodeChar) {
            code = "0" + code;
        }
        return code;
    }
}