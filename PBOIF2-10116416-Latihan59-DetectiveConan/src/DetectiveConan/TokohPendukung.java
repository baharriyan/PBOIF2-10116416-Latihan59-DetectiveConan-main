/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DetectiveConan;

/**
 *Nama  : Riyan Bahar
 *Kelas : PBO-02
 *NIM   : 10116416
 */
class TokohPendukung extends Tokoh {

  protected String partner;

    public TokohPendukung(String partner, String nama, String peran) {
        super(nama, peran);
        this.partner = partner;
    }

    public String getPartner() {
        return partner;
    }

    public void tampilTokohPendukung() {
        System.out.println("Nama  : Riyan Bahar " + getNama());
        System.out.println("Peran : " + getPeran());
        System.out.println("Partner : " + getPartner());
        System.out.println("");
    } 
  
}
 