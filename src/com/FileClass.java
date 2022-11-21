package com;

import java.io.*;

public class FileClass {

    public static void main(String[] args) {

        File f = new File("C:\\Users\\LENOVO\\Desktop\\st","Digital.txt");

        try{
            f.createNewFile();
        }catch(IOException e){
            e.printStackTrace();
        }

        System.out.println(f.canWrite());
        System.out.println(f.canRead());
        System.out.println(f.isAbsolute());
        System.out.println(f.isDirectory());
        System.out.println(f.isFile());
        System.out.println(f.getName());
        System.out.println(f.getParent());
        System.out.println(f.getPath());
        System.out.println(f.toURI());

        //writing in a file :-
        try{
            FileWriter fw = new FileWriter(f);
            fw.write("This is digital partner institute students are good");
            fw.close();
        }catch (IOException c){
            c.printStackTrace();
        }

        //reading in a file :-
        FileReader reader = null;
        int ch;

        try{
            reader = new FileReader(f);

        }catch (FileNotFoundException ex){
            ex.printStackTrace();

        }

        try{
            while ((ch = reader.read())!=-1){
                System.out.print(((char) ch));
            }
            reader.close();
        }catch (IOException ie){
            ie.printStackTrace();
        }




    }


}
