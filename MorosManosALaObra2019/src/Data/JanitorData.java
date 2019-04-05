/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Data;

import Domain.Janitor;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Steven
 */
public class JanitorData {

    public boolean saveJanitor(Janitor janitor) throws FileNotFoundException, IOException, ClassNotFoundException {
        File miArchivo = new File(Utility.Utilities.PATHTOSAVEJANITORS);
        List<Janitor> janitorList = new ArrayList<>();
        if (miArchivo.exists()) {
            ObjectInputStream ois = new ObjectInputStream(new FileInputStream(miArchivo));

            Object aux = ois.readObject();
            janitorList = (List<Janitor>) aux;
            ois.close();
        }
        janitorList.add(janitor);

        ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(miArchivo));
        oos.writeUnshared(janitorList);
        oos.close();
        return true;

    }//Fin de metodo saveJanitor

    public List<Janitor> read() throws FileNotFoundException, IOException, ClassNotFoundException {

        File miArchivo = new File(Utility.Utilities.PATHTOSAVEJANITORS);
        List<Janitor> janitorList = new ArrayList<>();
        if (miArchivo.exists()) {
            ObjectInputStream ois = new ObjectInputStream(new FileInputStream(miArchivo));

            Object aux = ois.readObject();
            janitorList = (List<Janitor>) aux;
            ois.close();
            if (janitorList == null || janitorList.isEmpty()) {
                janitorList = new ArrayList();
                janitorList.add(new Janitor());
                return janitorList;
            }
            return janitorList;
        } else {
            janitorList.add(new Janitor());
            return janitorList;
        }

    }//Fin de metodo

    public boolean search(String name) throws FileNotFoundException, IOException, ClassNotFoundException {
        File miArchivo = new File(Utility.Utilities.PATHTOSAVEJANITORS);
        List<Janitor> janitorList = new ArrayList<>();
        boolean bandera = false;
        if (miArchivo.exists()) {
            ObjectInputStream ois = new ObjectInputStream(new FileInputStream(miArchivo));
            Object aux = ois.readObject();
            janitorList = (List<Janitor>) aux;
            ois.close();
        }
        for (int i = 0; i < janitorList.size(); i++) {

            String palabra = janitorList.get(i).getNameEmployee();
            for (int j = 0; j < palabra.length(); j++) {
                for (int x = 0; x < name.length(); x++) {
                    if (janitorList.get(i).getNameEmployee().equalsIgnoreCase(name)) {
                        return true;
                    }//if
                }//tercer for
            }//Segundo For
        }//Primer for
        return false;

    }// //Fin de metodo search

    public Janitor getJanitor(String name) throws FileNotFoundException, IOException, ClassNotFoundException {
        File miArchivo = new File(Utility.Utilities.PATHTOSAVEJANITORS);
        List<Janitor> janitorList = new ArrayList<>();
        boolean bandera = false;
        if (miArchivo.exists()) {
            ObjectInputStream ois = new ObjectInputStream(new FileInputStream(miArchivo));
            Object aux = ois.readObject();
            janitorList = (List<Janitor>) aux;
            ois.close();
        }
        for (int i = 0; i < janitorList.size(); i++) {

            String palabra = janitorList.get(i).getNameEmployee();
            for (int j = 0; j < palabra.length(); j++) {
                for (int x = 0; x < name.length(); x++) {
                    if (janitorList.get(i).getNameEmployee().equalsIgnoreCase(name)) {
                        return janitorList.get(i);
                    }//if
                }//tercer for
            }//Segundo For
        }//Primer for
        return null;

    }//Fin de metodo

    public boolean delete(String name) throws IOException, FileNotFoundException, ClassNotFoundException {
        File miArchivo = new File(Utility.Utilities.PATHTOSAVEJANITORS);
        List<Janitor> janitorList = new ArrayList<Janitor>();
        if (miArchivo.exists()) {
            ObjectInputStream ois = new ObjectInputStream(new FileInputStream(miArchivo));
            Object aux = ois.readObject();
            janitorList = (List<Janitor>) aux;
            ois.close();
        }
        for (int i = 0; i < janitorList.size(); i++) {
            if (janitorList.get(i).getNameEmployee().equalsIgnoreCase(name)) {
                janitorList.remove(janitorList.get(i));
                ObjectOutputStream ouput = new ObjectOutputStream(new FileOutputStream(miArchivo));
                ouput.writeUnshared(janitorList);
                ouput.close();
                return true;
            }
        }

        return false;
    }//Fin de metodo delete
}//Fin de clase

