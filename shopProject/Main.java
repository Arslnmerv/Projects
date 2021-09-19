package shopProject;

public class Main {
    public static void main(String[] args) {

//  MÃ¼ÅŸterinin alacaÄŸÄ± bir Ã¼rÃ¼n iÃ§in taksit yapÄ±lcacaktÄ±r.
//  KullanÄ±cÄ±dan AlÄ±ncak olan malÄ±n Ã¼cret ve kaÃ§ taksit olacaÄŸÄ± bilgisini alÄ±nÄ±z.
//  Taksit rakamlarÄ± kuruÅŸlu Ã§Ä±kÄ±yorsa kuruÅŸlar toplanÄ±p, son taksite eklensin.
//  GÃ¼nÃ¼n tarihine gÃ¶re 1 ay atlatarak oluÅŸan taksit tarihi ve Ã¶dencek taksit miktarÄ±nÄ±n listesini yazdÄ±rÄ±nÄ±z.

        Shop gs = new Shop();
        gs.secilenUrunler = gs.urunSec(gs);
        for (Urunler urunler : gs.secilenUrunler) {
            System.out.println(urunler.toString());
        }
        gs.hesaplaToplamAlisVerisTutari();
        gs.taksit = gs.taksitBelirle();
        gs.taksitlendir();
        gs.taksitleriYazdir();

    }
}
