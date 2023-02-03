package org.example.xlsx;

import lombok.Cleanup;
import org.apache.commons.collections.IteratorUtils;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class GerenciadorTabelas {

    public List<Tabelas> criar()throws IOException {

        List<Tabelas> tabela = new ArrayList<>();

        //Pegando o arquivo
        @Cleanup FileInputStream file = new FileInputStream(new File("src/resources/TESTANDOJAVA.xlsx"));
        Workbook workbook = new XSSFWorkbook(file);

        //Setando aba
        Sheet sheet = workbook.getSheetAt(0);

        /*   //Setando as linhas
        List<Row> rows = (List<Row>) toList(sheet.iterator());



       rows.forEach(row ->{
             //Setando as celulas
             List<Cell> cells = (List<Cell>) toList(row.cellIterator());

             Tabelas tabelas = Tabelas.builder()
                     .coluna01(cells.get(0).getStringCellValue().toString())
                     .coluna02(cells.get(1).getStringCellValue().toString())
                     .coluna03(cells.get(2).getStringCellValue().toString())
                     .coluna04(cells.get(3).getStringCellValue().toString())
                     .coluna05(cells.get(4).getStringCellValue().toString())
                     .coluna06(cells.get(5).getStringCellValue().toString())
                     .coluna07(cells.get(6).getStringCellValue().toString())
                     .coluna08(cells.get(7).getStringCellValue().toString())
                     .coluna09(cells.get(8).getStringCellValue().toString())
                     .coluna10(cells.get(9).getStringCellValue().toString())
                     .coluna11(cells.get(10).getStringCellValue().toString())
                     .build();

             tabela.add(tabelas);
             for(int i = 0;i <= 3 ; i++) {
                 String sistema;
                 String versao;
                 String usuario = null;
                 rows.indexOf(i);
                 if(i == 0){
                     sistema = cells.get(1).getStringCellValue();
                     tabelas.setSistema(sistema);
                 } else if (i == 1) {
                     versao = cells.get(1).getStringCellValue();
                     tabelas.setSistema(versao);
                 }else
                     usuario = cells.get(1).getStringCellValue();
                     tabelas.setSistema(usuario);


             }
         });
   */

        for (int i = 0;  i <= sheet.getLastRowNum();i++){
            Row row = sheet.getRow(i);

            if (i == 0) {
                Cell cell = row.getCell(1);
                System.out.println("Versao : " + cell.getStringCellValue());

            }
            if (i == 1) {
                Cell cell = row.getCell(1);
                System.out.println("Sistema : " + cell.getStringCellValue());

            }
            if (i == 2) {
                Cell cell = row.getCell(1);
                System.out.println("Usuario : " + cell.getStringCellValue());

            }
            if (i >= 3) {
                for (int j = 0; j < row.getLastCellNum(); j++) {
                    Cell cell = row.getCell(j);
                    System.out.print(cell.getStringCellValue().toString() + " ");

                }
                System.out.print("\n");
            }


        }
        file.close();
        return null;
    }
    /*
   // public List<?> toList(Iterator<?> iterator){
   //     return IteratorUtils.toList(iterator);
   // }

    public void imprimir(List<Tabelas> tabelas){
        tabelas.forEach(System.out::println);
    }

     */
}
