/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package id.co.indocyber.guessinggame;

import id.co.indocyber.guessinggame.model.WordModel;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 *
 * @author user
 */
public class WordQuestionGenerator {

    
    public static WordModel[] createSoal(){
        WordModel soal1 = new WordModel("Pondok Indah", "Daerah Jakarta Selatan");
        WordModel soal2 = new WordModel("Sudirman","Jalan Utama di Jakarta");
        WordModel soal3 = new WordModel("Tugu Tani","Patung deket Monas");
        WordModel soal4 = new WordModel("Citos","Mall di selatan Jakarta");
        WordModel soal5 = new WordModel("Gandaria City","Mall anak muda");
    
        WordModel[] bankSoal = {soal1,soal2,soal3,soal4,soal5};
    return bankSoal;
    }
    
    public static List<WordModel> createQuestionInCollection(){
        WordModel soal1 = new WordModel("Pondok Indah", "Daerah Jakarta Selatan");
        WordModel soal2 = new WordModel("Sudirman","Jalan Utama di Jakarta");
        WordModel soal3 = new WordModel("Tugu Tani","Patung deket Monas");
        WordModel soal4 = new WordModel("Citos","Mall di selatan Jakarta");
        WordModel soal5 = new WordModel("Gandaria City","Mall anak muda");
    
        List<WordModel> bankSoal = new ArrayList<>();
        bankSoal.add(soal1);
        bankSoal.add(soal2);
        bankSoal.add(soal3);
        bankSoal.add(soal4);
        bankSoal.add(soal5);
        
        return bankSoal;
        }
    
    public static List<WordModel> createQuestionFromFile(String filename) throws FileNotFoundException, IOException{
        List<WordModel> bankSoal = new ArrayList<>();
        File file = new File(filename);
//        if (file.exists()) {
//            System.out.println("File ada");
//        }
        FileReader fr = new FileReader(file);
        BufferedReader br = new BufferedReader(fr);
        
        String line = null;
        while((line = br.readLine()) != null){
            String[] arrayModel = line.split(",");//Split line, assign ke string array
            WordModel model = new WordModel(arrayModel[0], arrayModel[1].trim());//buat oobject dengan aray indx 0 kata dasar dan indx 1 untuk petunjuk
            bankSoal.add(model);
        }
        return bankSoal;
    }
}
