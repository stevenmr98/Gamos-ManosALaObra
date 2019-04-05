/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Data;
import Domain.Driver;
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
public class DriverData {

    public boolean SaveDriver(Driver driver) throws FileNotFoundException, IOException, ClassNotFoundException {
        File miArchivo = new File(Utility.Utilities.PATHTOSAVEDRIVERS);
        List<Driver> driverList = new ArrayList<>();
        if (miArchivo.exists()) {
            ObjectInputStream ois = new ObjectInputStream(new FileInputStream(miArchivo));

            Object aux = ois.readObject();
            driverList = (List<Driver>) aux;
            ois.close();
        }
        driverList.add(driver);

        ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(miArchivo));
        oos.writeUnshared(driverList);
        oos.close();
        return true;

    }//Fin de metodo saveDriver

    public List<Driver> read() throws FileNotFoundException, IOException, ClassNotFoundException {

        File miArchivo = new File(Utility.Utilities.PATHTOSAVEDRIVERS);
        List<Driver> driverList = new ArrayList<>();
        if (miArchivo.exists()) {
            ObjectInputStream ois = new ObjectInputStream(new FileInputStream(miArchivo));

            Object aux = ois.readObject();
            driverList = (List<Driver>) aux;
            ois.close();
            if (driverList == null || driverList.isEmpty()) {
                driverList = new ArrayList();
                driverList.add(new Driver());
                return driverList;
            }
            return driverList;
        } else {
            driverList.add(new Driver());
            return driverList;
        }

    }//Fin de metodo read

    public boolean search(String name) throws FileNotFoundException, IOException, ClassNotFoundException {
        File miArchivo = new File(Utility.Utilities.PATHTOSAVEDRIVERS);
        List<Driver> driverList = new ArrayList<>();
        boolean bandera = false;
        if (miArchivo.exists()) {
            ObjectInputStream ois = new ObjectInputStream(new FileInputStream(miArchivo));
            Object aux = ois.readObject();
            driverList = (List<Driver>) aux;
            ois.close();
        }
        for (int i = 0; i < driverList.size(); i++) {

            String palabra = driverList.get(i).getNameEmployee();
            for (int j = 0; j < palabra.length(); j++) {
                for (int x = 0; x < name.length(); x++) {
                    if (driverList.get(i).getNameEmployee().equalsIgnoreCase(name)) {
                        return true;
                    }//if
                }//tercer for

            }//Segundo For
        }//Primer for
        return false;

    }// //Fin de metodo search

    public Driver getDriver(String name) throws FileNotFoundException, IOException, ClassNotFoundException {
        File miArchivo = new File(Utility.Utilities.PATHTOSAVEDRIVERS);
        List<Driver> driverList = new ArrayList<>();
        boolean bandera = false;
        if (miArchivo.exists()) {
            ObjectInputStream ois = new ObjectInputStream(new FileInputStream(miArchivo));
            Object aux = ois.readObject();
            driverList = (List<Driver>) aux;
            ois.close();
        }
        for (int i = 0; i < driverList.size(); i++) {

            String palabra = driverList.get(i).getNameEmployee();
            for (int j = 0; j < palabra.length(); j++) {
                for (int x = 0; x < name.length(); x++) {
                    if (driverList.get(i).getNameEmployee().equalsIgnoreCase(name)) {
                        return driverList.get(i);
                    }//if
                }//tercer for

            }//Segundo For
        }//Primer for
        return null;

    }//Fin de metodo getDriver

    public boolean delete(String name) throws IOException, FileNotFoundException, ClassNotFoundException {
        File miArchivo = new File(Utility.Utilities.PATHTOSAVEDRIVERS);
        List<Driver> driverList = new ArrayList<Driver>();
        if (miArchivo.exists()) {
            ObjectInputStream ois = new ObjectInputStream(new FileInputStream(miArchivo));
            Object aux = ois.readObject();
            driverList = (List<Driver>) aux;
            ois.close();
        }//if

        for (int i = 0; i < driverList.size(); i++) {
            if (driverList.get(i).getNameEmployee().equalsIgnoreCase(name)) {
                driverList.remove(driverList.get(i));
                ObjectOutputStream ouput = new ObjectOutputStream(new FileOutputStream(miArchivo));
                ouput.writeUnshared(driverList);
                ouput.close();
                return true;
            }//if
        }//for

        return false;
    }//Fin de metodo delete
}//Fin de clase
