package domain;

import javafx.collections.ObservableList;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.NamedQuery;
import javax.persistence.Table;

@Entity
@Table(name = "TBL_EVALUATIEMOMENT")
@NamedQuery(name = "EvaluatieMoment.findAll", query = "SELECT e FROM EvaluatieMoment e")
public class EvaluatieMoment {

    @Id
    private int id;
    private int parkeren;
    private int garage;
    private int stuuroef;
    private int achteruit;
    private int keren;
    private int houding;
    private int remmen;
    private int koppeling;
    private int schakelen;
    private int sturen;
    private int kijken;
    private int helling;
    private int richtingaanwijzers;
    private int voorrang;
    private int openbareWeg;
    private int verkeerstekens;
    private int snelheid;
    private int afstand;
    private int inhalen;
    private int kruisen;
    private int linksaf;
    private int rechtsaf;
    private int rotonde;
    private int rijstroken;
    private int stad;
    private int autosnelweg;
    private int schakelaars;
    private int vloeistoffen;
    private int banden;
    private int tanken;
    private int noodstop;
    private int gps;
    private ObservableList houdingOpm;
    private ObservableList koppelingOpm;
    private ObservableList remmenOpm;
    private ObservableList schakelenOpm;
    private ObservableList sturenOpm;
    private ObservableList kijkenOpm;
    private ObservableList hellingOpm;
    private ObservableList richtingaanwijzersOpm;
    private ObservableList voorrangOpm;
    private ObservableList openbareWegOpm;
    private ObservableList verkeerstekensOpm;
    private ObservableList snelheidOpm;
    private ObservableList afstandOpm;
    private ObservableList inhalenOpm;
    private ObservableList kruisenOpm;
    private ObservableList linksafOpm;
    private ObservableList rechtsafOpm;
    private ObservableList attitudeOpm;
    private ObservableList hoofdmenuOpm;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getParkeren() {
        return parkeren;
    }

    public void setParkeren(int parkeren) {
        this.parkeren = parkeren;
    }

    public int getGarage() {
        return garage;
    }

    public void setGarage(int garage) {
        this.garage = garage;
    }

    public int getStuuroef() {
        return stuuroef;
    }

    public void setStuuroef(int stuuroef) {
        this.stuuroef = stuuroef;
    }

    public int getAchteruit() {
        return achteruit;
    }

    public void setAchteruit(int achteruit) {
        this.achteruit = achteruit;
    }

    public int getKeren() {
        return keren;
    }

    public void setKeren(int keren) {
        this.keren = keren;
    }

    public int getHouding() {
        return houding;
    }

    public void setHouding(int houding) {
        this.houding = houding;
    }

    public int getRemmen() {
        return remmen;
    }

    public void setRemmen(int remmen) {
        this.remmen = remmen;
    }

    public int getKoppeling() {
        return koppeling;
    }

    public void setKoppeling(int koppeling) {
        this.koppeling = koppeling;
    }

    public int getSchakelen() {
        return schakelen;
    }

    public void setSchakelen(int schakelen) {
        this.schakelen = schakelen;
    }

    public int getSturen() {
        return sturen;
    }

    public void setSturen(int sturen) {
        this.sturen = sturen;
    }

    public int getKijken() {
        return kijken;
    }

    public void setKijken(int kijken) {
        this.kijken = kijken;
    }

    public int getHelling() {
        return helling;
    }

    public void setHelling(int helling) {
        this.helling = helling;
    }

    public int getRichtingaanwijzers() {
        return richtingaanwijzers;
    }

    public void setRichtingaanwijzers(int richtingaanwijzers) {
        this.richtingaanwijzers = richtingaanwijzers;
    }

    public int getVoorrang() {
        return voorrang;
    }

    public void setVoorrang(int voorrang) {
        this.voorrang = voorrang;
    }

    public int getOpenbareWeg() {
        return openbareWeg;
    }

    public void setOpenbareWeg(int openbareWeg) {
        this.openbareWeg = openbareWeg;
    }

    public int getVerkeerstekens() {
        return verkeerstekens;
    }

    public void setVerkeerstekens(int verkeerstekens) {
        this.verkeerstekens = verkeerstekens;
    }

    public int getSnelheid() {
        return snelheid;
    }

    public void setSnelheid(int snelheid) {
        this.snelheid = snelheid;
    }

    public int getAfstand() {
        return afstand;
    }

    public void setAfstand(int afstand) {
        this.afstand = afstand;
    }

    public int getInhalen() {
        return inhalen;
    }

    public void setInhalen(int inhalen) {
        this.inhalen = inhalen;
    }

    public int getKruisen() {
        return kruisen;
    }

    public void setKruisen(int kruisen) {
        this.kruisen = kruisen;
    }

    public int getLinksaf() {
        return linksaf;
    }

    public void setLinksaf(int linksaf) {
        this.linksaf = linksaf;
    }

    public int getRechtsaf() {
        return rechtsaf;
    }

    public void setRechtsaf(int rechtsaf) {
        this.rechtsaf = rechtsaf;
    }

    public int getRotonde() {
        return rotonde;
    }

    public void setRotonde(int rotonde) {
        this.rotonde = rotonde;
    }

    public int getRijstroken() {
        return rijstroken;
    }

