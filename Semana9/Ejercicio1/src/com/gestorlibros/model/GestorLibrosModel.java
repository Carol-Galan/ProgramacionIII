package com.gestorlibros.model;

import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.Files;
import java.util.ArrayList;
import java.util.List;
import java.io.IOException;
import java.lang.reflect.Type;
import java.nio.charset.StandardCharsets;
import java.io.FileOutputStream;
import java.io.ObjectOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.ObjectInputStream;

import com.coti.tools.Rutas;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.dataformat.xml.XmlMapper;
import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;

public class GestorLibrosModel {

    ArrayList<Libro> libros;

    // Path to export and import data
    Path pathToXML = Rutas.pathToFileOnDesktop("libros.xml");
    Path pathToJSON = Rutas.pathToFileOnDesktop("libros.json");
    Path pathToCSV = Rutas.pathToFileOnDesktop("libros.csv");
    Path pathToBinary = Rutas.pathToFileOnDesktop("libros.bin");

    public GestorLibrosModel() {
        libros = new ArrayList<Libro>();
    }

    // CRUD OPERATIONS
    public void addLibro(Libro l) {
        libros.add(l);
    }

    public void removeLibro(Libro l) {
        libros.remove(l);
    }

    public void updateLibro(Libro l) {
        libros.set(libros.indexOf(l), l);
    }

    public ArrayList<Libro> getLibros() {
        // Devolvemos copia para no modificar el original desde la vista.
        return new ArrayList<Libro>(this.libros);
    }

    // Export and Import data ------------------------------------------
    public int exportBooksToCSV() {
        throw new UnsupportedOperationException("Unimplemented method 'importBooksFromCSV'");
    }

    public int importBooksFromCSV() {
        throw new UnsupportedOperationException("Unimplemented method 'importBooksFromCSV'");
    }

    public String exportBooksToJSON() {

        File f2 = pathToJSON.toFile();

        if (!exportarListaDeLibrosAJSON(libros, f2)) {
            return null;
        }else{
            return f2.getAbsolutePath();
        }
        
    }

    public int importBooksFromJSON() {
        throw new UnsupportedOperationException("Unimplemented method 'importBooksFromCSV'");
        /* 
        File f2 = pathToJSON.toFile();


        if (f2.isFile() && f2.exists()) {
            List<Libro> librosImportados = importarListaDePersonasDeJSON(f2);
            if (librosImportados != null) {
                System.out.println("Personas importadas:" + librosImportados.size());
                for (Libro libroImportado : librosImportados) {
                    System.out.println(libroImportado.getLibroAsString());
                }
            } else {
                System.out.println("Error en la importación");
            }
        }
        */
    }

    public int importBooksFromXML() {
        throw new UnsupportedOperationException("Unimplemented method 'importBooksFromCSV'");
/* 
        File f2 = pathToXML.toFile();
        if (f2.isFile() && f2.exists()) {
            List<Libro> librosImportados = importarListaDePersonasDeXML(f2);
            if (librosImportados != null) {
                System.out.println("Personas importadas:" + librosImportados.size());
                for (Libro libroImportado : librosImportados) {
                    System.out.println(libroImportado.getLibroAsString());
                }
            } else {
                System.out.println("Error en la importación");
            }
        } 
        */
    }

    public int exportBooksToXML() {
    throw new UnsupportedOperationException("Unimplemented method 'importBooksFromCSV'");
    /* 
        File f2 = pathToXML.toFile();

        if (!exportarListaDeLibrosAXML(libros, f2)) {
            System.out.println("Hubo un problema con la exportación");
        }else{
            System.out.println("Exportado con éxito");
            System.out.println("Vea el resultado en:"+f2.getAbsolutePath());
        }
        */
    }

    // Serialization and Deserialization ------------------------------------------
    public int saveStateOfTheApp(){
        throw new UnsupportedOperationException("Unimplemented method 'importBooksFromCSV'");
    }

    public int loadStateOfTheApp(){
        throw new UnsupportedOperationException("Unimplemented method 'importBooksFromCSV'");
    }

    public static boolean exportarListaDeLibrosAJSON(List<Libro> libros, File f) {
        try {
            Gson gson = new Gson();
            String json = gson.toJson(libros);
            Files.write(f.toPath(), json.getBytes(StandardCharsets.UTF_8));
            return true;
        } catch (IOException ex) {
            // TODO veremos como cambiar esto cuando tratemos excepciones
            // de momento retornaremos null si hay algún problema
            System.err.println("Error:" + ex.getMessage());
            return false;
        }
    }
/*
    public static List<Libro> importarListaDePersonasDeJSON(File f) {
        try {
            Gson gson = new Gson();
            // Lee todo el archivo en un String
            String json = new String(Files.readAllBytes(f.toPath()), StandardCharsets.UTF_8);
            // Obtiene el tipo de la lista
            Type tipoDeLista = new TypeToken<List<Libro>>() {}.getType();
            return gson.fromJson(json, tipoDeLista);
        } catch (IOException ex) {
            // TODO veremos como cambiar esto cuando tratemos excepciones
            // de momento retornaremos null si hay algún problema
            System.err.println("Error:" + ex.getMessage());
            return null;
        }
    }

    public static boolean exportarListaDeLibrosAXML(List<Libro> libros, File f) {
        try {
            XmlMapper xmlMapper = new XmlMapper();
            String xml = xmlMapper.writeValueAsString(libros);
            Files.write(f.toPath(), xml.getBytes(StandardCharsets.UTF_8));
            return true;
        } catch (JsonProcessingException ex) {
            // TODO veremos como cambiar esto cuando tratemos excepciones
            // de momento retornaremos null si hay algún problema
            System.err.println("Error:" + ex.getMessage());
            return false;
        } catch (IOException ex) {
            // Lo mismo aquí
            System.err.println("Error:" + ex.getMessage());
            return false;
        }
    }

    public static List<Libro> importarListaDePersonasDeXML(File f) {
        try {
            XmlMapper xmlMapper = new XmlMapper();
            String xml = new String(Files.readAllBytes(f.toPath()), StandardCharsets.UTF_8);
            // Utiliza TypeFactory para obtener el tipo de lista correcto
            return xmlMapper.readValue(xml, xmlMapper.getTypeFactory().constructCollectionType(List.class, Persona.class));
        } catch (IOException ex) {
            // TODO veremos como cambiar esto cuando tratemos excepciones
            // de momento retornaremos null si hay algún problema
            System.err.println("Error:" + ex.getMessage());
            return null;
        }
    }
*/
    

}
