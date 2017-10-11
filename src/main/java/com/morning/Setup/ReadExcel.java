package com.morning.Setup;

public class ReadExcel {

	public static void main(String[] args) throws Exception {
		/*File file=new File("C:\\ExcelData\\TestData.xlsx");
		FileInputStream fis=new FileInputStream(file);
		XSSFWorkbook wb=new XSSFWorkbook(fis); 
		XSSFSheet sheet = wb.getSheetAt(0);
		String data0=sheet.getRow(0).getCell(0).getStringCellValue();
		System.out.println("Data from Excel : "+data0);
		
		// Lets read full excel
		
		int rowcount=sheet.getLastRowNum();
		Row r = sheet.getRow(rowcount);
		 int maxCell=  r.getLastCellNum();
		 System.out.println(maxCell);
		System.out.println("Total Rows : "+rowcount);
		int pointer=0;
		for (int i = 0; i < rowcount; i++) {
			for (int j = 0; j <maxCell; j++) {
				
				if(pointer>=2)
				{System.out.print("\n"+ sheet.getRow(i).getCell(j).getStringCellValue());
					pointer=0;
					continue;
				}
				System.out.print(" " +sheet.getRow(i).getCell(j).getStringCellValue()+" ");
				
	 			pointer++;
			}
			
		}*/
		
		//System.out.println(sheet.getRow(0).getCell(1).getStringCellValue());
		
	}

}
