package practice;

/**
 * @author shefali.jain
 */
public class ExcelReaderExample {
//    private String title;
//    private String author;
//    private float price;
//
//    public ExcelReaderExample() {
//    }
//
//    public String toString() {
//        return String.format("%s - %s - %f", title, author, price);
//    }
//
//    private Object getCellValue(Cell cell) {
//        switch (cell.getCellType()) {
//            case Cell.CELL_TYPE_STRING:
//                return cell.getStringCellValue();
//
//            case Cell.CELL_TYPE_BOOLEAN:
//                return cell.getBooleanCellValue();
//
//            case Cell.CELL_TYPE_NUMERIC:
//                return cell.getNumericCellValue();
//        }
//
//        return null;
//    }
//
//
//    public List<Book> readBooksFromExcelFile(String excelFilePath) throws IOException {
//        List<Book> listBooks = new ArrayList<>();
//        FileInputStream inputStream = new FileInputStream(new File(excelFilePath));
//
//        Workbook workbook = new XSSFWorkbook(inputStream);
//        Sheet firstSheet = workbook.getSheetAt(0);
//        Iterator<Row> iterator = firstSheet.iterator();
//
//        while (iterator.hasNext()) {
//            Row nextRow = iterator.next();
//            Iterator<Cell> cellIterator = nextRow.cellIterator();
//            Book aBook = new Book();
//
//            while (cellIterator.hasNext()) {
//                Cell nextCell = cellIterator.next();
//                int columnIndex = nextCell.getColumnIndex();
//
//                switch (columnIndex) {
//                    case 1:
//                        aBook.setTitle((String) getCellValue(nextCell));
//                        break;
//                    case 2:
//                        aBook.setAuthor((String) getCellValue(nextCell));
//                        break;
//                    case 3:
//                        aBook.setPrice((double) getCellValue(nextCell));
//                        break;
//                }
//
//
//            }
//            listBooks.add(aBook);
//        }
//
//        workbook.close();
//        inputStream.close();
//
//        return listBooks;
//    }
}
