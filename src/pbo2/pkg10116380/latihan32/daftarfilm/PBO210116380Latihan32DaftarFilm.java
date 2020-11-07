/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pbo2.pkg10116380.latihan32.daftarfilm;

/**
* @author 
 * Nama  : Zain Achmad Rizqullah
 * Nim   : 10116380
 * Kelas : PBO2
 * Deskripsi Program : program ini tentang daftar film yang menampilkan judul, 
 * rating, genre, dan durasi dengan Oriented Object
 */
public class PBO210116380Latihan32DaftarFilm {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Film flm1 = new Film();
        flm1.filmName = "Venom";
        flm1.filmGenre = "Action, Horor, Scifi";
        flm1.filmRating = 8.5;
        flm1.filmDuration = 120;

        flm1.nowPlaying(flm1.filmName, flm1.filmGenre, flm1.filmRating,
                flm1.filmDuration);
        
        Film flm2 = new Film();
        flm2.filmName = "Small Foot";
        flm2.filmGenre = "Animation";
        flm2.filmRating = 9.0;
        flm2.filmDuration = 96;

        flm2.nowPlaying(flm2.filmName, flm2.filmGenre, flm2.filmRating,
                flm2.filmDuration);
        
        Film flm3 = new Film();
        flm3.filmName = "Crazy Rich asian";
        flm3.filmGenre = "Comedy";
        flm3.filmRating = 7.8;
        flm3.filmDuration = 119;

        flm3.nowPlaying(flm3.filmName, flm3.filmGenre, flm3.filmRating,
                flm3.filmDuration);
        
        Film flm4 = new Film();
        flm4.filmName = "Asih";
        flm4.filmGenre = "Horor";
        flm4.filmRating = 6.0;
        flm4.filmDuration = 100;

        flm4.nowPlaying(flm4.filmName, flm4.filmGenre, flm4.filmRating,
                flm4.filmDuration);
    }
    
}
