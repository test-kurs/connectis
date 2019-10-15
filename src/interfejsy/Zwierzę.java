package interfejsy;

import interfejsy.enumy.GATUNEK_ZWIERZĘCIA;
import interfejsy.enumy.SPOSÓB_ŻYWIENIA;

public interface Zwierzę extends Siersc, Jadowitość, Organizm, Comparable {

    double cena();
    SPOSÓB_ŻYWIENIA sposóbŻywienia();
    GATUNEK_ZWIERZĘCIA gatunekZwierzęcia();
    String nazwa();

}
