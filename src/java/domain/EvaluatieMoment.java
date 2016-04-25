package domain;

import java.util.ArrayList;
import java.util.List;
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
    
    //voor de kleuren:
    //Neutraal              = 0     Wit
    //Gekend                = 1     Groen
    //Gezien niet Gekend    = 2     Oranje
    //Niet gekend           = 3     Rood
    //gegevens rijtechniek
    private int parkeren, garage, stuuroef, achteruit, keren;
    private int houding, remmen, koppeling, schakelen, sturen, kijken, helling;
    private List<String> houdingOpm, koppelingOpm, remmenOpm, schakelenOpm,
            sturenOpm, kijkenOpm, hellingOpm;
    //gegevens verkeerstechniek
    private int richtingaanwijzers, voorrang, openbareWeg, verkeerstekens, snelheid,
            afstand, inhalen, kruisen, linksaf, rechtsaf;
    private List<String> richtingaanwijzersOpm, voorrangOpm, openbareWegOpm, verkeerstekensOpm,
            snelheidOpm, afstandOpm, inhalenOpm, kruisenOpm, linksafOpm, rechtsafOpm;
    //gegevens attitude
    private List<String> attitudeOpm;
    //gegevens hoofdmenu;
    private int rotonde, rijstroken, stad, autosnelweg, schakelaars, vloeistoffen,
            banden, tanken, noodstop, gps;
    private List<String> hoofdmenuOpm;

    //Constructors
    public EvaluatieMoment() {
        //dummy array om de andere arrays in te vullen
        this.houding = 0;
        this.koppeling = 0;
        this.remmen = 0;
        this.schakelen = 0;
        this.sturen = 0;
        this.kijken = 0;
        this.keren = 0;
        this.parkeren = 0;
        this.garage = 0;
        this.helling = 0;
        this.stuuroef = 0;
        this.achteruit = 0;
        this.houdingOpm = new ArrayList<String>();
        this.koppelingOpm = new ArrayList<String>();
        this.remmenOpm = new ArrayList<String>();
        this.schakelenOpm = new ArrayList<String>();
        this.sturenOpm = new ArrayList<String>();
        this.kijkenOpm = new ArrayList<String>();
        this.hellingOpm = new ArrayList<String>();
        this.richtingaanwijzers = 0;
        this.voorrang = 0;
        this.openbareWeg = 0;
        this.verkeerstekens = 0;
        this.snelheid = 0;
        this.afstand = 0;
        this.inhalen = 0;
        this.kruisen = 0;
        this.linksaf = 0;
        this.rechtsaf = 0;
        this.richtingaanwijzersOpm = new ArrayList<String>();
        this.voorrangOpm = new ArrayList<String>();
        this.openbareWegOpm = new ArrayList<String>();
        this.verkeerstekensOpm = new ArrayList<String>();
        this.snelheidOpm = new ArrayList<String>();
        this.afstandOpm = new ArrayList<String>();
        this.inhalenOpm = new ArrayList<String>();
        this.kruisenOpm = new ArrayList<String>();
        this.linksafOpm = new ArrayList<String>();
        this.rechtsafOpm = new ArrayList<String>();
        this.attitudeOpm = new ArrayList<String>();
        this.rotonde = 0;
        this.rijstroken = 0;
        this.stad = 0;
        this.autosnelweg = 0;
        this.schakelaars = 0;
        this.vloeistoffen = 0;
        this.banden = 0;
        this.tanken = 0;
        this.noodstop = 0;
        this.gps = 0;
        this.hoofdmenuOpm = new ArrayList<String>();
    }

    public EvaluatieMoment(int houding, int koppeling, int remmen, int schakelen, int sturen, int kijken,
            int keren, int parkeren, int garage, int helling, int stuuroef, int achteruit, List<String> houdingOpm,
            List<String> koppelingOpm, List<String> remmenOpm, List<String> schakelenOpm, List<String> sturenOpm, List<String> kijkenOpm,
            List<String> hellingOpm, int richtingaanwijzers, int voorrang, int openbareWeg, int verkeerstekens,
            int snelheid, int afstand, int inhalen, int kruisen, int linksaf, int rechtsaf, List<String> richtingaanwijzersOpm,
            List<String> voorrangOpm, List<String> openbareWegOpm, List<String> verkeerstekensOpm, List<String> snelheidOpm, List<String> afstandOpm,
            List<String> inhalenOpm, List<String> kruisenOpm, List<String> linksafOpm, List<String> rechtsafOpm, int grafiek, List<String> attitudeOpm,
            int rotonde, int rijstroken, int stad, int autosnelweg, int schakelaars, int vloeistoffen, int banden, int tanken,
            int noodstop, int gps, List<String> hoofdmenuOpm) {
        this.houding = houding;
        this.koppeling = koppeling;
        this.remmen = remmen;
        this.schakelen = schakelen;
        this.sturen = sturen;
        this.kijken = kijken;
        this.keren = keren;
        this.parkeren = parkeren;
        this.garage = garage;
        this.helling = helling;
        this.stuuroef = stuuroef;
        this.achteruit = achteruit;
        this.houdingOpm = houdingOpm;
        this.koppelingOpm = koppelingOpm;
        this.remmenOpm = remmenOpm;
        this.schakelenOpm = schakelenOpm;
        this.sturenOpm = sturenOpm;
        this.kijkenOpm = kijkenOpm;
        this.hellingOpm = hellingOpm;
        this.richtingaanwijzers = richtingaanwijzers;
        this.voorrang = voorrang;
        this.openbareWeg = openbareWeg;
        this.verkeerstekens = verkeerstekens;
        this.snelheid = snelheid;
        this.afstand = afstand;
        this.inhalen = inhalen;
        this.kruisen = kruisen;
        this.linksaf = linksaf;
        this.rechtsaf = rechtsaf;
        this.richtingaanwijzersOpm = richtingaanwijzersOpm;
        this.voorrangOpm = voorrangOpm;
        this.openbareWegOpm = openbareWegOpm;
        this.verkeerstekensOpm = verkeerstekensOpm;
        this.snelheidOpm = snelheidOpm;
        this.afstandOpm = afstandOpm;
        this.inhalenOpm = inhalenOpm;
        this.kruisenOpm = kruisenOpm;
        this.linksafOpm = linksafOpm;
        this.rechtsafOpm = rechtsafOpm;
        this.attitudeOpm = attitudeOpm;
        this.rotonde = rotonde;
        this.rijstroken = rijstroken;
        this.stad = stad;
        this.autosnelweg = autosnelweg;
        this.schakelaars = schakelaars;
        this.vloeistoffen = vloeistoffen;
        this.banden = banden;
        this.tanken = tanken;
        this.noodstop = noodstop;
        this.gps = gps;
        this.hoofdmenuOpm = hoofdmenuOpm;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
    
    //Getters en Setters
    public int getHouding() {
        return houding;
    }

    public void setHouding(int houding) {
        this.houding = houding;
    }

    public int getKoppeling() {
        return koppeling;
    }

    public void setKoppeling(int koppeling) {
        this.koppeling = koppeling;
    }

    public int getRemmen() {
        return remmen;
    }

    public void setRemmen(int remmen) {
        this.remmen = remmen;
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

    public int getKeren() {
        return keren;
    }

    public void setKeren(int keren) {
        this.keren = keren;
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

    public int getHelling() {
        return helling;
    }

    public void setHelling(int helling) {
        this.helling = helling;
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

    public List<String> getHoudingOpm() {
        return houdingOpm;
    }

    public void setHoudingOpm(List<String> houdingOpm) {
        this.houdingOpm = houdingOpm;
    }

    public List<String> getKoppelingOpm() {
        return koppelingOpm;
    }

    public void setKoppelingOpm(List<String> koppelingOpm) {
        this.koppelingOpm = koppelingOpm;
    }

    public List<String> getRemmenOpm() {
        return remmenOpm;
    }

    public void setRemmenOpm(List<String> remmenOpm) {
        this.remmenOpm = remmenOpm;
    }

    public List<String> getSchakelenOpm() {
        return schakelenOpm;
    }

    public void setSchakelenOpm(List<String> schakelenOpm) {
        this.schakelenOpm = schakelenOpm;
    }

    public List<String> getSturenOpm() {
        return sturenOpm;
    }

    public void setSturenOpm(List<String> sturenOpm) {
        this.sturenOpm = sturenOpm;
    }

    public List<String> getKijkenOpm() {
        return kijkenOpm;
    }

    public void setKijkenOpm(List<String> kijkenOpm) {
        this.kijkenOpm = kijkenOpm;
    }

    public List<String> getHellingOpm() {
        return hellingOpm;
    }

    public void setHellingOpm(List<String> hellingOpm) {
        this.hellingOpm = hellingOpm;
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

    public List<String> getRichtingaanwijzersOpm() {
        return richtingaanwijzersOpm;
    }

    public void setRichtingaanwijzersOpm(List<String> richtingaanwijzersOpm) {
        this.richtingaanwijzersOpm = richtingaanwijzersOpm;
    }

    public List<String> getVoorrangOpm() {
        return voorrangOpm;
    }

    public void setVoorrangOpm(List<String> voorrangOpm) {
        this.voorrangOpm = voorrangOpm;
    }

    public List<String> getOpenbareWegOpm() {
        return openbareWegOpm;
    }

    public void setOpenbareWegOpm(List<String> openbareWegOpm) {
        this.openbareWegOpm = openbareWegOpm;
    }

    public List<String> getVerkeerstekensOpm() {
        return verkeerstekensOpm;
    }

    public void setVerkeerstekensOpm(List<String> verkeerstekensOpm) {
        this.verkeerstekensOpm = verkeerstekensOpm;
    }

    public List<String> getSnelheidOpm() {
        return snelheidOpm;
    }

    public void setSnelheidOpm(List<String> snelheidOpm) {
        this.snelheidOpm = snelheidOpm;
    }

    public List<String> getAfstandOpm() {
        return afstandOpm;
    }

    public void setAfstandOpm(List<String> afstandOpm) {
        this.afstandOpm = afstandOpm;
    }

    public List<String> getInhalenOpm() {
        return inhalenOpm;
    }

    public void setInhalenOpm(List<String> inhalenOpm) {
        this.inhalenOpm = inhalenOpm;
    }

    public List<String> getKruisenOpm() {
        return kruisenOpm;
    }

    public void setKruisenOpm(List<String> kruisenOpm) {
        this.kruisenOpm = kruisenOpm;
    }

    public List<String> getLinksafOpm() {
        return linksafOpm;
    }

    public void setLinksafOpm(List<String> linksafOpm) {
        this.linksafOpm = linksafOpm;
    }

    public List<String> getRechtsafOpm() {
        return rechtsafOpm;
    }

    public void setRechtsafOpm(List<String> rechtsafOpm) {
        this.rechtsafOpm = rechtsafOpm;
    }

    public List<String> getAttitudeOpm() {
        return attitudeOpm;
    }

    public void setAttitudeOpm(List<String> attitudeOpm) {
        this.attitudeOpm = attitudeOpm;
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

    public List<String> getHoofdmenuOpm() {
        return hoofdmenuOpm;
    }

    public void setHoofdmenuOpm(List<String> hoofdmenuOpm) {
        this.hoofdmenuOpm = hoofdmenuOpm;
    }

}
