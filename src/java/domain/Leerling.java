package domain;

import java.awt.Image;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.NamedQuery;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;

@Entity
@Table(name = "TBL_LEERLING")
@NamedQuery(name = "Leerling.findAll", query = "SELECT l FROM Leerling l")
public class Leerling {

    private String naam;
    @Id
    private String inschrijvingsnr;
    private String instructeur;
    @Temporal(javax.persistence.TemporalType.DATE)
    private Date verval;
    private String type;
    //private Image image;
    private int grafiek;
    @OneToOne(cascade = CascadeType.PERSIST)
    private EvaluatieMoment eva1;
    @OneToOne(cascade = CascadeType.PERSIST)
    private EvaluatieMoment eva2;
    @OneToOne(cascade = CascadeType.PERSIST)
    private EvaluatieMoment eva3;
    private int lastSelectedEva;

    private List<String> aandachtsPuntenLijst = new ArrayList<>();

    public List<String> getAandachtsPuntenLijst() {
        return aandachtsPuntenLijst;
    }

    public void setAandachtsPuntenLijst(List<String> aandachtsPuntenLijst) {
        this.aandachtsPuntenLijst = aandachtsPuntenLijst;
    }
    
    public String getNaam() {
        return naam;
    }

    public void setNaam(String naam) {
        this.naam = naam;
    }

    public String getInschrijvingsnr() {
        return inschrijvingsnr;
    }

    public void setInschrijvingsnr(String inschrijvingsnr) {
        this.inschrijvingsnr = inschrijvingsnr;
    }

    public String getInstructeur() {
        return instructeur;
    }

    public void setInstructeur(String instructeur) {
        this.instructeur = instructeur;
    }

    public Date getVerval() {
        return verval;
    }

    public void setVerval(Date verval) {
        this.verval = verval;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    /*public Image getImage() {
        return image;
    }

    public void setImage(Image image) {
        this.image = image;
    }*/

    public int getGrafiek() {
        return grafiek;
    }

    public void setGrafiek(int grafiek) {
        this.grafiek = grafiek;
    }

    public EvaluatieMoment getEva1() {
        return eva1;
    }

    public void setEva1(EvaluatieMoment eva1) {
        this.eva1 = eva1;
    }

    public EvaluatieMoment getEva2() {
        return eva2;
    }

    public void setEva2(EvaluatieMoment eva2) {
        this.eva2 = eva2;
    }

    public EvaluatieMoment getEva3() {
        return eva3;
    }

    public void setEva3(EvaluatieMoment eva3) {
        this.eva3 = eva3;
    }

    public int getLastSelectedEva() {
        return lastSelectedEva;
    }

    public void setLastSelectedEva(int lastSelectedEva) {
        this.lastSelectedEva = lastSelectedEva;
    }
    
    

}
