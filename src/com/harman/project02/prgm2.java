package com.harman.project02;
import java.io.FileOutputStream;

import java.io.IOException;

public class prgm2 {
    public static void main(String[] args) {
        try
        {
            FileOutputStream out_obj = new FileOutputStream("Op_file.txt");

            String Data = "HAPPY NEW YEAR";

            byte inp[] = Data.getBytes();

            out_obj.write(inp);

            out_obj.close();

            System.out.println("File Created Successfully");
        }



        catch (IOException e)
        {
            e.printStackTrace();
        }

    }
}


