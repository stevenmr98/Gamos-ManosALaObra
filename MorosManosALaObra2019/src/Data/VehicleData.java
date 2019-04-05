package Data;

import Domain.Vehicle;
import Utility.Utilities;
import java.io.File;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.util.ArrayList;
import java.util.List;
                //escribimos en archivo
 

         
/**
 *
 * @author Steven
 */
//atributos
/**
 *
 */
public class VehicleData {

    public RandomAccessFile randomAccessFile;
    private int regsQuantity;//me indica la cantidad de registros
    private int regSize;
    private String myFilePath;

    //constructor
    /**
     *
     * @param file
     * @throws IOException
     */
    //Constructor
    public VehicleData(File file) throws IOException {
        start(file);
    }

    /**
     * instancia el random access file y coloca el valor de mis variables
     * privadas
     *
     * @param file
     * @throws IOException
     */
    private void start(File file) throws IOException {
        //almaceno la ruta
        myFilePath = file.getPath();

        //tamanno maximo de los registros dentro de esta 
        //clase
        this.regSize = 140;

        //una validacion basica
        if (file.exists() && !file.isFile()) {
            throw new IOException(file.getName()
                    + " is an invalid file");
        } else {
            //crear la nueva instancia de randomAccessFile
            randomAccessFile = new RandomAccessFile(file, "rw");

            //necesitamos indicar cuantos registros tiene el archivo
            this.regsQuantity = (int) Math.ceil((double) randomAccessFile.length() / (double) regSize);
        }
    }//fin de metodo start

    /**
     * cierra la conexion de mi programa con el archivo que estoy manipulando
     *
     * @throws IOException
     */
    public void close() throws IOException {
        randomAccessFile.close();
    }//Fin de método close

    /**
     * indica la cantidad de registros del archivo actual
     *
     * @return cantidad de registros
     */
    public int fileSize() {
        return regsQuantity;
    }//fin de metodo fileSize

    /**
     * inserta un nuevo registro pero en una posicion existente
     *
     * @param position
     * @param vehicle
     * @return
     * @throws IOException
     */
    public boolean putValue(int position, Vehicle vehicle) throws IOException {
        //una pequenna validacion antes de insertar
        if (position >= 0 && position <= regsQuantity) {
            if (vehicle.size() > regSize) {
                System.err.print("7001 record size is out of bounds");
                return false;
            } else {
                randomAccessFile.seek(position * regSize);
                randomAccessFile.writeUTF(vehicle.getName());
                randomAccessFile.writeInt(vehicle.getYear());
                randomAccessFile.writeFloat(vehicle.getMileage());
                randomAccessFile.writeBoolean(vehicle.isIsAmerican());
                randomAccessFile.writeInt(vehicle.getVehicleIdentificationNumber());

                return true;
            }
        } else {
            System.err.print("7002 position is "
                    + "out of bounds of this file");
            return false;
        }

    }//fin metodo putValue

    /**
     * agrega un registro nuevo pero al final del archivo, por esa razon se
     * incrementa la cantidad de registros
     *
     * @param person
     * @return
     * @throws IOException
     */
    public boolean addEndRecord(Vehicle vehicle) throws IOException {
        //insertar al final del archivo
        boolean success = putValue(regsQuantity, vehicle);

        if (success) {
            ++regsQuantity;
        }
        return success;
    }//fin de metodo addEndRecord

