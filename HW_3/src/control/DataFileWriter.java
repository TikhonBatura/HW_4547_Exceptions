/*
Записывает информацию в файл
 */

package control;

import model.UserData;

import java.io.FileWriter;
import java.io.IOException;

public class DataFileWriter {
    public void dataWriter(UserData data, String path) {
        System.out.println("to file " + path + "\n");

        try(FileWriter fw = new FileWriter(path, true)) {
            fw.append(data.toString());
            fw.append("\n");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
