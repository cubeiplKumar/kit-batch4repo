package com.java2novice.files;
 
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.Reader;
 
public class ReadFromConsole {
 
    public static void main(String a[]){
        BufferedReader br = null;
        Reader r = new InputStreamReader(System.in);
        br = new BufferedReader(r);
        String str = null;
        try {
            do{
                System.out.println("Enter Input, exit to quit.");
                str = br.readLine();
                System.out.println(str);
            } while (!str.equalsIgnoreCase("exit"));
        } catch (IOException e) {
            e.printStackTrace();
        } finally{
            try{
                if(br != null) br.close();
            }catch(Exception ex){}
        }
		# feature202 changes by Kumar on REgistration Module.
		public class MyFileXmlStore {
     
    public static void main(String a[]) throws IOException{
         
        OutputStream os = null;
        Properties prop = new Properties();
        prop.setProperty("name", "java2novice");
        prop.setProperty("domain", "www.java2novice.com");
        prop.setProperty("email", "java2novice@gmail.com");
        try {
            os = new FileOutputStream("MyProp.xml");
            prop.storeToXML(os, "Dynamic Property File");
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
         
    }
}
    }
}