    /**
     * obtiene un registro de una persona en la posicion indicada
     *
     * @param position
     * @return objeto de tipo Person con los datos del registro de esa persona
     * @throws IOException
     */
    public Vehicle getVehicle(int position) throws IOException {
        //validacion de la posicion
        if (position >= 0 && position <= regsQuantity) {
            //colocamos el puntero en el lugar 
            randomAccessFile.seek(position * regSize);

            //instancia de person
            Vehicle myVehicle = new Vehicle();

            //llevamos a cabo las lecturas
            myVehicle.setName(randomAccessFile.readUTF());
            myVehicle.setYear(randomAccessFile.readInt());
            myVehicle.setMileage(randomAccessFile.readFloat());
            myVehicle.setIsAmerican(randomAccessFile.readBoolean());
            myVehicle.setVehicleIdentificationNumber(randomAccessFile.readInt());

            //si es delete no retorno
            if (myVehicle == null) {
                Vehicle vehicleTemp = new Vehicle("", 0, 0, false, 0);
                addEndRecord(vehicleTemp);
            }
            if (myVehicle.getName().equalsIgnoreCase("deleted")) {
                return null;
            } else {
                return myVehicle;
            }

        } else {
            System.err.println("6001 position is out of bounds");
            return null;
        }
    }//fin de metodo getVehicle

    /**
     * consulta todos los registros de mi archivo
     *
     * @return una lista de objetos tipo Person
     * @throws IOException
     */
    public List<Vehicle> getAllVehicle() throws IOException {

        //variables a retornar
        List<Vehicle> vehicles = new ArrayList<Vehicle>();

        //recorro todos mis registros y los inserto en la lista
        for (int i = 0; i < regsQuantity; i++) {
            Vehicle vehicleTemp = this.getVehicle(i);

            if (vehicleTemp != null) {
                vehicles.add(vehicleTemp);
            }
        }

        return vehicles;
    }//fin metodo getAllVehicle

    public boolean deleteRecord(int id) throws IOException {
        Vehicle myVehicle;

        //buscar el registro para la eliminacion
        for (int i = 0; i < regsQuantity; i++) {

            //obtengo a la persona de esa posicion
            myVehicle = this.getVehicle(i);
            if (myVehicle != null) {
                System.out.println("mal");
            
            //pregunto si es la persona que quiero eliminar
            if (myVehicle.getVehicleIdentificationNumber() == id) {
                //marcar esta persona como eliminada
                myVehicle.setName("deleted");
                return this.putValue(i, myVehicle);
            }
            }
        }

        //si llega a este punto no encontro a la persona
        return false;
    }//fin de metodo deletedRecord

    public boolean Search(int id) throws IOException {
        for (int i = 0; i < this.regsQuantity; i++) {
            if (getVehicle(i) != null) {
                if (getVehicle(i).getVehicleIdentificationNumber() == id) {
                    return true;
                }
            }
        }
        return false;
    }//fin de método search

    public Vehicle getVehicleID(int id) throws IOException {
        for (int i = 0; i < this.regsQuantity; i++) {
            if (getVehicle(i) != null) {
                if (getVehicle(i).getVehicleIdentificationNumber() == id) {
                    return getVehicle(i);
                }
            }
        }
        return null;
    }//fin de metodo getVehicleID 

    public boolean deleteVehicle(int id) throws IOException {
        for (int i = 0; i < this.regsQuantity; i++) {
            if (getVehicle(i) != null) {
                if (getVehicle(i).getVehicleIdentificationNumber() == id) {
                    Vehicle vehicleTemp = getVehicle(i);
                    vehicleTemp.setName("deleted");
                    this.putValue(i, vehicleTemp);
                    return true;
                }
            }
        }
        return false;
    }// fin de metodo deletedVehicle

    public boolean updateVehicle(int id, String name, int year, boolean isAmerican) throws IOException {
        for (int i = 0; i < this.regsQuantity; i++) {
            if (getVehicle(i) != null) {
                Vehicle myVehicleTemp = getVehicle(i);
                if (myVehicleTemp.getVehicleIdentificationNumber() == id) {
                    myVehicleTemp.setIsAmerican(isAmerican);
                    myVehicleTemp.setName(name);
                    myVehicleTemp.setYear(year);
                    this.putValue(i, myVehicleTemp);
                    return true;
                }//segundo if
            }//primer if
        }//for
        return false;
    }//fin de metodo updateVehicle
}//Fin de clase
