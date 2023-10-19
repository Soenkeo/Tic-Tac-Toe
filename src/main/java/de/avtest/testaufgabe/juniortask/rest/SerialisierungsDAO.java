package de.avtest.testaufgabe.juniortask.rest;

import de.avtest.testaufgabe.juniortask.data.GameBoard;

import java.io.*;

public class SerialisierungsDAO {
    public void gameboardSpeichern(GameBoard gameBoard){   //Methode zum Speichern -> Idee: es muss immer nur gespeichert werden wenn eine markierung gesetzt wurde
        File file = new File("C:\\Users\\User\\Desktop\\Uni\\Praktikum AV-Test\\gameboard.ser");
        try(FileOutputStream outputStream = new FileOutputStream(file);
            ObjectOutputStream objectOutputStream = new ObjectOutputStream(outputStream);) {
            objectOutputStream.writeObject(gameBoard);

        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
    public GameBoard gameboardLaden(){       //Methode zum Laden
        GameBoard gameBoard = null;
        File file = new File("C:\\Users\\User\\Desktop\\Uni\\Praktikum AV-Test\\gameboard.ser");
        try(FileInputStream inputStream = new FileInputStream(file);
            ObjectInputStream objectInputStream = new ObjectInputStream(inputStream);) {
            gameBoard = (GameBoard) objectInputStream.readObject();
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        }
        return gameBoard;
    }
}