    public void setRijstroken(int rijstroken) {
        this.rijstroken = rijstroken;
    }

    public int getStad() {
        return stad;
    }

    public void setStad(int stad) {
        this.stad = stad;
    }

    public int getAutosnelweg() {
        return autosnelweg;
    }

    public void setAutosnelweg(int autosnelweg) {
        this.autosnelweg = autosnelweg;
    }

    public int getSchakelaars() {
        return schakelaars;
    }

    public void setSchakelaars(int schakelaars) {
        this.schakelaars = schakelaars;
    }

    public int getVloeistoffen() {
        return vloeistoffen;
    }

    public void setVloeistoffen(int vloeistoffen) {
        this.vloeistoffen = vloeistoffen;
    }

    public int getBanden() {
        return banden;
    }

    public void setBanden(int banden) {
        this.banden = banden;
    }

    public int getTanken() {
        return tanken;
    }

    public void setTanken(int tanken) {
        this.tanken = tanken;
    }

    public int getNoodstop() {
        return noodstop;
    }

    public void setNoodstop(int noodstop) {
        this.noodstop = noodstop;
    }

    public int getGps() {
        return gps;
    }

    public void setGps(int gps) {
        this.gps = gps;
    }

    public ObservableList getHoudingOpm() {
        return houdingOpm;
    }

    public void setHoudingOpm(ObservableList houdingOpm) {
        this.houdingOpm = houdingOpm;
    }

    public ObservableList getKoppelingOpm() {
        return koppelingOpm;
    }

    public void setKoppelingOpm(ObservableList koppelingOpm) {
        this.koppelingOpm = koppelingOpm;
    }

    public ObservableList getRemmenOpm() {
        return remmenOpm;
    }

    public void setRemmenOpm(ObservableList remmenOpm) {
        this.remmenOpm = remmenOpm;
    }

    public ObservableList getSchakelenOpm() {
        return schakelenOpm;
    }

    public void setSchakelenOpm(ObservableList schakelenOpm) {
        this.schakelenOpm = schakelenOpm;
    }

    public ObservableList getSturenOpm() {
        return sturenOpm;
    }

    public void setSturenOpm(ObservableList sturenOpm) {
        this.sturenOpm = sturenOpm;
    }

    public ObservableList getKijkenOpm() {
        return kijkenOpm;
    }

    public void setKijkenOpm(ObservableList kijkenOpm) {
        this.kijkenOpm = kijkenOpm;
    }

    public ObservableList getHellingOpm() {
        return hellingOpm;
    }

    public void setHellingOpm(ObservableList hellingOpm) {
        this.hellingOpm = hellingOpm;
    }

    public ObservableList getRichtingaanwijzersOpm() {
        return richtingaanwijzersOpm;
    }

    public void setRichtingaanwijzersOpm(ObservableList richtingaanwijzersOpm) {
        this.richtingaanwijzersOpm = richtingaanwijzersOpm;
    }

    public ObservableList getVoorrangOpm() {
        return voorrangOpm;
    }

    public void setVoorrangOpm(ObservableList voorrangOpm) {
        this.voorrangOpm = voorrangOpm;
    }

    public ObservableList getOpenbareWegOpm() {
        return openbareWegOpm;
    }

    public void setOpenbareWegOpm(ObservableList openbareWegOpm) {
        this.openbareWegOpm = openbareWegOpm;
    }

    public ObservableList getVerkeerstekensOpm() {
        return verkeerstekensOpm;
    }

    public void setVerkeerstekensOpm(ObservableList verkeerstekensOpm) {
        this.verkeerstekensOpm = verkeerstekensOpm;
    }

    public ObservableList getSnelheidOpm() {
        return snelheidOpm;
    }

    public void setSnelheidOpm(ObservableList snelheidOpm) {
        this.snelheidOpm = snelheidOpm;
    }

    public ObservableList getAfstandOpm() {
        return afstandOpm;
    }

    public void setAfstandOpm(ObservableList afstandOpm) {
        this.afstandOpm = afstandOpm;
    }

    public ObservableList getInhalenOpm() {
        return inhalenOpm;
    }

    public void setInhalenOpm(ObservableList inhalenOpm) {
        this.inhalenOpm = inhalenOpm;
    }

    public ObservableList getKruisenOpm() {
        return kruisenOpm;
    }

    public void setKruisenOpm(ObservableList kruisenOpm) {
        this.kruisenOpm = kruisenOpm;
    }

    public ObservableList getLinksafOpm() {
        return linksafOpm;
    }

    public void setLinksafOpm(ObservableList linksafOpm) {
        this.linksafOpm = linksafOpm;
    }

    public ObservableList getRechtsafOpm() {
        return rechtsafOpm;
    }

    public void setRechtsafOpm(ObservableList rechtsafOpm) {
        this.rechtsafOpm = rechtsafOpm;
    }

    public ObservableList getAttitudeOpm() {
        return attitudeOpm;
    }

    public void setAttitudeOpm(ObservableList attitudeOpm) {
        this.attitudeOpm = attitudeOpm;
    }

    public ObservableList getHoofdmenuOpm() {
        return hoofdmenuOpm;
    }

    public void setHoofdmenuOpm(ObservableList hoofdmenuOpm) {
        this.hoofdmenuOpm = hoofdmenuOpm;
    }
    
    

}
