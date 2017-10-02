/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package id.co.indocyber.guessinggame;

/**
 *
 * @author user
 */
public class StringProp {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        String nama = "Matt Robin";
        System.out.println(nama.indexOf('o'));
        System.out.println(nama.lastIndexOf('o'));
        nama=nama.replace('M', 'T');
        char [] vokal = {'a','i','u','e','o'};
        
        for (int i = 0; i < vokal.length; i++) {
            nama = nama.replace(vokal[i], '_');
        }
        System.out.println(nama);
//        for (int i = 0; i < vokal.length; i++) {
//            if (nama.indexOf(vokal[i])==-1) {
//                
//            }else{
//                int idx = nama.indexOf(vokal[i]);
//                
//            }
//        }
        
        System.out.println(nama);
//        char indx5 = nama.charAt(5);
//        System.out.println(indx5);
//        int uni5 = nama.codePointAt(5);
//        
//        System.out.println(uni5);
//        System.out.println(Character.getNumericValue('R'));
//        System.out.println();
    }
    
}
