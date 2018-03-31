//package practice;
//
//import org.apache.poi.hssf.usermodel.HSSFDateUtil;
//import org.apache.poi.xssf.usermodel.XSSFCell;
//import org.apache.poi.xssf.usermodel.XSSFRow;
//import org.apache.poi.xssf.usermodel.XSSFSheet;
//import org.apache.poi.xssf.usermodel.XSSFWorkbook;
//import org.testng.annotations.DataProvider;
//
//import java.io.FileInputStream;
//import java.io.FileOutputStream;
//import java.util.Calendar;
//
///**
// * @author shefali.jain
// */
public class DataProviderClass {
//
//
//
//    public String path;
//    public FileInputStream fis = null;
//    public FileOutputStream fileOut = null;
//    private XSSFWorkbook workbook = null;
//    private XSSFSheet sheet = null;
//    private XSSFRow row = null;
//    private XSSFCell cell = null;
//
//    @DataProvider(name="couponData")
//    public static Object[][] outstationETSPayloadsData() {
//        Object[][] arrayObject = GetExcelData_Xlsx("src/main/resources/website.xlsx", "successCoupon");
//        return arrayObject;
//    }
//
//    @DataProvider(name="couponDatafail")
//    public static Object[][] outstationETSPayloadsData1() {
//        Object[][] arrayObject = GetExcelData_Xlsx("src/main/resources/website.xlsx", "couponfail");
//        return arrayObject;
//    }
//
//    @DataProvider(name="couponDataInvalid")
//    public static Object[][] outstationETSPayloadsData2() {
//        Object[][] arrayObject = GetExcelData_Xlsx("src/main/resources/website.xlsx", "invalid");
//        return arrayObject;
//    }
//
//    @DataProvider(name="cancelReasons")
//    public static Object[][] cancelreasons() {
//        Object[][] arrayObject = GetExcelData_Xlsx("src/main/resources/website.xlsx", "getCancelReasons");
//        return arrayObject;
//    }
//
//    @DataProvider(name="login")
//    public static Object[][] login() {
//        Object[][] arrayObject = GetExcelData_Xlsx("src/main/resources/website.xlsx", "login");
//        return arrayObject;
//    }
//
//    @DataProvider(name="loginfail")
//    public static Object[][] loginfail() {
//        Object[][] arrayObject = GetExcelData_Xlsx("src/main/resources/website.xlsx", "loginfail");
//        return arrayObject;
//    }
//
//
//    @DataProvider(name="categoryInfo")
//    public static Object[][] categoryInfo() {
//        Object[][] arrayObject = GetExcelData_Xlsx("src/main/resources/website.xlsx", "categoryInfo");
//        return arrayObject;
//    }
//
//    @DataProvider(name="getProduct")
//    public static Object[][] getProduct() {
//        Object[][] arrayObject = GetExcelData_Xlsx("src/main/resources/website.xlsx", "getCategory");
//        return arrayObject;
//    }
//
//    @DataProvider(name="getproductoutstation")
//    public static Object[][] getProductout() {
//        Object[][] arrayObject = GetExcelData_Xlsx("src/main/resources/website.xlsx", "outstationGetCategory");
//        return arrayObject;
//    }
//
//    public static String[][] GetExcelData_Xlsx(String fileName, String sheetName) {
//        System.out.println("debug : getExcelData");
//        String[][] arrayExcelData = null;
//        DataProviderClass dpc = new DataProviderClass();
//        dpc.XlsReader(fileName, sheetName);
//
//        int totalNoOfCols = dpc.getColumnCount(sheetName);
//        int totalNoOfRows = dpc.getRowCount(sheetName);
//
//        arrayExcelData = new String[totalNoOfRows - 1][totalNoOfCols];
//
//        for (int i = 2; i <= totalNoOfRows; i++) {
//
//            for (int j = 0; j < totalNoOfCols; j++) {
//                arrayExcelData[i - 2][j] = dpc.getCellData(sheetName,j, i);
//            }
//
//        }
//        return arrayExcelData;
//    }
//
//    public void XlsReader(String path, String sheetName) {
//        this.path = path;
//
//        try {
//            this.fis = new FileInputStream(path);
//            this.workbook = new XSSFWorkbook(this.fis);
//            this.sheet = this.workbook.getSheet(sheetName);
//            this.fis.close();
//        } catch (Exception var4) {
//            var4.printStackTrace();
//        }
//
//    }
//    public int getColumnCount(String sheetName) {
//        if(!this.isSheetExist(sheetName)) {
//            return -1;
//        } else {
//            this.sheet = this.workbook.getSheet(sheetName);
//            this.row = this.sheet.getRow(0);
//            return this.row == null?-1:this.row.getLastCellNum();
//        }
//    }
//
//    public boolean isSheetExist(String sheetName) {
//        int index = this.workbook.getSheetIndex(sheetName);
//        if(index == -1) {
//            index = this.workbook.getSheetIndex(sheetName.toUpperCase());
//            return index != -1;
//        } else {
//            return true;
//        }
//    }
//
//    public int getRowCount(String sheetName) {
//        int index = this.workbook.getSheetIndex(sheetName);
//        if(index == -1) {
//            return 0;
//        } else {
//            this.sheet = this.workbook.getSheetAt(index);
//            int number = this.sheet.getLastRowNum() + 1;
//            return number;
//        }
//    }
//
//    public String getCellData(String sheetName, int colNum, int rowNum) {
//        try {
//            if(rowNum <= 0) {
//                return "";
//            } else {
//                int e = this.workbook.getSheetIndex(sheetName);
//                if(e == -1) {
//                    return "";
//                } else {
//                    this.sheet = this.workbook.getSheetAt(e);
//                    this.row = this.sheet.getRow(rowNum - 1);
//                    if(this.row == null) {
//                        return "";
//                    } else {
//                        this.cell = this.row.getCell(colNum);
//                        if(this.cell == null) {
//                            return "";
//                        } else if(this.cell.getCellType() == 1) {
//                            return this.cell.getStringCellValue();
//                        } else if(this.cell.getCellType() != 0 && this.cell.getCellType() != 2) {
//                            return this.cell.getCellType() == 3?"":String.valueOf(this.cell.getBooleanCellValue());
//                        } else {
//                            String cellText = String.valueOf(this.cell.getNumericCellValue());
//                            if(HSSFDateUtil.isCellDateFormatted(this.cell)) {
//                                double d = this.cell.getNumericCellValue();
//                                Calendar cal = Calendar.getInstance();
//                                cal.setTime(HSSFDateUtil.getJavaDate(d));
//                                cellText = String.valueOf(cal.get(1)).substring(2);
//                                cellText = cal.get(2) + 1 + "/" + cal.get(5) + "/" + cellText;
//                            }
//
//                            return cellText;
//                        }
//                    }
//                }
//            }
//        } catch (Exception var9) {
//            var9.printStackTrace();
//            return "row " + rowNum + " or column " + colNum + " does not exist  in xls";
//        }
//    }
//
}
//
//
//
//
//
