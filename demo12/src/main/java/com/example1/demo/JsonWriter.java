package com.example1.demo;//package com.sop.demo;
//
//import java.io.IOException;
//import java.io.InputStreamReader;
//import java.io.Reader;
//import com.google.gson.Gson;
//import com.google.gson.GsonBuilder;
//import java.io.FileOutputStream;
//import java.io.IOException;
//import java.io.OutputStreamWriter;
//import java.io.Writer;
//import com.google.gson.Gson;
//
//public class JsonWriter {
//    public static void main(String[] args) throws IOException {
//        try(Writer writer = new OutputStreamWriter(new FileOutputStream("Output.json") , "UTF-8")){
//            Gson gson = new GsonBuilder().create();
//            gson.toJson("Hello", writer);
//            gson.toJson(123, writer);
//
//        }
//    }
//}